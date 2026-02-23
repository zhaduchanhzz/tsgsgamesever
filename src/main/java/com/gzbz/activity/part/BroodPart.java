package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import allMgr.TaskMethod;
import com.google.common.collect.Lists;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.BroodActDao;
import com.gzbz.db.DrawActDao;
import com.gzbz.db.DrawActData;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.UnionDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameCache.TaskCustomCache;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.model.AbstractDrawItemModel;
import com.gzbz.model.ActivityDropModel;
import com.gzbz.model.BroodBuyModel;
import com.gzbz.model.BroodLimitModel;
import com.gzbz.model.BroodRewardModel;
import com.gzbz.model.BroodTaskModel;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.ActivityMsg;
import com.gzbz.protobuf.BroodMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CrossActivityMsg;
import com.gzbz.protobuf.CrossMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.ShopMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.BroodTaskPart;
import com.gzbz.union.UnionMgrParent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import misc.DateUtil;
import misc.MapUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
        mgr = GamePlayer.class
)
public class BroodPart extends AbstractActivityPart {
    private static int DRAW_BROOD_ITEM_1 = 1682;
    private static int DRAW_BROOD_ITEM_2 = 1683;
    private static int DRAW_BROOD_ITEM_3 = 1684;
    private static int DRAW_BROOD_ITEM_4 = 1685;
    private static int DROP_BROOD_ITEM_5 = 1686;

    public void resetDaily() {
        if (!this.isServerActivityInvalid()) {
            this.sendInfo();
            BroodActDao dao = this.getDao();
            dao.drapItemCountDaily = 0;
            dao.updateOp();
        }
    }

    public void activityEnd(int oldActivityId) {
        this.sendItenChangeMail();
        BroodActDao dao = this.getDao();
        dao.score = 0;
        dao.updateOp();
    }

