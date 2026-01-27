package com.gzbz.model;

import com.google.common.base.Splitter;
import com.gzbz.model.fun.ConditionModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.ModelAnno;
import model.ModelColumnAnno;
import org.apache.commons.collections4.MapUtils;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

@ModelAnno(
   file = "skillEffect"
)
public class SkillEffectModel extends BaseModel {
   public static byte TRIGGER_TYPE_ROUND = 1;
   public static final byte TRIGGER_SCENE_OFF = 1;
   public static final byte TRIGGER_SCENE_ON = 2;
   public static final byte TRIGGER_SCENE_ALL = 3;
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "效果id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "name",
      comment = "名称",
      onlyReadOnDebugMode = true
   )
   private String name;
   @ModelColumnAnno(
      comment = "是否是被动效果0否1是"
   )
   private int isPassive;
   @ModelColumnAnno(
      comment = "是否前置执行"
   )
   private int isPre;
   @ModelColumnAnno(
      columnName = "parentSkillSlot",
      comment = "父技能,不填则为所有的技能添加一个效果"
   )
   private int parentSkillSlot;
   @ModelColumnAnno(
      columnName = "parentEffectIndex",
      comment = "替换父技能的某个效果，不填则为为父技能添加一个效果"
   )
   private int parentEffectIndex;
   @ModelColumnAnno(
      columnName = "checkDead",
      comment = "死亡后是否还生效"
   )
   private byte checkDead;
   @ModelColumnAnno(
      columnName = "tipsType",
      comment = "是否需要飘字"
   )
   private byte tipsType;
   @ModelColumnAnno(
      columnName = "onTriggerScene",
      comment = "是否在场上"
   )
   public byte onTriggerScene;
   @ModelColumnAnno(
      columnName = "sub",
      comment = "子类型"
   )
   public short sub;
   @ModelColumnAnno(
      columnName = "eventRate",
      comment = "事件几率"
   )
   public int eventRate;
   @ModelColumnAnno(
      columnConvertType = 3,
      columnName = "eventType",
      loadFun = "loadEvent",
      comment = "触发类型"
   )
   public HashMap<Integer, KeyValFun> eventType = new HashMap();
   @ModelColumnAnno(
      columnName = "triggerTimeType",
      comment = "触发次数计算类型"
   )
   private int triggerTimeType;
   @ModelColumnAnno(
      columnName = "triggerTime",
      comment = "触发次数"
   )
   private int triggerTime;
   @ModelColumnAnno(
      columnName = "coolDown",
      comment = "属性值"
   )
   private int coolDown;
   @ModelColumnAnno(
      columnName = "targetType",
      comment = "目标类型"
   )
   private byte targetType;
   @ModelColumnAnno(
      columnName = "selectType",
      comment = "选怪方式"
   )
   private short selectType;
   @ModelColumnAnno(
      columnName = "selectNum",
      comment = "选怪个数"
   )
   private short selectNum;
   @ModelColumnAnno(
      columnName = "selectParam",
      comment = "选怪参数"
   )
   private String selectParam;
   @ModelColumnAnno(
      columnName = "hit",
      comment = "是否计算命中"
   )
   private byte hit;
   @ModelColumnAnno(
      columnName = "crit",
      comment = "是否计算暴击"
   )
   private byte crit;
   @ModelColumnAnno(
      columnName = "control",
      comment = "是否计算抗控"
   )
   private byte control;
   @ModelColumnAnno(
      columnName = "isForce",
      comment = "是否不受封印影响"
   )
   private byte isForce;
   @ModelColumnAnno(
      columnName = "rateType",
      comment = "计算几率类型"
   )
   private byte rateType;
   @ModelColumnAnno(
      columnName = "rate",
      comment = "生效几率"
   )
   private int rate;
   @ModelColumnAnno(
      columnName = "rateParam",
      comment = "计算几率参数值"
   )
   private int rateParam;
   @ModelColumnAnno(
      columnName = "conditionType",
      comment = "条件类型1全部满足-2满足其中一个即可"
   )
   private byte conditionType;
   @ModelColumnAnno(
      columnName = "condition",
      columnConvertType = 1,
      subCls = ConditionModel.class,
      count = 2,
      comment = "条件函数"
   )
   private ArrayList<ConditionModel> conditions = new ArrayList();
   @ModelColumnAnno(
      columnName = "func",
      comment = "使用函数"
   )
   private short func;
   @ModelColumnAnno(
      columnConvertType = 3,
      columnName = "funcParamStr",
      loadFun = "loadParam",
      comment = "函数参数"
   )
   private Map<String, Integer> funcParam = new HashMap();
   @ModelColumnAnno(
      columnName = "funcTimes",
      comment = "使用次数"
   )
   private int funcTimes;
   @ModelColumnAnno(
      columnName = "calc",
      comment = "计算方式"
   )
   private int calc;
   @ModelColumnAnno(
      columnName = "property",
      comment = "属性"
   )
   private int property;
   @ModelColumnAnno(
      columnName = "propertyValue",
      comment = "属性值"
   )
   private int propertyValue;
   @ModelColumnAnno(
      columnName = "calc_lv",
      comment = "等级属性加成"
   )
   private int calc_lv;
   @ModelColumnAnno(
      columnName = "property_lv",
      comment = "等级属性加成"
   )
   private int property_lv;
   @ModelColumnAnno(
      columnName = "propertyValue_lv",
      comment = "等级属性加成"
   )
   private int propertyValue_lv;
   @ModelColumnAnno(
      columnName = "fetterType",
      comment = "羁绊类型"
   )
   private int fetterType;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "羁绊武将id"
   )
   private List<Integer> fetterId = new ArrayList();
   @ModelColumnAnno(
      columnName = "nation",
      comment = "阵营加成"
   )
   private int nation;
   @ModelColumnAnno(
      columnName = "needDressId",
      comment = "需要激活的英雄皮肤ID"
   )
   private int needDressId;
   @ModelColumnAnno(
      columnName = "fieldSkill",
      comment = "是否领域技能"
   )
   private int fieldSkill;

   public void loadParam(String data) {
      if (!StringUtils.isEmpty(data)) {
         String[] split = data.split("\\|");

         for(String str : split) {
            String[] temp = str.split(":");
            if (temp.length != 2) {
               LoggerFactory.getLogger(this.getClass()).error("技能效果使用函数参数配置有误 参数键值对错误 id:{}  str:{}", new Object[]{this.id, data, new RuntimeException()});
               return;
            }

            Integer value = (Integer)this.funcParam.get(temp[0]);
            if (value != null) {
               LoggerFactory.getLogger(this.getClass()).error("技能效果使用函数参数配置有误 参数重复 id:{}  str:{}", new Object[]{this.id, data, new RuntimeException()});
               return;
            }

            try {
               this.funcParam.put(temp[0], Integer.parseInt(temp[1]));
            } catch (Exception var10) {
               LoggerFactory.getLogger(this.getClass()).error("技能效果使用函数参数配置有误 参数异常 id:{}  str:{}  key:{} value:{}", new Object[]{this.id, data, temp[0], temp[1], new RuntimeException()});
               return;
            }
         }

      }
   }

   public void loadEvent(String data) {
      if (!StringUtils.isEmpty(data)) {
         if (data.indexOf(":") < 0) {
            KeyValFun keyValFun = new KeyValFun();
            if (data.indexOf("-") > -1) {
               String[] params = data.split("-");
               keyValFun.setKey(Integer.parseInt(params[0]));
               keyValFun.setExParams(params[1]);
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
                     String[] arrStr = params.split("-");
                     keyValFun.setVal(Integer.parseInt(arrStr[0]));
                     keyValFun.setExParams(arrStr[1]);
                  } else {
                     keyValFun.setVal(Integer.parseInt(params));
                  }

                  this.eventType.put(keyValFun.getKey(), keyValFun);
               }

            }
         }
      }
   }

   public int getParam(String key) {
      return !this.funcParam.containsKey(key) ? 0 : (Integer)this.funcParam.get(key);
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

   public int getIsPassive() {
      return this.isPassive;
   }

   public void setIsPassive(int isPassive) {
      this.checkModify();
      this.isPassive = isPassive;
   }

   public int getIsPre() {
      return this.isPre;
   }

   public void setIsPre(int isPre) {
      this.checkModify();
      this.isPre = isPre;
   }

   public int getParentSkillSlot() {
      return this.parentSkillSlot;
   }

   public void setParentSkillSlot(int parentSkillSlot) {
      this.checkModify();
      this.parentSkillSlot = parentSkillSlot;
   }

   public int getParentEffectIndex() {
      return this.parentEffectIndex;
   }

   public void setParentEffectIndex(int parentEffectIndex) {
      this.checkModify();
      this.parentEffectIndex = parentEffectIndex;
   }

   public int getTriggerTime() {
      return this.triggerTime;
   }

   public void setTriggerTime(int triggerTime) {
      this.checkModify();
      this.triggerTime = triggerTime;
   }

   public int getCoolDown() {
      return this.coolDown;
   }

   public void setCoolDown(int coolDown) {
      this.checkModify();
      this.coolDown = coolDown;
   }

   public byte getTargetType() {
      return this.targetType;
   }

   public void setTargetType(byte targetType) {
      this.checkModify();
      this.targetType = targetType;
   }

   public short getSelectType() {
      return this.selectType;
   }

   public void setSelectType(short selectType) {
      this.checkModify();
      this.selectType = selectType;
   }

   public short getSelectNum() {
      return this.selectNum;
   }

   public void setSelectNum(short selectNum) {
      this.checkModify();
      this.selectNum = selectNum;
   }

   public String getSelectParam() {
      return this.selectParam;
   }

   public void setSelectParam(String selectParam) {
      this.checkModify();
      this.selectParam = selectParam;
   }

   public byte getHit() {
      return this.hit;
   }

   public void setHit(byte hit) {
      this.checkModify();
      this.hit = hit;
   }

   public byte getCrit() {
      return this.crit;
   }

   public void setCrit(byte crit) {
      this.checkModify();
      this.crit = crit;
   }

   public byte getControl() {
      return this.control;
   }

   public void setControl(byte control) {
      this.checkModify();
      this.control = control;
   }

   public byte getIsForce() {
      return this.isForce;
   }

   public void setIsForce(byte force) {
      this.checkModify();
      this.isForce = force;
   }

   public int getRate() {
      return this.rate;
   }

   public void setRate(int rate) {
      this.checkModify();
      this.rate = rate;
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

   public short getFunc() {
      return this.func;
   }

   public void setFunc(short func) {
      this.checkModify();
      this.func = func;
   }

   public int getFuncTimes() {
      return this.funcTimes == 0 ? 1 : this.funcTimes;
   }

   public void setFuncTimes(int funcTimes) {
      this.checkModify();
      this.funcTimes = funcTimes;
   }

   public int getCalc() {
      return this.calc;
   }

   public void setCalc(int calc) {
      this.checkModify();
      this.calc = calc;
   }

   public int getProperty() {
      return this.property;
   }

   public void setProperty(int property) {
      this.checkModify();
      this.property = property;
   }

   public int getPropertyValue() {
      return this.propertyValue;
   }

   public void setPropertyValue(int propertyValue) {
      this.checkModify();
      this.propertyValue = propertyValue;
   }

   public int getId() {
      return this.id;
   }

   public HashMap<Integer, KeyValFun> getEventType() {
      return this.eventType;
   }

   public void setEventType(HashMap<Integer, KeyValFun> eventType) {
      this.checkModify();
      this.eventType = eventType;
   }

   public Map<String, Integer> getFuncParam() {
      return this.funcParam;
   }

   public int getFuncParamByDefault(String key) {
      return !this.funcParam.containsKey(key) ? 0 : (Integer)this.funcParam.get(key);
   }

   public void setFuncParam(Map<String, Integer> funcParam) {
      this.checkModify();
      this.funcParam = funcParam;
   }

   public byte getCheckDead() {
      return this.checkDead;
   }

   public void setCheckDead(byte checkDead) {
      this.checkDead = checkDead;
   }

   public int getFetterType() {
      return this.fetterType;
   }

   public void setFetterType(int fetterType) {
      this.checkModify();
      this.fetterType = fetterType;
   }

   public List<Integer> getFetterId() {
      return this.fetterId;
   }

   public void setFetterId(List<Integer> fetterId) {
      this.checkModify();
      this.fetterId = fetterId;
   }

   public int getCalc_lv() {
      return this.calc_lv;
   }

   public void setCalc_lv(int calc_lv) {
      this.checkModify();
      this.calc_lv = calc_lv;
   }

   public int getProperty_lv() {
      return this.property_lv;
   }

   public void setProperty_lv(int property_lv) {
      this.checkModify();
      this.property_lv = property_lv;
   }

   public int getPropertyValue_lv() {
      return this.propertyValue_lv;
   }

   public void setPropertyValue_lv(int propertyValue_lv) {
      this.checkModify();
      this.propertyValue_lv = propertyValue_lv;
   }

   public int getTriggerTimeType() {
      return this.triggerTimeType;
   }

   public int getNation() {
      return this.nation;
   }

   public void setNation(int nation) {
      this.checkModify();
      this.nation = nation;
   }

   public byte getTipsType() {
      return this.tipsType;
   }

   public void setTipsType(byte tipsType) {
      this.tipsType = tipsType;
   }

   public int getRateParam() {
      return this.rateParam;
   }

   public void setRateParam(int rateParam) {
      this.rateParam = rateParam;
   }

   public byte getRateType() {
      return this.rateType;
   }

   public void setRateType(byte rateType) {
      this.rateType = rateType;
   }

   public int getNeedDressId() {
      return this.needDressId;
   }

   public void setNeedDressId(int dressId) {
      this.checkModify();
      this.needDressId = dressId;
   }

   public int getFieldSkill() {
      return this.fieldSkill;
   }

   public void setFieldSkill(int fieldSkill) {
      this.checkModify();
      this.fieldSkill = fieldSkill;
   }
}
