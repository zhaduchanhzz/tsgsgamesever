package com.gzbz.activity.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gzbz.protobuf.ThemeActivityMsg;
import java.util.Map;
import org.springframework.util.StringUtils;

public class WeChatGiftInfo {
   private String spid;
   private Integer open_level;
   private Integer background;
   private String wechat_account;
   private String wechat_account_article;
   private String wechat_subscribe;
   private String wechat_subscribe_article;
   private String player_communication_group;
   private String player_communication_article;
   private Map<String, String> qrcode_url;
   private Integer update_time;
   @JsonIgnore
   private String serverQrCodeUrl;

   public ThemeActivityMsg.S2C_WeChatGift_12950.Builder buildMsg() {
      ThemeActivityMsg.S2C_WeChatGift_12950.Builder msg = ThemeActivityMsg.S2C_WeChatGift_12950.newBuilder();
      msg.setOpen(true);
      if (this.getOpen_level() != null) {
         msg.setOpenLv(this.getOpen_level());
      }

      if (this.getBackground() != null) {
         msg.setBackground(this.getBackground());
      }

      if (!StringUtils.isEmpty(this.getWechat_account())) {
         msg.setAccount(this.getWechat_account());
      }

      if (!StringUtils.isEmpty(this.getWechat_account_article())) {
         msg.setAccountArticle(this.getWechat_account_article());
      }

      if (!StringUtils.isEmpty(this.getWechat_subscribe())) {
         msg.setSubscribe(this.getWechat_subscribe());
      }

      if (!StringUtils.isEmpty(this.getWechat_subscribe_article())) {
         msg.setSubscribeArticle(this.getWechat_subscribe_article());
      }

      if (!StringUtils.isEmpty(this.getPlayer_communication_group())) {
         msg.setCommunicationNo(this.getPlayer_communication_group());
      }

      if (!StringUtils.isEmpty(this.getPlayer_communication_article())) {
         msg.setCommunicationArticle(this.getPlayer_communication_article());
      }

      if (!StringUtils.isEmpty(this.getServerQrCodeUrl())) {
         msg.setCommunicationCode(this.getServerQrCodeUrl());
      }

      return msg;
   }

   public String getSpid() {
      return this.spid;
   }

   public void setSpid(String spid) {
      this.spid = spid;
   }

   public Integer getOpen_level() {
      return this.open_level;
   }

   public void setOpen_level(Integer open_level) {
      this.open_level = open_level;
   }

   public Integer getBackground() {
      return this.background;
   }

   public void setBackground(Integer background) {
      this.background = background;
   }

   public String getWechat_account() {
      return this.wechat_account;
   }

   public void setWechat_account(String wechat_account) {
      this.wechat_account = wechat_account;
   }

   public String getWechat_account_article() {
      return this.wechat_account_article;
   }

   public void setWechat_account_article(String wechat_account_article) {
      this.wechat_account_article = wechat_account_article;
   }

   public String getWechat_subscribe() {
      return this.wechat_subscribe;
   }

   public void setWechat_subscribe(String wechat_subscribe) {
      this.wechat_subscribe = wechat_subscribe;
   }

   public String getWechat_subscribe_article() {
      return this.wechat_subscribe_article;
   }

   public void setWechat_subscribe_article(String wechat_subscribe_article) {
      this.wechat_subscribe_article = wechat_subscribe_article;
   }

   public String getPlayer_communication_group() {
      return this.player_communication_group;
   }

   public void setPlayer_communication_group(String player_communication_group) {
      this.player_communication_group = player_communication_group;
   }

   public String getPlayer_communication_article() {
      return this.player_communication_article;
   }

   public void setPlayer_communication_article(String player_communication_article) {
      this.player_communication_article = player_communication_article;
   }

   public Map<String, String> getQrcode_url() {
      return this.qrcode_url;
   }

   public void setQrcode_url(Map<String, String> qrcode_url) {
      this.qrcode_url = qrcode_url;
   }

   public Integer getUpdate_time() {
      return this.update_time;
   }

   public void setUpdate_time(Integer update_time) {
      this.update_time = update_time;
   }

   public String getServerQrCodeUrl() {
      return this.serverQrCodeUrl;
   }

   public void setServerQrCodeUrl(String serverQrCodeUrl) {
      this.serverQrCodeUrl = serverQrCodeUrl;
   }

   public String toString() {
      return "WeChatGiftInfo{spid='" + this.spid + '\'' + ", open_level=" + this.open_level + ", background=" + this.background + ", wechat_account='" + this.wechat_account + '\'' + ", wechat_account_article='" + this.wechat_account_article + '\'' + ", wechat_subscribe='" + this.wechat_subscribe + '\'' + ", wechat_subscribe_article='" + this.wechat_subscribe_article + '\'' + ", player_communication_group='" + this.player_communication_group + '\'' + ", player_communication_article='" + this.player_communication_article + '\'' + ", qrcode_url=" + this.qrcode_url + ", update_time=" + this.update_time + ", serverQrCodeUrl='" + this.serverQrCodeUrl + '\'' + '}';
   }
}
