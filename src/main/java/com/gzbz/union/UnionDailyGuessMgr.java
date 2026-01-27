package com.gzbz.union;

import allMgr.MgrAnno;
import allMgr.TaskMethod;
import cn.hutool.core.collection.ConcurrentHashSet;
import com.google.protobuf.GeneratedMessageV3;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.UnionDailyGuessDao;
import com.gzbz.db.UnionDao;
import com.gzbz.db.UnionMemberDao;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailWorldMgr;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.UnionDailyGuessChapterModel;
import com.gzbz.model.UnionDailyGuessMapIconModel;
import com.gzbz.model.UnionGateRewardModel;
import com.gzbz.protobuf.UnionDailyGuessMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.union.bean.UnionDailyGuessChapterInfo;
import com.gzbz.union.bean.UnionGateBattleRecordInfo;
import com.gzbz.util.TempUtil;
import com.gzbz.worldMgr.WorldMgr;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import misc.DateUtil;
import misc.RandomUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@MgrAnno
public class UnionDailyGuessMgr extends GameMgr {
   Logger logger = LoggerFactory.getLogger(UnionDailyGuessMgr.class);
   @Autowired
   WorldMgr worldMgr;
   @Autowired
   UnionMgrParent unionMgrParent;
   @Autowired
   MailWorldMgr mailWorldMgr;
   private AtomicInteger resettingNum = new AtomicInteger(1);

   protected void init() throws Exception {
   }

   public boolean isResetting() {
      return this.resettingNum.get() > 0;
   }

   public void gmResettingNum() {
      this.resettingNum.set(0);
   }

   public UnionDailyGuessDao getUnionDailyGuessDao(int unionId) {
      UnionDao unionDao = (UnionDao)this.unionMgrParent.getUnionDaoMap().get(unionId);
      if (null == unionDao) {
         return null;
      } else {
         Map<Integer, UnionDailyGuessDao> unionDailyGuessDaoMap = this.gameCachePool.getAllTableByMap("tb_union_daily_guess");
         return unionDailyGuessDaoMap == null ? null : (UnionDailyGuessDao)unionDailyGuessDaoMap.get(unionId);
      }
   }

   public UnionDailyGuessDao getUnionDailyGuessDaoForAdd(int unionId) {
      UnionDao unionDao = (UnionDao)this.unionMgrParent.getUnionDaoMap().get(unionId);
      if (null == unionDao) {
         return null;
      } else {
         UnionDailyGuessDao unionDailyGuessDao = this.getUnionDailyGuessDao(unionId);
         if (null == unionDailyGuessDao) {
            unionDailyGuessDao = new UnionDailyGuessDao();
            unionDailyGuessDao.unionId = unionId;
            unionDailyGuessDao.unionLv = unionDao.level;
            unionDailyGuessDao.chapterInfo = this.getInitChapterInfo(unionDailyGuessDao.unionLv);
            unionDailyGuessDao.resetTime = System.currentTimeMillis();
            this.gameCachePool.insertDao(unionDailyGuessDao);
         }

         return unionDailyGuessDao;
      }
   }

