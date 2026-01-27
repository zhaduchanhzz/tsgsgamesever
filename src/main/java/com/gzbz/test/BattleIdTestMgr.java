package com.gzbz.test;

import allMgr.MgrAnno;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.model.BattleModel;
import com.gzbz.spring.ApplicationContextProvider;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
@MgrAnno
public class BattleIdTestMgr extends GameMgr {
   protected void init() throws Exception {
   }

   public void test() {
      Map<Integer, BattleModel> battleModelMap = ApplicationContextProvider.<Integer, BattleModel>getModelPoolMap("battle");
      StringBuffer stringBuffer = new StringBuffer();

      for(Map.Entry<Integer, BattleModel> battleModelEntry : battleModelMap.entrySet()) {
         BattlePKTeam battlePKTeam = new BattlePKTeam(((BattleModel)battleModelEntry.getValue()).getId());

         for(Map.Entry<Byte, Entity> entry : battlePKTeam.getEntityMap().entrySet()) {
            stringBuffer.append(((BattleModel)battleModelEntry.getValue()).getId()).append("\t").append(((Entity)entry.getValue()).getId()).append("\t");

            for(Map.Entry<Integer, Long> proEntry : ((Entity)entry.getValue()).getBaseProperties().entrySet()) {
               stringBuffer.append(proEntry.getValue()).append("\t");
            }

            stringBuffer.append("\n");
         }
      }

      this.print(stringBuffer);
      System.out.println("打印完成！");
   }

   public void print(StringBuffer stringBuffer) {
      try {
         File file = new File("battleId.txt");
         if (!file.exists()) {
            file.createNewFile();
         }

         FileWriter fileWriter = new FileWriter("battleId.txt", true);
         BufferedWriter bw = new BufferedWriter(fileWriter);
         bw.write(stringBuffer.toString());
         bw.close();
         fileWriter.close();
         StringBuffer var6 = null;
      } catch (Exception e) {
         e.printStackTrace();
      }

   }
}
