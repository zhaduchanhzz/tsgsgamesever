package com.gzbz.model;

import com.google.common.base.Splitter;
import com.gzbz.model.fun.BuffUseFun;
import com.gzbz.model.fun.ConditionModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import model.ModelAnno;
import model.ModelColumnAnno;
import org.apache.commons.collections4.MapUtils;
import org.springframework.util.StringUtils;

@ModelAnno(
   file = "buff"
)
public class BuffModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "主id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "name",
      onlyReadOnDebugMode = true
   )
   private String name;
   @ModelColumnAnno(
      columnName = "isPassive",
      comment = "是否被动"
   )
   private int isPassive;
   @ModelColumnAnno(
      columnName = "isForce",
      comment = "是否不受封印影响"
   )
   private byte isForce;
   @ModelColumnAnno(
      columnName = "type",
      comment = "类型"
   )
   private byte type;
   @ModelColumnAnno(
      columnName = "round",
      comment = "回合数"
   )
   private short round;
   @ModelColumnAnno(
      columnName = "exForce",
      comment = "对谋方外加回合数"
   )
   private byte exForce;
   @ModelColumnAnno(
      columnName = "exRound",
      comment = "对谋方外加回合数"
   )
   private short exRound;
   @ModelColumnAnno(
      columnName = "combine",
      comment = "叠加数量"
   )
   private short combine;
   @ModelColumnAnno(
      columnName = "useTimes",
      comment = "使用次数"
   )
   private int useTimes;
   @ModelColumnAnno(
      columnName = "noDispel",
      comment = "0可以驱散1不可驱散"
   )
   private byte noDispel;
   @ModelColumnAnno(
      columnName = "forever",
      comment = "一直戴在人身上"
   )
   private byte forever;
   @ModelColumnAnno(
      columnName = "subCls",
      comment = "小类型"
   )
   private short subCls;
   @ModelColumnAnno(
      columnName = "conditionType",
      comment = "条件类型1全部满足-2满足其中一个即可"
   )
   private byte conditionType;
   @ModelColumnAnno(
      columnName = "checkDead",
      comment = "死亡后是否还生效"
   )
   private byte checkDead;
   @ModelColumnAnno(
      columnConvertType = 3,
      columnName = "eventType",
      loadFun = "loadEvent",
      comment = "触发类型"
   )
   private HashMap<Integer, KeyValFun> eventType = new HashMap();
   @ModelColumnAnno(
      columnConvertType = 1,
      columnName = "condition",
      subCls = ConditionModel.class,
      count = 2,
      comment = "条件函数"
   )
   private ArrayList<ConditionModel> conditions = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      columnName = "Func",
      subCls = BuffUseFun.class,
      count = 2,
      comment = "技能效果"
   )
   private HashMap<Integer, BuffUseFun> funcs = new HashMap();

   public void loadEvent(String data) {
      if (!StringUtils.isEmpty(data)) {
         if (data.indexOf(":") < 0) {
            KeyValFun keyValFun = new KeyValFun();
            if (data.indexOf("-") > -1) {
               String[] strArr = data.split("-");
               keyValFun.setKey(Integer.parseInt(strArr[0]));
               keyValFun.setExParams(strArr[1]);
            } else {
               keyValFun.setKey(Integer.parseInt(data));
            }

            this.eventType.put(keyValFun.getKey(), keyValFun);
         } else {
            Map<String, String> map = Splitter.on("|").trimResults().withKeyValueSeparator(":").split(data);
            if (!MapUtils.isEmpty(map)) {
               for(Map.Entry<String, String> entry : map.entrySet()) {
                  KeyValFun keyValFun = new KeyValFun();
                  keyValFun.setKey(Integer.parseInt((String)entry.getKey()));
                  String params = (String)entry.getValue();
                  if (params.indexOf("-") > -1) {
                     String[] strArr = params.split("-");
                     keyValFun.setVal(Integer.parseInt(strArr[0]));
                     keyValFun.setExParams(strArr[1]);
                  } else {
                     keyValFun.setVal(Integer.parseInt(params));
                  }

                  this.eventType.put(keyValFun.getKey(), keyValFun);
               }

            }
         }
      }
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getIsPassive() {
      return this.isPassive;
   }

   public void setIsPassive(int isPassive) {
      this.checkModify();
      this.isPassive = isPassive;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public byte getIsForce() {
      return this.isForce;
   }

   public void setIsForce(byte force) {
      this.checkModify();
      this.isForce = force;
   }

   public byte getType() {
      return this.type;
   }

   public void setType(byte type) {
      this.checkModify();
      this.type = type;
   }

   public short getRound() {
      return this.round;
   }

   public void setRound(short round) {
      this.checkModify();
      this.round = round;
   }

   public short getCombine() {
      return this.combine;
   }

   public void setCombine(short combine) {
      this.checkModify();
      this.combine = combine;
   }

   public byte getNoDispel() {
      return this.noDispel;
   }

   public void setNoDispel(byte noDispel) {
      this.checkModify();
      this.noDispel = noDispel;
   }

   public byte getForever() {
      return this.forever;
   }

   public void setForever(byte forever) {
      this.checkModify();
      this.forever = forever;
   }

   public short getSubCls() {
      return this.subCls;
   }

   public void setSubCls(short subCls) {
      this.checkModify();
      this.subCls = subCls;
   }

   public byte getConditionType() {
      return this.conditionType;
   }

   public void setConditionType(byte conditionType) {
      this.checkModify();
      this.conditionType = conditionType;
   }

   public ArrayList<ConditionModel> getConditions() {
      return this.conditions;
   }

   public void setConditions(ArrayList<ConditionModel> conditions) {
      this.checkModify();
      this.conditions = conditions;
   }

   public HashMap<Integer, KeyValFun> getEventType() {
      return this.eventType;
   }

   public void setEventType(HashMap<Integer, KeyValFun> eventType) {
      this.checkModify();
      this.eventType = eventType;
   }

   public HashMap<Integer, BuffUseFun> getFuncs() {
      return this.funcs;
   }

   public void setFuncs(HashMap<Integer, BuffUseFun> funcs) {
      this.checkModify();
      this.funcs = funcs;
   }

   public byte getCheckDead() {
      return this.checkDead;
   }

   public void setCheckDead(byte checkDead) {
      this.checkDead = checkDead;
   }

   public int getUseTimes() {
      return this.useTimes;
   }

   public void setUseTimes(int useTimes) {
      this.useTimes = useTimes;
   }

   public byte getExForce() {
      return this.exForce;
   }

   public short getExRound() {
      return this.exRound;
   }
}
