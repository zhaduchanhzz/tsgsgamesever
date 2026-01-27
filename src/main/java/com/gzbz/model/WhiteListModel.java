package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "whiteList"
)
public class WhiteListModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private String ip;
}
