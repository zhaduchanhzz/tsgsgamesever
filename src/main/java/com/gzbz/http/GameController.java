package com.gzbz.http;

import com.gzbz.db.bean.WorldCupMatch;
import com.gzbz.db.bean.WorldCupResult;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.http.vo.SimpleResult;
import com.gzbz.mini.MiniProgramPart;
import com.gzbz.qqBigPlayer.QqBigPlayerDefine;
import com.gzbz.qqBigPlayer.part.QqBigPlayerPart;
import com.gzbz.share.part.FaceBookSharePart;
import com.gzbz.share.part.SVipPart;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldCup.WorldCupMgr;
import com.gzbz.worldMgr.WorldMgr;
import java.util.List;
import misc.MD5Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/game"})
public class GameController {
   private static final Logger LOGGER = LoggerFactory.getLogger(GameController.class);
   @Autowired
   private Environment env;

   @GetMapping({"/wechat/invite"})
   public SimpleResult<String> invite(String invite, String beInvite, int serverId, int time, String sign) {
      String key = this.env.getProperty("weChatInviteKey", "");
      if (StringUtils.isEmpty(key)) {
         LOGGER.error("服务器没有配置key!!!");
         return SimpleResult.<String>fail("game server error!");
      } else {
         String checkSign = MD5Util.encode(invite + beInvite + serverId + time + key);
         if (!checkSign.equals(sign)) {
            return SimpleResult.<String>fail("sign invalid");
         } else if (StringUtils.isEmpty(invite)) {
            return SimpleResult.<String>fail("invite is empty");
         } else if (StringUtils.isEmpty(beInvite)) {
            return SimpleResult.<String>fail("beInvite is empty");
         } else if (invite.equals(beInvite)) {
            return SimpleResult.<String>fail("cannot invite owner");
         } else {
            WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
            GamePlayer invitePlayer = worldMgr.getGamePlayerByAccount(invite, serverId);
            if (invitePlayer == null) {
               return SimpleResult.<String>fail("invitePlayer not exist");
            } else {
               invitePlayer.pushPartTaskEx(MiniProgramPart.class, "invitePlayer", new Object[]{beInvite});
               invitePlayer.pushPartTaskEx(SVipPart.class, "invitePlayer", new Object[]{beInvite});
               return SimpleResult.<String>suc("success");
            }
         }
      }
   }

   @GetMapping({"/facebook/invite"})
   public SimpleResult<String> faceBookInvite(String invite, String beInvite, int serverId, int time, String sign) {
      String key = this.env.getProperty("faceBookInviteKey", "");
      if (StringUtils.isEmpty(key)) {
         LOGGER.error("服务器没有配置key!!!");
         return SimpleResult.<String>fail("game server error!");
      } else {
         String checkSign = MD5Util.encode(invite + beInvite + serverId + time + key);
         if (!checkSign.equals(sign)) {
            return SimpleResult.<String>fail("sign invalid");
         } else if (StringUtils.isEmpty(invite)) {
            return SimpleResult.<String>fail("invite is empty");
         } else if (StringUtils.isEmpty(beInvite)) {
            return SimpleResult.<String>fail("beInvite is empty");
         } else if (invite.equals(beInvite)) {
            return SimpleResult.<String>fail("cannot invite owner");
         } else {
            WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
            GamePlayer invitePlayer = worldMgr.getGamePlayerByAccount(invite, serverId);
            if (invitePlayer == null) {
               return SimpleResult.<String>fail("invitePlayer not exist");
            } else {
               invitePlayer.pushPartTaskEx(FaceBookSharePart.class, "invitePlayer", new Object[]{beInvite});
               return SimpleResult.<String>suc("success");
            }
         }
      }
   }

   @PostMapping({"/worldCup/matchInfo"})
   public String worldCupMatchInfo(@RequestBody List<WorldCupMatch> params) {
      WorldCupMgr mgr = (WorldCupMgr)ApplicationContextProvider.getContext().getBean(WorldCupMgr.class);
      mgr.pushTaskEx("insertMatchInfo", new Object[]{params});
      return "success";
   }

   @PostMapping({"/worldCup/matchResult"})
   public String worldCupMatchResult(@RequestBody List<WorldCupResult> params) {
      WorldCupMgr mgr = (WorldCupMgr)ApplicationContextProvider.getContext().getBean(WorldCupMgr.class);
      mgr.pushTaskEx("setMatchResult", new Object[]{params});
      return "success";
   }

