package com.gzbz.gamePlayer.heroPart;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import allMgr.TaskMethod;
import com.gzbz.activity.ActivityMgr;
import com.gzbz.alliance.AllianceMgr;
import com.gzbz.catchDeer.CatchDeerMgr;
import com.gzbz.db.ArtifactDao;
import com.gzbz.db.HeroArrayingDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.TongqueTerraceDao;
import com.gzbz.db.arraying.ArrayingEntity;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.db.worldBean.HeroPowerData;
import com.gzbz.demonStrikes.DemonStrikesPart;
import com.gzbz.duel.DuelPart;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.magicBook.MagicBookPart;
import com.gzbz.gamePlayer.peak.PeakBattlePart;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.gamePlayer.tongque.TongqueTerracePart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.megerWar.part.MergeWarGamePart;
import com.gzbz.model.BattleCondition;
import com.gzbz.model.HeroModel;
import com.gzbz.model.SkillKingTalentModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.HeroExtendMsg;
import com.gzbz.protobuf.HeroMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.rank.part.RankPart;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.supremePvp.part.SupremePvpPart;
import com.gzbz.war.redcliff.RedCliffPart;
import com.gzbz.war.stonehenge.StonehengePart;
import com.gzbz.worldMgr.WorldMgr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
public class HeroArrayingPart extends PlayerPart {
    Logger logger = LoggerFactory.getLogger(WorldMgr.class);
    @Autowired
    ConfigManager configManager;
    @Autowired
    ActivityMgr activityMgr;
    @Autowired
    HeroRankMgr heroRankMgr;
    public static final Map<Integer, List<CommonMsg.HeroState>> MULTIPLE_ARRAYING = new HashMap();
    public static final List<Integer> RESET_ADDITION_ARRAYING = new ArrayList();

    public void loginHandle() {
        this.sendArrayingListToClient();
        if (this.activityMgr.checkOpenServerRankTime(RankDefine.RankModule.OPEN_SERVER_HERO_LEV) > 0) {
            RankPart rankPart = (RankPart) this.player.getMgrPart(RankPart.class);
            HeroBagPart heroBagPart = (HeroBagPart) this.player.getMgrPart(HeroBagPart.class);
            int levSum = 0;
            HeroArrayingDao commonArraying = this.getHeroArrayingDaoByType(CommonMsg.HeroState.HERO_STATE_ARRAYING);

            for (byte position : commonArraying.elements.keySet()) {
                CommonMsg.CodeType codeType = this.getCodeTypeByPosition(position);
                if (codeType == CommonMsg.CodeType.CODE_HERO) {
                    HeroDao heroDao = heroBagPart.getHeroByCode((Integer) commonArraying.elements.get(position));
                    if (heroDao != null && heroDao.type != HeroDefine.HERO_SP_TYPE_LINK) {
                        levSum += heroDao.getLv();
                    }
                }
            }

            rankPart.updateRank(RankDefine.RankModule.OPEN_SERVER_HERO_LEV, (long) levSum, true);
        }

    }

    public boolean loginHandleAsync() {
        return true;
    }

    public long getPlayerCombatPower(boolean isUpdateHeroPower) {
        long totalCombatPower = 0L;
        HeroArrayingDao heroArrayingDao = this.getHeroArrayingDaoByType(CommonMsg.HeroState.HERO_STATE_ARRAYING);
        if (heroArrayingDao == null) {
            return 0L;
        } else {
            HeroBagPart heroBagPart = (HeroBagPart) this.player.getMgrPart(HeroBagPart.class);

            for (Map.Entry<Byte, Integer> entry : heroArrayingDao.elements.entrySet()) {
                switch ((Byte) entry.getKey()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        HeroDao heroDao = heroBagPart.getHeroByCode((Integer) entry.getValue());
                        if (heroDao != null) {
                            totalCombatPower += heroDao.getCombatPower();
                            if (isUpdateHeroPower && heroDao.invalidTime == 0) {
                                this.heroRankMgr.pushTaskEx("updateHeroRank", new Object[]{this.player.getPlayerId(), heroDao.id, heroDao.getCombatPower(), heroDao.code});
                            }
                        }
                }
            }

            heroArrayingDao.updateOp();
            MagicBookPart magicBookPart = (MagicBookPart) this.player.getMgrPart(MagicBookPart.class);
            totalCombatPower += magicBookPart.getPower();
            return totalCombatPower;
        }
    }

    @MsgHandlerAnno
    public void C2S_HeroArrayingList_5029(HeroMsg.C2S_HeroArrayingList_5029 msg, String source) {
        this.sendArrayingListToClient();
    }

    public void sendArrayingListToClient() {
        HeroMsg.S2C_HeroArrayingListResult_5030.Builder result_builder = HeroMsg.S2C_HeroArrayingListResult_5030.newBuilder();
        Map<Integer, HeroArrayingDao> map = this.player.<Integer, HeroArrayingDao>getMap("tb_hero_arraying", this.player.getPlayerId());
        if (map != null) {
            HeroBagPart heroBagPart = (HeroBagPart) this.player.getMgrPart(HeroBagPart.class);
            List<HeroArrayingDao> delDaoList = new ArrayList();
            Map<Integer, HeroPowerData> heroPowerDataMap = new HashMap();

            for (Map.Entry<Integer, HeroArrayingDao> mainEntry : map.entrySet()) {
                HeroArrayingDao heroArrayingDao = (HeroArrayingDao) mainEntry.getValue();
                if (heroArrayingDao != null) {
                    CommonMsg.HeroState state = CommonMsg.HeroState.forNumber((Integer) mainEntry.getKey());
                    if (state == null) {
                        delDaoList.add(heroArrayingDao);
                    } else {
                        HeroMsg.ArrayingList.Builder arraying_builder = HeroMsg.ArrayingList.newBuilder();
                        arraying_builder.setArrayingType(state);
                        arraying_builder.setFriendState(heroArrayingDao.friendState);
                        arraying_builder.setFriendNation(heroArrayingDao.friendNation);
                        arraying_builder.setIsHide(heroArrayingDao.hide);
                        arraying_builder.setKingCode(heroArrayingDao.kingCode);
                        arraying_builder.setFriendJob(heroArrayingDao.friendJob);
                        arraying_builder.setSoulHeroCode(heroArrayingDao.soulHeroCode);
                        List<Byte> needDelList = new ArrayList();

                        for (Map.Entry<Byte, Integer> subEntry : heroArrayingDao.elements.entrySet()) {
                            if ((Byte) subEntry.getKey() <= 5) {
                                HeroDao heroDao = heroBagPart.getHeroByCode((Integer) subEntry.getValue());
                                if (heroDao == null) {
                                    this.logger.error("玩家={}，阵型={}，没有英雄，code={}", new Object[]{this.player.getPlayerId(), mainEntry.getKey(), subEntry.getValue()});
                                    needDelList.add(subEntry.getKey());
                                    continue;
                                }

                                if (state == CommonMsg.HeroState.HERO_STATE_ARRAYING) {
                                    HeroPowerData heroPowerData = new HeroPowerData(this.player.getPlayerId(), heroDao.code, heroDao.getCombatPower());
                                    if (heroDao.type != HeroDefine.HERO_SP_TYPE_PALACE && heroDao.invalidTime == 0) {
                                        heroPowerDataMap.put(heroDao.id, heroPowerData);
                                    }
                                }
                            }

                            HeroMsg.ArrayingInfo.Builder infoBuilder = HeroMsg.ArrayingInfo.newBuilder();
                            infoBuilder.setPosition((Byte) subEntry.getKey());
                            infoBuilder.setCode((Integer) subEntry.getValue());
                            infoBuilder.setCodeType(this.getCodeTypeByPosition((Byte) subEntry.getKey()));
                            arraying_builder.addInfo(infoBuilder);
                        }

                        if (state == CommonMsg.HeroState.HERO_STATE_ARRAYING) {
                            this.heroRankMgr.pushTaskEx("updateHeroListRank", new Object[]{this.player.getPlayerId(), heroPowerDataMap});
                        }

                        if (!needDelList.isEmpty()) {
                            for (Byte key : needDelList) {
                                heroArrayingDao.elements.remove(key);
                            }

                            heroArrayingDao.updateOp();
                        }

                        result_builder.addArrayings(arraying_builder);
                    }
                }
            }

            if (!delDaoList.isEmpty()) {
                for (HeroArrayingDao heroArrayingDao : delDaoList) {
                    this.player.deleteDao(heroArrayingDao, true);
                }
            }

            this.player.sendMsg(result_builder.build());
        }
    }

    public void updateArraying(HeroArrayingDao heroArrayingDao) {
        if (heroArrayingDao != null) {
            HeroMsg.S2C_HeroArrayingListResult_5030.Builder result_builder = HeroMsg.S2C_HeroArrayingListResult_5030.newBuilder();
            result_builder.setIsUpdate(true);
            HeroMsg.ArrayingList.Builder arraying_builder = HeroMsg.ArrayingList.newBuilder();
            arraying_builder.setArrayingType(CommonMsg.HeroState.forNumber(heroArrayingDao.arrayingType));
            arraying_builder.setIsHide(heroArrayingDao.hide);
            arraying_builder.setSoulHeroCode(heroArrayingDao.soulHeroCode);

            for (Map.Entry<Byte, Integer> entry : heroArrayingDao.elements.entrySet()) {
                HeroMsg.ArrayingInfo.Builder infoBuilder = HeroMsg.ArrayingInfo.newBuilder();
                infoBuilder.setPosition((Byte) entry.getKey());
                infoBuilder.setCode((Integer) entry.getValue());
                infoBuilder.setCodeType(this.getCodeTypeByPosition((Byte) entry.getKey()));
                arraying_builder.addInfo(infoBuilder);
            }

            result_builder.addArrayings(arraying_builder);
            this.player.sendMsg(result_builder.build());
        }
    }

    @MsgHandlerAnno
    public void C2S_UpdateFriendHeroState_13211(HeroExtendMsg.C2S_UpdateFriendHeroState_13211 msg, String source) {
        HeroArrayingDao heroArrayingDao = this.getHeroArrayingDaoByType(msg.getArrayingType());
        if (heroArrayingDao == null) {
            heroArrayingDao = new HeroArrayingDao();
            heroArrayingDao.playerId = this.player.getPlayerId();
            heroArrayingDao.arrayingType = msg.getArrayingType().getNumber();
            heroArrayingDao.friendState = msg.getFriendState();
            heroArrayingDao.insertOp();
            this.player.insertDao(heroArrayingDao);
        } else {
            if (msg.getFriendState() != 0 && msg.getFriendState() != 1) {
                this.logger.info("援军状态不对={}", msg.getFriendState());
                return;
            }

            heroArrayingDao.friendState = msg.getFriendState();
            heroArrayingDao.updateOp();
        }

        HeroExtendMsg.S2C_UpdateFriendHeroState_13212.Builder builder = HeroExtendMsg.S2C_UpdateFriendHeroState_13212.newBuilder();
        builder.setResult(1);
        builder.setArrayingType(msg.getArrayingType());
        builder.setFriendState(msg.getFriendState());
        this.player.sendMsg(builder.build());
        this.sendArrayingToCross(msg.getArrayingType());
        this.checkSoulHeroByFriendState(heroArrayingDao);
    }

    public void checkSoulHeroByFriendState(HeroArrayingDao heroArrayingDao) {
        byte tempKey = 0;
        int targetHeroCode = 0;
        HeroBagPart heroBagPart = (HeroBagPart) this.player.getMgrPart(HeroBagPart.class);
        int limitStar = this.configManager.getIntDefault("SoulHeroLimitStar", 9);
        int oldSoulHeroCode = heroArrayingDao.soulHeroCode;
        Boolean flag = false;

        for (Map.Entry<Byte, Integer> entry : heroArrayingDao.elements.entrySet()) {
            HeroDao heroDao = heroBagPart.getHeroByCode((Integer) entry.getValue());
            if ((Byte) entry.getKey() == 5 && heroArrayingDao.friendState == 1 && heroArrayingDao.soulHeroCode == heroDao.code) {
                heroArrayingDao.soulHeroCode = 0;
                heroArrayingDao.updateOp();
                flag = true;
                break;
            }
        }

        if (flag) {
            for (Map.Entry<Byte, Integer> entry : heroArrayingDao.elements.entrySet()) {
                if ((Byte) entry.getKey() <= 5 && (Byte) entry.getKey() >= 0) {
                    HeroDao heroDao = heroBagPart.getHeroByCode((Integer) entry.getValue());
                    if (heroDao != null) {
                        HeroModel heroModel = (HeroModel) this.player.getGameModelPool().getEntity("hero", heroDao.id);
                        if (heroModel.getNation() == 10 && heroDao.inheritNation > 0 && heroDao.getStar() >= limitStar && heroDao.heroStarSkills.size() >= heroModel.getFieldSkillSlotId() && ((Byte) entry.getKey() == 5 && heroArrayingDao.friendState == 0 || (Byte) entry.getKey() < 5) && (tempKey == 0 || (Byte) entry.getKey() < tempKey)) {
                            tempKey = (Byte) entry.getKey();
                            targetHeroCode = heroDao.code;
                        }
                    }
                }
            }

            if (targetHeroCode > 0 && heroArrayingDao.soulHeroCode == 0) {
                heroArrayingDao.soulHeroCode = targetHeroCode;
                heroArrayingDao.updateOp();
            } else if (heroArrayingDao.soulHeroCode > 0 && targetHeroCode == 0) {
                heroArrayingDao.soulHeroCode = 0;
                heroArrayingDao.updateOp();
            }
        }

        if (oldSoulHeroCode != heroArrayingDao.soulHeroCode) {
            HeroMsg.S2C_SelectSoulHero_5240.Builder builder = HeroMsg.S2C_SelectSoulHero_5240.newBuilder();
            builder.setHeroCode(heroArrayingDao.soulHeroCode);
            builder.setArrayingType(CommonMsg.HeroState.forNumber(heroArrayingDao.arrayingType));
            this.player.sendMsg(builder.build());
        }

    }

