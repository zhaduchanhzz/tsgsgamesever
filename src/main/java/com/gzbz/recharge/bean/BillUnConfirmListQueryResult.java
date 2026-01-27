package com.gzbz.recharge.bean;

import com.gzbz.db.RechargeDao;
import com.gzbz.model.fun.ResourceModel;
import db.ParsingResult;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import misc.JsonUtil;

public class BillUnConfirmListQueryResult implements ParsingResult {
   public List<RechargeDao> billList = new ArrayList();

   public void parsing(ResultSet resultSet) {
      try {
         while(resultSet.next()) {
            RechargeDao rechargeDao = new RechargeDao();
            rechargeDao.billNo = resultSet.getString("billNo");
            rechargeDao.rewards = JsonUtil.jsonToList(resultSet.getString("rewards"), ResourceModel.class);
            this.billList.add(rechargeDao);
         }
      } catch (SQLException e) {
         e.printStackTrace();
      }

   }
}
