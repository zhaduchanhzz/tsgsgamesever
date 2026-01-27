package com.gzbz.bugMail;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import mail.MailServer;
import misc.MD5Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;

public class BugMail extends MailServer {
   static Logger logger = LoggerFactory.getLogger(BugMail.class);
   @Value("${spring.mail.host}")
   private String mailHost;
   @Value("${spring.mail.port}")
   private int mailPost;
   @Value("${spring.mail.username}")
   private String mailAccount;
   @Value("${spring.mail.password}")
   private String password;
   @Value("${spring.mail.recipient}")
   private String recipient;
   @Value("${spring.mail.url}")
   public String mailUrl;
   public Integer GAME_SERVER_ID;
   @Value("${PlatformId}")
   public int PLATFORM_ID;
   @Value("${ServerName}")
   public String GAME_SERVER_NAME;
   @Value("${PlatformName}")
   public String PLATFORM_NAME;
   @Autowired
   private Environment env;
   private List<String> recipientList = new ArrayList();
   private HashSet<String> submittedHash = new HashSet();
   private int bugsNum;

   @PostConstruct
   void init() {
      this.GAME_SERVER_ID = (Integer)this.env.getProperty("ServerId", Integer.class);
      if (this.GAME_SERVER_ID == null) {
         this.GAME_SERVER_ID = (Integer)this.env.getProperty("ServerZone", Integer.class);
      }

      super.init(this.mailHost, this.mailPost, this.mailAccount, this.password);

      for(String str : this.recipient.split(",")) {
         this.recipientList.add(String.format("%s@%s", str, this.mailUrl));
      }

   }

   @PreDestroy
   public void destroy() {
      super.destroy();
   }

   public synchronized void sendBugMail(String msg, String stack) {
      if (this.bugsNum <= 100) {
         ++this.bugsNum;
         String hashCode = MD5Util.encode(stack);
         if (!this.submittedHash.contains(hashCode)) {
            this.submittedHash.add(hashCode);

            try {
               String title = String.format("%d-%s-%d-%s", this.PLATFORM_ID, this.PLATFORM_NAME, this.GAME_SERVER_ID, this.GAME_SERVER_NAME);
               super.send(this.recipientList, title, stack);
            } catch (Exception var5) {
               logger.info("无法上报bug给邮件服务器");
            }

         }
      }
   }

   public synchronized void sendBugMail(Throwable e) {
      if (this.bugsNum <= 100) {
         ++this.bugsNum;
         StringWriter sw = new StringWriter();
         PrintWriter pw = new PrintWriter(sw);
         e.printStackTrace(pw);

         try {
            String stack = sw.toString();
            String hashCode = MD5Util.encode(stack);
            if (!this.submittedHash.contains(hashCode)) {
               this.submittedHash.add(hashCode);
               String title = this.PLATFORM_NAME + "---" + this.GAME_SERVER_NAME;
               title = new String(title.getBytes("gbk"), "utf-8");
               this.send(this.recipientList, title + "---" + this.PLATFORM_ID + "---" + this.GAME_SERVER_ID + " ---" + e.getMessage(), sw.toString());
               return;
            }
         } catch (Exception var16) {
            logger.info("无法上报bug给邮件服务器");
            return;
         } finally {
            try {
               pw.close();
               sw.close();
            } catch (Exception var15) {
            }

         }

      }
   }
}