    @MsgHandlerAnno
    public void C2S_UpdateFriendHeroNation_13213(HeroExtendMsg.C2S_UpdateFriendHeroNation_13213 msg, String source) {
        HeroArrayingDao heroArrayingDao = this.getHeroArrayingDaoByType(msg.getArrayingType());
        if (heroArrayingDao == null) {
            heroArrayingDao = new HeroArrayingDao();
            heroArrayingDao.playerId = this.player.getPlayerId();
            heroArrayingDao.arrayingType = msg.getArrayingType().getNumber();
            heroArrayingDao.friendNation = msg.getFriendNation();
            heroArrayingDao.insertOp();
            this.player.insertDao(heroArrayingDao);
        } else {
            if (msg.getFriendNation() < 0 || msg.getFriendNation() > 5) {
                this.logger.info("援军阵营不对={}", msg.getFriendNation());
                return;
            }

            heroArrayingDao.friendNation = msg.getFriendNation();
            heroArrayingDao.updateOp();
        }

        HeroExtendMsg.S2C_UpdateFriendHeroNation_13214.Builder builder = HeroExtendMsg.S2C_UpdateFriendHeroNation_13214.newBuilder();
        builder.setResult(1);
        builder.setArrayingType(msg.getArrayingType());
        builder.setFriendNation(msg.getFriendNation());
        this.player.sendMsg(builder.build());
        this.sendArrayingToCross(msg.getArrayingType());
    }

    @MsgHandlerAnno
    public void C2S_UpdateFriendHeroJob_13223(HeroExtendMsg.C2S_UpdateFriendHeroJob_13223 msg, String source) {
        if (!HeroDefine.HERO_JOB.contains(msg.getFriendJob())) {
            this.logger.error("玩家{}选择援军职业不存在={}", this.player.getPlayerId(), msg.getFriendJob());
            this.player.failure(0);
        } else {
            HeroArrayingDao heroArrayingDao = this.getHeroArrayingDaoByType(msg.getArrayingType());
            if (heroArrayingDao == null) {
                this.logger.error("玩家{}阵型不存在={}", this.player.getPlayerId(), msg.getArrayingType());
                this.player.failure(0);
            } else {
                Integer friendHeroCode = (Integer) heroArrayingDao.elements.get((byte) 5);
                if (friendHeroCode == null) {
                    this.logger.error("玩家{}选择援军职业失败,未选择援军", this.player.getPlayerId());
                } else {
                    HeroBagPart heroBagPart = (HeroBagPart) this.player.getMgrPart(HeroBagPart.class);
                    HeroDao heroDao = heroBagPart.getHeroByCode(friendHeroCode);
                    if (heroDao == null) {
                        this.logger.error("玩家{}选择援军职业失败,援军武将不存在,code={}", this.player.getPlayerId(), friendHeroCode);
                        this.player.failure(4100);
                    } else {
                        HeroModel heroModel = (HeroModel) ApplicationContextProvider.getModelPoolEntity("hero", heroDao.id);
                        if (heroModel == null) {
                            this.player.failure(0);
                        } else if (heroModel.getHeroSpType() != HeroDefine.HERO_SP_TYPE_KING) {
                            this.logger.error("玩家{}选择援军职业失败,援军武将{}非君主武将", this.player.getPlayerId(), heroDao.id);
                        } else {
                            heroArrayingDao.friendJob = msg.getFriendJob();
                            heroArrayingDao.updateOp();
                            if (msg.getArrayingType() == CommonMsg.HeroState.HERO_STATE_ARRAYING) {
                                long oldPower = this.player.getPlayerCombatPower();
                                int friendCode = heroBagPart.updateFriendAndKingProperty(false, HeroDefine.HeroPropertyModel.MODEL_HERO);
                                Set<Integer> flushHeroCodeSet = this.getArrayingHeroCodes(msg.getArrayingType());
                                heroBagPart.flushHeroIdAndArrayingForCodeList(HeroDefine.HeroPropertyModel.MODEL_HERO, flushHeroCodeSet, false, false);
                                if (friendCode > 0) {
                                    flushHeroCodeSet.add(friendCode);
                                }

                                heroBagPart.sendHeroList2ClientByCode(flushHeroCodeSet);
                                heroBagPart.sendHeroList2ClientByHeroDao(heroDao);
                                long newPower = this.getPlayerCombatPower(false);
                                this.player.flushPlayerCombatPower("更改君主职业", newPower);
                                this.player.getOperationMgr().addPowerChangeLog(this.player, oldPower, "更改君主职业", (HeroDefine.HeroPropertyModel) null);

                                for (Integer code : flushHeroCodeSet) {
                                    HeroDao otherHero = heroBagPart.getHeroByCode(code);
                                    heroBagPart.updateNationHeroRank(otherHero, true);
                                }
                            }

                            HeroExtendMsg.S2C_UpdateFriendHeroJob_13224.Builder builder = HeroExtendMsg.S2C_UpdateFriendHeroJob_13224.newBuilder();
                            builder.setArrayingType(msg.getArrayingType());
                            builder.setFriendJob(msg.getFriendJob());
                            this.player.sendMsg(builder.build());
                            this.sendArrayingToCross(msg.getArrayingType());
                        }
                    }
                }
            }
        }
    }

    @MsgHandlerAnno
    public void C2S_ArtifactBeautyArraying_5201(HeroMsg.C2S_ArtifactBeautyArraying_5201 msg, String source) {
        CommonMsg.HeroState arrayingType = msg.getArrayingType();
        CommonMsg.CodeType codeType = msg.getCodeType();
        int code = msg.getCode();
        HeroArrayingDao heroArrayingDao = this.getHeroArrayingDaoByType(arrayingType);
        if (code > 0) {
            switch (codeType) {
                case CODE_ARTIFACT:
                    ArtifactDao artifactDao = (ArtifactDao) this.player.getData("tb_artifact", this.player.getPlayerId());
                    if (!artifactDao.artifacts.containsKey(code)) {
                        return;
                    }

                    List<Integer> artfactCodeList = new ArrayList();
                    if (arrayingType == CommonMsg.HeroState.HERO_STATE_DUEL_1 || arrayingType == CommonMsg.HeroState.HERO_STATE_DUEL_2 || arrayingType == CommonMsg.HeroState.HERO_STATE_DUEL_3) {
                        int articactCode_1 = this.getArtifactCodeOfArraying(CommonMsg.HeroState.HERO_STATE_DUEL_1);
                        int articactCode_2 = this.getArtifactCodeOfArraying(CommonMsg.HeroState.HERO_STATE_DUEL_2);
                        int articactCode_3 = this.getArtifactCodeOfArraying(CommonMsg.HeroState.HERO_STATE_DUEL_3);
                        artfactCodeList.add(articactCode_1);
                        artfactCodeList.add(articactCode_2);
                        artfactCodeList.add(articactCode_3);
                    }

                    if (artfactCodeList.contains(code)) {
                        this.logger.info("其他阵型中已经包含此神兵ID={}，List={}", code, artfactCodeList);
                        return;
                    }
                    break;
                case CODE_BEAUTY:
                    if (!this.player.isSystemOpen(2300)) {
                        this.logger.info("美人系统没有开放，lv={}", this.player.getPublicDao().lv);
                        return;
                    }

                    TongqueTerracePart tongqueTerracePart = (TongqueTerracePart) this.player.getMgrPart(TongqueTerracePart.class);
                    TongqueTerraceDao tongqueTerraceDao = tongqueTerracePart.getTongqueTerraceDao(code);
                    if (tongqueTerraceDao.beautyGrade >= 1) {
                        this.logger.info("该美人为副美人 不可上阵");
                        return;
                    }
            }

            if (heroArrayingDao == null) {
                heroArrayingDao = new HeroArrayingDao();
                heroArrayingDao.playerId = this.player.getPlayerId();
                heroArrayingDao.arrayingType = arrayingType.getNumber();
                switch (codeType) {
                    case CODE_ARTIFACT:
                        heroArrayingDao.elements.put((byte) 6, code);
                        break;
                    case CODE_BEAUTY:
                        TongqueTerracePart tongqueTerracePart = (TongqueTerracePart) this.player.getMgrPart(TongqueTerracePart.class);
                        TongqueTerraceDao tongqueTerraceDao = tongqueTerracePart.getTongqueTerraceDao(code);
                        if (tongqueTerraceDao.beautyGrade >= 1) {
                            this.logger.info("该美人为副美人，不可上阵");
                            return;
                        }

                        heroArrayingDao.elements.put((byte) 7, code);
                }

                heroArrayingDao.insertOp();
                this.player.insertDao(heroArrayingDao);
            } else {
                switch (codeType) {
                    case CODE_ARTIFACT:
                        heroArrayingDao.elements.put((byte) 6, code);
                        break;
                    case CODE_BEAUTY:
                        heroArrayingDao.elements.put((byte) 7, code);
                }

                heroArrayingDao.updateOp();
            }
        } else {
            if (heroArrayingDao == null) {
                return;
            }

            switch (codeType) {
                case CODE_ARTIFACT:
                    heroArrayingDao.elements.remove((byte) 6);
                    break;
                case CODE_BEAUTY:
                    heroArrayingDao.elements.remove((byte) 7);
            }

            heroArrayingDao.updateOp();
        }

        HeroMsg.S2C_ArtifactBeautyArraying_5202.Builder builder = HeroMsg.S2C_ArtifactBeautyArraying_5202.newBuilder();
        builder.setResult(1);
        builder.addArrayingType(arrayingType);
        builder.setCodeType(codeType);
        builder.setCode(code);
        this.player.sendMsg(builder.build());
        this.sendArrayingToCross(arrayingType);
    }

    public void sendArrayingToCross(CommonMsg.HeroState arrayingType) {
        if (arrayingType == CommonMsg.HeroState.HERO_STATE_ARRAYING) {
            this.player.uploadCrossPlayer();
            MergeWarGamePart mergeWarGamePart = (MergeWarGamePart) this.player.getMgrPart(MergeWarGamePart.class);
            mergeWarGamePart.sendArrayingToCross();
        } else if (arrayingType == CommonMsg.HeroState.HERO_STATE_RED_CLIFF) {
            RedCliffPart redCliffPart = (RedCliffPart) this.player.getMgrPart(RedCliffPart.class);
            redCliffPart.sendArrayingToCross(true);
        } else if (arrayingType == CommonMsg.HeroState.HERO_STATE_PEAK_LADDER) {
            PeakBattlePart peakPart = (PeakBattlePart) this.player.getMgrPart(PeakBattlePart.class);
            peakPart.sendArrayingToCross(2);
        } else if (arrayingType == CommonMsg.HeroState.HERO_STATE_PEAK_BATTLE) {
            PeakBattlePart peakPart = (PeakBattlePart) this.player.getMgrPart(PeakBattlePart.class);
            peakPart.sendArrayingToCross(1);
        } else if (arrayingType == CommonMsg.HeroState.HERO_STATE_KING_PLAINS) {
            CatchDeerMgr catchDeerMgr = (CatchDeerMgr) ApplicationContextProvider.getContext().getBean(CatchDeerMgr.class);
            catchDeerMgr.sendArrayingToCross(this.player);
        } else if (arrayingType == CommonMsg.HeroState.HERO_STATE_ALLIANCE) {
            if (this.player.isRobot()) {
                return;
            }

            AllianceMgr allianceMgr = (AllianceMgr) ApplicationContextProvider.getContext().getBean(AllianceMgr.class);
            allianceMgr.pushTaskEx("allianceUploadArraying", new Object[]{this.player});
        } else if (arrayingType == CommonMsg.HeroState.HERO_STATE_DEMON_STRIKES) {
            if (this.player.isRobot()) {
                return;
            }

            DemonStrikesPart demonStrikesPart = (DemonStrikesPart) this.player.getMgrPart(DemonStrikesPart.class);
            demonStrikesPart.updatePlayerData();
        } else if (arrayingType != CommonMsg.HeroState.HERO_STATE_DUEL_1 && arrayingType != CommonMsg.HeroState.HERO_STATE_DUEL_2 && arrayingType != CommonMsg.HeroState.HERO_STATE_DUEL_3) {
            if (arrayingType == CommonMsg.HeroState.HERO_STATE_SUPREME_PVP) {
                SupremePvpPart supremePvpPart = (SupremePvpPart) this.player.getMgrPart(SupremePvpPart.class);
                supremePvpPart.uploadArraying();
            }
        } else {
            if (this.player.isRobot()) {
                return;
            }

            DuelPart duelPart = (DuelPart) this.player.getMgrPart(DuelPart.class);
            duelPart.uploadArraying();
        }

    }

