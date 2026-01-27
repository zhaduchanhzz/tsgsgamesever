package com.gzbz.gamePlayer.battle;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import allMgr.TaskMethod;
import com.gzbz.db.BattleTempleDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.BattleTempleModel;
import com.gzbz.protobuf.BattleDailyMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import java.util.Map;
import java.util.TreeSet;
import misc.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class BattleTemplePart extends PlayerPart {
   Logger logger = LoggerFactory.getLogger(BattleTemplePart.class);
   @Autowired
   private WorldMgr worldMgr;

   @MsgHandlerAnno
   public void getTempleInfo(BattleDailyMsg.C2S_GetTempleInfo_6637 msg, String channelId) {
      BattleTempleMgr templeMgr = (BattleTempleMgr)ApplicationContextProvider.getContext().getBean(BattleTempleMgr.class);
      PlayerDao playerDao = (PlayerDao)this.player.getData("tb_player", this.player.getPlayerId());
      templeMgr.pushTaskEx("sendTempleInfo", new Object[]{this.player, playerDao.templeDefeatTime});
   }

   @MsgHandlerAnno
   public void enterTemple(BattleDailyMsg.C2S_EnterTemple_6639 msg, String channelId) {
      int id = msg.getId();
      int level = msg.getLevel();
      BattleTempleModel templeModel = (BattleTempleModel)this.player.getGameModelPool().getEntity("battleTemple", id);
      if (templeModel != null && templeModel.getLevels().contains(level)) {
         PlayerDao playerDao = (PlayerDao)this.player.getData("tb_player", this.player.getPlayerId());
         RankMgr rankMgr = (RankMgr)ApplicationContextProvider.getContext().getBean(RankMgr.class);
         int pvpRank = rankMgr.getRank(RankDefine.RankModule.PVP, this.player.getPlayerId());
         if (pvpRank != 0 && pvpRank <= templeModel.getRank()) {
            if (playerDao.templeDefeatTime != 0L) {
               int failCD = ApplicationContextProvider.getConfigInt("templeChallengeFailCD", 0);
               long time = (long)(failCD * 60) * 1000L;
               if (System.currentTimeMillis() - playerDao.templeDefeatTime < time) {
                  this.player.failure(5017);
                  return;
               }
            }

            BattleTempleMgr templeMgr = (BattleTempleMgr)ApplicationContextProvider.getContext().getBean(BattleTempleMgr.class);
            templeMgr.pushTaskEx("enterTemple", new Object[]{playerDao, templeModel, level});
            this.player.triggerTask(215, 0, 1L, 1);
            this.player.getOperationMgr().addExtraLog(this.player, 207, this.player.getPublicDao().vip_lv + "", "武神殿", "1");
         } else {
            this.player.failure(5016);
         }
      } else {
         this.player.failure(6);
      }
   }

   @MsgHandlerAnno
   public void getTempleBattleRecord(BattleDailyMsg.C2S_GetTempleBattleRecord_6641 msg, String channelId) {
      int id = msg.getId();
      BattleTempleModel templeModel = (BattleTempleModel)this.player.getGameModelPool().getEntity("battleTemple", id);
      if (templeModel == null) {
         this.player.failure(6);
      } else {
         BattleTempleMgr templeMgr = (BattleTempleMgr)ApplicationContextProvider.getContext().getBean(BattleTempleMgr.class);
         templeMgr.pushTaskEx("sendBattleRecord", new Object[]{id, this.player});
      }
   }

   @MsgHandlerAnno
   public void templeBattleEnd(BattleDailyMsg.C2S_TempleBattleEnd_6643 msg, String channelId) {
      int id = msg.getId();
      Map<Integer, BattleTempleModel> map = this.player.getGameModelPool().getMap("battleTemple");
      if (map.containsKey(id)) {
         BattleTempleModel model = (BattleTempleModel)map.get(id);
         BattleTempleMgr templeMgr = (BattleTempleMgr)ApplicationContextProvider.getContext().getBean(BattleTempleMgr.class);
         templeMgr.pushTaskEx("templeBattleEnd", new Object[]{this.player, id, model});
      }
   }

   @TaskMethod
   public void updateDefeat(BattleDailyMsg.S2C_EnterTemple_6640.Builder down, BattleTempleModel battleTempleModel) {
      PlayerDao playerDao = this.player.getPlayerDao();
      playerDao.templeDefeatTime = System.currentTimeMillis();
      playerDao.updateOp();
      down.setDefeatTime(DateUtil.getIntTime(System.currentTimeMillis()));
      down.setId(battleTempleModel.getId());
      Map<Integer, BattleTempleModel> map = this.player.getGameModelPool().getMap("battleTemple");

      for(Integer id : new TreeSet(map.keySet())) {
         BattleTempleModel model = (BattleTempleModel)map.get(id);
         BattleTempleDao dao = (BattleTempleDao)this.player.getGameCachePool().getData("tb_battle_temple", new Object[]{model.getId()});
         down.addInfo(this.packTempleInfo(dao));
      }

      down.setPrestigeId(0);
      this.player.sendMsg(down.build());
   }

   public BattleDailyMsg.TempleInfo.Builder packTempleInfo(BattleTempleDao templeDao) {
      BattleDailyMsg.TempleInfo.Builder info = BattleDailyMsg.TempleInfo.newBuilder();
      info.setId(templeDao.id);
      info.setLevel(templeDao.level);
      info.setPlayerCode(templeDao.playerCode);
      info.setPlayerName("");
      info.setPlayerLevel(1);
      info.setPlayerIcon(1);
      info.setPlayerHead(1);
      if (templeDao.playerCode != 0) {
         GamePlayer templePlayer = this.worldMgr.getPlayerById(templeDao.playerCode);
         PlayerDao playerDao = templePlayer.getPlayerDao();
         if (playerDao != null) {
            info.setPlayerName(playerDao.playerName);
            info.setPlayerLevel(playerDao.lv);
            info.setPlayerIcon(playerDao.monarchId);
            info.setPlayerHead(playerDao.head);
         }
      }

      return info;
   }

   public void gmOp() {
      PlayerDao playerDao = this.player.getPlayerDao();
      playerDao.templeDefeatTime = 0L;
      playerDao.updateOp();
   }
}