    public void sendItenChangeMail() {
        CentreAwardModel centreAwardModel = (CentreAwardModel) ApplicationContextProvider.getModelPoolEntity("centreAward", CentreAwardModel.TYPE_BROOD_ACT_ITEN_CHNAGE);
        if (null == centreAwardModel) {
            this.logger.error("centreAward 配置缺失 id:{}", CentreAwardModel.TYPE_BROOD_ACT_ITEN_CHNAGE);
        } else {
            MailPart mailPart = (MailPart) this.player.getMgrPart(MailPart.class);
            ItemBagPart itemBagPart = (ItemBagPart) this.player.getMgrPart(ItemBagPart.class);
            List<ResourceModel> resourceModels = Lists.newArrayList();

            for (int itemId : Arrays.asList(DRAW_BROOD_ITEM_1, DRAW_BROOD_ITEM_2, DRAW_BROOD_ITEM_3, DRAW_BROOD_ITEM_4, DROP_BROOD_ITEM_5)) {
                int count = itemBagPart.getItemNum(itemId);
                if (count > 0) {
                    this.player.delItem(itemId, (long) count, 150, 15008);
                    ItemModel item = (ItemModel) ApplicationContextProvider.getModelPoolEntity("item", itemId);
                    if (item.getSell() != null && !item.getSell().isEmpty() && item.getSell().size() == 3) {
                        int type = (Integer) item.getSell().get(0);
                        int id = (Integer) item.getSell().get(1);
                        int num = (Integer) item.getSell().get(2);
                        resourceModels.add(new ResourceModel(type, id, num * count));
                    }
                }
            }

            if (!resourceModels.isEmpty()) {
                mailPart.pushTaskEx("addMailOfEffectTime", new Object[]{MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), resourceModels, 604800000L, 150, 15009});
            }

        }
    }

    public void rotateReset(int oldActivityId) {
        this.initTask();
        BroodActDao dao = this.getDao();
        dao.recordList.clear();
        dao.drawActDatas.clear();
        dao.score = 0;
        dao.broodBuy.clear();
        dao.itemDrawTimes.clear();
        dao.updateOp();
        this.clearActivityGift(24);
    }

    public int getActivityType() {
        return 108;
    }

    public BroodActDao getDao() {
        return (BroodActDao) this.player.getData("tb_act_brood", this.player.getPlayerId());
    }

    @MsgHandlerAnno
    public void C2S_ActivityInfo_26001(BroodMsg.C2S_ActivityInfo_26001 msg, String source) {
        this.sendInfo();
    }

    public void sendInfo() {
        this.uploadPlayerBaseData();
        CrossNettyClient crossNettyClient = (CrossNettyClient) ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
        BroodMsg.C2S_ActivityInfo_26001 msg = BroodMsg.C2S_ActivityInfo_26001.newBuilder().build();
        crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
    }

    public void uploadPlayerBaseData() {
        CrossNettyClient crossNettyClient = (CrossNettyClient) ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
        CrossMsg.S2CR_PlayerBaseData_4202.Builder builder = CrossMsg.S2CR_PlayerBaseData_4202.newBuilder();
        builder.setServerId(this.player.getServerId());
        builder.setPlayerId(this.player.getPlayerId());
        PlayerDao playerDao = this.player.getPlayerDao();
        builder.setPlayerName(playerDao.playerName);
        builder.setSex(playerDao.sex);
        builder.setLv(playerDao.lv);
        builder.setCombatPower(this.player.getPlayerCombatPower());
        builder.setHeadId(playerDao.head);
        builder.setHeadFrame(playerDao.headFrame);
        builder.setPrestige(playerDao.prestige);
        builder.setMonarchId(playerDao.monarchId);
        builder.setUnionId(playerDao.unionId);
        builder.setVipLev(playerDao.vip_lv);
        builder.setUnionName("");
        builder.setPeakLv(playerDao.peak_lv);
        if (playerDao.unionId > 0) {
            UnionMgrParent unionMgrParent = (UnionMgrParent) ApplicationContextProvider.getContext().getBean(UnionMgrParent.class);
            UnionDao unionDao = unionMgrParent.getUnionMgr(playerDao.unionId).getUnion();
            builder.setUnionName(unionDao.unionName);
        }

        crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
    }

    @MsgHandlerAnno
    public void CR2S_BroodActivityInfo_13112(CrossActivityMsg.CR2S_BroodActivityInfo_13112 msg, String source) {
        BroodTaskPart broodTaskPart = (BroodTaskPart) this.player.getMgrPart(BroodTaskPart.class);
        BroodActDao dao = this.getDao();
        BroodMsg.S2C_ActivityInfo_26002.Builder resp = BroodMsg.S2C_ActivityInfo_26002.newBuilder();
        resp.setOpenDay(this.getCrossActOpenDay());
        resp.setActDay(this.getSeverActivityDay());
        resp.setTotalScore(msg.getTotalScore());
        resp.addAllJoinServers(msg.getJoinServersList());
        if (broodTaskPart.getTaskListMsg().isEmpty()) {
            this.initTask();
        }

        resp.addAllTaskList(broodTaskPart.getTaskListMsg());

        for (Map.Entry<Integer, Integer> entry : dao.broodBuy.entrySet()) {
            Integer buyId = (Integer) entry.getKey();
            Integer buyNum = (Integer) entry.getValue();
            CommonMsg.MapDataII.Builder mapData = CommonMsg.MapDataII.newBuilder();
            mapData.setKey(buyId);
            mapData.setValue(buyNum);
            resp.addBroodBuyIdNum(mapData.build());
        }

        for (Map.Entry<Integer, Integer> entry : dao.itemDrawTimes.entrySet()) {
            Integer buyId = (Integer) entry.getKey();
            Integer buyNum = (Integer) entry.getValue();
            CommonMsg.MapDataII.Builder mapData = CommonMsg.MapDataII.newBuilder();
            mapData.setKey(buyId);
            mapData.setValue(buyNum);
            resp.addBroodDrawId2Num(mapData.build());
        }

        for (Map.Entry<Integer, DrawActData> entry : dao.drawActDatas.entrySet()) {
            Integer type = (Integer) entry.getKey();
            Integer num = ((DrawActData) entry.getValue()).drawTimes;
            CommonMsg.MapDataII.Builder mapData = CommonMsg.MapDataII.newBuilder();
            mapData.setKey(type);
            mapData.setValue(num);
            resp.addBroodDrawType2Num(mapData.build());
        }

        this.player.sendMsg(resp.build());
    }

    public int getCrossActOpenDay() {
        ActivityInfo serverActivityInfo = this.getServerActivityInfo();
        return serverActivityInfo != null && serverActivityInfo.crossActOpenDay > 0 ? serverActivityInfo.crossActOpenDay : -1;
    }

    @TaskMethod
    public void noticeCrossActOpenDay() {
        this.sendInfo();
    }

    @MsgHandlerAnno
    public boolean C2S_BroodBuy_26060(BroodMsg.C2S_BroodBuy_26060 msg, String source) {
        if (this.isServerActivityInvalid()) {
            return this.player.failure(8007);
        } else if (this.getCrossActOpenDay() < 0) {
            return this.player.failure(76416);
        } else if (msg.getNum() < 1) {
            return this.player.failure(6);
        } else {
            BroodBuyModel broodBuyModel = (BroodBuyModel) ApplicationContextProvider.getModelPoolEntity("broodBuy", msg.getId());
            if (null == broodBuyModel) {
                return this.player.failure(6);
            } else {
                BroodActDao dao = this.getDao();
                if (broodBuyModel.getPreId() > 0) {
                    BroodBuyModel preModel = (BroodBuyModel) ApplicationContextProvider.getModelPoolEntity("broodBuy", broodBuyModel.getPreId());
                    if (null == preModel) {
                        return this.player.failure(37);
                    }

                    Integer preIdBuyNum = (Integer) dao.broodBuy.getOrDefault(preModel.getId(), 0);
                    if (preIdBuyNum < preModel.getQuota()) {
                        return this.player.failure(76031);
                    }
                }

                Integer buyNum = (Integer) dao.broodBuy.getOrDefault(msg.getId(), 0);
                if (buyNum + msg.getNum() > broodBuyModel.getQuota()) {
                    return this.player.failure(25);
                } else {
                    ResourceModel cost = new ResourceModel(broodBuyModel.getExchangeType(), broodBuyModel.getExchangeId(), broodBuyModel.getExchangeNum() * msg.getNum());
                    if (!this.player.checkResourceNum(cost)) {
                        return this.player.failure(76135);
                    } else {
                        this.player.delResource(cost, 150, 15006, 0, 0, "");
                        this.player.addResource(broodBuyModel.getItemType(), broodBuyModel.getItemId(), broodBuyModel.getItemNum() * msg.getNum(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 150, 15007, 0, 0, "");
                        dao.broodBuy.put(msg.getId(), buyNum + msg.getNum());
                        dao.updateOp();
                        BroodMsg.S2C_BroodBuy_26061.Builder resp = BroodMsg.S2C_BroodBuy_26061.newBuilder();

                        for (Map.Entry<Integer, Integer> entry : dao.broodBuy.entrySet()) {
                            Integer id = (Integer) entry.getKey();
                            Integer num = (Integer) entry.getValue();
                            CommonMsg.MapDataII.Builder mapData = CommonMsg.MapDataII.newBuilder();
                            mapData.setKey(id);
                            mapData.setValue(num);
                            resp.addBroodBuyIdNum(mapData);
                        }

                        this.player.sendMsg(resp.build());
                        return true;
                    }
                }
            }
        }
    }

    public void sendTaskNoRecMail() {
        CentreAwardModel centreAwardModel = (CentreAwardModel) ApplicationContextProvider.getModelPoolEntity("centreAward", CentreAwardModel.ID_BROOD_ACT_TASK_NO_REC);
        if (null == centreAwardModel) {
            this.logger.error("CentreAward 配置缺失 id:{}", CentreAwardModel.ID_FLOWER_ACT_TASK_NO_REC);
        } else {
            Map<Integer, BroodTaskModel> allTaskMap = ApplicationContextProvider.<Integer, BroodTaskModel>getModelPoolMap("broodTask");
            BroodTaskPart broodTaskPart = (BroodTaskPart) this.player.getMgrPart(BroodTaskPart.class);
            List<ResourceModel> noRecRewardList = new ArrayList();

            for (Map.Entry<Integer, BroodTaskModel> entry : allTaskMap.entrySet()) {
                Integer taskId = (Integer) entry.getKey();
                BroodTaskModel taskModel = (BroodTaskModel) entry.getValue();
                TaskData taskData = broodTaskPart.getTask(taskId);
                if (null != taskData && !DateUtil.isSameDay((long) taskData.ctTime * 1000L, System.currentTimeMillis()) && broodTaskPart.checkCommit(taskId)) {
                    for (ResourceModel item : taskModel.getItems()) {
                        item.addResourceToList(noRecRewardList);
                    }

                    taskData.finish();
                }
            }

            if (noRecRewardList.size() > 0) {
                MailPart mailPart = (MailPart) this.player.getMgrPart(MailPart.class);
                mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), noRecRewardList, 604800000L, 150, 15002);
            }

        }
    }

    public void initTask() {
        TaskCustomCache taskCustomCache = (TaskCustomCache) this.player.getCustomCache("tb_task", this.player.getPlayerId());
        taskCustomCache.delete(TaskDefine.TaskModule.MODULE_ACT_BROOD);
        BroodTaskPart broodTaskPart = (BroodTaskPart) this.player.getMgrPart(BroodTaskPart.class);
        broodTaskPart.trigger();
    }

    @MsgHandlerAnno
    public void C2S_Brood_26041(BroodMsg.C2S_Brood_26041 msg, String source) {
        if (this.isServerActivityInvalid()) {
            this.player.failure(8007);
        } else {
            DrawCommon drawCommon = DrawCommon.create("broodReward");
            BroodLimitModel broodLimitModel = drawCommon.getBroodLimitModel(this.getCrossActOpenDay(), this.getSeverActivityDay(), msg.getType());
            if (broodLimitModel != null) {
                Map<Integer, AbstractDrawItemModel> itemModelMap = drawCommon.getDrawItemMap(this.getCrossActOpenDay(), this.getSeverActivityDay(), msg.getType());
                if (itemModelMap != null && !itemModelMap.isEmpty()) {
                    BroodActDao dao = this.getDao();
                    DrawActData drawActData = (DrawActData) MapUtil.computeIfAbsent(dao.drawActDatas, msg.getType(), DrawActData.class);
                    if (broodLimitModel.getMaxBroodTimes() <= 0 || drawActData.drawTimes < broodLimitModel.getMaxBroodTimes()) {
                        if (msg.getTimes() == 1 || msg.getTimes() == 10) {
                            if (!this.player.checkResourceNum(2, broodLimitModel.getBroodCostItem(), msg.getTimes())) {
                                this.player.failure(3);
                            } else {
                                List<AbstractDrawItemModel> drawModels = Lists.newArrayList();
                                drawCommon = DrawCommon.create("broodReward");
                                broodLimitModel = drawCommon.getBroodLimitModel(this.getCrossActOpenDay(), this.getSeverActivityDay(), msg.getType());
                                this.player.delItem(broodLimitModel.getBroodCostItem(), (long) msg.getTimes(), 150, 15005);
                                itemModelMap = drawCommon.getDrawItemMap(this.getCrossActOpenDay(), this.getSeverActivityDay(), msg.getType());
                                drawActData = (DrawActData) MapUtil.computeIfAbsent(this.getDao().drawActDatas, msg.getType(), DrawActData.class);
                                List<AbstractDrawItemModel> var11 = drawCommon.drawItems(msg.getTimes(), drawActData, itemModelMap);
                                List<ResourceModel> resourceModels = Lists.newArrayList();
                                var11.forEach((model) -> resourceModels.addAll(model.getRewards()));
                                this.player.addResource(resourceModels, PlayerMsg.ShowType.SHOW_CROOS_BROOD, 150, 15003);
//                                dao = this.getDao();
                                int createTime = DateUtil.getIntTime(System.currentTimeMillis());
                                var11.forEach((drawModelx) -> drawModelx.getRewards().forEach((rs) -> dao.addRecordInfo(new DrawActDao.RecordInfo(createTime, rs))));
                                dao.updateOp();

                                for (AbstractDrawItemModel drawModel : var11) {
                                    if (drawModel.getIsRecord() > 0) {
                                        CrossNettyClient crossNettyClient = (CrossNettyClient) ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
                                        CrossMsg.S2CR_UploadBroodDrawData_4263.Builder builder = CrossMsg.S2CR_UploadBroodDrawData_4263.newBuilder();
                                        builder.setPlayerName(this.player.getPlayerDao().playerName);
                                        builder.setBelovedItemId(drawModel.getBelovedItemID());
                                        builder.setStage(drawModel.getStage());
                                        if (drawModel instanceof BroodRewardModel) {
                                            BroodRewardModel broodRewardModel = (BroodRewardModel) drawModel;
                                            builder.setSlotType(broodRewardModel.getRewardSlot());
                                        }

                                        crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
                                    }
                                }

//                                dao = this.getDao();
                                drawCommon = DrawCommon.create("broodReward");
                                broodLimitModel = drawCommon.getBroodLimitModel(this.getCrossActOpenDay(), this.getSeverActivityDay(), msg.getType());
                                dao.score += broodLimitModel.getBroodScore() * msg.getTimes();
                                dao.updateOp();
                                CrossNettyClient crossNettyClient = (CrossNettyClient) ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
                                ActivityInfo activityInfo = this.getServerActivityInfo();
                                CrossActivityMsg.S2CR_UpdateBroodRankScroe_13111.Builder builder = CrossActivityMsg.S2CR_UpdateBroodRankScroe_13111.newBuilder();
                                builder.setActivityId(activityInfo.id);
                                builder.setActivityType(this.getActivityType());
                                builder.setEndTime(activityInfo.end);
                                builder.setEndScore(broodLimitModel.getBroodScore() * msg.getTimes());
                                crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
//                                dao = this.getDao();
                                drawActData = (DrawActData) MapUtil.computeIfAbsent(dao.drawActDatas, msg.getType(), DrawActData.class);
                                drawActData.drawTimes += msg.getTimes();

                                for (AbstractDrawItemModel drawModel : var11) {
                                    MapUtil.mapPlusInt(dao.itemDrawTimes, drawModel.getId(), 1);
                                }

                                dao.updateOp();
//                                dao = this.getDao();
                                BroodMsg.S2C_Brood_26042.Builder resp = BroodMsg.S2C_Brood_26042.newBuilder();
                                resp.setResult(0);
                                resp.setIsHaveFancy(var11.stream().anyMatch((drawModelx) -> drawModelx.getBelovedItemID() != 0));

                                for (AbstractDrawItemModel drawModel : var11) {
                                    int drawId = drawModel.getId();
                                    int drawCount = (Integer) MapUtil.getOrDefault(dao.itemDrawTimes, drawId, 0);
                                    resp.addBroodDrawId2Num(CommonMsg.MapDataII.newBuilder().setKey(drawId).setValue(drawCount));
                                }

                                drawActData = (DrawActData) MapUtil.computeIfAbsent(dao.drawActDatas, msg.getType(), DrawActData.class);
                                resp.setBroodDrawType2Num(CommonMsg.MapDataII.newBuilder().setKey(msg.getType()).setValue(drawActData.drawTimes));
                                this.player.sendMsg(resp.build());
                            }
                        }
                    }
                }
            }
        }
    }

    @MsgHandlerAnno
    public void C2S_DrawRecord_26021(BroodMsg.C2S_DrawRecord_26021 msg, String source) {
        if (this.isServerActivityInvalid()) {
            this.player.failure(8007);
        } else {
            BroodMsg.S2C_DrawRecord_26022.Builder builder = BroodMsg.S2C_DrawRecord_26022.newBuilder();
            BroodActDao dao = this.getDao();

            for (String record : dao.recordList) {
                String[] arr = record.split(":");
                BroodMsg.MyDrawRecord.Builder drawRecord = BroodMsg.MyDrawRecord.newBuilder();
                drawRecord.setCreateTime(Integer.parseInt(arr[0]));
                String[] split = arr[1].split("_");
                CommonMsg.ItemInfo.Builder itemInfo = CommonMsg.ItemInfo.newBuilder();
                itemInfo.setType(Integer.parseInt(split[0]));
                itemInfo.setId(Integer.parseInt(split[1]));
                itemInfo.setNum(Integer.parseInt(split[2]));
                drawRecord.addItemInfo(itemInfo);
                builder.addMyRecord(drawRecord);
            }

            this.player.sendMsg(builder.build());
        }
    }

    @MsgHandlerAnno
    public void C2S_ServerDrawRecord_26023(BroodMsg.C2S_ServerDrawRecord_26023 msg, String source) {
        if (this.isServerActivityInvalid()) {
            this.player.failure(8007);
        } else {
            CrossNettyClient crossNettyClient = (CrossNettyClient) ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
            crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
        }
    }

    public void requestBroodRank(GamePlayer gamePlayer, RankDefine.RankModule module, int limitCount) {
        if (this.isServerActivityInvalid()) {
            this.player.failure(8007);
        } else {
            CrossNettyClient crossNettyClient = (CrossNettyClient) ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
            CrossActivityMsg.CR2S_BroodRankInfo_13109.Builder msg = CrossActivityMsg.CR2S_BroodRankInfo_13109.newBuilder();
            ActivityInfo activityInfo = this.getServerActivityInfo();
            msg.setActivityId(activityInfo.id);
            msg.setModuleId(module.id);
            msg.setLimit(ApplicationContextProvider.getConfigInt("broodRankNum", 10));
            crossNettyClient.sendCross(gamePlayer.getServerId(), gamePlayer.getPlayerId(), msg.build());
        }
    }

    public ResourceModel activityDrop(int minute) {
        ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
        if (activityInfo != null && activityInfo.id > 0 && activityInfo.end >= DateUtil.getIntTime(System.currentTimeMillis())) {
            if (this.getCrossActOpenDay() == -1) {
                return null;
            } else {
                ActivityDropModel activityDropModel = (ActivityDropModel) ApplicationContextProvider.getModelPoolEntity("activityDrop", activityInfo.id);
                BroodActDao dao = this.getDao();
                if (dao.drapItemCountDaily >= activityDropModel.getLimitDaily()) {
                    return null;
                } else {
                    int dropNum = minute * 60 / activityDropModel.getDropTime();
                    if (dropNum <= 0) {
                        return null;
                    } else {
                        if (dao.drapItemCountDaily + dropNum > activityDropModel.getLimitDaily()) {
                            dropNum = activityDropModel.getLimitDaily() - dao.drapItemCountDaily;
                        }

                        dao.drapItemCountDaily += dropNum;
                        dao.updateOp();
                        return new ResourceModel(activityDropModel.getPropertyPropsType(), activityDropModel.getPropertyPropsId(), dropNum);
                    }
                }
            }
        } else {
            return null;
        }
    }

    public void handleGm(String type, String ext) {
        CrossActivityMsg.S2CR_BroodSettleTest_13114.Builder msg = CrossActivityMsg.S2CR_BroodSettleTest_13114.newBuilder();
        CrossNettyClient crossNettyClient = (CrossNettyClient) ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
        ActivityPart activityPart = (ActivityPart) this.player.getMgrPart(ActivityPart.class);
        switch (type) {
            case "info":
                this.sendInfo();
                break;
            case "brood":
                this.C2S_Brood_26041(BroodMsg.C2S_Brood_26041.newBuilder().setType(1).setTimes(Integer.parseInt(ext)).build(), "");
                break;
            case "rank":
                RankDefine.RankModule module = RankDefine.getRankModule(RankDefine.RankModule.ACTIVITY_BROOD_RANK.id);
                this.requestBroodRank(this.player, module, 10);
                break;
            case "record":
                this.C2S_DrawRecord_26021(BroodMsg.C2S_DrawRecord_26021.newBuilder().build(), "");
                break;
            case "svrrecord":
                this.C2S_ServerDrawRecord_26023(BroodMsg.C2S_ServerDrawRecord_26023.newBuilder().build(), "");
                break;
            case "cleandraw":
                BroodActDao dao = this.getDao();
                dao.recordList.clear();
                dao.drawActDatas.clear();
                dao.score = 0;
                dao.broodBuy.clear();
                dao.itemDrawTimes.clear();
                dao.updateOp();
                ActivityInfo activityInfo = this.getServerActivityInfo();
                CrossActivityMsg.S2CR_UpdateBroodRankScroe_13111.Builder builder = CrossActivityMsg.S2CR_UpdateBroodRankScroe_13111.newBuilder();
                builder.setActivityId(activityInfo.id);
                builder.setActivityType(this.getActivityType());
                builder.setEndTime(activityInfo.end);
                builder.setEndScore(0);
                crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
                break;
            case "buy":
                this.C2S_BroodBuy_26060(BroodMsg.C2S_BroodBuy_26060.newBuilder().setNum(1).setId(Integer.parseInt(ext)).build(), "");
                break;
            case "crosssettle":
                msg.setType("crosssettle");
                crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg.build());
                break;
            case "crosspause":
                msg.setType("crosspause");
                crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg.build());
                break;
            case "crossrecover":
                msg.setType("crossrecover");
                crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg.build());
                break;
            case "crossclose":
                msg.setType("crossclose");
                crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg.build());
                break;
            case "shopinfo":
                ActivityMsg.C2S_ActivityShopInfo_6725.Builder C2S_ActivityShopInfo_6725 = ActivityMsg.C2S_ActivityShopInfo_6725.newBuilder();
                C2S_ActivityShopInfo_6725.setActivityType(this.getActivityType());
                activityPart.C2S_ActivityShopInfo_6725(C2S_ActivityShopInfo_6725.build(), "");
                break;
            case "shopbuy":
                ShopMsg.BuyItem.Builder buyItem = ShopMsg.BuyItem.newBuilder();
                buyItem.setBuyId(Integer.parseInt(ext));
                buyItem.setBuyNum(1);
                ActivityMsg.C2S_ActivityShopBuy_6727.Builder C2S_ActivityShopBuy_6727 = ActivityMsg.C2S_ActivityShopBuy_6727.newBuilder();
                C2S_ActivityShopBuy_6727.setActivityType(this.getActivityType());
                C2S_ActivityShopBuy_6727.setBuyItem(buyItem);
                activityPart.C2S_ActivityShopBuy_6727(C2S_ActivityShopBuy_6727.build(), "");
                break;
            case "itemchange":
                this.sendItenChangeMail();
        }

    }
}