    @MsgHandlerAnno
    public void C2S_HeroArraying_5015(HeroMsg.C2S_HeroArraying_5015 msg, String source) {
        long oldPower = this.player.getPlayerCombatPower();
        CommonMsg.HeroState arrayingType = msg.getArrayingType();
        if (arrayingType != CommonMsg.HeroState.HERO_STATE_DUEL_1 && arrayingType != CommonMsg.HeroState.HERO_STATE_DUEL_2 && arrayingType != CommonMsg.HeroState.HERO_STATE_DUEL_3) {
            if (arrayingType != CommonMsg.HeroState.HERO_STATE_DEMON_BOSS && arrayingType != CommonMsg.HeroState.HERO_STATE_DEMON_ROTATE_BOSS) {
                if (arrayingType != CommonMsg.HeroState.HERO_STATE_DECISIVE_BATTLE_1 && arrayingType != CommonMsg.HeroState.HERO_STATE_DECISIVE_BATTLE_2 && arrayingType != CommonMsg.HeroState.HERO_STATE_DECISIVE_BATTLE_3) {
                    if (arrayingType == CommonMsg.HeroState.HERO_STATE_CUSTOM_ARRAYING) {
                        this.player.failure(0);
                    } else {
                        List<HeroMsg.ArrayingInfo> arrayingList = msg.getInfoList();
                        int result = this.checkSaveHeroArrayingState(arrayingType, arrayingList, true);
                        if (result != 1) {
                            HeroMsg.S2C_HeroArrayingResult_5016.Builder result_builder = HeroMsg.S2C_HeroArrayingResult_5016.newBuilder();
                            result_builder.setResult(result);
                            this.player.sendMsg(result_builder.build());
                        } else {
                            this.saveHeroArraying(arrayingType, arrayingList);
                            HeroMsg.S2C_HeroArrayingResult_5016.Builder result_builder = HeroMsg.S2C_HeroArrayingResult_5016.newBuilder();
                            result_builder.setResult(1);
                            result_builder.setArrayingType(msg.getArrayingType());
                            long totalCombatPower = this.getPlayerCombatPower(false);
                            HeroArrayingDao heroArrayingDao = this.getHeroArrayingDaoByType(arrayingType);
                            if (heroArrayingDao != null) {
                                int soulHeroCode = msg.hasSoulHeroCode() ? msg.getSoulHeroCode() : 0;
                                this.checkSoulHero(heroArrayingDao, msg.hasSoulHeroCode(), soulHeroCode);

                                for (Map.Entry<Byte, Integer> entry : heroArrayingDao.elements.entrySet()) {
                                    HeroMsg.ArrayingInfo.Builder infoBuilder = HeroMsg.ArrayingInfo.newBuilder();
                                    infoBuilder.setPosition((Byte) entry.getKey());
                                    infoBuilder.setCode((Integer) entry.getValue());
                                    infoBuilder.setCodeType(this.getCodeTypeByPosition((Byte) entry.getKey()));
                                    result_builder.addInfo(infoBuilder);
                                }

                                result_builder.setSoulHeroCode(heroArrayingDao.soulHeroCode);
                                this.player.sendMsg(result_builder.build());
                                HeroMsg.S2C_SelectKingResult_5228.Builder kingCodersp = HeroMsg.S2C_SelectKingResult_5228.newBuilder();
                                kingCodersp.setResult(1);
                                kingCodersp.setKingCode(heroArrayingDao.kingCode);
                                kingCodersp.setArrayingType(msg.getArrayingType());
                                this.player.sendMsg(kingCodersp.build());
                                if (msg.getArrayingType() == CommonMsg.HeroState.HERO_STATE_ARRAYING) {
                                    this.player.flushPlayerCombatPower("保存阵型", totalCombatPower);
                                    LogOperationMgr operationMgr = this.player.getOperationMgr();
                                    operationMgr.addPowerChangeLog(this.player, oldPower, "保存阵型", (HeroDefine.HeroPropertyModel) null);
                                }

                                this.sendArrayingToCross(arrayingType);
                            }
                        }
                    }
                } else {
                    this.player.failure(0);
                }
            } else {
                this.player.failure(0);
            }
        } else {
            this.player.failure(0);
        }
    }

    public void checkSoulHero(HeroArrayingDao heroArrayingDao, Boolean hasSoulHeroCode, int soulHeroCode) {
        HeroBagPart heroBagPart = (HeroBagPart) this.player.getMgrPart(HeroBagPart.class);
        int limitStar = this.configManager.getIntDefault("SoulHeroLimitStar", 9);
        if (hasSoulHeroCode && soulHeroCode > 0) {
            HeroDao heroDao = heroBagPart.getHeroByCode(soulHeroCode);
            HeroModel soulModel = (HeroModel) this.player.getGameModelPool().getEntity("hero", heroDao.id);
            if (heroDao != null && heroDao.containState(heroArrayingDao.arrayingType) && heroDao.getStar() >= limitStar && soulModel.getNation() == 10 && heroDao.heroStarSkills.size() >= soulModel.getFieldSkillSlotId()) {
                if (!heroArrayingDao.elements.containsKey((byte) 5) || (Integer) heroArrayingDao.elements.get((byte) 5) != soulHeroCode || heroArrayingDao.friendState != 1) {
                    heroArrayingDao.soulHeroCode = soulHeroCode;
                    heroArrayingDao.updateOp();
                    return;
                }

                heroArrayingDao.soulHeroCode = 0;
                heroArrayingDao.updateOp();
            } else {
                heroArrayingDao.soulHeroCode = 0;
                heroArrayingDao.updateOp();
            }
        } else {
            heroArrayingDao.soulHeroCode = 0;
            heroArrayingDao.updateOp();
        }

        byte tempKey = 0;
        int targetHeroCode = 0;

        for (Map.Entry<Byte, Integer> entry : heroArrayingDao.elements.entrySet()) {
            if ((Byte) entry.getKey() >= 0 && (Byte) entry.getKey() <= 5) {
                HeroDao heroDao = heroBagPart.getHeroByCode((Integer) entry.getValue());
                HeroModel heroModel = (HeroModel) this.player.getGameModelPool().getEntity("hero", heroDao.id);
                if (heroModel.getNation() == 10 && heroDao.inheritNation > 0 && heroDao.getStar() >= limitStar && heroDao.heroStarSkills.size() >= heroModel.getFieldSkillSlotId() && ((Byte) entry.getKey() == 5 && heroArrayingDao.friendState == 0 || (Byte) entry.getKey() < 5) && (tempKey == 0 || (Byte) entry.getKey() < tempKey)) {
                    tempKey = (Byte) entry.getKey();
                    targetHeroCode = heroDao.code;
                }
            }
        }

        if (targetHeroCode > 0 && heroArrayingDao.soulHeroCode == 0) {
            heroArrayingDao.soulHeroCode = targetHeroCode;
            heroArrayingDao.updateOp();
        } else if (heroArrayingDao.soulHeroCode > 0 && targetHeroCode == 0) {
            heroArrayingDao.soulHeroCode = 0;
            heroArrayingDao.updateOp();
        }

    }

    @MsgHandlerAnno
    public void C2S_HeroLeaveArraying_5095(HeroMsg.C2S_HeroLeaveArraying_5095 msg, String source) {
        boolean isSuccess = this.heroLeaveArraying(msg.getCode(), true, msg.getIsHeroClub());
        if (isSuccess) {
            HeroMsg.S2C_HeroLeaveArrayingResult_5096.Builder builder = HeroMsg.S2C_HeroLeaveArrayingResult_5096.newBuilder();
            builder.setCode(msg.getCode());
            this.player.sendMsg(builder.build());
        }

    }

    @MsgHandlerAnno
    public void C2S_HideArraying_13217(HeroExtendMsg.C2S_HideArraying_13217 msg, String source) {
        HeroArrayingDao heroArrayingDao = this.getHeroArrayingDaoByType(msg.getArrayingType());
        if (heroArrayingDao == null) {
            this.player.failure(4125);
        } else {
            if (heroArrayingDao.hide != msg.getIsHide()) {
                DuelPart duelPart = (DuelPart) this.player.getMgrPart(DuelPart.class);
                switch (msg.getArrayingType()) {
                    case HERO_STATE_DUEL_1:
                        if (!duelPart.checkCanUploadArraying()) {
                            this.player.failure(76005);
                            return;
                        }

                        if (msg.getIsHide()) {
                            HeroArrayingDao heroArrayingDao2 = this.getHeroArrayingDaoByType(CommonMsg.HeroState.HERO_STATE_DUEL_2);
                            HeroArrayingDao heroArrayingDao3 = this.getHeroArrayingDaoByType(CommonMsg.HeroState.HERO_STATE_DUEL_3);
                            if (heroArrayingDao2.hide && heroArrayingDao3.hide) {
                                return;
                            }
                        }
                        break;
                    case HERO_STATE_DUEL_2:
                        if (!duelPart.checkCanUploadArraying()) {
                            this.player.failure(76005);
                            return;
                        }

                        if (msg.getIsHide()) {
                            HeroArrayingDao heroArrayingDao1 = this.getHeroArrayingDaoByType(CommonMsg.HeroState.HERO_STATE_DUEL_1);
                            HeroArrayingDao heroArrayingDao3 = this.getHeroArrayingDaoByType(CommonMsg.HeroState.HERO_STATE_DUEL_3);
                            if (heroArrayingDao1.hide && heroArrayingDao3.hide) {
                                return;
                            }
                        }
                        break;
                    case HERO_STATE_DUEL_3:
                        if (!duelPart.checkCanUploadArraying()) {
                            this.player.failure(76005);
                            return;
                        }

                        if (msg.getIsHide()) {
                            HeroArrayingDao heroArrayingDao1 = this.getHeroArrayingDaoByType(CommonMsg.HeroState.HERO_STATE_DUEL_1);
                            HeroArrayingDao heroArrayingDao2 = this.getHeroArrayingDaoByType(CommonMsg.HeroState.HERO_STATE_DUEL_2);
                            if (heroArrayingDao1.hide && heroArrayingDao2.hide) {
                                return;
                            }
                        }
                }

                heroArrayingDao.hide = msg.getIsHide();
                heroArrayingDao.updateOp();
                this.sendArrayingToCross(msg.getArrayingType());
            }

            HeroExtendMsg.S2C_HideArraying_13218.Builder resp = HeroExtendMsg.S2C_HideArraying_13218.newBuilder();
            resp.setIsHide(msg.getIsHide());
            resp.setArrayingType(msg.getArrayingType());
            this.player.sendMsg(resp.build());
        }
    }

