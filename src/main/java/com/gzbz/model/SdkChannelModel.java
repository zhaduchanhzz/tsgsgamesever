package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "sddChannel"
)
public class SdkChannelModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "渠道ID"
   )
   private int channelId;
   @ModelColumnAnno(
      comment = "验证URL"
   )
   private String verUrl;
   @ModelColumnAnno(
      comment = "appkey"
   )
   private String appKey;
   @ModelColumnAnno(
      comment = "paykey"
   )
   private String payKey;
   @ModelColumnAnno(
      comment = "secrect"
   )
   private String secrect;

   public int getChannelId() {
      return this.channelId;
   }

   public void setChannelId(int channelId) {
      this.checkModify();
      this.channelId = channelId;
   }

   public String getVerUrl() {
      return this.verUrl;
   }

   public void setVerUrl(String verUrl) {
      this.checkModify();
      this.verUrl = verUrl;
   }

   public String getAppKey() {
      return this.appKey;
   }

   public void setAppKey(String appKey) {
      this.checkModify();
      this.appKey = appKey;
   }

   public String getPayKey() {
      return this.payKey;
   }

   public void setPayKey(String payKey) {
      this.checkModify();
      this.payKey = payKey;
   }

   public String getSecrect() {
      return this.secrect;
   }

   public void setSecrect(String secrect) {
      this.checkModify();
      this.secrect = secrect;
   }
}
