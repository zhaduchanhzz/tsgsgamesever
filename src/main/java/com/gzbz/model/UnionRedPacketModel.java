package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "unionRedpacket"
)
public class UnionRedPacketModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "giftId",
      comment = "礼包id"
   )
   private int giftId;
   @ModelColumnAnno(
      columnName = "grantItem",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "发放者奖励"
   )
   private List<ResourceModel> grantItem = new ArrayList();
   @ModelColumnAnno(
      columnName = "redPacketNum",
      comment = "红包数量"
   )
   private int redPacketNum;
   @ModelColumnAnno(
      columnName = "redPacketItemType",
      comment = "红包内钱币类型"
   )
   private int redPacketItemType;
   @ModelColumnAnno(
      columnName = "redPacketItemId",
      comment = "钱币id"
   )
   private int redPacketItemId;
   @ModelColumnAnno(
      columnName = "redPacketItemNum",
      comment = "钱币数量"
   )
   private int redPacketItemNum;
   @ModelColumnAnno(
      columnName = "desTip",
      comment = "标签"
   )
   private String desTip;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getGiftId() {
      return this.giftId;
   }

   public void setGiftId(int giftId) {
      this.checkModify();
      this.giftId = giftId;
   }

   public List<ResourceModel> getGrantItem() {
      return this.grantItem;
   }

   public void setGrantItem(List<ResourceModel> grantItem) {
      this.checkModify();
      this.grantItem = grantItem;
   }

   public int getRedPacketNum() {
      return this.redPacketNum;
   }

   public void setRedPacketNum(int redPacketNum) {
      this.checkModify();
      this.redPacketNum = redPacketNum;
   }

   public int getRedPacketItemType() {
      return this.redPacketItemType;
   }

   public void setRedPacketItemType(int redPacketItemType) {
      this.checkModify();
      this.redPacketItemType = redPacketItemType;
   }

   public int getRedPacketItemId() {
      return this.redPacketItemId;
   }

   public void setRedPacketItemId(int redPacketItemId) {
      this.checkModify();
      this.redPacketItemId = redPacketItemId;
   }

   public int getRedPacketItemNum() {
      return this.redPacketItemNum;
   }

   public void setRedPacketItemNum(int redPacketItemNum) {
      this.checkModify();
      this.redPacketItemNum = redPacketItemNum;
   }

   public String getDesTip() {
      return this.desTip;
   }

   public void setDesTip(String desTip) {
      this.checkModify();
      this.desTip = desTip;
   }
}
