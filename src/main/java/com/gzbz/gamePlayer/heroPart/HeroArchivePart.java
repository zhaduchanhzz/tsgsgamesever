package com.gzbz.gamePlayer.heroPart;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.HeroArchiveDao;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.DirtionaryHeroModel;
import com.gzbz.model.GameModelPool;
import com.gzbz.model.HeroModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.HeroMsg;
import com.gzbz.protobuf.PlayerMsg;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class HeroArchivePart extends PlayerPart {
   public static final byte REWARD = 1;
   public static final byte HAD_REWARD = 2;

   @MsgHandlerAnno
   public void msgHeroArchiveList(HeroMsg.C2S_HeroArchiveList_5023 msg, String source) {
      this.sendHeroArchiveList();
   }

   private void sendHeroArchiveList() {
      HeroMsg.S2C_HeroArchiveList_5024.Builder builder = HeroMsg.S2C_HeroArchiveList_5024.newBuilder();
      HeroArchiveDao heroArchiveDao = (HeroArchiveDao)this.player.getData("tb_dictionary_hero", this.player.getPlayerId());

      for(Map.Entry<Integer, Byte> entry : heroArchiveDao.mapHero.entrySet()) {
         HeroMsg.HeroArchive.Builder cell = HeroMsg.HeroArchive.newBuilder();
         cell.setHeroId((Integer)entry.getKey());
         cell.setGetReward(1 == (Byte)entry.getValue());
         builder.addArchive(cell);
      }

      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public boolean msgGetArchiveReward(HeroMsg.C2S_GetArchiveReward_5025 msg, String source) {
      int heroId = msg.getHeroId();
      HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", msg.getHeroId());
      if (heroModel == null) {
         return false;
      } else {
         HeroArchiveDao heroArchiveDao = (HeroArchiveDao)this.player.getData("tb_dictionary_hero", this.player.getPlayerId());
         if (!heroArchiveDao.mapHero.containsKey(heroId)) {
            return this.player.failure(4121);
         } else if (2 == (Byte)heroArchiveDao.mapHero.get(heroId)) {
            return this.player.failure(4122);
         } else {
            heroArchiveDao.mapHero.put(heroId, (byte)2);
            heroArchiveDao.updateOp();
            GameModelPool gameModelPool = this.player.getGameModelPool();
            DirtionaryHeroModel archiveModel = (DirtionaryHeroModel)gameModelPool.getEntity("dictionaryHero", heroId);
            archiveModel.getRewards().forEach((rewardItem) -> this.player.addResource(rewardItem.getType(), rewardItem.getId(), rewardItem.getValue(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 4, 403, rewardItem.getId(), rewardItem.getValue(), "" + this.player.getPlayerId()));
            HeroMsg.S2C_GetArchiveReward_5026.Builder push = HeroMsg.S2C_GetArchiveReward_5026.newBuilder();
            HeroMsg.HeroArchive.Builder archive = HeroMsg.HeroArchive.newBuilder();
            archive.setHeroId(heroId);
            archive.setGetReward(false);
            push.setArchive(archive);
            this.player.sendMsg(push.build());
            return true;
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_AllArchiveReward_5217(HeroMsg.C2S_AllArchiveReward_5217 msg, String source) {
      HeroArchiveDao heroArchiveDao = (HeroArchiveDao)this.player.getData("tb_dictionary_hero", this.player.getPlayerId());
      ArrayList<Integer> heroList = new ArrayList();

      for(Map.Entry<Integer, Byte> entry : heroArchiveDao.mapHero.entrySet()) {
         if ((Byte)entry.getValue() == 1) {
            heroList.add(entry.getKey());
         }
      }

      if (!heroList.isEmpty()) {
         ArrayList<ResourceModel> reward = new ArrayList();

         for(int i = 0; i < heroList.size(); ++i) {
            DirtionaryHeroModel archiveModel = (DirtionaryHeroModel)this.player.getGameModelPool().getEntity("dictionaryHero", heroList.get(i));
            if (!Objects.isNull(archiveModel)) {
               reward.addAll(archiveModel.getRewards());
            }
         }

         this.player.addResource(reward, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 4, 403, 0, 0, "" + this.player.getPlayerId());

         for(int i = 0; i < heroList.size(); ++i) {
            heroArchiveDao.mapHero.put(heroList.get(i), (byte)2);
         }

         heroArchiveDao.updateOp();
         HeroMsg.S2C_AllArchiveReward_5218.Builder push = HeroMsg.S2C_AllArchiveReward_5218.newBuilder();

         for(int i = 0; i < heroList.size(); ++i) {
            HeroMsg.HeroArchive.Builder archive = HeroMsg.HeroArchive.newBuilder();
            archive.setHeroId((Integer)heroList.get(i));
            archive.setGetReward(false);
            push.addArchive(archive);
         }

         this.player.sendMsg(push.build());
      }
   }

   public void takeNewHero(int heroId) {
      HeroArchiveDao heroArchiveDao = (HeroArchiveDao)this.player.getData("tb_dictionary_hero", this.player.getPlayerId());
      if (!heroArchiveDao.mapHero.containsKey(heroId)) {
         heroArchiveDao.mapHero.put(heroId, (byte)1);
         heroArchiveDao.updateOp();
         HeroMsg.S2C_UnlockNewArchive_5027.Builder builder = HeroMsg.S2C_UnlockNewArchive_5027.newBuilder();
         HeroMsg.HeroArchive.Builder archive = HeroMsg.HeroArchive.newBuilder();
         archive.setHeroId(heroId);
         archive.setGetReward(true);
         builder.addArchive(archive);
         this.player.sendMsg(builder.build());
      }
   }

   public List<Integer> getNoArchiveHero() {
      List<Integer> heroList = new ArrayList();
      HeroArchiveDao heroArchiveDao = (HeroArchiveDao)this.player.getData("tb_dictionary_hero", this.player.getPlayerId());
      Map<Integer, HeroModel> heroModelMap = this.player.getGameModelPool().getMap("hero");

      for(Map.Entry<Integer, HeroModel> entry : heroModelMap.entrySet()) {
         if (((HeroModel)entry.getValue()).getShowOpen() > 0 && ((HeroModel)entry.getValue()).getStar() >= 5 && !heroArchiveDao.mapHero.containsKey(entry.getKey())) {
            heroList.add(entry.getKey());
         }
      }

      return heroList;
   }

   public void loginHandle() {
      this.sendHeroArchiveList();
   }
}