   @PostMapping({"wanKa/wanKaInfoUpdate"})
   public SimpleResult<String> wanKaInfoUpdate(String account, Integer serverId, Long time, Integer score, Integer level, Boolean binding, Integer discount, Integer payReturnCount, Boolean isUsingCard, Integer realLevel, Long cardExpireTs, String sign) {
      String key = this.env.getProperty("wanKaKey", "");
      if (StringUtils.isEmpty(key)) {
         LOGGER.error("服务器没有配置wanKaKey!!!");
         return SimpleResult.<String>fail("wanKaKey no conf");
      } else if (StringUtils.isEmpty(account)) {
         return SimpleResult.<String>fail("account is empty");
      } else if (null != serverId && serverId > 0) {
         if (null == time) {
            return SimpleResult.<String>fail("time is empty");
         } else if (null != score && score >= 0) {
            if (null != level && level >= 0) {
               if (null == binding) {
                  return SimpleResult.<String>fail("binding is empty");
               } else if (null == discount) {
                  return SimpleResult.<String>fail("discount is empty");
               } else if (null == payReturnCount) {
                  return SimpleResult.<String>fail("payReturnCount is empty");
               } else if (null == isUsingCard) {
                  return SimpleResult.<String>fail("isUsingCard is empty");
               } else if (null != realLevel && realLevel >= 0) {
                  if (null == cardExpireTs) {
                     return SimpleResult.<String>fail("cardExpireTs is empty");
                  } else {
                     Integer wanKaLv = (Integer)QqBigPlayerDefine.WAN_KA_LV_DEFINE.get(level);
                     if (null == wanKaLv) {
                        return SimpleResult.<String>fail("wanKaLv no define level = " + level);
                     } else {
                        Integer realWanKaLv = (Integer)QqBigPlayerDefine.WAN_KA_LV_DEFINE.get(realLevel);
                        if (null == realWanKaLv) {
                           return SimpleResult.<String>fail("realWanKaLv no define realLevel = " + realLevel);
                        } else {
                           String checkSign = MD5Util.encode(account + serverId + time + score + level + binding + discount + payReturnCount + isUsingCard + realLevel + cardExpireTs + key);
                           if (!checkSign.equals(sign)) {
                              return SimpleResult.<String>fail("sign invalid");
                           } else {
                              WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
                              GamePlayer player = worldMgr.getGamePlayerByAccount(account, serverId);
                              if (player == null) {
                                 return SimpleResult.<String>fail("player not exist");
                              } else {
                                 LOGGER.info("更新玩家玩咖信息参数 playerId:{},score:{},level:{},binding:{},discount:{},payReturnCount:{},isUsingCard:{},realLevel:{},cardExpireTs:{}", new Object[]{player.getPlayerId(), score, level, binding, discount, payReturnCount, isUsingCard, realLevel, cardExpireTs});
                                 long scoreLong = Long.parseLong(score + "");
                                 boolean bindingFlag = binding;
                                 boolean isUsingCardFlag = isUsingCard;
                                 player.pushPartTaskEx(QqBigPlayerPart.class, "updateWanKaInfo", new Object[]{scoreLong, wanKaLv, bindingFlag, discount, payReturnCount, isUsingCardFlag, realWanKaLv, cardExpireTs});
                                 return SimpleResult.<String>suc("success");
                              }
                           }
                        }
                     }
                  }
               } else {
                  return SimpleResult.<String>fail("realLevel is empty");
               }
            } else {
               return SimpleResult.<String>fail("level is empty");
            }
         } else {
            return SimpleResult.<String>fail("score is empty");
         }
      } else {
         return SimpleResult.<String>fail("serverId is wrong");
      }
   }

   @GetMapping({"wanKa/reportWanKaPay"})
   public SimpleResult<String> reportWanKaPay(String account, Integer serverId, Long time, Integer use, Integer left, String sign) {
      String key = this.env.getProperty("wanKaKey", "");
      if (StringUtils.isEmpty(key)) {
         LOGGER.error("服务器没有配置wanKaKey!!!");
         return SimpleResult.<String>fail("wanKaKey no conf");
      } else if (StringUtils.isEmpty(account)) {
         return SimpleResult.<String>fail("account is empty");
      } else if (null != serverId && serverId > 0) {
         if (null == time) {
            return SimpleResult.<String>fail("time is empty");
         } else if (null == use) {
            return SimpleResult.<String>fail("use is empty");
         } else if (null == left) {
            return SimpleResult.<String>fail("left is empty");
         } else {
            String checkSign = MD5Util.encode(account + serverId + time + use + left + key);
            if (!checkSign.equals(sign)) {
               return SimpleResult.<String>fail("sign invalid");
            } else {
               WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
               GamePlayer player = worldMgr.getGamePlayerByAccount(account, serverId);
               if (player == null) {
                  return SimpleResult.<String>fail("player not exist");
               } else {
                  player.pushPartTaskEx(QqBigPlayerPart.class, "updatePayReturnCount", new Object[]{left});
                  return SimpleResult.<String>suc("success");
               }
            }
         }
      } else {
         return SimpleResult.<String>fail("serverId is wrong");
      }
   }
}
