package com.gzbz.db.bean;

import com.gzbz.dragonVein.DragonVeinDefine;
import com.gzbz.protobuf.DragonVeinMsg;
import java.util.ArrayList;
import java.util.List;

public class DragonSoulData {
   private int code;
   private int position;
   private int soulLv;
   private int quality;
   private List<HeroTypeAttrData> attr = new ArrayList();
   private int groupSkillId;

   public DragonSoulData() {
   }

   public DragonSoulData(int code, int position, int soulLv, int quality, List<HeroTypeAttrData> attr, int groupSkillId) {
      this.code = code;
      this.position = position;
      this.soulLv = soulLv;
      this.quality = quality;
      this.attr = attr;
      this.groupSkillId = groupSkillId;
   }

   public DragonSoulData(int position, int soulLv, int quality, List<HeroTypeAttrData> attr, int groupSkillId) {
      this.position = position;
      this.soulLv = soulLv;
      this.quality = quality;
      this.attr = attr;
      this.groupSkillId = groupSkillId;
   }

   public int getCode() {
      return this.code;
   }

   public void setCode(int code) {
      this.code = code;
   }

   public int getPosition() {
      return this.position;
   }

   public void setPosition(int position) {
      this.position = position;
   }

   public int getSoulLv() {
      return this.soulLv;
   }

   public void setSoulLv(int soulLv) {
      this.soulLv = soulLv;
   }

   public int getQuality() {
      return this.quality;
   }

   public void setQuality(int quality) {
      this.quality = quality;
   }

   public List<HeroTypeAttrData> getAttr() {
      return this.attr;
   }

   public void setAttr(List<HeroTypeAttrData> attr) {
      this.attr = attr;
   }

   public int getGroupSkillId() {
      return this.groupSkillId;
   }

   public void setGroupSkillId(int groupSkillId) {
      this.groupSkillId = groupSkillId;
   }

   public DragonVeinMsg.SoulData.Builder toBuilder() {
      DragonVeinMsg.SoulData.Builder dataBuilder = DragonVeinMsg.SoulData.newBuilder();
      dataBuilder.setCode(this.getCode());
      dataBuilder.setPosition(this.getPosition());
      dataBuilder.setSoulLv(this.getSoulLv());
      dataBuilder.setQuality(this.getQuality());
      dataBuilder.setScore(this.calScore());

      for(HeroTypeAttrData a : this.getAttr()) {
         DragonVeinMsg.HeroTypeAttr.Builder attrBuilder = DragonVeinMsg.HeroTypeAttr.newBuilder();
         attrBuilder.setHeroType(a.getHeroType());
         attrBuilder.setType(a.getType());
         attrBuilder.setWay(a.getWay());
         attrBuilder.setVal(a.getVal());
         dataBuilder.addAttr(attrBuilder);
      }

      dataBuilder.setGroupSkillId(this.getGroupSkillId());
      return dataBuilder;
   }

   public long calScore() {
      if (this.getAttr().isEmpty()) {
         return 0L;
      } else {
         long s = 0L;

         for(HeroTypeAttrData attrData : this.getAttr()) {
            s += DragonVeinDefine.calAttrScore(attrData.getType(), attrData.getWay(), (long)attrData.getVal());
         }

         return s;
      }
   }
}