   @TaskMethod
   public void resetUnionDailyGuessChapter() {
      this.logger.info("军团猜门重置开始<<<<<<");
      this.unionMgrParent.pushTask(() -> {
         Map<Integer, UnionDao> unionDaoMap = this.unionMgrParent.getUnionDaoMap();
         if (unionDaoMap != null && !unionDaoMap.isEmpty()) {
            Set<Map.Entry<Integer, UnionDao>> unionDaoEntrySet = unionDaoMap.entrySet();
            this.resettingNum.set(unionDaoEntrySet.size());

            for(Map.Entry<Integer, UnionDao> unionDaoEntry : unionDaoEntrySet) {
               UnionDao unionDao = (UnionDao)unionDaoEntry.getValue();
               this.pushTask(() -> {
                  try {
                     UnionDailyGuessDao unionDailyGuessDao = this.getUnionDailyGuessDaoForAdd(unionDao.unionId);
                     if (null != unionDailyGuessDao) {
                        this.sendAllPassEmailAward(unionDailyGuessDao.unionLv, unionDailyGuessDao);
                        if (!DateUtil.isSameDay(unionDailyGuessDao.resetTime)) {
                           unionDailyGuessDao.unionLv = unionDao.level;
                           unionDailyGuessDao.chapterInfo = this.getInitChapterInfo(unionDailyGuessDao.unionLv);
                           unionDailyGuessDao.intoChapterPlayerIds.clear();
                           unionDailyGuessDao.firstPassPlayerId = 0;
                           unionDailyGuessDao.completePlayerIds.clear();
                           unionDailyGuessDao.resetTime = System.currentTimeMillis();
                           unionDailyGuessDao.battleRecord.clear();
                           unionDailyGuessDao.updateOp();
                        }

                        return;
                     }
                  } catch (Exception e) {
                     this.logger.error("重置军团猜门信息异常,军团id:" + unionDaoEntry.getKey(), e);
                     return;
                  } finally {
                     this.resettingNum.decrementAndGet();
                  }

               });
            }

         } else {
            this.resettingNum.set(0);
         }
      });
   }

   public int getRandomMapGroup() {
      Map<Integer, UnionDailyGuessMapIconModel> modelPoolMap = ApplicationContextProvider.<Integer, UnionDailyGuessMapIconModel>getModelPoolMap("unionGateMapicon");
      List<Integer> groupList = new ArrayList();

      for(Map.Entry<Integer, UnionDailyGuessMapIconModel> modelEntry : modelPoolMap.entrySet()) {
         UnionDailyGuessMapIconModel model = (UnionDailyGuessMapIconModel)modelEntry.getValue();
         groupList.add(model.getGroup());
      }

      if (groupList.size() <= 0) {
         return 1;
      } else {
         int randomIndex = RandomUtil.randInt(0, groupList.size());
         return (Integer)groupList.get(randomIndex);
      }
   }

   public ConcurrentHashMap<Integer, UnionDailyGuessChapterInfo> getInitChapterInfo(int unionLv) {
      ConcurrentHashMap<Integer, UnionDailyGuessChapterInfo> chapterInfoMap = new ConcurrentHashMap();
      Map<Integer, UnionDailyGuessChapterModel> chapterModelMap = ApplicationContextProvider.<Integer, UnionDailyGuessChapterModel>getModelPoolMap("unionGateChapter");
      if (null == chapterModelMap) {
         return chapterInfoMap;
      } else {
         int lastChapterId = 0;

         for(Map.Entry<Integer, UnionDailyGuessChapterModel> chapterModelEntry : chapterModelMap.entrySet()) {
            UnionDailyGuessChapterModel chapterModel = (UnionDailyGuessChapterModel)chapterModelEntry.getValue();
            if (unionLv >= chapterModel.getUnlockUnionLv()) {
               List<Integer> randomBoxGrids = chapterModel.getRandomBoxGrids();
               if (randomBoxGrids.size() > 0) {
                  int randomIndex = RandomUtil.randInt(randomBoxGrids.size());
                  Integer passChapterGrid = (Integer)randomBoxGrids.get(randomIndex);
                  UnionDailyGuessChapterInfo unionDailyGuessChapterInfo = new UnionDailyGuessChapterInfo(chapterModel.getId(), passChapterGrid, 0, this.getRandomMapGroup());
                  chapterInfoMap.put(chapterModel.getId(), unionDailyGuessChapterInfo);
                  lastChapterId = chapterModel.getId() >= lastChapterId ? chapterModel.getId() : lastChapterId;
               }
            }
         }

         if (lastChapterId > 0) {
            UnionDailyGuessChapterInfo unionDailyGuessChapterInfo = (UnionDailyGuessChapterInfo)chapterInfoMap.get(lastChapterId);
            unionDailyGuessChapterInfo.setNextChapterGrid(-1);
         }

         return chapterInfoMap;
      }
   }

