package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "DecisiveStamp"
)
public class DecisiveStampModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "职业"
   )
   private int type;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "配饰id"
   )
   private List<Integer> stampId = new ArrayList();
   @ModelColumnAnno(
      comment = "机器人配饰"
   )
   private String RobotStampId;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public List<Integer> getStampId() {
      return this.stampId;
   }

   public void setStampId(List<Integer> stampId) {
      this.checkModify();
      this.stampId = stampId;
   }

   public String getRobotStampId() {
      return this.RobotStampId;
   }

   public void setRobotStampId(String robotStampId) {
      this.checkModify();
      this.RobotStampId = robotStampId;
   }
}
