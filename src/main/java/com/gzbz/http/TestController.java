package com.gzbz.http;

import cn.hutool.core.io.IoUtil;
import cn.hutool.core.util.RandomUtil;
import com.alibaba.fastjson.JSONObject;
import com.gzbz.battleTest.BattleTestMgr;
import com.gzbz.protobuf.DBServerMsg;
import com.gzbz.protobuf.LoginMsg;
import com.gzbz.udp.DBMsgReceiveList;
import com.gzbz.udp.DBMsgSendList;
import com.gzbz.udp.DBNettyClient;
import com.gzbz.worldMgr.WorldMgr;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
   @Autowired
   private WorldMgr worldMgr;
   @Autowired
   private DBMsgReceiveList receiveList;
   @Autowired
   private DBMsgSendList sendList;
   @Autowired
   private DBNettyClient client;

   @PostMapping({"test/msg"})
   public void test(HttpServletRequest request, HttpServletResponse response) {
      Enumeration<String> paramNames = request.getParameterNames();

      while(paramNames.hasMoreElements()) {
         String paramName = (String)paramNames.nextElement();
         System.out.println(request.getParameter(paramName));
      }

      LoginMsg.S2C_Respond_1004 msg = null;
      OutputStream outputStream = null;
      response.setHeader("REQUEST_PROTO_CODE", request.getHeader("REQUEST_PROTO_CODE"));

      try {
         List<String> list = new ArrayList();
         List var10000 = (List)IoUtil.readLines(request.getInputStream(), "UTF-8", list);
         outputStream = response.getOutputStream();
         outputStream.write("rayco 111111122222223333".getBytes("UTF-8"));
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         if (outputStream != null) {
            try {
               outputStream.flush();
               outputStream.close();
            } catch (IOException e) {
               e.printStackTrace();
            }
         }

      }

   }

   @GetMapping({"test/startBattle"})
   public void startBattle(HttpServletRequest request, HttpServletResponse response) {
      this.worldMgr.startBattleTest();
   }

   @GetMapping({"test/stopBattle"})
   public void stopBattle(HttpServletRequest request, HttpServletResponse response) {
      this.worldMgr.stopBattleTest();
      System.out.println("当前计算战斗数" + BattleTestMgr.times);
      System.out.println("开始就算战斗时间" + System.currentTimeMillis());
   }

   @GetMapping({"test/one"})
   public void testOne(HttpServletRequest request, HttpServletResponse response) {
      this.worldMgr.testOne();
   }

   @GetMapping({"print/gameDBStatus"})
   public void gameDBStatus() {
      this.sendList.printStatus();
      this.receiveList.printStatus();
   }

   @GetMapping({"print/DBStatus"})
   public void DBStatus() {
      DBServerMsg.S2DB_PrintStatus_14506.Builder builder = DBServerMsg.S2DB_PrintStatus_14506.newBuilder();
      this.client.sendMsg(builder.build(), 0);
   }

   @GetMapping({"/test/wechatGift"})
   @ResponseBody
   public String wechatGift() {
      JSONObject jsonObject = new JSONObject();
      jsonObject.put("ret", 0);
      jsonObject.put("msg", "suc");
      JSONObject dataJson = new JSONObject();
      dataJson.put("spid", "dev");
      dataJson.put("open_level", 1);
      dataJson.put("background", 0);
      dataJson.put("wechat_account", RandomUtil.randomString(10));
      dataJson.put("wechat_account_article", RandomUtil.randomString(50));
      dataJson.put("wechat_subscribe", RandomUtil.randomString(10));
      dataJson.put("wechat_subscribe_article", RandomUtil.randomString(50));
      dataJson.put("player_communication_group", RandomUtil.randomString(10));
      dataJson.put("player_communication_article", RandomUtil.randomString(50));
      JSONObject qrcodeObj = new JSONObject();
      List<String> picUrl = new ArrayList();
      picUrl.add("http://192.168.10.66:10001/11.png");
      picUrl.add("http://192.168.10.66:10001/33.png");
      qrcodeObj.put("0", "3,3|" + (String)picUrl.get(misc.RandomUtil.randInt(picUrl.size())));
      dataJson.put("qrcode_url", qrcodeObj);
      dataJson.put("update_time", RandomUtil.randomInt(10000));
      jsonObject.put("data", dataJson);
      return jsonObject.toJSONString();
   }
}
