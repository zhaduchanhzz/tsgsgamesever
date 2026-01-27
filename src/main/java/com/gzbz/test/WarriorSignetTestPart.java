package com.gzbz.test;

import allMgr.PartAnnotation;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerBag.WarriorSignet;
import com.gzbz.model.ItemModel;
import com.gzbz.model.WarriorSignetModel;
import com.gzbz.model.WarriorSignetSkillModel;
import com.gzbz.model.fun.PropertyModel;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class WarriorSignetTestPart extends PlayerPart {
   static Logger logger = LoggerFactory.getLogger(WarriorSignetTestPart.class);

   public void test() {
      logger.info("开始生成将印");
      int num = 1000;
      this.printTeamWarriors(num);
      logger.info("结束生成将印");
   }

   public void printTeamWarriors(int num) {
      Map<Integer, WarriorSignetModel> map = this.player.getGameModelPool().getMap("warriorSignet");
      if (map != null) {
         Map<Integer, WarriorSignetModel> treeMap = new TreeMap(map);

         for(Map.Entry<Integer, WarriorSignetModel> entry : treeMap.entrySet()) {
            ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", ((WarriorSignetModel)entry.getValue()).getId());
            if (itemModel != null) {
               StringBuffer sb = new StringBuffer();
               sb.append("====  生成将印  ====").append("\n").append("\n");
               sb.append("========").append(itemModel.getName()).append("=======").append("\n");

               for(int i = 0; i < num; ++i) {
                  List<List<Integer>> skillList = new ArrayList();

                  for(int j = 0; j < 10; ++j) {
                     WarriorSignet warriorSignet = new WarriorSignet();
                     warriorSignet.init(0, 1, itemModel, (GamePlayer)null);
                     sb.append(warriorSignet.id);
                     sb.append("\t");
                     int skillLoop = 0;
                     int skillSize = warriorSignet.skills.size();
                     skillList.add(warriorSignet.skills);

                     for(Integer skill : warriorSignet.skills) {
                        sb.append(skill);
                        ++skillLoop;
                        if (skillLoop != skillSize) {
                           sb.append("|");
                        } else {
                           sb.append("\t");
                        }
                     }

                     int propertyLoop = 0;
                     int propertySize = warriorSignet.properties.size();

                     for(PropertyModel property : warriorSignet.properties) {
                        sb.append(property.getType()).append("|").append(property.getWay()).append("|").append(property.getValue());
                        ++propertyLoop;
                        if (propertyLoop != propertySize) {
                           sb.append(",");
                        } else {
                           sb.append("\t");
                        }
                     }
                  }

                  if (!skillList.isEmpty()) {
                     sb.append("(");
                     int loop = 1;

                     for(List<Integer> list : skillList) {
                        sb.append(loop).append(":");

                        for(Integer skillId : list) {
                           WarriorSignetSkillModel warriorSignetSkillModel = (WarriorSignetSkillModel)this.player.getGameModelPool().getEntity("warriorSignetSkill", skillId);
                           if (warriorSignetSkillModel != null) {
                              sb.append(warriorSignetSkillModel.getName());
                              sb.append(",");
                           }
                        }

                        sb.append(";");
                        ++loop;
                     }

                     sb.append(")");
                  }

                  sb.append("\n");
               }

               this.print(sb);
            }
         }

      }
   }

   public void printWarriors(int num) {
      Map<Integer, WarriorSignetModel> map = this.player.getGameModelPool().getMap("warriorSignet");
      if (map != null) {
         Map<Integer, WarriorSignetModel> treeMap = new TreeMap(map);

         for(Map.Entry<Integer, WarriorSignetModel> entry : treeMap.entrySet()) {
            ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", ((WarriorSignetModel)entry.getValue()).getId());
            if (itemModel != null) {
               StringBuffer sb = new StringBuffer();
               sb.append("====  生成将印  ====").append("\n").append("\n");
               sb.append("========").append(itemModel.getName()).append("=======").append("\n");

               for(int i = 0; i < num; ++i) {
                  WarriorSignet warriorSignet = new WarriorSignet();
                  warriorSignet.init(0, 1, itemModel, (GamePlayer)null);
                  sb.append(warriorSignet.id);
                  sb.append("\t");
                  int skillLoop = 0;
                  int skillSize = warriorSignet.skills.size();

                  for(Integer skill : warriorSignet.skills) {
                     sb.append(skill);
                     ++skillLoop;
                     if (skillLoop != skillSize) {
                        sb.append("|");
                     } else {
                        sb.append("\t");
                     }
                  }

                  int propertyLoop = 0;
                  int propertySize = warriorSignet.properties.size();

                  for(PropertyModel property : warriorSignet.properties) {
                     sb.append(property.getType()).append("|").append(property.getWay()).append("|").append(property.getValue());
                     ++propertyLoop;
                     if (propertyLoop != propertySize) {
                        sb.append(",");
                     } else {
                        sb.append("\t");
                     }
                  }

                  if (!warriorSignet.skills.isEmpty()) {
                     sb.append("(");

                     for(Integer skill : warriorSignet.skills) {
                        WarriorSignetSkillModel warriorSignetSkillModel = (WarriorSignetSkillModel)this.player.getGameModelPool().getEntity("warriorSignetSkill", skill);
                        if (warriorSignetSkillModel != null) {
                           sb.append(warriorSignetSkillModel.getName());
                           sb.append(",");
                        }
                     }

                     sb.append(")");
                  }

                  sb.append("\n");
               }

               this.print(sb);
            }
         }

      }
   }

   public void print(StringBuffer stringBuffer) {
      try {
         File file = new File("test/warriorsignet.txt");
         if (!file.exists()) {
            file.createNewFile();
         }

         FileWriter fileWriter = new FileWriter("test/warriorsignet.txt", true);
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
