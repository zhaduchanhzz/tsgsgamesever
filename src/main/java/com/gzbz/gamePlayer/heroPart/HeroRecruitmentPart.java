package com.gzbz.gamePlayer.heroPart;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.ActivityMgr;
import com.gzbz.chat.ChatMgr;
import com.gzbz.db.HeroRecruitmentDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.bean.HeroRecruitmentRecord;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.guanjia.GuanJiaPart;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.gift.GiftPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.mergeActivity.part.MergeActivityHeFuKuangHuanPart;
import com.gzbz.model.ConfigModel;
import com.gzbz.model.HeroEmployeeLibModel;
import com.gzbz.model.HeroEmployeeModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.LanguageModel;
import com.gzbz.model.QualityColorModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.HeroMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.rank.part.RankPart;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.util.ResCountryDifUtils;
import com.gzbz.worldMgr.WorldMgr;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import misc.DateUtil;
import misc.RandomUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
        mgr = GamePlayer.class
)
public class HeroRecruitmentPart extends PlayerPart {
    Logger logger = LoggerFactory.getLogger(HeroRecruitmentPart.class);
    private static final int SAVE_MAX_NUM = 200;
    @Autowired
    ConfigManager configManager;
    @Autowired
    RankMgr rankMgr;
    @Autowired
    ActivityMgr activityMgr;
    private boolean isFiveStar_OnceProfessional = false;

    public void resetDaily() {
        this.S2C_HeroRecruitmentUiResult_5032();
    }

    public boolean loginHandleAsync() {
        return true;
    }

    public void logoutHandle() {
        this.S2C_HeroRecruitmentUiResult_5032();
    }

    public HeroRecruitmentDao getHeroRecruitmentDao() {
        return (HeroRecruitmentDao) this.player.getData("tb_hero_recruitment", this.player.getPlayerId());
    }

    @MsgHandlerAnno
    public void C2S_HeroRecruitment_5013(HeroMsg.C2S_HeroRecruitment_5013 msg, String source) {
        HeroMsg.RecruitmentType type = msg.getType();
        HeroMsg.NumType numType = msg.getNum();
        PlayerDao playerDao = this.player.getPlayerDao();
        HeroBagPart heroBagPart = (HeroBagPart) this.player.getMgrPart(HeroBagPart.class);
        PlayerExtend playerExtend = (PlayerExtend) this.player.getPlayerExtend(13);
        int typeId = HeroDefine.HERO_RECRUITMENT[type.getNumber()][numType.getNumber()];
        int recruitmentrNum = 0;
        int reason = 422;
        String recruitmentName = "";
        int recruitmentGuide = 0;
        PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache) this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
        int newDailyProfessionalRecruitNum = 0;
        LanguageModel strModel;
        switch (type) {
            case COMMON:
                strModel = (LanguageModel) ApplicationContextProvider.getModelPoolEntity("language", "heroEmployee1");
                recruitmentName = strModel.getValue();
                if (numType == HeroMsg.NumType.ONCE) {
                    recruitmentrNum = 1;
                    reason = 422;
                    if (!playerExtend.iisCompletedCommonRecruitmentGuide()) {
                        recruitmentGuide = 1;
                    }
                } else if (numType == HeroMsg.NumType.TEN_TIMES) {
                    recruitmentrNum = 10;
                    reason = 423;
                }
                break;
            case FRIENDLY:
                strModel = (LanguageModel) ApplicationContextProvider.getModelPoolEntity("language", "heroEmployee2");
                recruitmentName = strModel.getValue();
                if (numType == HeroMsg.NumType.ONCE) {
                    recruitmentrNum = 1;
                    reason = 424;
                } else if (numType == HeroMsg.NumType.TEN_TIMES) {
                    recruitmentrNum = 10;
                    reason = 425;
                }
                break;
            case PROFESSIONAL:
                strModel = (LanguageModel) ApplicationContextProvider.getModelPoolEntity("language", "heroEmployee3");
                recruitmentName = strModel.getValue();
                if (numType == HeroMsg.NumType.ONCE) {
                    recruitmentrNum = 1;
                    reason = 426;
                    if (!playerExtend.iisCompletedProfessionalRecruitmentGuide()) {
                        recruitmentGuide = 2;
                    }
                } else if (numType == HeroMsg.NumType.TEN_TIMES) {
                    recruitmentrNum = 10;
                    reason = 427;
                }

                int dailyRecruitNum = (Integer) playerResetCustomCache.getDailyNum(16, 0);
                newDailyProfessionalRecruitNum = dailyRecruitNum + recruitmentrNum;
                int lotteryLimit = this.configManager.getIntDefault("LotteryLimit", 99999);
                if (newDailyProfessionalRecruitNum > lotteryLimit) {
                    this.player.failure(51);
                    return;
                }
                break;
            case INTEGRAL:
                strModel = (LanguageModel) ApplicationContextProvider.getModelPoolEntity("language", "heroEmployee4");
                recruitmentName = strModel.getValue();
                recruitmentrNum = 1;
                reason = 428;
                break;
            default:
                typeId = 1;
                recruitmentrNum = 1;
                reason = 422;
        }

