package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "stonehengeType"
)
public class StonehengeTypeModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "路线类型"
   )
   private int type;
   @ModelColumnAnno(
      comment = "位置设定(1起点 2终点 3普通)"
   )
   private int site;
   @ModelColumnAnno(
      comment = "是否可移动(0非 1可)"
   )
   private int isMove;
   @ModelColumnAnno(
      comment = "相连房间",
      columnConvertType = 2,
      subCls = Integer.class
   )
   private List<Integer> relatedRooms = new ArrayList();
   @ModelColumnAnno(
      comment = "事件类型"
   )
   private int eventType;
   @ModelColumnAnno(
      comment = "额外参数1"
   )
   private int eventId1;
   @ModelColumnAnno(
      comment = "额外参数2"
   )
   private int eventId2;
   @ModelColumnAnno(
      comment = "额外参数3"
   )
   private int eventId3;

   public int getId() {
      return this.id;
   }

   public int getType() {
      return this.type;
   }

   public int getSite() {
      return this.site;
   }

   public boolean getIsMove() {
      return this.isMove == 1;
   }

   public List<Integer> getRelatedRooms() {
      return this.relatedRooms;
   }

   public int getEventType() {
      return this.eventType;
   }

   public int getEventId1() {
      return this.eventId1;
   }

   public int getEventId2() {
      return this.eventId2;
   }

   public int getEventId3() {
      return this.eventId3;
   }
}
