package com.gzbz.http;

import com.gzbz.battle.scene.BattleScene;
import com.gzbz.chat.ChatMgr;
import com.gzbz.db.GameDBPool;
import com.gzbz.db.PlayerDao;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.http.vo.FetchPlayerVo;
import com.gzbz.http.vo.FetchRealStatisticsVo;
import com.gzbz.http.vo.FetchResourceVo;
import com.gzbz.http.vo.GmCmdVo;
import com.gzbz.http.vo.SimpleResult;
import com.gzbz.model.GameModelPool;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.GmMgr;
import com.gzbz.worldMgr.OnLineMgr;
import com.gzbz.worldMgr.WorldMgr;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import jodd.util.StringUtil;
import misc.DateUtil;
import net.DirMemTool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/gm"})
public class GmController {
   private final Logger logger = LoggerFactory.getLogger(this.getClass());
   private final WorldMgr worldMgr;
   private final GameDBPool gameDBPool;

   public GmController(WorldMgr worldMgr, GameDBPool gameDBPool) {
      this.worldMgr = worldMgr;
      this.gameDBPool = gameDBPool;
   }

   @GetMapping({"/list"})
   public List<GmCmdVo> gmList() {
      List<GmCmdVo> list = new ArrayList();

      for(Method method : GmMgr.class.getDeclaredMethods()) {
         if (method.getName().startsWith("cmd")) {
            GmCmdVo gmCmdVo = new GmCmdVo();
            gmCmdVo.setCmd(method.getName());

            for(Parameter parameter : method.getParameters()) {
               gmCmdVo.getParams().add(parameter.getName());
            }

            list.add(gmCmdVo);
         }
      }

      return list;
   }

   @GetMapping({"/gmSettingActivity/{activityId}/{start}/{end}"})
   public String gmSettingActivity(@PathVariable String activityId, @PathVariable String start, @PathVariable String end) {
      this.logger.info("执行设置活动命令-->活动【{}】开始时间【{}】,结束时间【{}】", new Object[]{activityId, start, end});
      int startTime = DateUtil.getIntTime(DateUtil.getSomeDayBeginTime(DateUtil.parse(start, "yyyy-MM-dd").getTime()));
      int endTime = DateUtil.getIntTime(DateUtil.getSomeDayEndTime(DateUtil.parse(end, "yyyy-MM-dd").getTime()));
      GmMgr gmMgr = (GmMgr)ApplicationContextProvider.getContext().getBean(GmMgr.class);
      return gmMgr.commandHandle("cmdSettingActivity|" + activityId + "," + startTime + "," + endTime + ",0");
   }

   @GetMapping({"/gmCloseActivity/{activityId}"})
   public String gmCloseActivity(@PathVariable String activityId) {
      this.logger.info("执行关闭活动命令-->活动【{}】", activityId);
      GmMgr gmMgr = (GmMgr)ApplicationContextProvider.getContext().getBean(GmMgr.class);
      return gmMgr.commandHandle("cmdCloseActivity|" + activityId);
   }

   @GetMapping({"/doGm/{cmd}"})
   public String doGmCmd(@PathVariable String cmd) {
      this.logger.info("http执行命令:{}", cmd);
      GmMgr gmMgr = (GmMgr)ApplicationContextProvider.getContext().getBean(GmMgr.class);
      return gmMgr.commandHandle(cmd);
   }

   @GetMapping({"/exGm/{player}/{command}"})
   public String gmCommand(@PathVariable Integer player, @PathVariable String command) {
      GamePlayer gamePlayer = this.worldMgr.getPlayerById(player);
      if (Objects.isNull(gamePlayer)) {
         return "未找到玩家";
      } else {
         ChatMgr chatMgr = (ChatMgr)ApplicationContextProvider.getContext().getBean(ChatMgr.class);
         chatMgr.handleGMCommand(gamePlayer, command);
         return "执行成功!!!";
      }
   }

   @GetMapping({"/fetchPlayer/online/ids"})
   public SimpleResult<Set<Integer>> fetchOnlinePlayerIds() {
      return SimpleResult.<Set<Integer>>suc(this.worldMgr.getOnlinePlayerMap().keySet());
   }

   @GetMapping({"/fetchPlayer/uq/{playerId}"})
   public SimpleResult<FetchPlayerVo> fetchPlayer(@PathVariable int playerId) {
      GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
      if (gamePlayer == null) {
         return SimpleResult.<FetchPlayerVo>fail("player not exist");
      } else {
         PlayerDao playerDao = gamePlayer.getPlayerDao();
         FetchPlayerVo fetchPlayerVo = new FetchPlayerVo(playerDao);
         fetchPlayerVo.setOnline(gamePlayer.isLogin());
         PlayerExtend playerExtend = (PlayerExtend)gamePlayer.getPlayerExtend(13);
         fetchPlayerVo.setTotalOnline(DateUtil.getIntTime(playerExtend.totalOnlineTime));
         return SimpleResult.<FetchPlayerVo>suc(fetchPlayerVo);
      }
   }

