package com.gzbz.model;

import com.gzbz.model.manager.ActivityOpenServerTimeBaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "artifactRelation"
)
public class ArtifactSkinRelationModel extends ActivityOpenServerTimeBaseModel {
   @ModelColumnAnno(
      comment = "时装id"
   )
   private int dressId;
   @ModelColumnAnno(
      comment = "激活道具id"
   )
   private int activateId;
   @ModelColumnAnno(
      comment = "夺宝道具id"
   )
   private int extractId;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class
   )
   private List<Integer> mailId = new ArrayList();

   public int getDressId() {
      return this.dressId;
   }

   public void setDressId(int dressId) {
      this.checkModify();
      this.dressId = dressId;
   }

   public int getActivateId() {
      return this.activateId;
   }

   public void setActivateId(int activateId) {
      this.checkModify();
      this.activateId = activateId;
   }

   public int getExtractId() {
      return this.extractId;
   }

   public void setExtractId(int extractId) {
      this.checkModify();
      this.extractId = extractId;
   }

   public List<Integer> getMailId() {
      return this.mailId;
   }

   public void setMailId(List<Integer> mailId) {
      this.checkModify();
      this.mailId = mailId;
   }

   public String getCustomExcelName() {
      return "customArtifactRelation";
   }
}
