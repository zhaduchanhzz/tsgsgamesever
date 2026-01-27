package com.gzbz.model;

import com.gzbz.model.fun.BoxNeedFun;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "northSection"
)
public class NorthSectionModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "章节id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "章节名称"
   )
   private String name;
   @ModelColumnAnno(
      comment = "英雄半身像"
   )
   private int heroIcon;
   @ModelColumnAnno(
      comment = "解锁的章节id"
   )
   private int openSectionId;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = BoxNeedFun.class,
      count = 3,
      comment = "宝箱"
   )
   private List<BoxNeedFun> boxes = new ArrayList();
   @ModelColumnAnno(
      comment = "章节图片路径"
   )
   private String CopyImagPath;
   @ModelColumnAnno(
      comment = "关卡数量"
   )
   private int copyNumber;
   @ModelColumnAnno(
      columnConvertType = 4,
      subCls = Integer.class,
      count = 10,
      comment = "关卡"
   )
   private List<Integer> copies = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public int getHeroIcon() {
      return this.heroIcon;
   }

   public void setHeroIcon(int heroIcon) {
      this.checkModify();
      this.heroIcon = heroIcon;
   }

   public int getOpenSectionId() {
      return this.openSectionId;
   }

   public void setOpenSectionId(int openSectionId) {
      this.checkModify();
      this.openSectionId = openSectionId;
   }

   public List<BoxNeedFun> getBoxes() {
      return this.boxes;
   }

   public void setBoxes(List<BoxNeedFun> boxes) {
      this.checkModify();
      this.boxes = boxes;
   }

   public String getCopyImagPath() {
      return this.CopyImagPath;
   }

   public void setCopyImagPath(String CopyImagPath) {
      this.checkModify();
      this.CopyImagPath = CopyImagPath;
   }

   public int getCopyNumber() {
      return this.copyNumber;
   }

   public void setCopyNumber(int copyNumber) {
      this.checkModify();
      this.copyNumber = copyNumber;
   }

   public List<Integer> getCopies() {
      return this.copies;
   }

   public void setCopies(List<Integer> copies) {
      this.checkModify();
      this.copies = copies;
   }
}
