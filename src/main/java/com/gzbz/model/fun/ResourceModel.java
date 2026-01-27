package com.gzbz.model.fun;

import com.gzbz.model.HeroModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.LanguageModel;
import com.gzbz.model.PlayerProperty;
import com.gzbz.model.manager.BaseModel;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import model.ModelColumnAnno;
import model.ModelCombinationAnno;
import org.springframework.util.StringUtils;

@ModelCombinationAnno
public class ResourceModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "type",
      comment = "类型"
   )
   private int type;
   @ModelColumnAnno(
      columnName = "id",
      comment = "ID"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "value",
      comment = "数量"
   )
   private int value;
   private int createTime;

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getValue() {
      return this.value;
   }

   public void setValue(int value) {
      this.checkModify();
      this.value = value;
   }

   public int getCreateTime() {
      return this.createTime;
   }

   public void setCreateTime(int createTime) {
      this.createTime = createTime;
   }

   public ResourceModel() {
   }

   public ResourceModel(int type, int id) {
      this.type = type;
      this.id = id;
   }

   public ResourceModel(int type, int id, int value) {
      this.type = type;
      this.id = id;
      this.value = value;
   }

   public static List<CommonMsg.ItemInfo> builderList(List<ResourceModel> resourceModelList) {
      ArrayList<CommonMsg.ItemInfo> list = new ArrayList();

      for(ResourceModel resourceModel : resourceModelList) {
         list.add(resourceModel.builder());
      }

      return list;
   }

   public CommonMsg.ItemInfo builder() {
      CommonMsg.ItemInfo.Builder builder = CommonMsg.ItemInfo.newBuilder();
      builder.setType(this.type);
      builder.setId(this.id);
      builder.setNum(this.value);
      return builder.build();
   }

   public void addResourceToList(List<ResourceModel> resourceModelList) {
      if (resourceModelList != null) {
         Optional<ResourceModel> resourceModelOptional = resourceModelList.stream().filter((rewardItem) -> rewardItem.type == this.type && rewardItem.id == this.id).findFirst();
         if (!resourceModelOptional.isPresent()) {
            resourceModelList.add(this.clone());
         } else {
            ResourceModel existResource = (ResourceModel)resourceModelOptional.get();
            long total = (long)existResource.value + (long)this.value;
            if (total > 2147483647L) {
               return;
            }

            existResource.setValue(existResource.value + this.value);
         }

      }
   }

   public static void addResourceToList(List<ResourceModel> resourceModelList, List<ResourceModel> resourceModelList2) {
      for(ResourceModel resourceModel : resourceModelList2) {
         resourceModel.addResourceToList(resourceModelList);
      }

   }

   public static void addResourceToList(List<ResourceModel> resourceModelList, ResourceModel resourceModel) {
      if (resourceModel != null) {
         resourceModel.addResourceToList(resourceModelList);
      }
   }

   public static List<ResourceModel> buildResources(String str) {
      List<ResourceModel> resourceModelList = new ArrayList();
      if (StringUtils.isEmpty(str)) {
         (new RuntimeException("资源列表字符串为空")).printStackTrace();
         return resourceModelList;
      } else {
         String[] resourceListArr = str.split(",");

         for(String resourceArr : resourceListArr) {
            resourceModelList.add(buildResource(resourceArr));
         }

         return resourceModelList;
      }
   }

   public static ResourceModel buildResource(String str) {
      if (StringUtils.isEmpty(str)) {
         (new RuntimeException("资源列表字符串为空")).printStackTrace();
         return new ResourceModel();
      } else {
         String[] resourceArr = str.split("\\|");
         if (resourceArr.length != 3) {
            throw new RuntimeException("资源字符串格式错误");
         } else {
            return new ResourceModel(Integer.parseInt(resourceArr[0]), Integer.parseInt(resourceArr[1]), Integer.parseInt(resourceArr[2]));
         }
      }
   }

   public static List<ResourceModel> buildResourcesPlus(String str) {
      ArrayList<ResourceModel> totalList = new ArrayList();
      if (str != null && !str.isEmpty()) {
         for(String r : str.split(",")) {
            if (StringUtils.isEmpty(r)) {
               break;
            }

            String[] resourceArr = r.split("\\|");
            if (resourceArr.length != 3) {
               throw new RuntimeException("资源字符串格式错误");
            }

            int type = Integer.parseInt(resourceArr[0]);
            int id = Integer.parseInt(resourceArr[1]);
            long value = Long.parseLong(resourceArr[2]);
            if (value <= 2147483647L) {
               totalList.add(new ResourceModel(type, id, Integer.parseInt(resourceArr[2])));
            } else {
               ArrayList<ResourceModel> list = new ArrayList();
               long count = value / 2147483647L;

               for(int i = 0; (long)i < count; ++i) {
                  value -= 2147483647L;
                  list.add(new ResourceModel(type, id, Integer.MAX_VALUE));
               }

               if (value > 0L && value <= 2147483647L) {
                  list.add(new ResourceModel(type, id, (int)value));
               }

               totalList.addAll(list);
            }
         }

         return totalList;
      } else {
         return totalList;
      }
   }

   public static void addResourceToListPlus(List<ResourceModel> resourceModelList, List<ResourceModel> resourceModelList2) {
      if (resourceModelList2 != null && !resourceModelList2.isEmpty()) {
         for(ResourceModel addModel : resourceModelList2) {
            if (addModel.value != Integer.MAX_VALUE && !resourceModelList.stream().noneMatch((m) -> m.type == addModel.type && m.id == addModel.id && m.value < Integer.MAX_VALUE)) {
               for(ResourceModel model : resourceModelList) {
                  if (model.type == addModel.type && model.id == addModel.id && model.value < Integer.MAX_VALUE) {
                     int finalValue = addModel.value - Integer.MAX_VALUE + model.value;
                     if (finalValue < 0) {
                        model.value += addModel.value;
                     } else {
                        model.value = Integer.MAX_VALUE;
                        resourceModelList.add(new ResourceModel(model.type, model.id, finalValue));
                     }
                     break;
                  }
               }
            } else {
               resourceModelList.add(addModel.clone());
            }
         }

      }
   }

   public static void addResourceToListPlus(List<ResourceModel> resourceModelList, ResourceModel resourceModel) {
      addResourceToListPlus(resourceModelList, Collections.singletonList(resourceModel));
   }

   public static CommonMsg.ItemInfo.Builder builderItemInfo(ResourceModel resourceModel) {
      CommonMsg.ItemInfo.Builder builder = CommonMsg.ItemInfo.newBuilder();
      builder.setType(resourceModel.getType());
      builder.setId(resourceModel.getId());
      builder.setNum(resourceModel.getValue());
      return builder;
   }

   public ResourceModel clone() {
      return new ResourceModel(this.type, this.id, this.value);
   }

   public String toString() {
      return "ResourceModel{type=" + this.type + ", id=" + this.id + ", value=" + this.value + '}';
   }

   public static String getResourceErrorTips(int itemType, int itemId) {
      LanguageModel languageModel = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "NotEnough");
      String errorStr = languageModel.getValue();
      if (itemType == 1) {
         PlayerProperty propertyModel = (PlayerProperty)ApplicationContextProvider.getModelPoolEntity("playerProperty", itemId);
         errorStr = MessageFormat.format(errorStr, propertyModel.getName());
      } else if (itemType == 2) {
         ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", itemId);
         if (itemModel != null) {
            errorStr = MessageFormat.format(errorStr, itemModel.getName());
         }
      } else {
         HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", itemId);
         if (heroModel != null) {
            errorStr = MessageFormat.format(errorStr, heroModel.getName());
         }
      }

      return errorStr;
   }

   public static boolean checkTotalNumError(int price, int num) {
      long totalNum = (long)price * (long)num;
      return totalNum > 2147483647L;
   }
}