   @GetMapping({"/fetchPlayer/online/infos"})
   public SimpleResult<List<FetchPlayerVo>> fetchOnlinePlayers() {
      List<FetchPlayerVo> list = new ArrayList();
      this.worldMgr.getOnlinePlayer().forEach((player) -> {
         PlayerDao playerDao = player.getPlayerDao();
         FetchPlayerVo fetchPlayerVo = new FetchPlayerVo(playerDao);
         fetchPlayerVo.setOnline(true);
         PlayerExtend playerExtend = (PlayerExtend)player.getPlayerExtend(13);
         fetchPlayerVo.setTotalOnline(DateUtil.getIntTime(playerExtend.totalOnlineTime));
         list.add(fetchPlayerVo);
      });
      return SimpleResult.<List<FetchPlayerVo>>suc(list);
   }

   @GetMapping({"/fetch/statistics"})
   public SimpleResult<FetchRealStatisticsVo> realInfo() {
      FetchRealStatisticsVo vo = new FetchRealStatisticsVo();

      try {
         this.gameDBPool.query("SELECT COUNT(1) FROM (SELECT playerId FROM tb_recharge GROUP BY playerId) AS TEMP;", (resultSet) -> {
            try {
               if (resultSet.next()) {
                  vo.setPayment(resultSet.getInt(1));
               }
            } catch (SQLException e) {
               e.printStackTrace();
            }

         }, new Object[0]);
         this.gameDBPool.query("SELECT COUNT(1) FROM tb_account", (resultSet) -> {
            try {
               if (resultSet.next()) {
                  vo.setAccountNum(resultSet.getInt(1));
               }
            } catch (SQLException e) {
               e.printStackTrace();
            }

         }, new Object[0]);
      } catch (Throwable throwable) {
         throwable.printStackTrace();
      }

      vo.setCreate(this.worldMgr.getRoleNum());
      vo.setOnline(this.worldMgr.getOnlinePlayer().size());
      return SimpleResult.<FetchRealStatisticsVo>suc(vo);
   }

   @GetMapping({"/fetch/resource/{playerId}/{resourceType}/{resourceId}"})
   public SimpleResult<FetchResourceVo> fetchPlayer(@PathVariable int playerId, @PathVariable int resourceType, @PathVariable int resourceId) {
      GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
      if (gamePlayer == null) {
         return SimpleResult.<FetchResourceVo>fail("player not exist");
      } else {
         gamePlayer.pushTaskExWait("getResourceNum", new Object[]{resourceType, resourceId});
         FetchResourceVo fetchPlayerVo = new FetchResourceVo();
         fetchPlayerVo.setPlayerId(playerId);
         fetchPlayerVo.setResType(resourceType);
         fetchPlayerVo.setResId(resourceId);
         fetchPlayerVo.setResNum(gamePlayer.getResourceNum(resourceType, resourceId));
         return SimpleResult.<FetchResourceVo>suc(fetchPlayerVo);
      }
   }

   @GetMapping({"/battleLogOn"})
   public String battleLogOn() {
      BattleScene.battleLog.set(true);
      return "开始战斗日志成功";
   }

   @GetMapping({"/battleLogOff"})
   public String battleLogOff() {
      BattleScene.battleLog.set(false);
      return "关闭战斗日志成功";
   }

   @GetMapping({"/addxlsflag"})
   public void addXlsFlag() {
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      gameModelPool.addXlsServerFlag();
   }

   @GetMapping({"/compareXlsCsv"})
   public void compareXlsCsv() {
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      gameModelPool.compareXlsCsv();
   }

   @GetMapping({"/printMem"})
   public void printMem() {
      DirMemTool.printJavaMemory();
      DirMemTool.printNettyMemory();
   }

   @GetMapping({"/gmNotify/{notifyType}/{notifyParam}"})
   public void gmNotify(@PathVariable int notifyType, @PathVariable int notifyParam) {
      this.logger.info("后台执行某个操作通知广播给在线的客户端-->类型【{}】参数【{}】", notifyType, notifyParam);
      PlayerMsg.S2C_GmNotify_3000.Builder msg = PlayerMsg.S2C_GmNotify_3000.newBuilder();
      msg.setNotifyType(notifyType);
      msg.setNotifyParam(notifyParam);
      OnLineMgr onLineMgr = (OnLineMgr)ApplicationContextProvider.getContext().getBean(OnLineMgr.class);
      onLineMgr.pushTask(() -> onLineMgr.onlineBroadcast(msg.build()));
   }

   @GetMapping({"/gmSetIpAttribution/{playerId}/{ipAttribution}"})
   public String gmSetIpAttribution(@PathVariable int playerId, @PathVariable String ipAttribution) {
      this.logger.info("后台修改玩家 {} IP归属地: 【{}】", playerId, ipAttribution);
      if (StringUtil.isBlank(ipAttribution)) {
         ipAttribution = "";
      }

      GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
      if (gamePlayer != null) {
         gamePlayer.pushTaskEx("setIpAttributionByGm", new Object[]{ipAttribution});
         return "执行成功";
      } else {
         this.logger.error("后台修改玩家 {} IP归属地失败，找不到玩家", playerId);
         return "未找到玩家";
      }
   }
}