        if (!heroBagPart.isEnableAddHero(recruitmentrNum)) {
            this.player.sendMsg(HeroMsg.S2C_HeroRecruitmentResult_5014.newBuilder().setResult(4124).build());
        } else {
            HeroEmployeeModel heroEmployeeModel = (HeroEmployeeModel) this.player.getGameModelPool().getEntity("heroEmployee", typeId);
            if (playerDao.vip_lv < heroEmployeeModel.getVip()) {
                this.player.sendMsg(HeroMsg.S2C_HeroRecruitmentResult_5014.newBuilder().setResult(4108).build());
            } else {
                boolean isFree = false;
                if (this.isEnableFreeRec(type, heroEmployeeModel)) {
                    isFree = true;
                } else if (!this.isEnableRecruitmentHero(heroEmployeeModel, playerDao, type, numType)) {
                    return;
                }

                List<HeroModel> heroModelList = this.getHeroList(type, numType, recruitmentrNum, recruitmentGuide, heroEmployeeModel);
                if (heroModelList != null && !heroModelList.isEmpty()) {
                    List<ResourceModel> needList = new ArrayList();
                    if (!isFree) {
                        needList = this.delItemForRecruitmentHero(heroEmployeeModel, playerDao, reason, type, numType);
                    } else if (type == HeroMsg.RecruitmentType.COMMON) {
                        playerResetCustomCache.addDailyReset(101, 1);
                        playerResetCustomCache.setDailyReset(103, (int) (System.currentTimeMillis() / 1000L));
                    } else if (type == HeroMsg.RecruitmentType.PROFESSIONAL) {
                        playerResetCustomCache.addDailyReset(102, 1);
                        playerResetCustomCache.setDailyReset(104, (int) (System.currentTimeMillis() / 1000L));
                    }

                    if (type == HeroMsg.RecruitmentType.PROFESSIONAL) {
                        playerResetCustomCache.setDailyReset(16, newDailyProfessionalRecruitNum);
                        MergeActivityHeFuKuangHuanPart mergeActivityHeFuKuangHuanPart = (MergeActivityHeFuKuangHuanPart) this.player.getMgrPart(MergeActivityHeFuKuangHuanPart.class);
                        mergeActivityHeFuKuangHuanPart.updateRushRank(2, recruitmentrNum);
                    }

                    this.player.updateGuideStep(msg.getGuideStep());
                    this.S2C_HeroRecruitmentUiResult_5032();
                    this.commitHeroList(heroModelList, type, recruitmentrNum, typeId, playerDao, recruitmentName, heroEmployeeModel, reason, needList, PlayerMsg.ShowType.SHOW_TYPE_HERO_RECRUITMENT);
                    HeroMsg.S2C_HeroRecruitmentResult_5014.Builder result_builder = HeroMsg.S2C_HeroRecruitmentResult_5014.newBuilder();
                    result_builder.setResult(1);
                    this.player.sendMsg(result_builder.build());
                    GuanJiaPart guanJiaPart = (GuanJiaPart) this.player.getMgrPart(GuanJiaPart.class);
                    guanJiaPart.checkState(1640, (List) null);
                }
            }
        }
    }

    public List<HeroModel> getHeroList(HeroMsg.RecruitmentType type, HeroMsg.NumType numType, int recruitmentrNum, int recruitmentGuide, HeroEmployeeModel heroEmployeeModel) {
        List<HeroModel> heroModelList = new ArrayList();
        PlayerExtend playerExtend = (PlayerExtend) this.player.getPlayerExtend(13);
        if (recruitmentGuide > 0) {
            if (recruitmentGuide == 1) {
                ConfigManager configManager = (ConfigManager) ApplicationContextProvider.getContext().getBean(ConfigManager.class);
                int heroId = configManager.getInt("firsteRecruitment");
                HeroModel heroModel = (HeroModel) this.player.getGameModelPool().getEntity("hero", heroId);
                if (heroModel == null) {
                    this.logger.error("英雄模板为空，id={}", heroId);
                    return heroModelList;
                }

                heroModelList.add(heroModel);
                playerExtend.completedCommonRecruitmentGuide();
            } else if (recruitmentGuide == 2) {
                ConfigManager configManager = (ConfigManager) ApplicationContextProvider.getContext().getBean(ConfigManager.class);
                int heroId = configManager.getInt("firsteRecruitment2");
                HeroModel heroModel = (HeroModel) this.player.getGameModelPool().getEntity("hero", heroId);
                if (heroModel == null) {
                    this.logger.error("英雄模板为空，id={}", heroId);
                    return heroModelList;
                }

                heroModelList.add(heroModel);
                playerExtend.completedProfessionalRecruitmentGuide();
            }
        } else {
            for (int i = 0; i < recruitmentrNum; ++i) {
                if (type == HeroMsg.RecruitmentType.PROFESSIONAL) {
                    ++playerExtend.numSpace;
                }

                int heroId = this.getRecruitmentHeroId(heroEmployeeModel.getLibId(), playerExtend);
                if (heroId < 0) {
                    this.player.sendMsg(HeroMsg.S2C_HeroRecruitmentResult_5014.newBuilder().setResult(4107).build());
                    return heroModelList;
                }

                HeroModel heroModel = (HeroModel) this.player.getGameModelPool().getEntity("hero", heroId);
                if (heroModel == null) {
                    this.logger.error("英雄模板为空，id={}", heroId);
                    return heroModelList;
                }

                heroModelList.add(heroModel);
            }
        }

        if (numType == HeroMsg.NumType.ONCE && type == HeroMsg.RecruitmentType.PROFESSIONAL) {
            if (((HeroModel) heroModelList.get(0)).getStar() == 5) {
                if (this.isFiveStar_OnceProfessional) {
                    int heroId = this.getRecruitmentHeroId(4, playerExtend);
                    this.logger.info("高级单抽连续出现5星，替换成4星={}", heroId);
                    HeroModel heroModel = (HeroModel) this.player.getGameModelPool().getEntity("hero", heroId);
                    if (heroModel == null) {
                        this.logger.error("英雄模板为空，id={}", heroId);
                        return heroModelList;
                    }

                    heroModelList.set(0, heroModel);
                    this.isFiveStar_OnceProfessional = false;
                } else {
                    this.isFiveStar_OnceProfessional = true;
                }
            } else {
                this.isFiveStar_OnceProfessional = false;
            }
        }

        Map<Integer, List<HeroModel>> starModelMap = new HashMap();

        for (HeroModel model : heroModelList) {
            List<HeroModel> list = (List) starModelMap.getOrDefault(model.getStar(), new ArrayList());
            list.add(model);
            starModelMap.put(model.getStar(), list);
        }

        if (numType == HeroMsg.NumType.TEN_TIMES) {
            int star = 0;
            switch (type) {
                case COMMON:
                    star = 3;
                    break;
                case FRIENDLY:
                    star = 4;
                    break;
                case PROFESSIONAL:
                    star = 5;
                    break;
                case INTEGRAL:
                    star = 5;
            }

            if ((starModelMap.get(star) == null || ((List) starModelMap.get(star)).size() == 0) && !heroEmployeeModel.getHeroLib2().isEmpty()) {
                int heroId = this.getRecruitmentHeroId(heroEmployeeModel.getLibIdAssure(), playerExtend);
                HeroModel heroModel = (HeroModel) this.player.getGameModelPool().getEntity("hero", heroId);
                if (heroModel == null) {
                    this.logger.error("英雄模板为空，id={}", heroId);
                    return heroModelList;
                }

                heroModelList.set(0, heroModel);
                Collections.shuffle(heroModelList);
            }

            if (starModelMap.get(5) != null && ((List) starModelMap.get(5)).size() > 3) {
                int updateNum = ((List) starModelMap.get(5)).size() - 3;

                for (int i = 0; i < heroModelList.size(); ++i) {
                    if (((HeroModel) heroModelList.get(i)).getStar() == 5 && updateNum > 0) {
                        int heroId = this.getRecruitmentHeroId(3, playerExtend);
                        HeroModel heroModel = (HeroModel) this.player.getGameModelPool().getEntity("hero", heroId);
                        if (heroModel == null) {
                            this.logger.error("英雄模板为空，id={}", heroId);
                            return heroModelList;
                        }

                        heroModelList.set(i, heroModel);
                        --updateNum;
                        if (updateNum <= 0) {
                            break;
                        }
                    }
                }
            }

            if (type == HeroMsg.RecruitmentType.PROFESSIONAL) {
                int fourStarNum = 0;

                for (HeroModel model : heroModelList) {
                    if (model.getStar() == 4) {
                        ++fourStarNum;
                    }
                }

                if (fourStarNum == 0) {
                    for (int i = 0; i < heroModelList.size(); ++i) {
                        if (((HeroModel) heroModelList.get(i)).getStar() == 3) {
                            int heroId = this.getRecruitmentHeroId(4, playerExtend);
                            HeroModel heroModel = (HeroModel) this.player.getGameModelPool().getEntity("hero", heroId);
                            if (heroModel == null) {
                                this.logger.error("英雄模板为空，id={}", heroId);
                                return heroModelList;
                            }

                            heroModelList.set(i, heroModel);
                            break;
                        }
                    }
                }

                if (fourStarNum > 3) {
                    this.logger.info("4星={},删除多余", fourStarNum);
                    int updateNum = ((List) starModelMap.get(4)).size() - 3;

                    for (int i = 0; i < heroModelList.size(); ++i) {
                        if (((HeroModel) heroModelList.get(i)).getStar() == 4 && updateNum > 0) {
                            int heroId = this.getRecruitmentHeroId(3, playerExtend);
                            HeroModel heroModel = (HeroModel) this.player.getGameModelPool().getEntity("hero", heroId);
                            if (heroModel == null) {
                                this.logger.error("英雄模板为空，id={}", heroId);
                                return heroModelList;
                            }

                            heroModelList.set(i, heroModel);
                            --updateNum;
                            if (updateNum <= 0) {
                                break;
                            }
                        }
                    }
                }
            }
        }

        int heroEmployeeHeroLock = this.configManager.getInt("heroEmployeeHeroLock");
        if (type == HeroMsg.RecruitmentType.PROFESSIONAL || type == HeroMsg.RecruitmentType.INTEGRAL && numType == HeroMsg.NumType.TEN_TIMES) {
            if (playerExtend.professionalNum < heroEmployeeHeroLock) {
                for (int i = 0; i < heroModelList.size(); ++i) {
                    HeroModel heroModel = (HeroModel) heroModelList.get(i);
                    if (heroModel.getStar() == 5 && (heroModel.getNation() == 4 || heroModel.getNation() == 5)) {
                        HeroModel newHeroModel = null;
                        int loop = 0;

                        do {
                            ++loop;
                            int heroId = this.getRecruitmentHeroId(5, playerExtend);
                            newHeroModel = (HeroModel) this.player.getGameModelPool().getEntity("hero", heroId);
                            if (newHeroModel == null) {
                                this.logger.error("招募英雄模板出错，id={}", heroId);
                                return heroModelList;
                            }
                        } while (loop <= 999 && (newHeroModel.getNation() == 4 || newHeroModel.getNation() == 5));

                        this.logger.info("{}抽到同阵营、相同ID的英雄、神魔武将,次数={},原英雄={},替换={}", new Object[]{this.player.getPlayerId(), playerExtend.professionalNum, heroModel.getName(), newHeroModel.getName()});
                        heroModelList.set(i, newHeroModel);
                    }
                }
            }

            playerExtend.professionalNum += heroModelList.size();
        }

        this.player.updatePlayerExtend(13);
        return heroModelList;
    }

    public void commitHeroList(List<HeroModel> heroModelList, HeroMsg.RecruitmentType type, int recruitmentrNum, int typeId, PlayerDao playerDao, String recruitmentName, HeroEmployeeModel heroEmployeeModel, int reason, List<ResourceModel> needList, PlayerMsg.ShowType showType) {
        List<HeroModel> fiveStarList = new ArrayList();
        List<ResourceModel> addList = new ArrayList();
        List<HeroRecruitmentRecord> records = new LinkedList();
        boolean isNation4 = false;
        boolean isNation5 = false;

        for (HeroModel model : heroModelList) {
            addList.add(new ResourceModel(3, model.getId(), 1));
            if (type == HeroMsg.RecruitmentType.COMMON) {
                this.player.triggerTask(327, model.getStar(), 1L, 1);
            } else if (type == HeroMsg.RecruitmentType.FRIENDLY) {
                this.player.triggerTask(326, model.getStar(), 1L, 1);
            }

            if (model.getStar() >= 5) {
                fiveStarList.add(model);
                if (type == HeroMsg.RecruitmentType.PROFESSIONAL) {
                    if (model.getNation() == 4) {
                        isNation4 = true;
                    } else if (model.getNation() == 5) {
                        isNation5 = true;
                    }
                }
            }
        }

        if (isNation4 && isNation5) {
            this.player.triggerTask(615, 0, 1L, 1);
        }

        int taskId = HeroDefine.HERO_RECRUITMENT[type.getNumber()][0];
        this.player.triggerTask(403, taskId, (long) recruitmentrNum, 1);
        this.player.triggerTask(103, 0, (long) addList.size(), 1);
        addList.add(new ResourceModel(1, PlayerDefine.PLAYER_HERO_EXP, heroEmployeeModel.getHeroExp()));
        addList.add(new ResourceModel(1, PlayerDefine.PLAYER_BLESSING, heroEmployeeModel.getPoints()));
        this.player.addResource(addList, showType, 4, reason, 0, 0, "");
        RankPart rankPart = (RankPart) this.player.getMgrPart(RankPart.class);
        if (this.activityMgr.checkOpenServerRankTime(RankDefine.RankModule.OPEN_SERVER_RECRUIT) > 0 && (taskId == 3 || taskId == 4)) {
            int score = (int) rankPart.getScore(RankDefine.RankModule.OPEN_SERVER_RECRUIT);
            int realNum = recruitmentrNum + score;
            rankPart.updateRank(RankDefine.RankModule.OPEN_SERVER_RECRUIT, (long) realNum, false);
        }

        for (HeroModel heroModel : fiveStarList) {
            LanguageModel languageModel = (LanguageModel) ApplicationContextProvider.getModelPoolEntity("language", "SeniorRecruitment");
            LanguageModel languageModel_deep = (LanguageModel) ApplicationContextProvider.getModelPoolEntity("language", "SeniorRecruitment_deep");
            QualityColorModel qualityColorModel = (QualityColorModel) this.player.getGameModelPool().getEntity("qualityColor", heroModel.getQuality());
            String format = MessageFormat.format(languageModel.getValue(), playerDao.playerName, recruitmentName, qualityColorModel.getColor(), heroModel.getName());
            String format_deep = MessageFormat.format(languageModel_deep.getValue(), playerDao.playerName, recruitmentName, qualityColorModel.getColor(), heroModel.getName());
            ChatMgr chatMgr = (ChatMgr) ApplicationContextProvider.getContext().getBean(ChatMgr.class);
            chatMgr.pushTaskEx("sendSystem", new Object[]{4, 2, this.player.getPlayerId(), playerDao.playerName, format});
            chatMgr.pushTaskEx("sendSystem", new Object[]{4, 5, this.player.getPlayerId(), playerDao.playerName, format_deep});
            HeroRecruitmentRecord record = new HeroRecruitmentRecord(heroModel.getId(), DateUtil.getIntTime(System.currentTimeMillis()));
            records.add(record);
        }

        if (fiveStarList.size() > 0) {
            GiftPart giftPart = (GiftPart) this.player.getMgrPart(GiftPart.class);
            giftPart.triggerTimeLimitGift(1, 5);
        }

        this.addRecord(type.getNumber(), records);
        String[] usedStr = LogOperationMgr.toRewardsInfo(needList);
        String[] grantStr = LogOperationMgr.toRewardsInfo(addList);
        this.player.getOperationMgr().addExtraLog(this.player, 148, typeId + "", type.getNumber() + "", usedStr[2], usedStr[1], grantStr[0], grantStr[2], grantStr[1]);
    }

    public void addRecord(int type, List<HeroRecruitmentRecord> records) {
        if (!records.isEmpty()) {
            HeroRecruitmentDao heroRecruitmentDao = this.getHeroRecruitmentDao();
            LinkedList<HeroRecruitmentRecord> recordList = (LinkedList) heroRecruitmentDao.recordMap.getOrDefault(type, new LinkedList());
            recordList.addAll(records);
            if (recordList.size() > 200) {
                int count = recordList.size() - 200;

                for (int i = 0; i < count; ++i) {
                    recordList.removeFirst();
                }
            }

            heroRecruitmentDao.recordMap.put(type, recordList);
            heroRecruitmentDao.updateOp();
            this.notifyHeroRecruitmentRecord();
        }
    }

    @MsgHandlerAnno
    public void C2S_HeroRecruitmentUi_5031(HeroMsg.C2S_HeroRecruitmentUi_5031 msg, String source) {
        this.S2C_HeroRecruitmentUiResult_5032();
    }

    @MsgHandlerAnno
    public void C2S_HeroRecruitmentRecord_5281(HeroMsg.C2S_HeroRecruitmentRecord_5281 msg, String source) {
        this.notifyHeroRecruitmentRecord();
    }

    public void notifyHeroRecruitmentRecord() {
        HeroRecruitmentDao heroRecruitmentDao = this.getHeroRecruitmentDao();
        List<HeroMsg.RecruitmentRecord> commonRecords = new ArrayList();
        List<HeroMsg.RecruitmentRecord> friendRecords = new ArrayList();
        List<HeroMsg.RecruitmentRecord> higherRecords = new ArrayList();
        heroRecruitmentDao.recordMap.forEach((key, value) -> {
            for (HeroRecruitmentRecord heroRecruitmentRecord : value) {
                HeroMsg.RecruitmentRecord.Builder recordBuilder = HeroMsg.RecruitmentRecord.newBuilder();
                recordBuilder.setHeroId(heroRecruitmentRecord.heroId);
                recordBuilder.setTime(heroRecruitmentRecord.time);
                if (key == 0) {
                    commonRecords.add(recordBuilder.build());
                } else if (key == 1) {
                    friendRecords.add(recordBuilder.build());
                } else if (key == 2) {
                    higherRecords.add(recordBuilder.build());
                }
            }

        });
        this.player.sendMsg(HeroMsg.S2C_HeroRecruitmentRecord_5282.newBuilder().addAllCommonRecord(commonRecords).addAllFriendRecord(friendRecords).addAllHigherRecord(higherRecords).build());
    }

    public void S2C_HeroRecruitmentUiResult_5032() {
        PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache) this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
        HeroMsg.S2C_HeroRecruitmentUiResult_5032.Builder result_builder = HeroMsg.S2C_HeroRecruitmentUiResult_5032.newBuilder();
        int num = 0;
        int time = 0;

        for (HeroMsg.RecruitmentType recruitmentType : HeroMsg.RecruitmentType.values()) {
            for (HeroMsg.NumType numType : HeroMsg.NumType.values()) {
                boolean isNeedSendClient = false;
                if (recruitmentType == HeroMsg.RecruitmentType.COMMON && numType == HeroMsg.NumType.ONCE) {
                    num = (Integer) playerResetCustomCache.getDailyNum(101, 0);
                    time = (Integer) playerResetCustomCache.getDailyNum(103, 0);
                    isNeedSendClient = true;
                } else if (recruitmentType == HeroMsg.RecruitmentType.PROFESSIONAL && numType == HeroMsg.NumType.ONCE) {
                    num = (Integer) playerResetCustomCache.getDailyNum(102, 0);
                    time = (Integer) playerResetCustomCache.getDailyNum(104, 0);
                    isNeedSendClient = true;
                }

                if (isNeedSendClient) {
                    int dailyProfessionalRecruitNum = (Integer) playerResetCustomCache.getDailyNum(16, 0);
                    HeroMsg.HeroRecruitmentInfo.Builder info_builder = HeroMsg.HeroRecruitmentInfo.newBuilder();
                    info_builder.setType(recruitmentType);
                    info_builder.setNumType(numType);
                    info_builder.setNum(num);
                    info_builder.setCdTime(time);
                    info_builder.setRecruitNum(dailyProfessionalRecruitNum);
                    result_builder.addInfos(info_builder);
                }
            }
        }

        this.player.sendMsg(result_builder.build());
    }

    public boolean isEnableFreeRec(HeroMsg.RecruitmentType type, HeroEmployeeModel heroEmployeeModel) {
        boolean reslut = false;
        PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache) this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
        int num = 0;
        int time = 0;
        switch (type) {
            case COMMON:
                num = (Integer) playerResetCustomCache.getDailyNum(101, 0);
                time = (Integer) playerResetCustomCache.getDailyNum(103, 0);
                break;
            case PROFESSIONAL:
                playerResetCustomCache = (PlayerResetCustomCache) this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
                num = (Integer) playerResetCustomCache.getDailyNum(102, 0);
                time = (Integer) playerResetCustomCache.getDailyNum(104, 0);
        }

        reslut = this.isFree(heroEmployeeModel, time, num);
        return reslut;
    }

    public boolean isFree(HeroEmployeeModel heroEmployeeModel, int time, int num) {
        return heroEmployeeModel.getFreeTimes() - num > 0 && (time == 0 || System.currentTimeMillis() / 1000L - (long) time >= (long) heroEmployeeModel.getFreeCD());
    }

    public boolean isEnableRecruitmentHero(HeroEmployeeModel heroEmployeeModel, PlayerDao playerDao, HeroMsg.RecruitmentType recruitmentType, HeroMsg.NumType numType) {
        if (recruitmentType == HeroMsg.RecruitmentType.COMMON) {
            ItemBagPart itemBagPart = (ItemBagPart) this.player.getMgrPart(ItemBagPart.class);
            int num = itemBagPart.getItemNum(1002);
            if (num < heroEmployeeModel.getConsume()) {
                this.player.sendMsg(HeroMsg.S2C_HeroRecruitmentResult_5014.newBuilder().setResult(4106).build());
                return false;
            }
        } else if (recruitmentType == HeroMsg.RecruitmentType.FRIENDLY) {
            if (playerDao.friend < heroEmployeeModel.getConsume()) {
                this.player.sendMsg(HeroMsg.S2C_HeroRecruitmentResult_5014.newBuilder().setResult(4109).build());
                return false;
            }
        } else if (recruitmentType == HeroMsg.RecruitmentType.PROFESSIONAL) {
            ItemBagPart itemBagPart = (ItemBagPart) this.player.getMgrPart(ItemBagPart.class);
            int professionalNum = itemBagPart.getItemNum(1003);
            int needNum = 1;
            if (numType == HeroMsg.NumType.TEN_TIMES) {
                needNum = 10;
            }

            if (professionalNum < needNum) {
                int needGold = 0;
                if (numType == HeroMsg.NumType.ONCE) {
                    needGold = (needNum - professionalNum) * heroEmployeeModel.getConsume();
                } else {
                    ConfigModel configModel = (ConfigModel) this.player.getGameModelPool().getEntity("config", "seniorRecruitmentCost");
                    Integer val = Integer.parseInt(configModel.getValue());
                    needGold = (needNum - professionalNum) * val;
                }

                needGold = ResCountryDifUtils.goldAdditionForJp(1, PlayerDefine.PLAYER_GOLD, needGold);
                if (playerDao.gold < (long) needGold) {
                    this.player.sendMsg(HeroMsg.S2C_HeroRecruitmentResult_5014.newBuilder().setResult(4111).build());
                    return false;
                }
            }
        } else if (playerDao.blessing < heroEmployeeModel.getConsume()) {
            this.player.sendMsg(HeroMsg.S2C_HeroRecruitmentResult_5014.newBuilder().setResult(4110).build());
            return false;
        }

        return true;
    }

    public List<ResourceModel> delItemForRecruitmentHero(HeroEmployeeModel heroEmployeeModel, PlayerDao playerDao, int reason, HeroMsg.RecruitmentType recruitmentType, HeroMsg.NumType numType) {
        List<ResourceModel> resourceModels = new ArrayList();
        if (recruitmentType == HeroMsg.RecruitmentType.COMMON) {
            resourceModels.add(new ResourceModel(2, 1002, heroEmployeeModel.getConsume()));
            this.player.delResource(2, 1002, (long) heroEmployeeModel.getConsume(), 4, reason, 0, 0, "");
        } else if (recruitmentType == HeroMsg.RecruitmentType.FRIENDLY) {
            this.player.delResource(1, PlayerDefine.PLAYER_FRIEND, (long) heroEmployeeModel.getConsume(), 4, reason, 0, 0, "");
            resourceModels.add(new ResourceModel(1, PlayerDefine.PLAYER_FRIEND, heroEmployeeModel.getConsume()));
        } else if (recruitmentType == HeroMsg.RecruitmentType.PROFESSIONAL) {
            ItemBagPart itemBagPart = (ItemBagPart) this.player.getMgrPart(ItemBagPart.class);
            int professionalNum = itemBagPart.getItemNum(1003);
            int needNum = 1;
            if (numType == HeroMsg.NumType.TEN_TIMES) {
                needNum = 10;
            }

            if (professionalNum >= needNum) {
                this.player.delResource(2, 1003, (long) needNum, 4, reason, 0, 0, "");
                resourceModels.add(new ResourceModel(2, 1003, needNum));
            } else {
                if (professionalNum > 0) {
                    this.player.delResource(2, 1003, (long) professionalNum, 4, reason, 0, 0, "");
                    resourceModels.add(new ResourceModel(2, 1003, professionalNum));
                }

                int needGold = 0;
                if (numType == HeroMsg.NumType.ONCE) {
                    needGold = (needNum - professionalNum) * heroEmployeeModel.getConsume();
                } else {
                    ConfigModel configModel = (ConfigModel) this.player.getGameModelPool().getEntity("config", "seniorRecruitmentCost");
                    Integer val = Integer.parseInt(configModel.getValue());
                    needGold = (needNum - professionalNum) * val;
                }

                needGold = ResCountryDifUtils.goldAdditionForJp(1, PlayerDefine.PLAYER_GOLD, needGold);
                this.player.delResource(1, PlayerDefine.PLAYER_GOLD, (long) needGold, 4, reason, 0, 0, "");
                resourceModels.add(new ResourceModel(1, PlayerDefine.PLAYER_GOLD, needGold));
            }
        } else {
            this.player.delResource(1, PlayerDefine.PLAYER_BLESSING, (long) heroEmployeeModel.getConsume(), 4, reason, 0, 0, "");
            resourceModels.add(new ResourceModel(1, PlayerDefine.PLAYER_BLESSING, heroEmployeeModel.getConsume()));
        }

        return resourceModels;
    }

    public int getRecruitmentHeroId(int libId, PlayerExtend playerExtend) {
        List<HeroEmployeeLibModel> oldHeroEmployeeLibList = (List) this.player.getGameModelPool().getEntity("custom_heroEmployeeLib", libId);
        int totalProbabilityNum = 0;
        List<HeroEmployeeLibModel> newHeroEmployeeLibList = new ArrayList();
        List<Integer> compensateLibList = new ArrayList();
        WorldMgr worldMgr = (WorldMgr) ApplicationContextProvider.getContext().getBean(WorldMgr.class);
        int openServerDays = worldMgr.getOpenServerDays();

        for (HeroEmployeeLibModel model : oldHeroEmployeeLibList) {
            int dateEnd = model.getDateEnd() == -1 ? Integer.MAX_VALUE : model.getDateEnd();
            if (openServerDays >= model.getDateStart() && openServerDays <= dateEnd && (model.getLockNum() == 0 || model.getLockNum() > 0 && playerExtend.professionalNum >= model.getLockNum())) {
                newHeroEmployeeLibList.add(model);
                totalProbabilityNum += model.getOdds();
                if (model.getOpenLimit() > 0 && playerExtend.professionalNum >= model.getOpenLimit() && playerExtend.numSpace >= model.getNumSpace()) {
                    compensateLibList.add(model.getHeroId());
                }
            }
        }

        if (!compensateLibList.isEmpty()) {
            this.logger.info("重置前次数={},有保底英雄={}", playerExtend.numSpace, compensateLibList);
            playerExtend.numSpace = 0;
            HeroArchivePart heroArchivePart = (HeroArchivePart) this.player.getMgrPart(HeroArchivePart.class);
            List<Integer> heroIdList = heroArchivePart.getNoArchiveHero();
            this.logger.info("没有解锁的英雄ID={}", heroIdList);
            heroIdList.retainAll(compensateLibList);
            this.logger.info("需要替换的英雄={}", heroIdList);
            if (heroIdList != null && !heroIdList.isEmpty()) {
                totalProbabilityNum = 0;

                for (HeroEmployeeLibModel heroEmployeeLibModel : newHeroEmployeeLibList) {
                    if (heroIdList.contains(heroEmployeeLibModel.getHeroId())) {
                        this.logger.info("替换概率英雄={}，替换概率之前={}，之后={}", new Object[]{heroEmployeeLibModel.getHeroId(), heroEmployeeLibModel.getOdds(), heroEmployeeLibModel.getLimitAddPro()});
                        totalProbabilityNum += heroEmployeeLibModel.getLimitAddPro();
                    } else {
                        totalProbabilityNum += heroEmployeeLibModel.getOdds();
                    }
                }

                int r = RandomUtil.randInt(totalProbabilityNum);
                int tVal = 0;

                for (HeroEmployeeLibModel model : newHeroEmployeeLibList) {
                    if (heroIdList.contains(model.getHeroId())) {
                        tVal += model.getLimitAddPro();
                    } else {
                        tVal += model.getOdds();
                    }

                    if (tVal > r) {
                        this.logger.info("抽中的英雄={},是否是图鉴没有英雄={}", model.getHeroId(), heroIdList.contains(model.getHeroId()));
                        return model.getHeroId();
                    }
                }

                return 0;
            }
        }

        if (totalProbabilityNum == 0) {
            this.logger.error("{}寻访配置错误 libId：{}", this.player.getPlayerId(), libId);
            return 0;
        } else {
            int r = RandomUtil.randInt(totalProbabilityNum);
            int tVal = 0;

            for (HeroEmployeeLibModel model : newHeroEmployeeLibList) {
                tVal += model.getOdds();
                if (tVal > r) {
                    return model.getHeroId();
                }
            }

            return 0;
        }
    }

    public void guanJiaOperate(int systemId, int typeNum) {
        PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache) this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
        int common_num = (Integer) playerResetCustomCache.getDailyNum(101, 0);
        if (common_num != 0) {
            this.logger.error("玩家={}，普通免费次数已经领取过，不能再做快速人物，num={}", this.player.getPlayerId(), common_num);
        } else {
            int professional_num = (Integer) playerResetCustomCache.getDailyNum(102, 0);
            if (professional_num != 0) {
                this.logger.error("玩家={}，高级免费次数已经领取过，不能再做快速人物，num={}", this.player.getPlayerId(), professional_num);
            } else {
                ItemBagPart itemBagPart = (ItemBagPart) this.player.getMgrPart(ItemBagPart.class);
                int professionalNum = itemBagPart.getItemNum(1003);
                List<ResourceModel> needList = new ArrayList();
                HeroEmployeeModel professionalModel = null;
                if (typeNum > 0) {
                    if (professionalNum < typeNum) {
                        int needGold = 0;
                        if (typeNum >= 10) {
                            professionalModel = (HeroEmployeeModel) this.player.getGameModelPool().getEntity("heroEmployee", 4);
                            ConfigModel configModel = (ConfigModel) this.player.getGameModelPool().getEntity("config", "seniorRecruitmentCost");
                            Integer val = Integer.parseInt(configModel.getValue());
                            needGold = (typeNum - professionalNum) * val;
                        } else {
                            professionalModel = (HeroEmployeeModel) this.player.getGameModelPool().getEntity("heroEmployee", 3);
                            needGold = (typeNum - professionalNum) * professionalModel.getConsume();
                        }

                        needGold = ResCountryDifUtils.goldAdditionForJp(1, PlayerDefine.PLAYER_GOLD, needGold);
                        if (this.player.getPlayerDao().gold < (long) needGold) {
                            return;
                        }

                        if (professionalNum > 0) {
                            needList.add(new ResourceModel(2, 1003, professionalNum));
                        }

                        needList.add(new ResourceModel(1, PlayerDefine.PLAYER_GOLD, needGold));
                    } else {
                        if (typeNum >= 10) {
                            professionalModel = (HeroEmployeeModel) this.player.getGameModelPool().getEntity("heroEmployee", 4);
                        } else {
                            professionalModel = (HeroEmployeeModel) this.player.getGameModelPool().getEntity("heroEmployee", 3);
                        }

                        needList.add(new ResourceModel(2, 1003, typeNum));
                    }
                }

                playerResetCustomCache.setDailyReset(101, 3);
                playerResetCustomCache.setDailyReset(103, (int) (System.currentTimeMillis() / 1000L));
                List<HeroModel> commonFreeHeroList = new ArrayList();
                HeroEmployeeModel commonFreeModel = (HeroEmployeeModel) this.player.getGameModelPool().getEntity("heroEmployee", 1);
                List<ResourceModel> resultList = new ArrayList();

                for (int i = 0; i < 3; ++i) {
                    PlayerExtend playerExtend = (PlayerExtend) this.player.getPlayerExtend(13);
                    int heroId = this.getRecruitmentHeroId(commonFreeModel.getLibId(), playerExtend);
                    if (heroId >= 0) {
                        HeroModel heroModel = (HeroModel) this.player.getGameModelPool().getEntity("hero", heroId);
                        if (heroModel == null) {
                            this.logger.error("英雄模板为空，id={}", heroId);
                        } else {
                            commonFreeHeroList.add(heroModel);
                            resultList.add(new ResourceModel(3, heroModel.getId(), 1));
                        }
                    }
                }

                HeroEmployeeModel professionalFreeModel = (HeroEmployeeModel) this.player.getGameModelPool().getEntity("heroEmployee", 3);
                playerResetCustomCache.setDailyReset(102, 1);
                playerResetCustomCache.setDailyReset(104, (int) (System.currentTimeMillis() / 1000L));
                List<HeroModel> professionalFreeHeroList = this.getHeroList(HeroMsg.RecruitmentType.PROFESSIONAL, HeroMsg.NumType.ONCE, 1, 0, professionalFreeModel);

                for (HeroModel heroModel : professionalFreeHeroList) {
                    resultList.add(new ResourceModel(3, heroModel.getId(), 1));
                }

                List<HeroModel> professionalHeroList = new ArrayList();
                if (typeNum >= 10) {
                    professionalHeroList = this.getHeroList(HeroMsg.RecruitmentType.PROFESSIONAL, HeroMsg.NumType.TEN_TIMES, typeNum, 0, professionalModel);
                } else if (typeNum > 0) {
                    professionalHeroList = this.getHeroList(HeroMsg.RecruitmentType.PROFESSIONAL, HeroMsg.NumType.ONCE, typeNum, 0, professionalModel);
                }

                for (HeroModel heroModel : professionalHeroList) {
                    resultList.add(new ResourceModel(3, heroModel.getId(), 1));
                }

                if (!needList.isEmpty()) {
                    this.player.delResource((List) needList, 4, 433, 0, 0, "");
                }

                LanguageModel strModel = (LanguageModel) ApplicationContextProvider.getModelPoolEntity("language", "heroEmployee1");
                String recruitmentName = strModel.getValue();
                this.commitHeroList(commonFreeHeroList, HeroMsg.RecruitmentType.COMMON, 3, 1, this.player.getPlayerDao(), recruitmentName, commonFreeModel, 433, needList, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW);
                this.commitHeroList(professionalFreeHeroList, HeroMsg.RecruitmentType.PROFESSIONAL, 1, 3, this.player.getPlayerDao(), recruitmentName, professionalFreeModel, 433, needList, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW);
                if (typeNum > 0) {
                    if (typeNum >= 10) {
                        this.commitHeroList(professionalHeroList, HeroMsg.RecruitmentType.PROFESSIONAL, typeNum, 4, this.player.getPlayerDao(), recruitmentName, professionalModel, 433, needList, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW);
                    } else if (typeNum > 0) {
                        this.commitHeroList(professionalHeroList, HeroMsg.RecruitmentType.PROFESSIONAL, typeNum, 3, this.player.getPlayerDao(), recruitmentName, professionalModel, 433, needList, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW);
                    }
                }

                playerResetCustomCache.addDailyReset(16, 1 + typeNum);
                MergeActivityHeFuKuangHuanPart mergeActivityHeFuKuangHuanPart = (MergeActivityHeFuKuangHuanPart) this.player.getMgrPart(MergeActivityHeFuKuangHuanPart.class);
                mergeActivityHeFuKuangHuanPart.updateRushRank(2, 1 + typeNum);
                this.S2C_HeroRecruitmentUiResult_5032();
                GuanJiaPart guanJiaPart = (GuanJiaPart) this.player.getMgrPart(GuanJiaPart.class);
                guanJiaPart.checkState(systemId, resultList);
            }
        }
    }

    public void advertisementVnRecruitment() {
        PlayerExtend playerExtend = (PlayerExtend) this.player.getPlayerExtend(13);
        int typeId = HeroDefine.HERO_RECRUITMENT[2][0];
        HeroEmployeeModel heroEmployeeModel = (HeroEmployeeModel) this.player.getGameModelPool().getEntity("heroEmployee", typeId);
        if (heroEmployeeModel == null) {
            this.logger.error("玩家【{}】越南广告寻访奖励获取失败,找不到【{}】对应配置", this.player.getPlayerId(), typeId);
        } else if (this.player.getPlayerDao().vip_lv < heroEmployeeModel.getVip()) {
            this.logger.error("玩家【{}】越南广告寻访奖励获取失败,【{}】配置需要对应vip【{}】", new Object[]{this.player.getPlayerId(), heroEmployeeModel.getId(), heroEmployeeModel.getVip()});
        } else {
            List<HeroModel> heroModelList = this.getHeroList(HeroMsg.RecruitmentType.PROFESSIONAL, HeroMsg.NumType.ONCE, 1, !playerExtend.iisCompletedProfessionalRecruitmentGuide() ? 2 : 0, heroEmployeeModel);
            if (heroModelList != null && !heroModelList.isEmpty()) {
                MergeActivityHeFuKuangHuanPart mergeActivityHeFuKuangHuanPart = (MergeActivityHeFuKuangHuanPart) this.player.getMgrPart(MergeActivityHeFuKuangHuanPart.class);
                mergeActivityHeFuKuangHuanPart.updateRushRank(2, 1);
                LanguageModel strModel = (LanguageModel) ApplicationContextProvider.getModelPoolEntity("language", "heroEmployee3");
                this.commitHeroList(heroModelList, HeroMsg.RecruitmentType.PROFESSIONAL, 1, typeId, this.player.getPlayerDao(), strModel.getValue(), heroEmployeeModel, 12201, (List) null, PlayerMsg.ShowType.SHOW_AD_RECRUITMENT);
            } else {
                this.logger.error("玩家【{}】越南广告寻访奖励获取失败,获取不到武将", this.player.getPlayerId());
            }
        }
    }
}
