package com.gzbz.db.arraying;

import cn.hutool.core.util.StrUtil;
import com.gzbz.battle.entity.Monster;
import com.gzbz.db.HeroDao;
import com.gzbz.db.bean.HeroMirror;
import com.gzbz.protobuf.CommonMsg;

public class HeroArrayingEntity extends ArrayingEntity {
   public HeroMirror mirror;

   public HeroArrayingEntity() {
   }

   public HeroArrayingEntity(int position, HeroDao heroDao) {
      this.positon = position;
      this.code = heroDao.code;
      this.mirror = HeroMirror.fromHeroBean(heroDao);
   }

   public HeroArrayingEntity(int position, HeroMirror heroMirror) {
      this.positon = position;
      this.code = heroMirror.code;
      this.mirror = heroMirror;
   }

   public HeroArrayingEntity(int position, Monster monster) {
      this.positon = position;
      this.code = 0;
      this.mirror = HeroMirror.fromMonster(monster);
   }

   public boolean heroAndFriend() {
      return true;
   }

   public int heroId() {
      return this.mirror.id;
   }

   public long power() {
      return this.mirror.combatPower;
   }

   public CommonMsg.CodeType entityType() {
      return CommonMsg.CodeType.CODE_HERO;
   }

   public CommonMsg.HeroInfo toBuilder() {
      return this.mirror.toBuilder().setPosition(this.positon).build();
   }

   public String encode() {
      StringBuffer sb = new StringBuffer();
      sb.append(this.positon).append("arrFor");
      sb.append(this.code).append("arrFor");
      sb.append(this.mirror.encode()).append("arrFor");
      return sb.toString();
   }

   public void decode(String str) {
      if (StrUtil.isNotEmpty(str)) {
         String[] array = StrUtil.split(str, "arrFor");
         if (array.length < 3) {
            return;
         }

         this.positon = Integer.parseInt(array[0]);
         this.code = Integer.parseInt(array[1]);
         HeroMirror heroMirror = new HeroMirror();
         heroMirror.decode(array[2]);
         this.mirror = heroMirror;
      }

   }
}
