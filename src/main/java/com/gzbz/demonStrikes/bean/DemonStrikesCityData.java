package com.gzbz.demonStrikes.bean;

import com.gzbz.model.DemonStrikesCityModel;
import com.gzbz.protobuf.DemonStrikesMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import misc.DateUtil;
import misc.MapUtil;

public class DemonStrikesCityData {
   public int cId;
   public boolean home;
   public int camp;
   public int state;
   public int st;
   public int oct;
   public Map<Integer, Integer> bOct = new HashMap();
   public Map<Integer, DemonStrikesHoldData> hold = new HashMap();
   public int aCity;
   public Map<Integer, Integer> rReward = new HashMap();
   public int rRewardId;
   public int rRewardT;
   public int bACity;
   public int pre;

   public void advance(DemonStrikesCityData actionCityData) {
      this.state = 4;
      this.aCity = actionCityData.cId;
      this.st = DateUtil.getIntTime(System.currentTimeMillis());
      this.bACity = 0;
      this.pre = actionCityData.cId;
      actionCityData.state = 4;
      actionCityData.st = this.st;
      actionCityData.bACity = this.cId;
      actionCityData.aCity = 0;
      actionCityData.pre = this.cId;
   }

   public void occupy() {
      if (!this.home) {
         this.state = DemonStrikesMsg.CityState.HOLD_RECUPERATION.getNumber();
         this.st = DateUtil.getIntTime(System.currentTimeMillis());
         this.bACity = 0;
         this.aCity = 0;
         this.pre = 0;
         this.recordOccupyTime();
         this.camp = 0;
      }
   }

   public int cityHoldSecond(long curTime) {
      if (this.camp != 0) {
         return 0;
      } else if (this.oct <= 0) {
         return 0;
      } else {
         int occupyTime = 0;

         for(Integer value : this.bOct.values()) {
            occupyTime += value;
         }

         return DateUtil.getIntTime(curTime) - this.oct + occupyTime;
      }
   }

   public int citySomeDayHoldSecond(long someTime) {
      if (this.oct <= 0) {
         return 0;
      } else {
         long someTimeOccupyTime = 0L;
         long ocTime = (long)this.oct * 1000L;
         if (this.camp == 0 && ocTime < someTime) {
            if (DateUtil.isSameDay(ocTime, someTime)) {
               someTimeOccupyTime = someTime - ocTime;
            } else {
               someTimeOccupyTime = someTime - DateUtil.getSomeDayBeginTime(System.currentTimeMillis());
            }
         }

         int time = DateUtil.getIntTime(DateUtil.getSomeDayBeginTime(someTime));
         return DateUtil.getIntTime(someTimeOccupyTime) + (Integer)MapUtil.getOrDefault(this.bOct, time, 0);
      }
   }

   public int holdNum() {
      return this.hold.size();
   }

   public DemonStrikesMsg.CityInfo.Builder buildCityMsg() {
      DemonStrikesMsg.CityInfo.Builder cityInfo = DemonStrikesMsg.CityInfo.newBuilder();
      cityInfo.setCityId(this.cId);
      cityInfo.setDefenseCount(this.hold.size());
      cityInfo.setState(DemonStrikesMsg.CityState.forNumber(this.state));
      cityInfo.setCamp(DemonStrikesMsg.Camp.forNumber(this.camp));
      int time = 0;
      switch (this.state) {
         case 2:
            time = ApplicationContextProvider.getConfigInt("demonPlayerRest", 0);
         case 3:
         default:
            break;
         case 4:
            time = ApplicationContextProvider.getConfigInt("demonNpcMove", 20);
            break;
         case 5:
            DemonStrikesCityModel actCityModel = (DemonStrikesCityModel)ApplicationContextProvider.getModelPoolEntity("demonWarCity", this.aCity);
            if (actCityModel != null) {
               time = actCityModel.getDemonWarFightTime();
            }
      }

      cityInfo.setStateTime(this.st + time);
      cityInfo.setActToCity(this.aCity);
      if (this.rRewardId > 0) {
         cityInfo.setRewardId(this.rRewardId);
         cityInfo.setRewardEndTime(this.rRewardT);
      }

      return cityInfo;
   }

   public int cityFightTime() {
      DemonStrikesCityModel cityModel = null;
      if (this.aCity > 0) {
         cityModel = (DemonStrikesCityModel)ApplicationContextProvider.getModelPoolEntity("demonWarCity", this.aCity);
      } else if (this.bACity > 0) {
         cityModel = (DemonStrikesCityModel)ApplicationContextProvider.getModelPoolEntity("demonWarCity", this.bACity);
      }

      return cityModel == null ? 0 : cityModel.getDemonWarFightTime();
   }

   public void recordOccupyTime() {
      Calendar calendar = Calendar.getInstance();
      calendar.set(13, 0);
      int curTime = DateUtil.getIntTime(calendar.getTimeInMillis());
      if (this.camp == 0 && this.oct > 0) {
         int difDay = DateUtil.difftimeDay(new Timestamp((long)this.oct * 1000L));

         for(int day = difDay; day >= 0; --day) {
            int time = DateUtil.getIntTime(DateUtil.getSomeDayBeginTime((long)this.oct * 1000L + 86400000L * (long)day));
            int occupyTime;
            if (day == difDay) {
               if (DateUtil.isSameDay((long)this.oct * 1000L)) {
                  occupyTime = DateUtil.getIntTime(calendar.getTimeInMillis() - (long)this.oct * 1000L);
               } else {
                  occupyTime = DateUtil.getIntTime(calendar.getTimeInMillis() - DateUtil.getSomeDayBeginTime(calendar.getTimeInMillis()));
               }
            } else if (day == 0) {
               occupyTime = DateUtil.getIntTime(DateUtil.getSomeDayEndTime((long)this.oct * 1000L) - (long)this.oct * 1000L);
            } else {
               occupyTime = DateUtil.getIntTime(86399999L);
            }

            this.bOct.put(time, (Integer)MapUtil.getOrDefault(this.bOct, time, 0) + occupyTime);
         }
      }

      this.oct = curTime;
   }

   public DemonStrikesCityData(int cId, int state) {
      this.cId = cId;
      this.state = state;
   }

   public DemonStrikesCityData() {
   }

   public String toString() {
      return "DemonStrikesCityData{cityId=" + this.cId + ", isHome=" + this.home + ", camp=" + this.camp + ", state=" + this.state + ", stateTime=" + this.st + ", occupyTime=" + this.oct + ", beforeOccupy=" + this.bOct + ", hold=" + this.hold.size() + ", actToCity=" + this.aCity + ", randomReward=" + this.rReward + ", randomRewardId=" + this.rRewardId + ", randomRewardTime=" + this.rRewardT + ", beActToCity=" + this.bACity + '}';
   }
}