   public void checkChapterInfoChange(int chapterId, int unionId) {
      UnionDailyGuessDao unionDailyGuessDao = this.getUnionDailyGuessDao(unionId);
      UnionDailyGuessChapterModel unionDailyGuessChapterModel = (UnionDailyGuessChapterModel)ApplicationContextProvider.getModelPool().getEntity("unionGateChapter", chapterId);
      if (null != unionDailyGuessChapterModel && unionDailyGuessDao != null) {
         UnionDailyGuessChapterInfo unionDailyGuessChapterInfo = (UnionDailyGuessChapterInfo)unionDailyGuessDao.chapterInfo.get(chapterId);
         if (null == unionDailyGuessChapterInfo) {
            this.logger.info("初始化或重置UnionDailyGuessChapterInfo异常，没有需要的关卡信息 chapterId:{}，unionId:{}", chapterId, unionId);
         } else {
            List<Integer> randomBoxGrids = unionDailyGuessChapterModel.getRandomBoxGrids();
            if (randomBoxGrids.size() > 0) {
               int nextChapterGrid = unionDailyGuessChapterInfo.getNextChapterGrid();
               if (nextChapterGrid != -1 && !randomBoxGrids.contains(nextChapterGrid)) {
                  int randomIndex = RandomUtil.randInt(randomBoxGrids.size());
                  Integer passChapterGrid = (Integer)randomBoxGrids.get(randomIndex);
                  unionDailyGuessChapterInfo.setNextChapterGrid(passChapterGrid);
                  unionDailyGuessDao.updateOp();
               }

            }
         }
      }
   }

   public boolean setFirstPassPlayerId(int unionId, int playerId) {
      if (this.isResetting()) {
         return false;
      } else {
         UnionDailyGuessDao unionDailyGuessDao = this.getUnionDailyGuessDao(unionId);
         if (null != unionDailyGuessDao && unionDailyGuessDao.firstPassPlayerId <= 0) {
            unionDailyGuessDao.firstPassPlayerId = playerId;
            unionDailyGuessDao.updateOp();
            return true;
         } else {
            return false;
         }
      }
   }

   public void setChapterCanPassBattle(int unionId, int chapterId) {
      UnionDailyGuessDao unionDailyGuessDao = this.getUnionDailyGuessDao(unionId);
      if (null != unionDailyGuessDao) {
         UnionDailyGuessChapterInfo unionDailyGuessChapterInfo = (UnionDailyGuessChapterInfo)unionDailyGuessDao.chapterInfo.get(chapterId);
         if (unionDailyGuessChapterInfo != null && unionDailyGuessChapterInfo.getCanPassBattle() == 0) {
            unionDailyGuessChapterInfo.setCanPassBattle(1);
            unionDailyGuessDao.updateOp();
         }

      }
   }

   public void addCompletePlayerIds(int unionId, int playerId) {
      UnionDailyGuessDao unionDailyGuessDao = this.getUnionDailyGuessDao(unionId);
      if (null != unionDailyGuessDao) {
         if (!unionDailyGuessDao.completePlayerIds.contains(playerId)) {
            unionDailyGuessDao.completePlayerIds.add(playerId);
            unionDailyGuessDao.updateOp();
         }

      }
   }

   public void addIntoChapterPlayerIds(int unionId, int playerId) {
      UnionDailyGuessDao unionDailyGuessDao = this.getUnionDailyGuessDao(unionId);
      if (null != unionDailyGuessDao) {
         if (!unionDailyGuessDao.intoChapterPlayerIds.contains(playerId)) {
            unionDailyGuessDao.intoChapterPlayerIds.add(playerId);
            unionDailyGuessDao.updateOp();
         }

      }
   }