    @MsgHandlerAnno
    public void C2S_SaveArraying_13219(HeroExtendMsg.C2S_SaveArraying_13219 msg, String source) {
        if (MULTIPLE_ARRAYING.containsKey(msg.getSystemId()) && ((List) MULTIPLE_ARRAYING.get(msg.getSystemId())).size() == msg.getArrayingInfoCount()) {
            switch (msg.getSystemId()) {
                case 1980:
                default:
                    break;
                case 3190:
                    DuelPart duelPart = (DuelPart) this.player.getMgrPart(DuelPart.class);
                    if ((!msg.hasForce() || !msg.getForce()) && !duelPart.checkCanUploadArraying()) {
                        this.player.failure(76005);
                        return;
                    }
                    break;
                case 6310:
                    StonehengePart stonehengePart = (StonehengePart) this.player.getMgrPart(StonehengePart.class);
                    if (stonehengePart.rejectArraying(msg.getArrayingInfoList())) {
                        this.player.failure(6);
                        return;
                    }
            }

            Map<Integer, HeroDao> heroDaoMap = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());
            List<Integer> allArrayingHeroIdList = new ArrayList();
            List<Integer> linkHeroList = new ArrayList();

            for (int i = 0; i < msg.getArrayingInfoList().size(); ++i) {
                HeroMsg.ArrayingList arrayingInfo = msg.getArrayingInfo(i);
                if (arrayingInfo.getArrayingType() != ((List) MULTIPLE_ARRAYING.get(msg.getSystemId())).get(i)) {
                    this.player.failure(0);
                    return;
                }

                int checkResult = this.checkSaveHeroArrayingState(arrayingInfo.getArrayingType(), arrayingInfo.getInfoList(), false);
                if (checkResult != 1) {
                    this.player.failure(checkResult);
                    return;
                }

                for (HeroMsg.ArrayingInfo info : arrayingInfo.getInfoList()) {
                    HeroDao heroDao = (HeroDao) heroDaoMap.get(info.getCode());
                    if (allArrayingHeroIdList.contains(heroDao.id)) {
                        this.player.failure(58109);
                        return;
                    }

                    allArrayingHeroIdList.add(heroDao.id);
                    if (heroDao.type == HeroDefine.HERO_SP_TYPE_LINK) {
                        HeroDao linkHeroDao = (HeroDao) heroDaoMap.get(heroDao.linkCode);
                        if (linkHeroDao != null) {
                            linkHeroList.add(linkHeroDao.id);
                        }
                    }
                }
            }

            if (!linkHeroList.isEmpty() && msg.getArrayingInfoList().stream().anyMatch((arrayingList) -> arrayingList.getInfoList().stream().anyMatch((arrayingInfo) -> {
                HeroDao heroDao = (HeroDao) heroDaoMap.get(arrayingInfo.getCode());
                return heroDao == null || linkHeroList.contains(heroDao.id);
            }))) {
                this.player.failure(76510);
            } else {
                for (HeroMsg.ArrayingList arrayingInfo : msg.getArrayingInfoList()) {
                    this.saveHeroArraying(arrayingInfo.getArrayingType(), arrayingInfo.getInfoList());
                    HeroArrayingDao heroArrayingDao = this.getHeroArrayingDaoByType(arrayingInfo.getArrayingType());
                    int soulHeroCode = arrayingInfo.hasSoulHeroCode() ? arrayingInfo.getSoulHeroCode() : 0;
                    this.checkSoulHero(heroArrayingDao, arrayingInfo.hasSoulHeroCode(), soulHeroCode);
                    if (arrayingInfo.hasKingCode()) {
                        heroArrayingDao.kingCode = arrayingInfo.getKingCode();
                        heroArrayingDao.updateOp();
                    }

                    if (arrayingInfo.hasFriendJob()) {
                        heroArrayingDao.friendJob = arrayingInfo.getFriendJob();
                        heroArrayingDao.updateOp();
                    }

                    if (arrayingInfo.hasFriendNation()) {
                        heroArrayingDao.friendNation = arrayingInfo.getFriendNation();
                        heroArrayingDao.updateOp();
                    }

                    if (arrayingInfo.hasFriendState()) {
                        heroArrayingDao.friendState = arrayingInfo.getFriendState();
                        heroArrayingDao.updateOp();
                    }

                    arrayingInfo.toBuilder().setSoulHeroCode(heroArrayingDao.soulHeroCode).build();
                    msg.toBuilder();
                }

                HeroExtendMsg.S2C_SaveArraying_13220.Builder resp = HeroExtendMsg.S2C_SaveArraying_13220.newBuilder();

                for (HeroMsg.ArrayingList arrayingInfo : msg.getArrayingInfoList()) {
                    HeroArrayingDao heroArrayingDao = this.getHeroArrayingDaoByType(arrayingInfo.getArrayingType());
                    resp.addArrayingInfo(arrayingInfo.toBuilder().setSoulHeroCode(heroArrayingDao.soulHeroCode).build());
                }

                resp.setSystemId(msg.getSystemId());
                this.player.sendMsg(resp.build());
                if (msg.getSystemId() == 3190) {
                    DuelPart duelPart = (DuelPart) this.player.getMgrPart(DuelPart.class);
                    duelPart.uploadArraying();
                }

            }
        } else {
            this.player.failure(0);
        }
    }

    @MsgHandlerAnno
    public void C2S_SelectKing_5227(HeroMsg.C2S_SelectKing_5227 msg, String source) {
        int kingCode = msg.getKingCode();
        Map<Integer, HeroDao> map = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());
        HeroMsg.S2C_SelectKingResult_5228.Builder rsp = HeroMsg.S2C_SelectKingResult_5228.newBuilder();
        CommonMsg.HeroState heroState = CommonMsg.HeroState.HERO_STATE_ARRAYING;
        if (msg.hasArrayingType()) {
            heroState = msg.getArrayingType();
        }

        HeroArrayingDao heroArrayingDao = this.getHeroArrayingDaoByType(heroState);
        if (heroArrayingDao == null) {
            rsp.setArrayingType(heroState);
            rsp.setResult(0);
            rsp.setKingCode(kingCode);
            this.player.sendMsg(rsp.build());
        } else if (kingCode == 0) {
            heroArrayingDao.kingCode = kingCode;
            heroArrayingDao.updateOp();
            rsp.setResult(1);
            rsp.setKingCode(kingCode);
            rsp.setArrayingType(heroState);
            this.player.sendMsg(rsp.build());
        } else {
            HeroDao heroDao = (HeroDao) map.get(kingCode);
            if (heroDao == null) {
                rsp.setResult(0);
                rsp.setKingCode(kingCode);
            } else {
                HeroModel heroModel = (HeroModel) this.player.getGameModelPool().getEntity("hero", heroDao.id);
                if (heroModel != null && heroModel.getHeroSpType() == HeroDefine.HERO_SP_TYPE_KING) {
                    if (heroArrayingDao.kingCode != kingCode) {
                        heroArrayingDao.kingCode = kingCode;
                        heroArrayingDao.updateOp();
                    }

                    rsp.setResult(1);
                    rsp.setKingCode(kingCode);
                } else {
                    rsp.setResult(0);
                    rsp.setKingCode(kingCode);
                }
            }

            rsp.setArrayingType(msg.getArrayingType());
            this.player.sendMsg(rsp.build());
        }
    }

    public boolean heroLeaveArraying(int code, boolean isShowFailure, boolean isHeroClub) {
        HeroBagPart heroBagPart = (HeroBagPart) this.player.getMgrPart(HeroBagPart.class);
        HeroDao heroDao = heroBagPart.getHeroByCode(code);
        if (heroDao == null) {
            this.logger.info("下阵英雄不存在,code={}", code);
            return false;
        } else {
            List<Integer> stateList = heroDao.getStateList();
            if (stateList.isEmpty()) {
                this.logger.error("英雄没有上阵状态 CODE={},状态={}", code, heroDao.getStateList());
                if (isShowFailure) {
                    this.player.failure(0);
                }

                return false;
            } else if (!this.isEnableLeaveArraying(heroDao)) {
                this.logger.info("英雄不能下阵 CODE={},状态={}", code, heroDao.getStateList());
                if (isShowFailure) {
                    this.player.failure(4125);
                }

                return false;
            } else {
                boolean isArrayingLeave = false;
                boolean isLeaveSuccess = false;
                boolean isHeroStateChange = false;
                HeroMsg.S2C_HeroArrayingListResult_5030.Builder update_arraying_builder = HeroMsg.S2C_HeroArrayingListResult_5030.newBuilder();
                update_arraying_builder.setIsUpdate(true);
                Map<Integer, HeroArrayingDao> map = this.player.<Integer, HeroArrayingDao>getMap("tb_hero_arraying", this.player.getPlayerId());

                for (Map.Entry<Integer, HeroArrayingDao> mainEntry : map.entrySet()) {
                    HeroArrayingDao heroArrayingDao = (HeroArrayingDao) mainEntry.getValue();
                    CommonMsg.HeroState type = CommonMsg.HeroState.forNumber((Integer) mainEntry.getKey());
                    if (heroArrayingDao == null) {
                        if (heroDao.containState(type.getNumber())) {
                            heroDao.delState(type.getNumber());
                            heroDao.updateOp();
                            isHeroStateChange = true;
                        }
                    } else {
                        boolean isChange = false;
                        Iterator<Byte> iterator = heroArrayingDao.elements.keySet().iterator();

                        while (iterator.hasNext()) {
                            byte position = (Byte) iterator.next();
                            CommonMsg.CodeType codeType = this.getCodeTypeByPosition(position);
                            if ((codeType == CommonMsg.CodeType.CODE_HERO || codeType == CommonMsg.CodeType.CODE_FRIEND) && (Integer) heroArrayingDao.elements.get(position) == code) {
                                if (heroArrayingDao.arrayingType == 1) {
                                    if (codeType == CommonMsg.CodeType.CODE_FRIEND || codeType == CommonMsg.CodeType.CODE_HERO) {
                                        this.logger.info("普通整型援军下阵，重新计算面板属性");
                                        isArrayingLeave = true;
                                    }

                                    this.heroRankMgr.pushTaskEx("leaveArraying", new Object[]{this.player.getPlayerId(), heroDao.id});
                                    this.removeNationHeroRank(heroDao);
                                }

                                isLeaveSuccess = true;
                                isChange = true;
                                isHeroStateChange = true;
                                iterator.remove();
                            }
                        }

                        if (heroArrayingDao.soulHeroCode == heroDao.code) {
                            heroArrayingDao.soulHeroCode = 0;
                        }

                        heroArrayingDao.updateOp();
                        heroDao.delState(type.getNumber());
                        heroDao.updateOp();
                        if (isChange) {
                            HeroMsg.ArrayingList.Builder arraying_builder = HeroMsg.ArrayingList.newBuilder();
                            arraying_builder.setArrayingType(type);
                            arraying_builder.setFriendState(heroArrayingDao.friendState);
                            arraying_builder.setIsHide(heroArrayingDao.hide);

                            for (Map.Entry<Byte, Integer> entry : heroArrayingDao.elements.entrySet()) {
                                HeroMsg.ArrayingInfo.Builder infoBuilder = HeroMsg.ArrayingInfo.newBuilder();
                                infoBuilder.setPosition((Byte) entry.getKey());
                                infoBuilder.setCode((Integer) entry.getValue());
                                infoBuilder.setCodeType(this.getCodeTypeByPosition((Byte) entry.getKey()));
                                arraying_builder.addInfo(infoBuilder);
                            }

                            arraying_builder.setSoulHeroCode(heroArrayingDao.soulHeroCode);
                            update_arraying_builder.addArrayings(arraying_builder);
                            this.sendArrayingToCross(type);
                        }
                    }
                }

                if (!isHeroStateChange) {
                    for (CommonMsg.HeroState state : CommonMsg.HeroState.values()) {
                        switch (state) {
                            case HERO_STATE_ARRAYING:
                            case HERO_STATE_BATTLE_HERO_TRAINING:
                            case HERO_STATE_BATTLE_CUT_HERO:
                            case HERO_STATE_BATTLE_TOWER:
                            case HERO_STATE_WAR_HL:
                            case HERO_STATE_WAR_JZ:
                            case HERO_STATE_UNION_COPY:
                            case HERO_STATE_UNION_WAR:
                            case HERO_STATE_WAR_BARBARIAN:
                            case HERO_STATE_WAR_NORTH:
                            case HERO_STATE_EXPEDITION:
                            case HERO_STATE_RED_CLIFF:
                            case HERO_STATE_LADDER:
                            case HERO_STATE_WATER_TRANSPORT:
                            case HERO_STATE_PEAK_BATTLE:
                            case HERO_STATE_TRAIL_TOWER:
                            case HERO_STATE_SEVEN_BARBARIAN:
                            case HERO_STATE_ALLIANCE:
                            case HERO_STATE_PEAK_LADDER:
                            case HERO_STATE_MINE_ATK:
                            case HERO_STATE_MINE_DEF:
                            case HERO_STATE_UNDER_PALACE:
                            case HERO_STATE_GOD_TRIAL:
                            case HERO_STATE_WATER_TRANSPORT_SAIL:
                                heroDao.delState(state.getNumber());
                                break;
                            case HERO_STATE_EXCHANGE:
                                if (!isHeroClub) {
                                    PlayerExtend playerExtend = (PlayerExtend) this.player.getPlayerExtend(13);
                                    if (playerExtend.clubHeroCode == heroDao.code) {
                                        playerExtend.clubExchangeId = 0;
                                        playerExtend.clubHeroCode = 0;
                                        this.player.updatePlayerExtend(13);
                                    }

                                    heroDao.delState(state.getNumber());
                                }
                        }
                    }

                    heroDao.updateOp();
                    heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_HERO, heroDao);
                    HeroMsg.S2C_HeroLeaveArrayingResult_5096.Builder builder = HeroMsg.S2C_HeroLeaveArrayingResult_5096.newBuilder();
                    builder.setCode(code);
                    this.player.sendMsg(builder.build());
                    return false;
                } else {
                    if (isArrayingLeave) {
                        int friendCode = heroBagPart.updateFriendAndKingProperty(false, HeroDefine.HeroPropertyModel.MODEL_HERO);
                        Set<Integer> flushHeroCodeSet = this.getArrayingHeroCodes(CommonMsg.HeroState.HERO_STATE_ARRAYING);
                        heroBagPart.flushHeroIdAndArrayingForCodeList(HeroDefine.HeroPropertyModel.MODEL_HERO, flushHeroCodeSet, false, true);
                        if (friendCode > 0) {
                            flushHeroCodeSet.add(friendCode);
                        }

                        heroBagPart.sendHeroList2ClientByCode(flushHeroCodeSet);
                        heroBagPart.sendHeroList2ClientByHeroDao(heroDao);
                    } else {
                        heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_HERO, heroDao);
                        if (heroDao.containState(1) && heroDao.invalidTime == 0) {
                            this.heroRankMgr.pushTaskEx("updateHeroRank", new Object[]{this.player.getPlayerId(), heroDao.id, heroDao.getCombatPower(), heroDao.code});
                        }
                    }

                    if (isLeaveSuccess) {
                        this.player.sendMsg(update_arraying_builder.build());
                    }

                    return true;
                }
            }
        }
    }

    public boolean isEnableLeaveArraying(HeroDao heroDao) {
        Map<Integer, HeroArrayingDao> map = this.player.<Integer, HeroArrayingDao>getMap("tb_hero_arraying", this.player.getPlayerId());
        if (map == null) {
            return true;
        } else {
            for (Map.Entry<Integer, HeroArrayingDao> mainEntry : map.entrySet()) {
                CommonMsg.HeroState type = CommonMsg.HeroState.forNumber((Integer) mainEntry.getKey());
                HeroArrayingDao heroArrayingDao = this.getHeroArrayingDaoByType(type);
                if (heroArrayingDao != null) {
                    int heroNum = 0;
                    boolean isHaveHero = false;

                    for (Map.Entry<Byte, Integer> entry : heroArrayingDao.elements.entrySet()) {
                        CommonMsg.CodeType codeType = this.getCodeTypeByPosition((Byte) entry.getKey());
                        if ((Integer) mainEntry.getKey() != 52 && (Integer) mainEntry.getKey() != 61 && (Integer) mainEntry.getKey() != 23 && (Integer) mainEntry.getKey() != 24 && (Integer) mainEntry.getKey() != 25 && (Integer) mainEntry.getKey() != 26 && (Integer) mainEntry.getKey() != 27 && (Integer) mainEntry.getKey() != 28 && codeType == CommonMsg.CodeType.CODE_HERO) {
                            ++heroNum;
                            if ((Integer) entry.getValue() == heroDao.code) {
                                int state = (Integer) mainEntry.getKey();
                                if (heroDao.getStateList().contains(state)) {
                                    isHaveHero = true;
                                }
                            }
                        }
                    }

                    if (isHaveHero && heroNum == 1) {
                        return false;
                    }
                }
            }

            return true;
        }
    }

    public boolean isInSameHeroArraying(int heroCode, int heroCode2) {
        if (heroCode == heroCode2) {
            return true;
        } else {
            HeroBagPart heroBagPart = (HeroBagPart) this.player.getMgrPart(HeroBagPart.class);
            HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
            HeroDao heroDao2 = heroBagPart.getHeroByCode(heroCode2);
            List<Integer> stateList = heroDao.getStateList();
            List<Integer> stateList2 = heroDao2.getStateList();
            if (!stateList.isEmpty() && !stateList2.isEmpty()) {
                for (Integer state : stateList) {
                    if (stateList2.contains(state)) {
                        return true;
                    }
                }

                return false;
            } else {
                return false;
            }
        }
    }

    public boolean isHaveSameHeroId(CommonMsg.HeroState arrayingType, int heroId) {
        HeroArrayingDao heroArrayingDao = this.getHeroArrayingDaoByType(arrayingType);
        if (heroArrayingDao == null) {
            return false;
        } else if (heroArrayingDao.elements != null && !heroArrayingDao.elements.isEmpty()) {
            HeroBagPart heroBagPart = (HeroBagPart) this.player.getMgrPart(HeroBagPart.class);

            for (Map.Entry<Byte, Integer> entry : heroArrayingDao.elements.entrySet()) {
                if ((Byte) entry.getKey() <= 5) {
                    HeroDao heroDao = heroBagPart.getHeroByCode((Integer) entry.getValue());
                    if (heroDao.id == heroId) {
                        return true;
                    }
                }
            }

            return false;
        } else {
            return false;
        }
    }

    public int checkSaveHeroArrayingState(CommonMsg.HeroState arrayingType, List<HeroMsg.ArrayingInfo> arrayingList, boolean isCheckHcdAllTeam) {
        int result = 1;
        HeroBagPart heroBagPart = (HeroBagPart) this.player.getMgrPart(HeroBagPart.class);
        List<HeroMsg.ArrayingInfo> heroList = new ArrayList();
        List<HeroMsg.ArrayingInfo> friendList = new ArrayList();
        List<Integer> heroIdsList = new ArrayList();

        for (HeroMsg.ArrayingInfo arraying : arrayingList) {
            switch (arraying.getCodeType()) {
                case CODE_HERO:
                    HeroDao code_hero_Dao = heroBagPart.getHeroByCode(arraying.getCode());
                    if (code_hero_Dao == null) {
                        return 4112;
                    }

                    heroList.add(arraying);
                    break;
                case CODE_FRIEND:
                    friendList.add(arraying);
            }
        }

        if (heroList.size() > 5) {
            return 4113;
        } else if (friendList.size() > 1) {
            return 4114;
        } else if (friendList.size() > 0 && !this.player.isSystemOpen(1013)) {
            this.logger.info("援军系统没有开放，lv={}", this.player.getPublicDao().lv);
            return 0;
        } else {
            if (heroList.isEmpty()) {
                switch (arrayingType) {
                    case HERO_STATE_BATTLE_CUT_HERO:
                    case HERO_STATE_EXPEDITION:
                        break;
                    default:
                        return 4125;
                }
            }

            int invalidHeroNum = 0;

            for (HeroMsg.ArrayingInfo arrayingInfo : heroList) {
                HeroDao heroDao = heroBagPart.getHeroByCode(arrayingInfo.getCode());
                if (heroDao.invalidTime > 0) {
                    ++invalidHeroNum;
                }
            }

            if (invalidHeroNum == heroList.size()) {
                return 76513;
            } else {
                HeroPalacePart heroPalacePart = (HeroPalacePart) this.player.getMgrPart(HeroPalacePart.class);
                List<HeroMsg.ArrayingInfo> arrayingInfoList = new ArrayList();
                arrayingInfoList.addAll(heroList);
                arrayingInfoList.addAll(friendList);
                List<Integer> linkHeroList = new ArrayList();

                for (HeroMsg.ArrayingInfo arraying : arrayingInfoList) {
                    HeroDao heroDao = heroBagPart.getHeroByCode(arraying.getCode());
                    if (heroIdsList.contains(heroDao.id)) {
                        return 4117;
                    }

                    if (HeroModel.isReplacementHero(heroDao.id)) {
                        return 76182;
                    }

                    if (!heroPalacePart.checkPalaceHero(heroDao)) {
                        return 4129;
                    }

                    if (heroDao.type == HeroDefine.HERO_SP_TYPE_LINK) {
                        if (heroDao.linkCode <= 0) {
                            return 76509;
                        }

                        if (arrayingType == CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_1 || arrayingType == CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_2 || arrayingType == CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_3 || arrayingType == CommonMsg.HeroState.HERO_STATE_STONEHENGE_1 || arrayingType == CommonMsg.HeroState.HERO_STATE_STONEHENGE_2 || arrayingType == CommonMsg.HeroState.HERO_STATE_WAR_HL) {
                            return 76505;
                        }

                        HeroDao linkHeroDao = heroBagPart.getHeroByCode(heroDao.linkCode);
                        if (linkHeroDao != null) {
                            linkHeroList.add(linkHeroDao.id);
                        }
                    }

                    if (heroDao.invalidTime <= 0 || arrayingType != CommonMsg.HeroState.HERO_STATE_DUEL_1 && arrayingType != CommonMsg.HeroState.HERO_STATE_DUEL_2 && arrayingType != CommonMsg.HeroState.HERO_STATE_DUEL_3) {
                        HeroModel heroModel = (HeroModel) this.player.getGameModelPool().getEntity("hero", heroDao.id);
                        if (heroModel != null && (heroModel.getNation() != 10 || heroDao.inheritNation > 0)) {
                            heroIdsList.add(heroDao.id);
                            continue;
                        }

                        return 76414;
                    }

                    return 0;
                }

                if (!linkHeroList.isEmpty() && arrayingInfoList.stream().anyMatch((arrayingInfo) -> {
                    HeroDao heroDao = heroBagPart.getHeroByCode(arrayingInfo.getCode());
                    return heroDao == null || linkHeroList.contains(heroDao.id);
                })) {
                    return 76510;
                } else {
                    return result;
                }
            }
        }
    }

    public Integer getArtifactCodeOfArraying(CommonMsg.HeroState arrayingType) {
        HeroArrayingDao heroArrayingDao = this.getHeroArrayingDaoByType(arrayingType);
        if (heroArrayingDao != null && heroArrayingDao.elements != null && !heroArrayingDao.elements.isEmpty()) {
            for (Map.Entry<Byte, Integer> entry : heroArrayingDao.elements.entrySet()) {
                if ((Byte) entry.getKey() == 6) {
                    return (Integer) entry.getValue();
                }
            }

            return -1;
        } else {
            return -1;
        }
    }

    public Integer getBeautyCodeOfArraying(CommonMsg.HeroState arrayingType) {
        HeroArrayingDao heroArrayingDao = this.getHeroArrayingDaoByType(arrayingType);
        if (heroArrayingDao != null && heroArrayingDao.elements != null && !heroArrayingDao.elements.isEmpty()) {
            for (Map.Entry<Byte, Integer> entry : heroArrayingDao.elements.entrySet()) {
                if ((Byte) entry.getKey() == 7) {
                    return (Integer) entry.getValue();
                }
            }

            return -1;
        } else {
            return -1;
        }
    }

    public List<Integer> getHeroCodesOfArraying(CommonMsg.HeroState arrayingType) {
        List<Integer> resultList = new ArrayList();
        HeroArrayingDao heroArrayingDao = this.getHeroArrayingDaoByType(arrayingType);
        if (heroArrayingDao != null && heroArrayingDao.elements != null && !heroArrayingDao.elements.isEmpty()) {
            for (Map.Entry<Byte, Integer> entry : heroArrayingDao.elements.entrySet()) {
                if ((Byte) entry.getKey() <= 5) {
                    resultList.add(entry.getValue());
                }
            }

            return resultList;
        } else {
            return resultList;
        }
    }

    public boolean isEnableUseArraying(CommonMsg.HeroState arrayingType) {
        List<Integer> resultList = new ArrayList();
        HeroArrayingDao heroArrayingDao = this.getHeroArrayingDaoByType(arrayingType);
        if (heroArrayingDao != null && heroArrayingDao.elements != null && !heroArrayingDao.elements.isEmpty()) {
            for (Map.Entry<Byte, Integer> entry : heroArrayingDao.elements.entrySet()) {
                if ((Byte) entry.getKey() < 5) {
                    resultList.add(entry.getValue());
                }
            }

            if (resultList.isEmpty()) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public void saveHeroArraying(CommonMsg.HeroState arrayingType, List<HeroMsg.ArrayingInfo> arrayingList) {
        HeroArrayingDao heroArrayingDao = this.getHeroArrayingDaoByType(arrayingType);
        HeroBagPart heroBagPart = (HeroBagPart) this.player.getMgrPart(HeroBagPart.class);
        Set<Integer> leaveSet = new HashSet();
        boolean isArrayingChange = false;
        if (heroArrayingDao != null) {
            Iterator<Byte> iterator = heroArrayingDao.elements.keySet().iterator();

            while (iterator.hasNext()) {
                byte position = (Byte) iterator.next();
                CommonMsg.CodeType codeType = this.getCodeTypeByPosition(position);
                if (codeType == CommonMsg.CodeType.CODE_HERO || codeType == CommonMsg.CodeType.CODE_FRIEND) {
                    HeroDao heroDao = heroBagPart.getHeroByCode((Integer) heroArrayingDao.elements.get(position));
                    if (heroDao == null) {
                        this.logger.info("未找到相关英雄={},玩家={}", heroArrayingDao.elements.get(position), this.player.getPlayerId());
                        iterator.remove();
                    } else {
                        if (arrayingType == CommonMsg.HeroState.HERO_STATE_ARRAYING) {
                            isArrayingChange = true;
                        }

                        heroDao.delState(arrayingType.getNumber());
                        leaveSet.add(heroDao.code);
                        heroDao.updateOp();
                        iterator.remove();
                    }
                }
            }

            this.updateHeroArraying(arrayingType, heroArrayingDao, arrayingList, leaveSet, isArrayingChange);
        } else {
            this.insertHeroArraying(arrayingType, arrayingList, 0);
        }

        int num = this.getArrayingHeroNumber(arrayingList);
        if (!this.player.isRobot()) {
            this.player.triggerTask(352, 0, (long) num, 0);
        }

        if (arrayingType == CommonMsg.HeroState.HERO_STATE_ARRAYING) {
            RankPart rankPart = (RankPart) this.player.getMgrPart(RankPart.class);
            if (this.activityMgr.checkOpenServerRankTime(RankDefine.RankModule.OPEN_SERVER_HERO_LEV) > 0) {
                int levSum = 0;
                HeroArrayingDao commonArraying = this.getHeroArrayingDaoByType(CommonMsg.HeroState.HERO_STATE_ARRAYING);

                for (byte position : commonArraying.elements.keySet()) {
                    CommonMsg.CodeType codeType = this.getCodeTypeByPosition(position);
                    if (codeType == CommonMsg.CodeType.CODE_HERO) {
                        HeroDao heroDao = heroBagPart.getHeroByCode((Integer) commonArraying.elements.get(position));
                        if (heroDao != null && heroDao.type != HeroDefine.HERO_SP_TYPE_LINK) {
                            levSum += heroDao.getLv();
                        }
                    }
                }

                rankPart.updateRank(RankDefine.RankModule.OPEN_SERVER_HERO_LEV, (long) levSum, true);
            }
        }

    }

    @TaskMethod
    public void saveHeroArrayingSameCommon(CommonMsg.HeroState arrayingType) {
        this.insertHeroArrayingSameCommon(arrayingType, CommonMsg.HeroState.HERO_STATE_ARRAYING);
        HeroArrayingDao heroArrayingDao = this.getHeroArrayingDaoByType(arrayingType);
        int num = this.getArrayingHeroNumber(heroArrayingDao);
        this.player.triggerTask(352, 0, (long) num, 0);
    }

    @TaskMethod
    public void copyHeroArraying(CommonMsg.HeroState arrayingType, CommonMsg.HeroState sourceArrayingType) {
        this.logger.info("拷贝阵型，源阵型={}，目标={} playerId:{}", new Object[]{sourceArrayingType, arrayingType, this.player.getPlayerId()});
        if (arrayingType != CommonMsg.HeroState.HERO_STATE_ARRAYING) {
            HeroArrayingDao heroArrayingDao = this.getHeroArrayingDaoByType(arrayingType);
            HeroBagPart heroBagPart = (HeroBagPart) this.player.getMgrPart(HeroBagPart.class);
            HeroArrayingDao sourceArrayingDao = this.getHeroArrayingDaoByType(sourceArrayingType);
            if (sourceArrayingDao != null) {
                Set<Integer> leaveSet = new HashSet();
                if (heroArrayingDao != null) {
                    Iterator<Byte> iterator = heroArrayingDao.elements.keySet().iterator();

                    while (iterator.hasNext()) {
                        byte position = (Byte) iterator.next();
                        CommonMsg.CodeType codeType = this.getCodeTypeByPosition(position);
                        if (codeType == CommonMsg.CodeType.CODE_HERO || codeType == CommonMsg.CodeType.CODE_FRIEND) {
                            HeroDao heroDao = heroBagPart.getHeroByCode((Integer) heroArrayingDao.elements.get(position));
                            if (heroDao == null) {
                                this.logger.info("未找到相关英雄={},玩家={}", heroArrayingDao.elements.get(position), this.player.getPlayerId());
                                iterator.remove();
                            } else {
                                heroDao.delState(arrayingType.getNumber());
                                leaveSet.add(heroDao.code);
                                heroDao.updateOp();
                                iterator.remove();
                            }
                        }
                    }

                    this.updateHeroArraying(heroArrayingDao, sourceArrayingDao, leaveSet);
                } else {
                    this.insertHeroArrayingSameCommon(arrayingType, sourceArrayingType);
                }

                int num = this.getArrayingHeroNumber(sourceArrayingDao);
                this.player.triggerTask(352, 0, (long) num, 0);
            }
        }
    }

    public int getArrayingHeroNumber(List<HeroMsg.ArrayingInfo> arrayingList) {
        int num = 0;

        for (HeroMsg.ArrayingInfo arrayingInfo : arrayingList) {
            if (arrayingInfo.getCodeType() == CommonMsg.CodeType.CODE_HERO || arrayingInfo.getCodeType() == CommonMsg.CodeType.CODE_FRIEND) {
                ++num;
            }
        }

        return num;
    }

    public int getArrayingHeroNumber(HeroArrayingDao sourceArrayingDao) {
        int num = 0;

        for (Map.Entry<Byte, Integer> entry : sourceArrayingDao.elements.entrySet()) {
            CommonMsg.CodeType codeType = this.getCodeTypeByPosition((Byte) entry.getKey());
            if (codeType == CommonMsg.CodeType.CODE_HERO || codeType == CommonMsg.CodeType.CODE_FRIEND) {
                ++num;
            }
        }

        return num;
    }

    public void saveHeroArraying(CommonMsg.HeroState arrayingType, ArrayingMirror arrayingMirror) {
        List<HeroMsg.ArrayingInfo> arrayingList = new ArrayList();
        boolean isEnable = false;

        for (Map.Entry<Byte, ArrayingEntity> entry : arrayingMirror.arrayingElementsMap.entrySet()) {
            switch (((ArrayingEntity) entry.getValue()).entityType()) {
                case CODE_ARTIFACT:
                    HeroMsg.ArrayingInfo.Builder artifact = HeroMsg.ArrayingInfo.newBuilder();
                    artifact.setCodeType(CommonMsg.CodeType.CODE_ARTIFACT);
                    artifact.setCode(((ArrayingEntity) entry.getValue()).code);
                    artifact.setPosition((Byte) entry.getKey());
                    arrayingList.add(artifact.build());
                    break;
                case CODE_BEAUTY:
                    HeroMsg.ArrayingInfo.Builder beauty = HeroMsg.ArrayingInfo.newBuilder();
                    beauty.setCodeType(CommonMsg.CodeType.CODE_BEAUTY);
                    beauty.setCode(((ArrayingEntity) entry.getValue()).code);
                    beauty.setPosition((Byte) entry.getKey());
                    arrayingList.add(beauty.build());
                    break;
                case CODE_HERO:
                    isEnable = true;
                    HeroMsg.ArrayingInfo.Builder hero = HeroMsg.ArrayingInfo.newBuilder();
                    hero.setCodeType(CommonMsg.CodeType.CODE_HERO);
                    hero.setCode(((ArrayingEntity) entry.getValue()).code);
                    hero.setPosition((Byte) entry.getKey());
                    arrayingList.add(hero.build());
                    break;
                case CODE_FRIEND:
                    HeroMsg.ArrayingInfo.Builder friend = HeroMsg.ArrayingInfo.newBuilder();
                    friend.setCodeType(CommonMsg.CodeType.CODE_FRIEND);
                    friend.setCode(((ArrayingEntity) entry.getValue()).code);
                    friend.setPosition((Byte) entry.getKey());
                    arrayingList.add(friend.build());
            }
        }

        if (isEnable) {
            this.saveHeroArraying(arrayingType, arrayingList);
        }

    }

    private HeroArrayingDao updateHeroArraying(CommonMsg.HeroState arrayingType, HeroArrayingDao heroArrayingDao, List<HeroMsg.ArrayingInfo> arrayingList, Set<Integer> leaveSet, boolean isArrayingChange) {
        HeroBagPart heroBagPart = (HeroBagPart) this.player.getMgrPart(HeroBagPart.class);
        Set<Integer> jionSet = new HashSet();
        boolean isExist = false;

        for (HeroMsg.ArrayingInfo arrayingInfo : arrayingList) {
            if (arrayingInfo.getCodeType() == CommonMsg.CodeType.CODE_HERO || arrayingInfo.getCodeType() == CommonMsg.CodeType.CODE_FRIEND) {
                heroArrayingDao.elements.put((byte) arrayingInfo.getPosition(), arrayingInfo.getCode());
                HeroDao heroDao = heroBagPart.getHeroByCode(arrayingInfo.getCode());
                if (heroDao != null) {
                    if (arrayingType == CommonMsg.HeroState.HERO_STATE_ARRAYING) {
                        isArrayingChange = true;
                    }

                    if ((arrayingType == CommonMsg.HeroState.HERO_STATE_ARRAYING || RESET_ADDITION_ARRAYING.contains(arrayingType.getNumber())) && heroArrayingDao.kingCode != 0 && heroDao.code == heroArrayingDao.kingCode) {
                        isExist = true;
                    }

                    heroDao.addState(arrayingType.getNumber());
                    heroDao.updateOp();
                    jionSet.add(arrayingInfo.getCode());
                }
            }
        }

        if (arrayingType == CommonMsg.HeroState.HERO_STATE_ARRAYING || RESET_ADDITION_ARRAYING.contains(arrayingType.getNumber())) {
            if (!isExist) {
                heroArrayingDao.kingCode = 0;
            }

            this.checkKingCode(arrayingType);
        }

        heroArrayingDao.updateOp();
        this.player.updateDao(heroArrayingDao, false);
        Set<Integer> heroRankLeaveSet = new HashSet();
        heroRankLeaveSet.addAll(leaveSet);
        heroRankLeaveSet.removeAll(jionSet);
        if (arrayingType == CommonMsg.HeroState.HERO_STATE_ARRAYING) {
            for (Integer heroCode : heroRankLeaveSet) {
                HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
                this.heroRankMgr.pushTaskEx("leaveArraying", new Object[]{this.player.getPlayerId(), heroDao.id});
            }
        }

        if (isArrayingChange) {
            int friendCode = heroBagPart.updateFriendAndKingProperty(false, HeroDefine.HeroPropertyModel.MODEL_HERO);
            leaveSet.addAll(jionSet);
            heroBagPart.flushHeroIdAndArrayingForCodeList(HeroDefine.HeroPropertyModel.MODEL_HERO, leaveSet, false, false);
            if (friendCode > 0) {
                leaveSet.add(friendCode);
            }

            heroBagPart.sendHeroList2ClientByCode(leaveSet);
            if (arrayingType == CommonMsg.HeroState.HERO_STATE_ARRAYING) {
                for (Integer heroCode : heroRankLeaveSet) {
                    HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
                    this.removeNationHeroRank(heroDao);
                }

                if (heroRankLeaveSet.isEmpty()) {
                    for (int join : jionSet) {
                        HeroDao heroDao = heroBagPart.getHeroByCode(join);
                        heroBagPart.updateNationHeroRank(heroDao, false);
                    }
                }
            }
        } else {
            leaveSet.removeAll(jionSet);
            leaveSet.addAll(jionSet);
            heroBagPart.flushHeroIdAndArrayingForCodeList(HeroDefine.HeroPropertyModel.MODEL_HERO, leaveSet, true, false);
            if (arrayingType == CommonMsg.HeroState.HERO_STATE_ARRAYING) {
                for (Integer code : jionSet) {
                    HeroDao heroDao = heroBagPart.getHeroByCode(code);
                    if (heroDao.invalidTime == 0) {
                        this.heroRankMgr.pushTaskEx("updateHeroRank", new Object[]{this.player.getPlayerId(), heroDao.id, heroDao.getCombatPower(), heroDao.code});
                    }
                }
            }
        }

        return heroArrayingDao;
    }

    private HeroArrayingDao updateHeroArraying(HeroArrayingDao heroArrayingDao, HeroArrayingDao sourceArrayingDao, Set<Integer> leaveSet) {
        HeroBagPart heroBagPart = (HeroBagPart) this.player.getMgrPart(HeroBagPart.class);
        Set<Integer> jionSet = new HashSet();
        heroArrayingDao.elements.putAll(sourceArrayingDao.elements);
        heroArrayingDao.soulHeroCode = sourceArrayingDao.soulHeroCode;
        heroArrayingDao.updateOp();
        Set<Integer> codeSet = new HashSet();

        for (Map.Entry<Byte, Integer> entry : heroArrayingDao.elements.entrySet()) {
            if ((Byte) entry.getKey() <= 5) {
                codeSet.add(entry.getValue());
            }
        }

        leaveSet.removeAll(jionSet);
        leaveSet.addAll(jionSet);
        heroBagPart.sendHeroList2ClientByCode(leaveSet);
        this.updateArraying(heroArrayingDao);
        if (heroArrayingDao.friendState != sourceArrayingDao.friendState) {
            this.checkSoulHeroByFriendState(heroArrayingDao);
        }

        return heroArrayingDao;
    }

    public HeroArrayingDao insertHeroArraying(CommonMsg.HeroState arrayingType, List<HeroMsg.ArrayingInfo> arrayingList, int friendState) {
        HeroBagPart heroBagPart = (HeroBagPart) this.player.getMgrPart(HeroBagPart.class);
        HeroArrayingDao heroArrayingDao = new HeroArrayingDao();
        heroArrayingDao.playerId = this.player.getPlayerId();
        heroArrayingDao.arrayingType = arrayingType.getNumber();
        heroArrayingDao.friendState = friendState;
        Set<Integer> jionSet = new HashSet();
        boolean isArrayingChange = false;

        for (HeroMsg.ArrayingInfo arrayingInfo : arrayingList) {
            if (arrayingInfo.getCodeType() == CommonMsg.CodeType.CODE_HERO || arrayingInfo.getCodeType() == CommonMsg.CodeType.CODE_FRIEND) {
                if (arrayingType == CommonMsg.HeroState.HERO_STATE_ARRAYING) {
                    isArrayingChange = true;
                }

                heroArrayingDao.elements.put((byte) arrayingInfo.getPosition(), arrayingInfo.getCode());
                jionSet.add(arrayingInfo.getCode());
            }
        }

        for (Integer code : jionSet) {
            HeroDao heroDao = heroBagPart.getHeroByCode(code);
            heroDao.addState(arrayingType.getNumber());
            heroDao.updateOp();
        }

        heroArrayingDao.insertOp();
        this.player.insertDao(heroArrayingDao);
        if (isArrayingChange) {
            int friendCode = heroBagPart.updateFriendAndKingProperty(false, HeroDefine.HeroPropertyModel.MODEL_HERO);
            Set<Integer> heroSet = this.getArrayingHeroCodes(CommonMsg.HeroState.HERO_STATE_ARRAYING);
            heroSet.addAll(jionSet);
            heroBagPart.flushHeroIdAndArrayingForCodeList(HeroDefine.HeroPropertyModel.MODEL_HERO, heroSet, false, false);
            if (friendCode > 0) {
                heroSet.add(friendCode);
            }

            heroBagPart.sendHeroList2ClientByCode(heroSet);

            for (Integer code : heroSet) {
                HeroDao heroDao = heroBagPart.getHeroByCode(code);
                heroBagPart.updateNationHeroRank(heroDao, true);
            }
        } else {
            heroBagPart.flushHeroIdAndArrayingForCodeList(HeroDefine.HeroPropertyModel.MODEL_HERO, jionSet, true, false);
            if (arrayingType == CommonMsg.HeroState.HERO_STATE_ARRAYING) {
                for (Integer code : jionSet) {
                    HeroDao heroDao = heroBagPart.getHeroByCode(code);
                    if (heroDao.invalidTime == 0) {
                        this.heroRankMgr.pushTaskEx("updateHeroRank", new Object[]{this.player.getPlayerId(), heroDao.id, heroDao.getCombatPower(), heroDao.code});
                    }
                }
            }
        }

        return heroArrayingDao;
    }

    private void insertHeroArrayingSameCommon(CommonMsg.HeroState arrayingType, CommonMsg.HeroState sourceArrayingType) {
        if (this.getHeroCodesOfArraying(sourceArrayingType).isEmpty()) {
            this.logger.info("普通阵型为空={}", arrayingType);
        } else {
            HeroArrayingDao heroArrayingDao = this.getHeroArrayingDaoByType(arrayingType);
            if (heroArrayingDao == null) {
                heroArrayingDao = new HeroArrayingDao();
                heroArrayingDao.playerId = this.player.getPlayerId();
                heroArrayingDao.arrayingType = arrayingType.getNumber();
                this.player.insertDao(heroArrayingDao, false);
            }

            HeroArrayingDao commonHeroArrayingDao = this.getHeroArrayingDaoByType(sourceArrayingType);
            heroArrayingDao.elements.putAll(commonHeroArrayingDao.elements);
            heroArrayingDao.soulHeroCode = commonHeroArrayingDao.soulHeroCode;
            heroArrayingDao.updateOp();
            Set<Integer> codeSet = new HashSet();

            for (Map.Entry<Byte, Integer> entry : commonHeroArrayingDao.elements.entrySet()) {
                if ((Byte) entry.getKey() <= 5) {
                    codeSet.add(entry.getValue());
                }
            }

            HeroBagPart heroBagPart = (HeroBagPart) this.player.getMgrPart(HeroBagPart.class);

            for (Integer code : codeSet) {
                HeroDao heroDao = heroBagPart.getHeroByCode(code);
                heroDao.addState(arrayingType.getNumber());
                heroDao.updateOp();
            }

            heroBagPart.sendHeroList2ClientByCode(codeSet);
            if (heroArrayingDao.friendState != commonHeroArrayingDao.friendState) {
                this.checkSoulHeroByFriendState(heroArrayingDao);
            }

            this.updateArraying(heroArrayingDao);
        }
    }

    public ArrayingMirror getArrayingMirrorByType(CommonMsg.HeroState arrayingType) {
        return new ArrayingMirror(this.player, this.getHeroArrayingDaoByType(arrayingType));
    }

    public HeroArrayingDao getHeroArrayingDaoByType(CommonMsg.HeroState arrayingType) {
        Map<Integer, HeroArrayingDao> map = this.player.<Integer, HeroArrayingDao>getMap("tb_hero_arraying", this.player.getPlayerId());
        return map == null ? null : (HeroArrayingDao) map.get(arrayingType.getNumber());
    }

    public void flushHeroArrayingMirror(HeroDefine.HeroPropertyModel model, long oldPower, boolean isUpdateHeroPower) {
        long power = this.getPlayerCombatPower(isUpdateHeroPower);
        this.player.flushPlayerCombatPower("英雄属性改变", power);
        LogOperationMgr operationMgr = this.player.getOperationMgr();
        operationMgr.addPowerChangeLog(this.player, oldPower, "英雄属性改变", model);
    }

    public void flushHeroArrayingMirror(GamePlayer player, HeroDao heroDao) {
        long oldPower = player.getPlayerCombatPower();
        boolean isPowerChange = false;
        HeroArrayingDao heroArrayingDao = this.getHeroArrayingDaoByType(CommonMsg.HeroState.HERO_STATE_ARRAYING);

        for (Integer code : heroArrayingDao.elements.values()) {
            if (code == heroDao.code) {
                isPowerChange = true;
            }
        }

        if (isPowerChange) {
            long power = this.getPlayerCombatPower(false);
            player.flushPlayerCombatPower("英雄属性改变", power);
            if (heroDao.invalidTime == 0) {
                this.heroRankMgr.pushTaskEx("updateHeroRank", new Object[]{this.player.getPlayerId(), heroDao.id, heroDao.getCombatPower(), heroDao.code});
            }

            LogOperationMgr operationMgr = player.getOperationMgr();
            operationMgr.addPowerChangeLog(player, oldPower, "上阵英雄属性改变", (HeroDefine.HeroPropertyModel) null);
        }

    }

    public CommonMsg.CodeType getCodeTypeByPosition(int position) {
        CommonMsg.CodeType type = CommonMsg.CodeType.CODE_HERO;
        switch (position) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                type = CommonMsg.CodeType.CODE_HERO;
                break;
            case 5:
                type = CommonMsg.CodeType.CODE_FRIEND;
                break;
            case 6:
                type = CommonMsg.CodeType.CODE_ARTIFACT;
                break;
            case 7:
                type = CommonMsg.CodeType.CODE_BEAUTY;
        }

        return type;
    }

    public boolean isArrayingState(HeroDao heroDao) {
        if (!heroDao.isHaveArrayingState()) {
            return false;
        } else {
            for (Integer state : heroDao.getStateList()) {
                if (WorldMgr.heroArrayingStateList.contains(state)) {
                    return true;
                }
            }

            return false;
        }
    }

    public int getArrayingFriendCode(CommonMsg.HeroState arrayingType) {
        HeroArrayingDao heroArrayingDao = this.getHeroArrayingDaoByType(arrayingType);
        if (heroArrayingDao != null && heroArrayingDao.elements != null && !heroArrayingDao.elements.isEmpty()) {
            for (Map.Entry<Byte, Integer> entry : heroArrayingDao.elements.entrySet()) {
                if ((Byte) entry.getKey() == 5) {
                    return (Integer) entry.getValue();
                }
            }

            return 0;
        } else {
            return 0;
        }
    }

    public Set<Integer> getArrayingHeroCodes(CommonMsg.HeroState arrayingType) {
        Set<Integer> set = new HashSet();
        HeroArrayingDao heroArrayingDao = this.getHeroArrayingDaoByType(arrayingType);
        if (heroArrayingDao != null && heroArrayingDao.elements != null && !heroArrayingDao.elements.isEmpty()) {
            for (Map.Entry<Byte, Integer> entry : heroArrayingDao.elements.entrySet()) {
                if ((Byte) entry.getKey() < 5) {
                    set.add(entry.getValue());
                }
            }

            return set;
        } else {
            return set;
        }
    }

    public List<Integer> getArrayingOtherHeroAndFriendCodes(CommonMsg.HeroState arrayingType, int code) {
        List<Integer> list = new ArrayList();
        HeroArrayingDao heroArrayingDao = this.getHeroArrayingDaoByType(arrayingType);
        if (heroArrayingDao != null && heroArrayingDao.elements != null && !heroArrayingDao.elements.isEmpty()) {
            for (Map.Entry<Byte, Integer> entry : heroArrayingDao.elements.entrySet()) {
                if ((Byte) entry.getKey() == 5 && (Integer) entry.getValue() != code) {
                    list.add(entry.getValue());
                }
            }

            return list;
        } else {
            return list;
        }
    }

    public List<Integer> getArrayingHeroIds(CommonMsg.HeroState arrayingType) {
        List<Integer> heroIds = new ArrayList();
        Map<Integer, HeroDao> heroDaoMap = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());
        HeroArrayingDao heroArrayingDao = this.getHeroArrayingDaoByType(arrayingType);
        if (heroArrayingDao == null) {
            return heroIds;
        } else {
            for (Map.Entry<Byte, Integer> entry : heroArrayingDao.elements.entrySet()) {
                if ((Byte) entry.getKey() <= 5) {
                    HeroDao heroDao = (HeroDao) heroDaoMap.get(entry.getValue());
                    if (heroDao != null) {
                        heroIds.add(heroDao.id);
                    }
                }
            }

            return heroIds;
        }
    }

    public boolean multipleArrayingHadSameHero(int systemId) {
        if (!MULTIPLE_ARRAYING.containsKey(systemId)) {
            return false;
        } else {
            List<CommonMsg.HeroState> heroStates = (List) MULTIPLE_ARRAYING.get(systemId);
            HeroArrayingPart heroArrayingPart = (HeroArrayingPart) this.player.getMgrPart(HeroArrayingPart.class);
            HeroBagPart heroBagPart = (HeroBagPart) this.player.getMgrPart(HeroBagPart.class);
            List<Integer> allArrayingHeroIdList = new ArrayList();

            for (CommonMsg.HeroState heroState : heroStates) {
                for (int code : heroArrayingPart.getHeroCodesOfArraying(heroState)) {
                    HeroDao heroDao = heroBagPart.getHeroByCode(code);
                    if (allArrayingHeroIdList.contains(heroDao.id)) {
                        this.logger.error("玩家{}布阵系统{}存在重复武将id:{}", new Object[]{this.player.getPlayerId(), systemId, heroDao.id});
                        return true;
                    }

                    allArrayingHeroIdList.add(heroDao.id);
                }
            }

            return false;
        }
    }

    public int satisfiedConditions(List<Integer> conditions, List<CommonMsg.HeroState> arrayTypeList) {
        Map<Integer, HeroDao> heroDaoMap = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());
        int satisfiedCount = 0;

        for (int condition : conditions) {
            boolean flag = true;
            int count = 0;

            BattleCondition battleCondition = (BattleCondition) ApplicationContextProvider.getModelPoolEntity("battleCondition", condition);
            if (battleCondition == null) {
                this.logger.warn("battleCondition表配置缺失 id:{}", condition);
            } else {
                switch (battleCondition.getType()) {
                    case 11:
                        for (CommonMsg.HeroState arrayType : arrayTypeList) {
                            List<Integer> heroCodeList = this.getHeroCodesOfArraying(arrayType);

                            for (int code : heroCodeList) {
                                HeroDao heroDao = (HeroDao) heroDaoMap.get(code);
                                if (heroDao != null && heroDao.getStar() == battleCondition.getExtra()) {
                                    ++count;
                                }
                            }

                            if (count < battleCondition.getValue()) {
                                flag = false;
                                break;
                            }
                        }

                        if (flag) {
                            ++satisfiedCount;
                        }
                        break;
                    case 12:
                        count = 0;

                        for (CommonMsg.HeroState arrayType : arrayTypeList) {
                            for (int code : this.getHeroCodesOfArraying(arrayType)) {
                                HeroDao heroDao = (HeroDao) heroDaoMap.get(code);
                                if (heroDao != null && heroDao.getStar() == battleCondition.getExtra()) {
                                    ++count;
                                }
                            }
                        }

                        if (count >= battleCondition.getValue()) {
                            ++satisfiedCount;
                        }
                        break;
                    case 13:
                        flag = true;

                        for (CommonMsg.HeroState arrayType : arrayTypeList) {
                            List<Integer> heroCodeList = this.getHeroCodesOfArraying(arrayType);
                            count = 0;

                            for (int code : heroCodeList) {
                                HeroDao heroDao = (HeroDao) heroDaoMap.get(code);
                                if (heroDao != null && heroDao.getStar() >= battleCondition.getExtra()) {
                                    ++count;
                                }
                            }

                            if (count < battleCondition.getValue()) {
                                flag = false;
                                break;
                            }
                        }

                        if (flag) {
                            ++satisfiedCount;
                        }
                        break;
                    case 14:
                        count = 0;

                        for (CommonMsg.HeroState arrayType : arrayTypeList) {
                            for (int code : this.getHeroCodesOfArraying(arrayType)) {
                                HeroDao heroDao = (HeroDao) heroDaoMap.get(code);
                                if (heroDao != null && heroDao.getStar() >= battleCondition.getExtra()) {
                                    ++count;
                                }
                            }
                        }

                        if (count >= battleCondition.getValue()) {
                            ++satisfiedCount;
                        }
                }
            }
        }

        return satisfiedCount;
    }

    private boolean isArrayingAdd(HeroDao heroDao) {
        boolean isArrayingAdd = false;
        if (heroDao == null) {
            return isArrayingAdd;
        } else if (heroDao.talent == null) {
            return isArrayingAdd;
        } else if (heroDao.getTalentSkill().isEmpty()) {
            return isArrayingAdd;
        } else {
            for (Integer skillId : heroDao.getTalentSkill()) {
                SkillKingTalentModel skillKingTalentModel = (SkillKingTalentModel) this.player.getGameModelPool().getEntity("skillKingTalent", skillId);
                if (skillKingTalentModel != null && skillKingTalentModel.getType() == 2) {
                    isArrayingAdd = true;
                    break;
                }
            }

            return isArrayingAdd;
        }
    }

    public void checkKingCode(CommonMsg.HeroState arrayingType) {
        HeroArrayingDao heroArrayingDao = this.getHeroArrayingDaoByType(arrayingType);
        if (heroArrayingDao != null) {
            if (heroArrayingDao.kingCode == 0) {
                Integer friendCode = (Integer) heroArrayingDao.elements.get((byte) 5);
                if (friendCode != null) {
                    Map<Integer, HeroDao> map = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());
                    HeroDao heroDao = (HeroDao) map.get(friendCode);
                    if (heroDao != null) {
                        HeroModel heroModel = (HeroModel) this.player.getGameModelPool().getEntity("hero", heroDao.id);
                        if (heroModel != null && heroModel.getHeroSpType() == HeroDefine.HERO_SP_TYPE_KING) {
                            heroArrayingDao.kingCode = heroDao.code;
                            heroArrayingDao.updateOp();
                        }
                    }
                }
            }

            if (heroArrayingDao.kingCode == 0 && heroArrayingDao.elements != null && !heroArrayingDao.elements.isEmpty()) {
                for (Map.Entry<Byte, Integer> entry : heroArrayingDao.elements.entrySet()) {
                    if ((Byte) entry.getKey() < 5) {
                        Map<Integer, HeroDao> map = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());
                        HeroDao heroDao = (HeroDao) map.get(entry.getValue());
                        if (heroDao != null) {
                            HeroModel heroModel = (HeroModel) this.player.getGameModelPool().getEntity("hero", heroDao.id);
                            if (heroModel.getHeroSpType() == HeroDefine.HERO_SP_TYPE_KING) {
                                if (heroArrayingDao.kingCode == 0) {
                                    heroArrayingDao.kingCode = heroDao.code;
                                    heroArrayingDao.updateOp();
                                } else if (this.isArrayingAdd(heroDao) && !this.isArrayingAdd((HeroDao) map.get(heroArrayingDao.kingCode))) {
                                    heroArrayingDao.kingCode = heroDao.code;
                                    heroArrayingDao.updateOp();
                                }
                            }
                        }
                    }
                }
            }

        }
    }

    public void removeArraying(List<CommonMsg.HeroState> arrayingList) {
        if (!arrayingList.isEmpty()) {
            HeroArrayingPart mgrPart = (HeroArrayingPart) this.player.getMgrPart(HeroArrayingPart.class);
            HeroBagPart heroBagPart = (HeroBagPart) this.player.getMgrPart(HeroBagPart.class);
            HeroMsg.S2C_HeroArrayingListResult_5030.Builder updateList = HeroMsg.S2C_HeroArrayingListResult_5030.newBuilder();
            updateList.setIsUpdate(true);

            for (CommonMsg.HeroState arrayingType : arrayingList) {
                HeroMsg.S2C_HeroBaseData_5002.Builder result_builder = HeroMsg.S2C_HeroBaseData_5002.newBuilder();
                HeroArrayingDao arrayingDao = mgrPart.getHeroArrayingDaoByType(arrayingType);
                if (arrayingDao != null && !arrayingDao.elements.isEmpty()) {
                    for (Map.Entry<Byte, Integer> entry : arrayingDao.elements.entrySet()) {
                        switch ((Byte) entry.getKey()) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                                HeroDao heroDao = heroBagPart.getHeroByCode((Integer) entry.getValue());
                                if (heroDao != null && heroDao.containState(arrayingType.getNumber())) {
                                    heroDao.delState(arrayingType.getNumber());
                                    heroDao.updateOp();
                                    result_builder.addHeros(heroDao.toHeroInfo());
                                }
                        }
                    }

                    arrayingDao.soulHeroCode = 0;
                    arrayingDao.elements.clear();
                    arrayingDao.updateOp();
                    this.player.sendMsg(result_builder.build());
                    HeroMsg.ArrayingList.Builder arraying_builder = HeroMsg.ArrayingList.newBuilder();
                    arraying_builder.setArrayingType(arrayingType);
                    arraying_builder.setFriendState(arrayingDao.friendState);
                    arraying_builder.setIsHide(arrayingDao.hide);
                    updateList.addArrayings(arraying_builder);
                }
            }

            if (!updateList.getArrayingsBuilderList().isEmpty()) {
                this.player.sendMsg(updateList.build());
            }

        }
    }

    private void removeNationHeroRank(HeroDao heroDao) {
        if (!this.player.isRobot()) {
            HeroModel heroModel = (HeroModel) ApplicationContextProvider.getModelPoolEntity("hero", heroDao.id);
            if (heroModel != null) {
                RankMgr rankMgr = (RankMgr) ApplicationContextProvider.getContext().getBean(RankMgr.class);
                rankMgr.pushTaskEx("removeNationHeroRank", new Object[]{this.player.getPlayerId(), heroModel.getNation(), heroDao.code});
            }
        }
    }

    @MsgHandlerAnno
    public void C2S_SelectSoulHero_5239(HeroMsg.C2S_SelectSoulHero_5239 msg, String source) {
        HeroBagPart heroBagPart = (HeroBagPart) this.player.getMgrPart(HeroBagPart.class);
        HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode());
        if (heroDao != null) {
            if (heroDao.containState(msg.getArrayingType().getNumber())) {
                HeroModel heroModel = (HeroModel) this.player.getGameModelPool().getEntity("hero", heroDao.id);
                if (heroModel != null) {
                    if (heroModel.getNation() == 10) {
                        if (msg.getArrayingType() == CommonMsg.HeroState.HERO_STATE_DUEL_1 || msg.getArrayingType() == CommonMsg.HeroState.HERO_STATE_DUEL_2 || msg.getArrayingType() == CommonMsg.HeroState.HERO_STATE_DUEL_3) {
                            DuelPart duelPart = (DuelPart) this.player.getMgrPart(DuelPart.class);
                            if (!duelPart.checkCanUploadArraying()) {
                                this.player.failure(76005);
                                return;
                            }
                        }

                        HeroArrayingDao arrayingDao = this.getHeroArrayingDaoByType(msg.getArrayingType());
                        if (arrayingDao.elements.containsKey((byte) 5) && (Integer) arrayingDao.elements.get((byte) 5) == msg.getHeroCode() && arrayingDao.friendState == 1) {
                            this.logger.error("所选择魂武将未援军不出站状态：{}---{}", msg.getArrayingType(), msg.getHeroCode());
                        } else {
                            arrayingDao.soulHeroCode = msg.getHeroCode();
                            arrayingDao.updateOp();
                            HeroMsg.S2C_SelectSoulHero_5240.Builder builder = HeroMsg.S2C_SelectSoulHero_5240.newBuilder();
                            builder.setHeroCode(msg.getHeroCode());
                            builder.setArrayingType(msg.getArrayingType());
                            this.player.sendMsg(builder.build());
                        }
                    }
                }
            }
        }
    }

    static {
        List<CommonMsg.HeroState> arrayingList = new ArrayList();
        arrayingList.add(CommonMsg.HeroState.HERO_STATE_DUEL_1);
        arrayingList.add(CommonMsg.HeroState.HERO_STATE_DUEL_2);
        arrayingList.add(CommonMsg.HeroState.HERO_STATE_DUEL_3);
        MULTIPLE_ARRAYING.put(3190, arrayingList);
        arrayingList = new ArrayList();
        arrayingList.add(CommonMsg.HeroState.HERO_STATE_WAR_SHA_MO_KE_1);
        arrayingList.add(CommonMsg.HeroState.HERO_STATE_WAR_SHA_MO_KE_2);
        MULTIPLE_ARRAYING.put(1980, arrayingList);
        arrayingList = new ArrayList();
        arrayingList.add(CommonMsg.HeroState.HERO_STATE_LEVEL_PROMOTE_1);
        arrayingList.add(CommonMsg.HeroState.HERO_STATE_LEVEL_PROMOTE_2);
        arrayingList.add(CommonMsg.HeroState.HERO_STATE_LEVEL_PROMOTE_3);
        MULTIPLE_ARRAYING.put(3900, arrayingList);
        arrayingList = new ArrayList();
        arrayingList.add(CommonMsg.HeroState.HERO_STATE_MERGE_WAR_BOSS_1);
        arrayingList.add(CommonMsg.HeroState.HERO_STATE_MERGE_WAR_BOSS_2);
        arrayingList.add(CommonMsg.HeroState.HERO_STATE_MERGE_WAR_BOSS_3);
        MULTIPLE_ARRAYING.put(4207, arrayingList);
        arrayingList = new ArrayList();
        arrayingList.add(CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_2);
        arrayingList.add(CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_3);
        MULTIPLE_ARRAYING.put(5011, arrayingList);
        arrayingList = new ArrayList();
        arrayingList.add(CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_4);
        arrayingList.add(CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_5);
        arrayingList.add(CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_6);
        MULTIPLE_ARRAYING.put(5012, arrayingList);
        RESET_ADDITION_ARRAYING.add(56);
        RESET_ADDITION_ARRAYING.add(57);
        RESET_ADDITION_ARRAYING.add(58);
        MULTIPLE_ARRAYING.put(6310, Arrays.asList(CommonMsg.HeroState.HERO_STATE_STONEHENGE_1, CommonMsg.HeroState.HERO_STATE_STONEHENGE_2));
        arrayingList = new ArrayList();
        arrayingList.add(CommonMsg.HeroState.HERO_STATE_TRAIL_TOWER_1);
        arrayingList.add(CommonMsg.HeroState.HERO_STATE_TRAIL_TOWER_2);
        MULTIPLE_ARRAYING.put(2130, arrayingList);
        MULTIPLE_ARRAYING.put(2880, Arrays.asList(CommonMsg.HeroState.HERO_STATE_UNDER_PALACE_1, CommonMsg.HeroState.HERO_STATE_UNDER_PALACE_2));
    }
}
