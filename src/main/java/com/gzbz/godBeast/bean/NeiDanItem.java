package com.gzbz.godBeast.bean;

import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerBag.ItemBase;
import com.gzbz.model.ItemModel;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.protobuf.CommonMsg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;

public class NeiDanItem extends ItemBase {
   public int level;
   public int exp;
   public int entryId;
   public List<PropertyModel> entryPro = new ArrayList();
   public Map<Integer, NeiDanItem> deputyNeiDan = new HashMap();
   public int state = 0;
   public int martRecTime;

   public NeiDanItem() {
   }

   public NeiDanItem(int id, int level, int exp, int entryId, List<PropertyModel> entryPro) {
      this.id = id;
      this.num = 1;
      this.level = level;
      this.exp = exp;
      this.entryId = entryId;
      this.entryPro = entryPro;
   }

   public NeiDanItem(int code, NeiDanItem data) {
      this.code = code;
      this.id = data.id;
      this.num = data.num;
      this.enableTime = data.enableTime;
      this.level = data.level;
      this.exp = data.exp;
      this.entryId = data.entryId;
      this.entryPro.addAll(data.entryPro);
      this.deputyNeiDan.putAll(data.deputyNeiDan);
      this.state = data.state;
      this.martRecTime = data.martRecTime;
   }

   public void init(int code, int num, ItemModel itemModel, GamePlayer gamePlayer) {
      super.init(code, num, itemModel, gamePlayer);
      this.level = 0;
      this.exp = 0;
      this.entryId = 0;
      this.entryPro.clear();
      this.martRecTime = 0;
   }

   public boolean checkReset() {
      return this.level > 0 || this.exp > 0;
   }

   public void decode(String data) {
      if (!StringUtils.isBlank(data)) {
         String[] outer = data.split(";");
         this.code = Integer.parseInt(outer[0]);
         this.id = Integer.parseInt(outer[1]);
         this.num = Integer.parseInt(outer[2]);
         this.enableTime = Integer.parseInt(outer[3]);
         this.level = Integer.parseInt(outer[4]);
         this.exp = Integer.parseInt(outer[5]);
         this.entryId = Integer.parseInt(outer[6]);
         this.state = Integer.parseInt(outer[7]);
         if (outer.length > 8) {
            String[] type_way_valStrArr = outer[8].split("_");

            for(String type_way_valStr : type_way_valStrArr) {
               String[] type_way_val = type_way_valStr.split(":");
               if (type_way_val.length >= 3) {
                  int type = Integer.parseInt(type_way_val[0]);
                  int way = Integer.parseInt(type_way_val[1]);
                  int val = Integer.parseInt(type_way_val[2]);
                  PropertyModel p = new PropertyModel(type, way, (long)val);
                  this.entryPro.add(p);
               }
            }
         }

         if (outer.length > 9) {
            String[] deputyNeiDanMapStrArr = outer[9].split("#");

            for(String deputyNeiDanMapStr : deputyNeiDanMapStrArr) {
               String[] deputyNeiDanMap = deputyNeiDanMapStr.split("=");
               if (deputyNeiDanMap.length >= 2) {
                  int pos = Integer.parseInt(deputyNeiDanMap[0]);
                  NeiDanItem deputyNeiDan = new NeiDanItem();
                  String decodeStr = deputyNeiDanMap[1].replaceAll("@", ";");
                  deputyNeiDan.decode(decodeStr);
                  this.deputyNeiDan.put(pos, deputyNeiDan);
               }
            }
         }

         if (outer.length > 10) {
            this.martRecTime = Integer.parseInt(outer[10]);
         }

      }
   }

   public String encode() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.code);
      stringBuilder.append(";");
      stringBuilder.append(this.id);
      stringBuilder.append(";");
      stringBuilder.append(this.num);
      stringBuilder.append(";");
      stringBuilder.append(this.enableTime);
      stringBuilder.append(";");
      stringBuilder.append(this.level);
      stringBuilder.append(";");
      stringBuilder.append(this.exp);
      stringBuilder.append(";");
      stringBuilder.append(this.entryId);
      stringBuilder.append(";");
      stringBuilder.append(this.state);
      stringBuilder.append(";");

      for(PropertyModel p : this.entryPro) {
         stringBuilder.append(p.getType());
         stringBuilder.append(":");
         stringBuilder.append(p.getWay());
         stringBuilder.append(":");
         stringBuilder.append(p.getValue());
         stringBuilder.append("_");
      }

      stringBuilder.append(";");

      for(Map.Entry<Integer, NeiDanItem> entry : this.deputyNeiDan.entrySet()) {
         Integer pos = (Integer)entry.getKey();
         NeiDanItem deputyNeiDan = (NeiDanItem)entry.getValue();
         String deputyNeiDanEncode = deputyNeiDan.encode().replaceAll(";", "@");
         stringBuilder.append(pos);
         stringBuilder.append("=");
         stringBuilder.append(deputyNeiDanEncode);
         stringBuilder.append("#");
      }

      stringBuilder.append(";");
      stringBuilder.append(this.martRecTime);
      return stringBuilder.toString();
   }

   public void reset() {
      this.level = 0;
      this.exp = 0;
      this.deputyNeiDan.clear();
   }

   public CommonMsg.NeiDanInfo.Builder recNeiDanInfoBuilder() {
      CommonMsg.NeiDanInfo.Builder builder = CommonMsg.NeiDanInfo.newBuilder();
      builder.setId(this.id);
      builder.setLv(this.level);
      builder.setExp(this.exp);
      builder.setEntryId(this.entryId);
      builder.setMartRecTime(this.martRecTime);

      for(PropertyModel pm : this.entryPro) {
         builder.addEntryPro(pm.recPropertyBuilder());
      }

      for(Map.Entry<Integer, NeiDanItem> entry : this.deputyNeiDan.entrySet()) {
         Integer pos = (Integer)entry.getKey();
         NeiDanItem deputyNeiDan = (NeiDanItem)entry.getValue();
         deputyNeiDan.deputyNeiDan.clear();
         CommonMsg.NeiDanPos.Builder neiDanPosBuilder = CommonMsg.NeiDanPos.newBuilder();
         neiDanPosBuilder.setPos(pos);
         neiDanPosBuilder.setNeiDanInfo(deputyNeiDan.recNeiDanInfoBuilder());
         builder.addDeputyNeiDan(neiDanPosBuilder);
      }

      builder.setState(this.state);
      return builder;
   }

   public String toLogString() {
      return "{内丹id:" + this.id + ",内丹等级:" + this.level + ",内丹经验:" + this.exp + ",内丹词条id:" + this.entryId + "}";
   }
}
