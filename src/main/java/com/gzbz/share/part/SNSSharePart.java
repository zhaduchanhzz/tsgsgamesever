package com.gzbz.share.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.HeroModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.ActivityMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import java.util.List;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class SNSSharePart extends PlayerPart {
   @MsgHandlerAnno
   public void C2S_SNSShareReward_6795(ActivityMsg.C2S_SNSShareReward_6795 msg, String source) {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      List<Integer> heroIdList = msg.getHeroIdList();
      if (worldMgr.country.equals("jp") && !heroIdList.isEmpty()) {
         for(Integer heroId : heroIdList) {
            HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", heroId);
            if (heroModel.getQuality() != 5) {
               this.player.failure(6);
               return;
            }
         }

         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());

         for(Integer heroId : playerActivityDao.snsShareHeroIdSet) {
            if (heroIdList.contains(heroId)) {
               this.player.failure(61206);
               return;
            }
         }

         String configString = ApplicationContextProvider.getConfigString("SNSShareReward", "1|9|50,1|9|100,1|9|150,1|9|200,1|9|250,1|9|300,1|9|350,1|9|400,1|9|450,1|9|500");
         String[] rewardArr = configString.split(",");
         if (rewardArr.length < heroIdList.size()) {
            this.player.failure(6);
         } else {
            playerActivityDao.snsShareHeroIdSet.addAll(heroIdList);
            playerActivityDao.updateOp();
            List<ResourceModel> rewards = ResourceModel.buildResources(rewardArr[heroIdList.size() - 1]);
            this.player.addResource(rewards, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 124, 12351, 0, 0, "");
         }
      } else {
         this.player.failure(0);
      }
   }
}