   public void addBattleRecord(int unionId, UnionGateBattleRecordInfo battleRecordInfo) {
      UnionDailyGuessDao unionDailyGuessDao = this.getUnionDailyGuessDao(unionId);
      if (null != unionDailyGuessDao) {
         int chapterId = battleRecordInfo.getChapterId();
         if (!unionDailyGuessDao.battleRecord.containsKey(chapterId)) {
            unionDailyGuessDao.battleRecord.put(chapterId, battleRecordInfo);
            unionDailyGuessDao.updateOp();
            this.broadcastPassNum(unionId, unionDailyGuessDao.battleRecord.size());
         }
      }
   }

   public void sendAllPassEmailAward(int unionLv, UnionDailyGuessDao unionDailyGuessDao) {
      if (null != unionDailyGuessDao && unionDailyGuessDao.firstPassPlayerId > 0) {
         if (!DateUtil.isSameDay(unionDailyGuessDao.resetTime)) {
            UnionGateRewardModel rewardModel = (UnionGateRewardModel)ApplicationContextProvider.getModelPoolEntity("unionGateReward", unionLv);
            if (null != rewardModel) {
               ConcurrentHashSet<Integer> intoChapterPlayerIds = unionDailyGuessDao.intoChapterPlayerIds;
               int firstPassPlayerId = unionDailyGuessDao.firstPassPlayerId;
               Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
               TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.TYPE_UNION_DAILY_GUESS);
               CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
               Map<Integer, String> playerParams = new TreeMap();

               for(Integer intoChapterPlayerId : intoChapterPlayerIds) {
                  if (intoChapterPlayerId != firstPassPlayerId) {
                     playerParams.put(intoChapterPlayerId, "");
                  }
               }

               if (!playerParams.isEmpty()) {
                  String desc = MessageFormat.format(centreAwardModel.getDesc(), this.getCompletePlayerNames(unionDailyGuessDao.completePlayerIds));
                  this.mailWorldMgr.addParamsMailAndSendOnline(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), desc, rewardModel.getClearReward(), playerParams, 604800000L, 9, 939, 0);
               }

            }
         }
      }
   }

   public String getCompletePlayerNames(ConcurrentHashSet<Integer> completePlayerIds) {
      if (completePlayerIds != null && completePlayerIds.size() > 0) {
         StringBuilder completePlayerName = new StringBuilder();

         for(Integer playerId : completePlayerIds) {
            GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
            if (gamePlayer != null) {
               PlayerPublicDao publicDao = gamePlayer.getPublicDao();
               if (publicDao != null) {
                  String name = TempUtil.fixNameForMessageFormat(publicDao.playerName);
                  completePlayerName.append(name + ",");
               }
            }
         }

         if (completePlayerName.length() > 0) {
            completePlayerName.deleteCharAt(completePlayerName.length() - 1);
         }

         return completePlayerName.toString();
      } else {
         return "";
      }
   }

   private void broadcastPassNum(int unionId, int passNum) {
      UnionDailyGuessMsg.S2C_UpdatePassNum_16026.Builder builder = UnionDailyGuessMsg.S2C_UpdatePassNum_16026.newBuilder();
      builder.setPassNum(passNum);
      this.broadcastToMember(unionId, builder.build());
   }

   private void broadcastToMember(int unionId, GeneratedMessageV3 msg) {
      UnionMgr unionMgr = this.unionMgrParent.getUnionMgr(unionId);
      if (!Objects.isNull(unionMgr)) {
         Map<Integer, UnionMemberDao> unionMembers = unionMgr.getUnionMembers();

         for(UnionMemberDao unionMemberDao : unionMembers.values()) {
            GamePlayer gamePlayer = this.worldMgr.getPlayerById(unionMemberDao.playerId);
            if (gamePlayer != null && gamePlayer.isLogin()) {
               gamePlayer.sendMsg(msg);
            }
         }
      }

   }
}
