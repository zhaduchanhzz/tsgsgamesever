package com.gzbz.worldMgr;

import allMgr.MgrAnno;
import allMgr.TaskMethod;
import cn.hutool.core.collection.ConcurrentHashSet;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.gzbz.activity.ActivityMgr;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.activity.bean.GmActivitySetting;
import com.gzbz.activity.bean.WeChatGiftInfo;
import com.gzbz.chat.ChatMgr;
import com.gzbz.db.AccountWhiteListDao;
import com.gzbz.db.GameDBPool;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.PublicNoticeDao;
import com.gzbz.db.ReportDao;
import com.gzbz.db.SystemMailDao;
import com.gzbz.db.UnionDao;
import com.gzbz.db.UnionMemberDao;
import com.gzbz.db.WorldDao;
import com.gzbz.db.worldBean.ActivityData;
import com.gzbz.db.worldBean.GameManagerData;
import com.gzbz.db.worldBean.WorldData;
import com.gzbz.gameDefine.GameDefine;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.friend.FriendPart;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.mail.MailWorldMgr;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.gamePlayer.playerBag.ItemBase;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.http.vo.ChatLimitData;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.ActivityOpenTimeModel;
import com.gzbz.model.ActivityRuleModel;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.GeneralAvatarModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.PlayerNameModel;
import com.gzbz.model.PlayerProperty;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.net.HttpMgr;
import com.gzbz.protobuf.LoginMsg;
import com.gzbz.protobuf.ThemeActivityMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.union.UnionMgr;
import com.gzbz.union.UnionMgrParent;
import com.gzbz.util.NameFilter;
import com.gzbz.util.WordsFilter;
import db.DBColumnAnno;
import debug.AppArgs;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

import misc.DateUtil;
import misc.MD5Util;
import misc.MiscUtil;
import misc.RandomUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
@MgrAnno
public class GmMgr extends GameMgr {
    private static final Logger logger = LoggerFactory.getLogger(GmMgr.class);
    private static final int SCHEDULE_PERIOD_SIX = 6000;
    private static final int SCHEDULE_PERIOD_MINUTE = 60000;
    private static final String COMMAND_QUERY_SQL = "SELECT idcommand,type,cmd FROM command WHERE confirmtime=0;";
    private static final String COMMAND_CONFIRM_SQL = "UPDATE command SET confirmtime=? WHERE idcommand = ?;";
    private static final String RECEIVE_MAIL_SQL = "UPDATE systemmail SET recv_time=? WHERE systemmail_id = ?;";
    private static final String NOTIFY_QUERY_SQL = "SELECT idpublicnotice,begin_send_time,send_interval,end_send_time,next_send_time,content,type,color,is_forbid,is_urgent FROM publicnotice WHERE begin_send_time < ? AND end_send_time > ? AND is_forbid = 0 AND type = 1 AND is_urgent = 0;";
    private static final String WHITE_LIST_QUERY_SQL = "SELECT ip FROM white_list";
    private static final String ONLINE_RECORD_SQL = "INSERT INTO online VALUE(?,?,?,?,?,?)";
    private static final String MAIL_LIST_QUERY = "SELECT * FROM systemmail WHERE kind = ? AND uid = ? AND recv_time = 0";
    private static final String ROLE_NAME_MAP_TABLE_DROP = "DROP TABLE IF EXISTS role_name_map;";
    private static final String ROLE_NAME_MAP_VIEW_DROP = "DROP VIEW IF EXISTS role_name_map;";
    private static final String ROLE_NAME_MAP_VIEW_CREATE = "CREATE VIEW role_name_map AS SELECT serverId AS db_index, playerId AS role_id, playerName AS role_name, account AS plat_user_name, lv AS level,lastLoginTime AS last_login_time FROM tb_player;";
    private static final int MAIL_TYPE_PERSONAL = 1;
    private static final int MAIL_TYPE_SERVER = 2;
    private static final int NOTICE_TYPE_SYSTEM = 1;
    private String getKeywordUrl;
    private String getKeywordKey;
    private String getChatLimitUrl;
    private String getPlatformWhiteListUrl;
    private String weChatGiftUrl;
    private String weChatGiftKey;
    private final GameDBPool dbPool;
    private final WorldMgr worldMgr;
    private final LogOperationMgr operationMgr;
    private final ChatMgr chatMgr;
    private final MailWorldMgr mailWorldMgr;
    private final HttpMgr httpMgr;
    private final Environment env;
    private final UnionMgrParent unionMgrParent;
    private final Map<Integer, PublicNoticeDao> PUBLIC_NOTICE_MAP = new ConcurrentHashMap();
    public final Set<String> WHITE_LIST = new ConcurrentHashSet();
    public final Set<String> PLATFORM_WHITE_LIST = new ConcurrentHashSet();
    public WeChatGiftInfo weChatGiftInfo;

    public GmMgr(GameDBPool dbPool, WorldMgr worldMgr, LogOperationMgr operationMgr, ChatMgr chatMgr, MailWorldMgr mailWorldMgr, HttpMgr httpMgr, Environment env, UnionMgrParent unionMgrParent) {
        this.dbPool = dbPool;
        this.worldMgr = worldMgr;
        this.operationMgr = operationMgr;
        this.chatMgr = chatMgr;
        this.mailWorldMgr = mailWorldMgr;
        this.httpMgr = httpMgr;
        this.env = env;
        this.unionMgrParent = unionMgrParent;
    }

    protected void init() {
    }

    public void initData() {
        this.getKeywordUrl = this.env.getProperty("getKeywordUrl");
        this.getKeywordKey = this.env.getProperty("getKeywordKey");
        this.getChatLimitUrl = this.env.getProperty("getChatLimitUrl");
        this.getPlatformWhiteListUrl = this.env.getProperty("getWhiteListUrl");
        this.weChatGiftUrl = this.env.getProperty("weChatGiftUrl");
        this.weChatGiftKey = this.env.getProperty("weChatGiftKey");
        WorldDao<WorldData> worldDao = this.worldMgr.<WorldData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_WORLD);
        if (!MiscUtil.existBit((long) ((WorldData) worldDao.jsonData).otherFlag, 0)) {
            this.cmdCreateViewRoleNameMap();
        }

        this.cmdReloadWhiteList();
        if (!StringUtils.isEmpty(this.getKeywordUrl)) {
            this.cmdReloadBadWord();
        }

        this.getAllAccountWhiteList();
        this.schedule(60000L, this::minuteJob);
        this.schedule(6000L, this::sixSecondJob);
        this.recordPlayerTodayOnline();
    }

    private void minuteJob() {
        this.onlineRecord();
        if (!StringUtils.isEmpty(this.getChatLimitUrl)) {
            this.loadChatLimitData();
        }

        if (!StringUtils.isEmpty(this.getPlatformWhiteListUrl)) {
            this.loadPlatformWhiteList();
        }

        if (!StringUtils.isEmpty(this.weChatGiftUrl) && !StringUtils.isEmpty(this.weChatGiftKey)) {
            this.loadWeChatGift();
        }

        this.schedule(60000L, this::minuteJob);
    }

    private void sixSecondJob() {
        this.commandHandle();
        this.publicNoticeQuery();
        this.schedule(6000L, this::sixSecondJob);
    }

    public void cmdCreateViewRoleNameMap() {
        try {
            logger.info("删除role_name_map表");
            this.dbPool.query("DROP TABLE IF EXISTS role_name_map;", new Object[0]);
            logger.info("删除role_name_map视图");
            this.dbPool.query("DROP VIEW IF EXISTS role_name_map;", new Object[0]);
            logger.info("创建role_name_map视图");
            this.dbPool.query("CREATE VIEW role_name_map AS SELECT serverId AS db_index, playerId AS role_id, playerName AS role_name, account AS plat_user_name, lv AS level,lastLoginTime AS last_login_time FROM tb_player;", new Object[0]);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        this.worldMgr.pushTask(() -> {
            WorldDao<WorldData> worldDao = this.worldMgr.<WorldData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_WORLD);
            ((WorldData) worldDao.jsonData).otherFlag = MiscUtil.setBit(((WorldData) worldDao.jsonData).otherFlag, 0);
            worldDao.updateOp();
        });
    }

    private void commandHandle() {
        try {
            Map<Integer, String> cmdMap = new HashMap();
            this.dbPool.query("SELECT idcommand,type,cmd FROM command WHERE confirmtime=0;", (resultSet) -> {
                try {
                    while (resultSet.next()) {
                        int idCommand = resultSet.getInt("idcommand");
                        String cmd = resultSet.getString("cmd");
                        cmdMap.put(idCommand, cmd);
                    }
                } catch (Exception e) {
                    logger.error("查询后台命令出错:{}", e.getMessage(), e);
                }

            }, new Object[0]);
            Set<String> handleDoneCmdSet = new HashSet();

            for (Map.Entry<Integer, String> entry : cmdMap.entrySet()) {
                Integer id = (Integer) entry.getKey();
                String cmd = (String) entry.getValue();
                if (!handleDoneCmdSet.contains(cmd)) {
                    this.commandHandle(cmd);
                    handleDoneCmdSet.add(cmd);
                }

                this.dbPool.query("UPDATE command SET confirmtime=? WHERE idcommand = ?;", new Object[]{System.currentTimeMillis(), id});
            }
        } catch (Throwable t) {
            logger.error("执行后台命令出错:{}", t.getMessage(), t);
        }

    }

    public String commandHandle(String cmd) {
        if (StringUtils.isEmpty(cmd)) {
            return "命令为空";
        } else {
            String[] cmdArr = cmd.split("\\|");

            try {
                if (!cmd.startsWith("cmd")) {
                    logger.error("无效的命令:{}", cmd);
                    return "无效的命令:" + cmd;
                }

                logger.info("执行命令:{}", cmd);
                if (cmdArr.length == 1) {
                    Method cmdHandleMethod = this.getClass().getDeclaredMethod(cmdArr[0]);
                    cmdHandleMethod.invoke(this);
                } else {
                    String[] paramArr = cmdArr[1].split(",");
                    Class[] classTypeArr = new Class[paramArr.length];

                    for (int i = 0; i < paramArr.length; ++i) {
                        classTypeArr[i] = String.class;
                    }

                    Method cmdHandleMethod = this.getClass().getDeclaredMethod(cmdArr[0], classTypeArr);
                    cmdHandleMethod.invoke(this, paramArr);
                }
            } catch (NoSuchMethodException var7) {
                logger.error("命令:{},不存在", cmd);
                return "命令:" + cmd + "不存在";
            } catch (InvocationTargetException | IllegalAccessException e) {
                logger.error("命令:{},执行错误:{}", new Object[]{cmd, ((ReflectiveOperationException) e).getMessage(), e});
                return "命令:" + cmd + "执行错误:" + ((ReflectiveOperationException) e).getMessage();
            }

            return "成功执行命令:" + cmd;
        }
    }

    private void publicNoticeQuery() {
        try {
            int nowTime = DateUtil.getIntTime(System.currentTimeMillis());
            List<Integer> resultIds = new ArrayList();
            this.dbPool.query("SELECT idpublicnotice,begin_send_time,send_interval,end_send_time,next_send_time,content,type,color,is_forbid,is_urgent FROM publicnotice WHERE begin_send_time < ? AND end_send_time > ? AND is_forbid = 0 AND type = 1 AND is_urgent = 0;", (resultSet) -> {
                try {
                    while (resultSet.next()) {
                        int noticeId = resultSet.getInt("idpublicnotice");
                        long beginSendTime = resultSet.getLong("begin_send_time");
                        long sendInterval = resultSet.getLong("send_interval");
                        long endSendTime = resultSet.getLong("end_send_time");
                        String content = resultSet.getString("content");
                        int type = resultSet.getInt("type");
                        int color = resultSet.getInt("color");
                        int isForbid = resultSet.getInt("is_forbid");
                        int isUrgent = resultSet.getInt("is_urgent");
                        resultIds.add(noticeId);
                        PublicNoticeDao publicNoticeDao = (PublicNoticeDao) this.PUBLIC_NOTICE_MAP.computeIfAbsent(noticeId, (v) -> new PublicNoticeDao());
                        publicNoticeDao.idPublicNotice = noticeId;
                        publicNoticeDao.beginSendTime = beginSendTime;
                        publicNoticeDao.sendInterval = sendInterval;
                        publicNoticeDao.endSendTime = endSendTime;
                        publicNoticeDao.content = content;
                        publicNoticeDao.type = type;
                        publicNoticeDao.color = color;
                        publicNoticeDao.isForbid = isForbid;
                        publicNoticeDao.isUrgent = isUrgent;
                    }
                } catch (Exception e) {
                    logger.error("查询公告出错:{}", e.getMessage(), e);
                }

            }, new Object[]{nowTime, nowTime});
            Iterator<Map.Entry<Integer, PublicNoticeDao>> iterator = this.PUBLIC_NOTICE_MAP.entrySet().iterator();

            while (iterator.hasNext()) {
                Map.Entry<Integer, PublicNoticeDao> entry = (Map.Entry) iterator.next();
                PublicNoticeDao publicNoticeDao = (PublicNoticeDao) entry.getValue();
                if (resultIds.contains(publicNoticeDao.idPublicNotice) && publicNoticeDao.isForbid <= 0 && publicNoticeDao.endSendTime > (long) nowTime) {
                    if (publicNoticeDao.type == 1 && publicNoticeDao.nextSendTime <= (long) nowTime) {
                        publicNoticeDao.nextSendTime = (long) nowTime + publicNoticeDao.sendInterval;
                        this.chatMgr.pushTask(() -> {
                            this.chatMgr.sendSystem((byte) 4, (byte) 2, 0, "", publicNoticeDao.content);
                            if (publicNoticeDao.isUrgent == 0) {
                                this.chatMgr.sendSystem((byte) 4, (byte) 5, 0, "", publicNoticeDao.content);
                            }

                        });
                    }
                } else {
                    iterator.remove();
                }
            }
        } catch (Throwable throwable) {
            logger.error("查询公告出错:{}", throwable.getMessage(), throwable);
        }

    }

    private void loadChatLimitData() {
        try {
            this.httpMgr.sendGet(this.getChatLimitUrl, "plat=" + this.worldMgr.PLATFORM_NAME, this, this.getClass().getMethod("loadChatLimitDataHttpCallback", String.class, String.class));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }

    public void loadChatLimitDataHttpCallback(String param, String result) {
        JSONObject jsonObject = JSONObject.parseObject(result);
        if (jsonObject == null) {
            logger.error("获取聊天限制数据出错,消息:{}", result);
        } else {
            Integer ret = jsonObject.getInteger("ret");
            if (ret != null && ret == 0) {
                this.chatMgr.chatLimitDataMap.clear();
                if (jsonObject.containsKey("data")) {
                    JSONObject dataJson = jsonObject.getJSONObject("data");
                    if (dataJson.containsKey("data")) {
                        JSONArray chaLimitJsonArray = dataJson.getJSONArray("data");

                        for (int i = 0; i < chaLimitJsonArray.size(); ++i) {
                            JSONObject chatLimitJson = chaLimitJsonArray.getJSONObject(i);
                            ChatLimitData chatLimitData = new ChatLimitData();
                            chatLimitData.setType(Byte.parseByte(String.valueOf(chatLimitJson.get("type"))));
                            chatLimitData.setBoth(Integer.parseInt(String.valueOf(chatLimitJson.get("both"))) == 1);
                            chatLimitData.setChatLevel(Integer.parseInt(String.valueOf(chatLimitJson.get("chat_level"))));
                            chatLimitData.setCoolingTime(Integer.parseInt(String.valueOf(chatLimitJson.get("cooling_time"))));
                            chatLimitData.setVip(Integer.parseInt(String.valueOf(chatLimitJson.get("vip"))));
                            this.chatMgr.chatLimitDataMap.put(chatLimitData.getType(), chatLimitData);
                        }
                    }
                }
            } else {
                logger.error("获取聊天限制数据出错,消息:{}", jsonObject.getString("msg"));
            }

        }
    }

    private void loadPlatformWhiteList() {
        try {
            this.httpMgr.sendGet(this.getPlatformWhiteListUrl, "spid=" + this.worldMgr.PLATFORM_NAME, this, this.getClass().getMethod("loadPlatformWhiteListHttpCallback", String.class, String.class));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }

    public void loadPlatformWhiteListHttpCallback(String param, String result) {
        JSONObject jsonObject = JSONObject.parseObject(result);
        if (jsonObject == null) {
            logger.error("获取渠道白名单出错,消息:{}", result);
        } else {
            Integer ret = jsonObject.getInteger("ret");
            if (ret != null && ret == 0) {
                this.PLATFORM_WHITE_LIST.clear();
                if (!jsonObject.containsKey("data")) {
                    logger.error("获取渠道白名单出错,返回结果没有data字段");
                    return;
                }

                JSONObject dataJson = jsonObject.getJSONObject("data");
                if (dataJson == null) {
                    logger.error("获取渠道白名单出错,返回结果data=null");
                    return;
                }

                if (!dataJson.containsKey("ip")) {
                    logger.error("获取渠道白名单出错,返回结果没有ip字段");
                    return;
                }

                JSONArray ipJsonArr = dataJson.getJSONArray("ip");
                if (ipJsonArr == null) {
                    logger.error("获取渠道白名单出错,返回结果ip=null");
                    return;
                }

                this.PLATFORM_WHITE_LIST.addAll(ipJsonArr.toJavaList(String.class));
            } else {
                logger.error("获取渠道白名单出错,消息:{}", jsonObject.getString("msg"));
            }

        }
    }

    private void loadWeChatGift() {
        try {
            int time = DateUtil.getIntTime(System.currentTimeMillis());
            String sign = MD5Util.encode(this.worldMgr.PLATFORM_NAME + time + this.weChatGiftKey);
            this.httpMgr.sendGet(this.weChatGiftUrl, "spid=" + this.worldMgr.PLATFORM_NAME + "&time=" + time + "&sign=" + sign, this, this.getClass().getMethod("loadWeChatGiftHttpCallback", String.class, String.class));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void loadWeChatGiftHttpCallback(String param, String result) {
        JSONObject jsonObject = JSONObject.parseObject(result);
        if (jsonObject == null) {
            logger.error("获取微信好礼活动出错,消息:{}", result);
        } else {
            Integer ret = jsonObject.getInteger("ret");
            if (ret != null && ret == 0) {
                if (!jsonObject.containsKey("data")) {
                    if (this.weChatGiftInfo != null) {
                        this.weChatGiftInfo = null;
                        this.sendWeChatGiftInfo((GamePlayer) null);
                    }

                    return;
                }

                JSONObject dataJson = jsonObject.getJSONObject("data");
                if (dataJson == null || dataJson.isEmpty()) {
                    if (this.weChatGiftInfo != null) {
                        this.weChatGiftInfo = null;
                        this.sendWeChatGiftInfo((GamePlayer) null);
                    }

                    return;
                }

                WeChatGiftInfo weChatGiftInfo = (WeChatGiftInfo) JSONObject.parseObject(dataJson.toString(), WeChatGiftInfo.class);
                if (this.weChatGiftInfo == null || !weChatGiftInfo.getUpdate_time().equals(this.weChatGiftInfo.getUpdate_time())) {
                    this.weChatGiftInfo = weChatGiftInfo;
                    this.weChatGiftInfo.setServerQrCodeUrl((String) null);
                    if (this.weChatGiftInfo.getQrcode_url() != null) {
                        try {
                            for (String serverAndQrcode : this.weChatGiftInfo.getQrcode_url().values()) {
                                String[] serverAndQrcodeArr = serverAndQrcode.split("\\|");
                                String[] serverArr = serverAndQrcodeArr[0].split(",");
                                if (this.worldMgr.GAME_SERVER_ID >= Integer.parseInt(serverArr[0]) && this.worldMgr.GAME_SERVER_ID <= Integer.parseInt(serverArr[1])) {
                                    this.weChatGiftInfo.setServerQrCodeUrl(serverAndQrcodeArr[1]);
                                    break;
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }

                    this.sendWeChatGiftInfo((GamePlayer) null);
                    logger.info("{}", this.weChatGiftInfo.toString());
                }
            } else {
                logger.error("获取微信好礼活动出错,消息:{}", jsonObject.getString("msg"));
            }

        }
    }

    @TaskMethod
    public void sendWeChatGiftInfo(GamePlayer player) {
        if (player == null) {
            ThemeActivityMsg.S2C_WeChatGift_12950.Builder msg;
            if (this.weChatGiftInfo == null) {
                msg = ThemeActivityMsg.S2C_WeChatGift_12950.newBuilder();
                msg.setOpen(false);
            } else {
                msg = this.weChatGiftInfo.buildMsg();
            }

            OnLineMgr onLineMgr = (OnLineMgr) ApplicationContextProvider.getContext().getBean(OnLineMgr.class);
            onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{msg.build()});
        } else if (this.weChatGiftInfo != null) {
            PlayerPublicDao playerPublicDao = player.getPublicDao();
            if (playerPublicDao.lv < this.weChatGiftInfo.getOpen_level()) {
                return;
            }

            player.sendMsg(this.weChatGiftInfo.buildMsg().build());
        }

    }

    private void onlineRecord() {
        int online = this.worldMgr.getOnlinePlayer().size();
        this.operationMgr.pushTask(() -> this.operationMgr.addOnLinePlayerLog(online));
        Calendar nowInstance = Calendar.getInstance();

        try {
            this.dbPool.query("INSERT INTO online VALUE(?,?,?,?,?,?)", new Object[]{nowInstance.get(1), nowInstance.get(2) + 1, nowInstance.get(5), nowInstance.get(11), nowInstance.get(12), online});
        } catch (Throwable e) {
            e.printStackTrace();
        }

    }

    private List<SystemMailDao> getSystemMailList(int kind, int roleId) {
        List<SystemMailDao> list = new ArrayList();

        try {
            this.dbPool.query("SELECT * FROM systemmail WHERE kind = ? AND uid = ? AND recv_time = 0", (resultSet) -> {
                try {
                    while (resultSet.next()) {
                        SystemMailDao systemMailDao = new SystemMailDao();
                        Field[] fields = systemMailDao.getClass().getFields();

                        for (Field field : fields) {
                            DBColumnAnno dbColumnAnno = (DBColumnAnno) field.getAnnotation(DBColumnAnno.class);
                            if (!dbColumnAnno.skip()) {
                                field.set(systemMailDao, resultSet.getObject(dbColumnAnno.columnName()));
                            }
                        }

                        list.add(systemMailDao);
                    }
                } catch (Exception e) {
                    logger.error("查询后台邮件出错:{}", e.getMessage(), e);
                }

            }, new Object[]{kind, roleId});
        } catch (Throwable t) {
            logger.error("查询后台邮件出错:{}", t.getMessage(), t);
        }

        return list;
    }

    private String getQuerySystemMailSql(int kind, int roleId) {
        StringBuilder sql = new StringBuilder("SELECT ");
        Field[] fields = SystemMailDao.class.getFields();

        for (Field field : fields) {
            DBColumnAnno dbColumnAnno = (DBColumnAnno) field.getAnnotation(DBColumnAnno.class);
            if (!dbColumnAnno.skip()) {
                sql.append(dbColumnAnno.columnName()).append(",");
            }
        }

        sql.deleteCharAt(sql.length() - 1).append(" ");
        sql.append("FROM ").append("systemmail").append(" ");
        sql.append("WHERE  kind = ").append(kind).append(" ");
        if (kind == 1 && roleId > 0) {
            sql.append("AND uid = ").append(roleId).append(" ");
        }

        sql.append("AND recv_time = 0;");
        return sql.toString();
    }

    private void cmdRoleKickOut(String roleId) {
        if (StringUtils.isEmpty(roleId)) {
            logger.error("命令:cmdRoleKickOut错误,roleId不存在");
        } else {
            try {
                int playerId = Integer.parseInt(roleId);
                this.worldMgr.pushTask(() -> {
                    GamePlayer gamePlayer = this.worldMgr.getOnlinePlayer(playerId);
                    if (gamePlayer != null) {
                        gamePlayer.pushTask(() -> gamePlayer.closeChannel(LoginMsg.resultType.KICKOUT));
                    } else {
                        logger.error("命令:cmdRoleKickOut错误,玩家:{}不存在或者不在线", playerId);
                    }

                });
            } catch (Exception e) {
                logger.error("命令:cmdRoleKickOut错误,{}", e.getMessage(), e);
            }
        }

    }

    private void cmdSendMail(String kind, String roleId) {
        if (!StringUtils.isEmpty(kind) && !StringUtils.isEmpty(roleId)) {
            long curTime = System.currentTimeMillis();

            try {
                int paramKind = Integer.parseInt(kind);
                if (paramKind != 1 && paramKind != 2) {
                    logger.error("命令:cmdSendMail错误,错误的邮件类型:{}", kind);
                    return;
                }

                int paramRoleId = Integer.parseInt(roleId);

                for (SystemMailDao systemMailDao : this.getSystemMailList(paramKind, paramRoleId)) {
                    this.addMailResources(systemMailDao);
                    if (systemMailDao.invalidTime <= 0L) {
                        systemMailDao.invalidTime = curTime + MailPart.FOREVER;
                    }

                    if (paramKind == 1) {
                        GamePlayer gamePlayer = this.worldMgr.getPlayerById(systemMailDao.uid);
                        if (gamePlayer == null) {
                            logger.info("发送后台个人邮件失败,玩家不存在,邮件ID:{},发送玩家:{},邮件标题:{},邮件内容:{},邮件附件:{}", new Object[]{systemMailDao.systemMailId, systemMailDao.uid, systemMailDao.subject, systemMailDao.content, systemMailDao.resourceModels});
                            continue;
                        }

                        logger.info("发送后台个人邮件,邮件ID:{},发送玩家:{},邮件标题:{},邮件内容:{},邮件附件:{}", new Object[]{systemMailDao.systemMailId, systemMailDao.uid, systemMailDao.subject, systemMailDao.content, systemMailDao.resourceModels});
                        this.sendPersonalMail(systemMailDao, gamePlayer);
                    } else {
                        logger.info("发送后台全服邮件,邮件ID:{},邮件标题:{},邮件内容:{},邮件附件:{}", new Object[]{systemMailDao.systemMailId, systemMailDao.subject, systemMailDao.content, systemMailDao.resourceModels});
                        this.sendServerMail(systemMailDao);
                    }

                    this.dbPool.query("UPDATE systemmail SET recv_time=? WHERE systemmail_id = ?;", new Object[]{curTime, systemMailDao.systemMailId});
                }
            } catch (Throwable e) {
                logger.error("命令:cmdSendMail错误,{}", e.getMessage(), e);
            }

        } else {
            logger.error("命令:cmdSendMail错误,参数kind:{},roleId:{}", kind, roleId);
        }
    }

    private void cmdRegisterLimit() {
        WorldMgr var10001 = this.worldMgr;
        this.worldMgr.pushTask(var10001::registerLimit);
    }

    private void cmdOpenRegisterRole() {
        WorldMgr var10001 = this.worldMgr;
        this.worldMgr.pushTask(var10001::openRegister);
    }

    private void cmdForbidChat(String roleId, String minuteTime) {
        if (!StringUtils.isEmpty(roleId) && !StringUtils.isEmpty(minuteTime)) {
            try {
                GamePlayer gamePlayer = this.worldMgr.getPlayerById(Integer.parseInt(roleId));
                if (gamePlayer == null) {
                    logger.error("命令:cmdForbidChat错误,玩家{}不存在", roleId);
                    return;
                }

                int minute = Integer.parseInt(minuteTime);
                gamePlayer.pushTask(() -> {
                    PlayerDao playerDao = gamePlayer.getPlayerDao();
                    if (minute <= 0) {
                        playerDao.forbidChatTime = 0L;
                        ReportDao reportDao = (ReportDao) gamePlayer.getData("tb_report", gamePlayer.getPlayerId());
                        FriendPart friendPart = (FriendPart) gamePlayer.getMgrPart(FriendPart.class);
                        reportDao.hp = friendPart.getReportBlood();
                        reportDao.lv = playerDao.lv;
                        reportDao.reportIdSet.clear();
                        reportDao.updateOp();
                        friendPart.sendReportInfo(reportDao);
                    } else {
                        playerDao.forbidChatTime = System.currentTimeMillis() + (long) (minute * 60) * 1000L;
                        this.chatMgr.pushTask(() -> this.chatMgr.removeChatInfo(gamePlayer.getPlayerId()));
                    }

                    playerDao.updateOp();
                    logger.warn("命令:cmdForbidChat 成功 playerId:{} minute:{}", gamePlayer.getPlayerId(), minute);
                });
            } catch (Exception e) {
                logger.error("命令:cmdForbidChat错误:{}", e.getMessage(), e);
            }

        } else {
            logger.error("命令:cmdForbidChat错误,参数roleId:{},minuteTime:{}", roleId, minuteTime);
        }
    }

    private void cmdBanRole(String roleId, String minuteTime) {
        if (!StringUtils.isEmpty(roleId) && !StringUtils.isEmpty(minuteTime)) {
            try {
                int playerId = Integer.parseInt(roleId);
                int minute = Integer.parseInt(minuteTime);
                GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
                if (gamePlayer == null) {
                    logger.error("命令:cmdBanRole错误,玩家{}不存在", playerId);
                    return;
                }

                gamePlayer.pushTask(() -> {
                    PlayerDao playerDao = gamePlayer.getPlayerDao();
                    PlayerPublicDao playerPublicDao = gamePlayer.getPublicDao();
                    if (minute <= 0) {
                        playerDao.banEndTime = 0L;
                        playerDao.unsealTime = System.currentTimeMillis();
                        if (playerPublicDao != null) {
                            playerPublicDao.banEndTime = playerDao.banEndTime;
                        }
                    } else {
                        playerDao.banEndTime = System.currentTimeMillis() + (long) (minute * 60) * 1000L;
                        if (playerPublicDao != null) {
                            playerPublicDao.banEndTime = playerDao.banEndTime;
                        }

                        logger.info("【{}】封号到【{}】", playerDao.playerName, DateUtil.transferLongToDate(playerDao.banEndTime));
                        gamePlayer.closeChannel(LoginMsg.resultType.KICKOUT);
                        this.chatMgr.pushTask(() -> this.chatMgr.removeChatInfo(gamePlayer.getPlayerId()));
                        if (playerDao.unionId > 0) {
                            this.unionMgrParent.pushTask(() -> {
                                UnionMgr unionMgr = this.unionMgrParent.getUnionMgr(playerDao.unionId);
                                if (unionMgr != null) {
                                    UnionMemberDao unionMemberDao = unionMgr.getUnionMember(gamePlayer.getPlayerId());
                                    if (unionMemberDao.position == 1) {
                                        unionMgr.changeLeaderToMaxPower(gamePlayer.getPlayerId());
                                    } else if (unionMemberDao.position == 2) {
                                        unionMgr.handleDeputyLeader(gamePlayer, (GamePlayer) null, false, true);
                                    }

                                }
                            });
                        }
                    }

                    playerDao.updateOp();
                });
            } catch (Exception e) {
                logger.error("命令:cmdBanRole错误:{}", e.getMessage(), e);
            }

        } else {
            logger.error("命令:cmdBanRole错误,参数roleId:{},minuteTime:{}", roleId, minuteTime);
        }
    }

    private void cmdDelRoleResource(String roleId, String resTypeStr, String resIdStr, String resNumStr) {
        if (!StringUtils.isEmpty(roleId) && !StringUtils.isEmpty(resTypeStr) && !StringUtils.isEmpty(resIdStr) && !StringUtils.isEmpty(resNumStr)) {
            try {
                int playerId = Integer.parseInt(roleId);
                int resType = Integer.parseInt(resTypeStr);
                int resId = Integer.parseInt(resIdStr);
                int resNum = Integer.parseInt(resNumStr);
                if (resType != 1 && resType != 2) {
                    logger.error("命令:cmdDelRoleResource错误,资源类型{}错误", resType);
                    return;
                }

                GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
                if (gamePlayer == null) {
                    logger.error("命令:cmdDelRoleResource错误,玩家{}不存在", playerId);
                    return;
                }

                gamePlayer.pushTask(() -> {
                    long resourceNum = gamePlayer.getResourceNum(resType, resId);
                    gamePlayer.delResource(resType, resId, Math.min(resourceNum, (long) resNum), 49, 4902, 0, 0, "cmdDelRoleItemById");
                });
            } catch (Exception e) {
                logger.error("命令:cmdDelRoleResource错误:{}", e.getMessage(), e);
            }

        } else {
            logger.error("命令:cmdDelRoleResource错误,参数roleId:{},resType:{},resId:{},resNum:{}", new Object[]{roleId, resTypeStr, resIdStr, resNumStr});
        }
    }

    private void cmdDelRoleItemByCode(String roleId, String itemCodeStr, String itemNumStr) {
        if (!StringUtils.isEmpty(roleId) && !StringUtils.isEmpty(itemCodeStr)) {
            try {
                int playerId = Integer.parseInt(roleId);
                int itemCode = Integer.parseInt(itemCodeStr);
                int itemNum = Integer.parseInt(itemNumStr);
                GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
                if (gamePlayer == null) {
                    logger.error("命令:cmdDelRoleItemByCode错误,玩家{}不存在", playerId);
                    return;
                }

                gamePlayer.pushTask(() -> {
                    ItemBagPart itemBagPart = (ItemBagPart) gamePlayer.getMgrPart(ItemBagPart.class);
                    ItemBase itemBase = itemBagPart.getItemByCode(itemCode);
                    if (itemBase == null) {
                        logger.error("命令:cmdDelRoleItemByCode错误,玩家{}未拥有该物品,code:{}", playerId, itemCodeStr);
                    }

                    itemBagPart.deleteItemByCode(itemCode, itemNum, 49, 4902, itemCode, itemNum, "cmdDelRoleItemByCode");
                });
            } catch (Exception e) {
                logger.error("命令:cmdDelRoleItemByCode错误:{}", e.getMessage(), e);
            }

        } else {
            logger.error("命令:cmdDelRoleItemByCode错误,参数roleId:{},itemCode:{}", roleId, itemCodeStr);
        }
    }

    private void cmdReloadWhiteList() {
        try {
            this.WHITE_LIST.clear();
            this.dbPool.query("SELECT ip FROM white_list", (resultSet) -> {
                try {
                    while (resultSet.next()) {
                        this.WHITE_LIST.add(resultSet.getString("ip"));
                    }
                } catch (Exception e) {
                    logger.error("查询白名单列表出错:{}", e.getMessage(), e);
                }

            }, new Object[0]);
            logger.info("白名单:{}", this.WHITE_LIST);
        } catch (Throwable e) {
            logger.error("命令:cmdReloadWhiteList错误:{}", e.getMessage(), e);
        }

    }

    private void cmdDismissUnion(String unionId) {
        if (StringUtils.isEmpty(unionId)) {
            logger.error("命令:cmdDismissUnion错误,参数unionId:{}", unionId);
        } else {
            try {
                int union = Integer.parseInt(unionId);
                this.unionMgrParent.pushTask(() -> {
                    UnionMgr unionMgr = this.unionMgrParent.getUnionMgr(union);
                    if (unionMgr == null) {
                        logger.error("命令:cmdDismissUnion错误,军团{}不存在", unionId);
                    } else {
                        logger.info("gm后台解散军团{}", union);
                        this.unionMgrParent.dismissUnion(union);
                    }
                });
            } catch (Exception e) {
                logger.error("命令:cmdDismissUnion错误:{}", e.getMessage(), e);
            }

        }
    }

    private void cmdClearDeclaration(String unionId) {
        if (StringUtils.isEmpty(unionId)) {
            logger.error("命令:cmdClearDeclaration错误,参数unionId:{}", unionId);
        } else {
            try {
                int union = Integer.parseInt(unionId);
                this.unionMgrParent.pushTask(() -> {
                    UnionMgr unionMgr = this.unionMgrParent.getUnionMgr(union);
                    if (unionMgr == null) {
                        logger.error("命令:cmdClearDeclaration错误,军团{}不存在", unionId);
                    } else {
                        UnionDao unionDao = unionMgr.getUnion();
                        if (unionDao == null) {
                            logger.error("命令:cmdClearDeclaration错误,军团{}数据不存在", unionId);
                        } else {
                            unionDao.declaration = "";
                            unionDao.updateOp();
                            unionMgr.sendUnion((GamePlayer) null);
                        }
                    }
                });
            } catch (Exception e) {
                logger.error("命令:cmdDismissUnion错误:{}", e.getMessage(), e);
            }

        }
    }

    private void cmdSettingPlayerType(String roleId, String roleType) {
        if (!StringUtils.isEmpty(roleId) && !StringUtils.isEmpty(roleType)) {
            try {
                int playerId = Integer.parseInt(roleId);
                GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
                if (gamePlayer == null) {
                    logger.error("命令:cmdSettingPlayerType错误,玩家{}不存在", playerId);
                    return;
                }

                int playerType = Integer.parseInt(roleType);
                if (!PlayerDefine.ACCOUNT_TYPE_PLAYER_LIST.contains(playerType)) {
                    logger.error("命令:cmdSettingPlayerType错误,玩家类型{}错误", playerType);
                    return;
                }

                gamePlayer.pushTask(() -> {
                    PlayerDao playerDao = gamePlayer.getPlayerDao();
                    playerDao.type = playerType;
                    playerDao.updateOp();
                    gamePlayer.notifyPlayerData(PlayerDefine.PLAYER_TYPE, playerDao.type);
                });
            } catch (Exception e) {
                logger.error("命令:cmdSettingPlayerType错误:{}", e.getMessage(), e);
            }

        } else {
            logger.error("命令:cmdSettingPlayerType错误,参数roleId:{},参数roleType:{}", roleId, roleType);
        }
    }

    private void cmdReloadBadWord() {
        try {
            Map<String, String> params = new LinkedHashMap();
            params.put("spid", this.worldMgr.PLATFORM_NAME);
            params.put("keyword", "1");
            params.put("time", DateUtil.getIntTime(System.currentTimeMillis()) + "");
            StringBuilder stringBuilder = new StringBuilder();
            params.values().forEach(stringBuilder::append);
            stringBuilder.append(this.getKeywordKey);
            params.put("sign", MD5Util.encode(stringBuilder.toString()));
            stringBuilder = new StringBuilder();

            for (Map.Entry<String, String> entry : params.entrySet()) {
                String k = (String) entry.getKey();
                String v = (String) entry.getValue();
                stringBuilder.append(k).append("=").append(v).append("&");
            }

            this.httpMgr.sendGet(this.getKeywordUrl, stringBuilder.deleteCharAt(stringBuilder.length() - 1).toString(), this, this.getClass().getMethod("loadBadWordsHttpCallback", String.class, String.class));
        } catch (Throwable e) {
            logger.error("命令:cmdReloadBadWord错误:{}", e.getMessage(), e);
        }

    }

    public void settingActivity(int id, long start, long end, int force) {
        this.cmdSettingActivity(String.valueOf(id), String.valueOf(start), String.valueOf(end), String.valueOf(force));
    }

    private void cmdSettingActivity(String id, String start, String end, String force) {
        if (!StringUtils.isEmpty(id) && !StringUtils.isEmpty(start) && !StringUtils.isEmpty(end) && !StringUtils.isEmpty(force)) {
            try {
                ActivityMgr activityMgr = (ActivityMgr) ApplicationContextProvider.getContext().getBean(ActivityMgr.class);
                activityMgr.pushTask(() -> {
                    int activityId = Integer.parseInt(id);
                    int startTime = Integer.parseInt(start);
                    int endTime = Integer.parseInt(end);
                    ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel) ApplicationContextProvider.getModelPoolEntity("activityopenTime", activityId);
                    if (activityOpenTimeModel == null) {
                        logger.error("命令:cmdSettingActivity错误,活动【{}】配置不存在", activityId);
                    } else {
                        ActivityRuleModel activityRuleModel = (ActivityRuleModel) ApplicationContextProvider.getModelPoolEntity("activityRule", activityOpenTimeModel.getActivityType());
                        if (activityRuleModel == null) {
                            logger.error("命令:cmdSettingActivity错误,活动类型【{}】配置不存在", activityOpenTimeModel.getActivityType());
                        } else if (activityRuleModel.getOpenType() != 3) {
                            logger.error("命令:cmdSettingActivity错误,活动【{}】非指定日期开启类型", activityId);
                        } else {
                            startTime = DateUtil.getIntTime(DateUtil.getSomeDayBeginTime((long) startTime * 1000L));
                            endTime = DateUtil.getIntTime(DateUtil.getSomeDayEndTime((long) endTime * 1000L));
                            if (endTime < startTime) {
                                logger.error("命令:cmdSettingActivity错误,活动【{}】开启时间【{}】比结束时间【{}】大", new Object[]{activityId, DateUtil.transferLongToDate((long) startTime * 1000L), DateUtil.transferLongToDate((long) endTime * 1000L)});
                            } else {
                                WorldDao<GameManagerData> worldDao = this.worldMgr.<GameManagerData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_GAME_MANAGER);
                                ((GmActivitySetting) ((Map) ((GameManagerData) worldDao.jsonData).activities.computeIfAbsent(activityRuleModel.getActivityType(), (v) -> new HashMap())).computeIfAbsent(activityId, (v) -> new GmActivitySetting())).setStart(startTime).setEnd(endTime).setId(activityId).setClose(false);
                                worldDao.updateOp();
                                ActivityInfo activityInfo = activityMgr.getActivityInfo(activityRuleModel.getActivityType());
                                if (activityInfo != null && activityInfo.id == activityId && activityInfo.open) {
                                    logger.warn("活动【{}】正在开启中,不检查活动轮换,当前活动时间【{}】-【{}】", new Object[]{activityId, DateUtil.transferLongToDate((long) startTime * 1000L), DateUtil.transferLongToDate((long) endTime * 1000L)});
                                } else {
                                    activityMgr.activityFlush();
                                }
                            }
                        }
                    }
                });
            } catch (Exception e) {
                logger.error("命令:cmdSettingActivity错误:{}", e.getMessage(), e);
            }

        } else {
            logger.error("命令:cmdSettingActivity错误,参数id:{},参数start:{},参数end:{},参数force:{}", new Object[]{id, start, end, force});
        }
    }

    @TaskMethod
    public void closeActivity(int id) {
        this.cmdCloseActivity(String.valueOf(id));
    }

    private void cmdCloseActivity(String id) {
        if (StringUtils.isEmpty(id)) {
            logger.error("命令:cmdCloseActivity错误,参数id:{}", id);
        } else {
            try {
                int activityId = Integer.parseInt(id);
                ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel) ApplicationContextProvider.getModelPoolEntity("activityopenTime", activityId);
                if (activityOpenTimeModel == null) {
                    logger.error("命令:cmdCloseActivity错误,活动【{}】配置不存在", activityId);
                    return;
                }

                ActivityRuleModel activityRuleModel = (ActivityRuleModel) ApplicationContextProvider.getModelPoolEntity("activityRule", activityOpenTimeModel.getActivityType());
                if (activityRuleModel == null) {
                    logger.error("命令:cmdCloseActivity错误,活动类型【{}】配置不存在", activityOpenTimeModel.getActivityType());
                    return;
                }

                if (activityRuleModel.getOpenType() != 3) {
                    logger.error("命令:cmdCloseActivity错误,活动【{}】非指定日期开启类型", activityId);
                    return;
                }

                ActivityMgr activityMgr = (ActivityMgr) ApplicationContextProvider.getContext().getBean(ActivityMgr.class);
                activityMgr.pushTask(() -> {
                    WorldDao<GameManagerData> gmWorldDao = this.worldMgr.<GameManagerData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_GAME_MANAGER);
                    if (!((GameManagerData) gmWorldDao.jsonData).activities.containsKey(activityRuleModel.getActivityType())) {
                        logger.error("命令:cmdCloseActivity错误,活动【{}】的设置不存在", activityId);
                    } else if (!((Map) ((GameManagerData) gmWorldDao.jsonData).activities.get(activityRuleModel.getActivityType())).containsKey(activityId)) {
                        logger.error("命令:cmdCloseActivity错误,活动【{}】的设置不存在", activityId);
                    } else {
                        WorldDao<ActivityData> worldDao = this.worldMgr.<ActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_ACTIVITY);
                        ActivityInfo currentActivity = (ActivityInfo) ((ActivityData) worldDao.jsonData).timeRotates.get(activityOpenTimeModel.getActivityType());
                        if (currentActivity != null && currentActivity.id == activityId && currentActivity.open) {
                            GmActivitySetting gmActivitySetting = (GmActivitySetting) ((Map) ((GameManagerData) gmWorldDao.jsonData).activities.get(activityRuleModel.getActivityType())).get(activityId);
                            if (gmActivitySetting.getStart() == currentActivity.start && gmActivitySetting.getEnd() == currentActivity.end) {
                                gmActivitySetting.setClose(true);
                                gmWorldDao.updateOp();
                                currentActivity.gmOp = true;
                                worldDao.updateOp();
                                activityMgr.activityFlush();
                            } else {
                                logger.error("命令:cmdCloseActivity错误,当前开启的活动【{}】开启时间【{}】与设置的开启时间【{}】/结束时间【{}】与设置的结束时间【{}】不一致", new Object[]{activityId, DateUtil.transferLongToDate((long) currentActivity.start * 1000L), DateUtil.transferLongToDate((long) gmActivitySetting.getStart() * 1000L), DateUtil.transferLongToDate((long) currentActivity.end * 1000L), DateUtil.transferLongToDate((long) gmActivitySetting.getEnd() * 1000L)});
                            }
                        } else {
                            logger.error("命令:cmdCloseActivity,当前开启活动【{}-{}】,关闭活动【{}】未生效,", new Object[]{currentActivity == null ? 0 : currentActivity.id, currentActivity == null ? "未开启" : (currentActivity.open ? "开启中" : "关闭中"), activityId});
                        }
                    }
                });
            } catch (Exception e) {
                logger.error("命令:cmdCloseActivity错误:{}", e.getMessage(), e);
            }

        }
    }

    private void cmdSilentChat(String roleId, String minuteTime) {
        if (!StringUtils.isEmpty(roleId) && !StringUtils.isEmpty(minuteTime)) {
            try {
                int playerId = Integer.parseInt(roleId);
                int minute = Integer.parseInt(minuteTime);
                GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
                if (gamePlayer == null) {
                    logger.error("命令:cmdSilentChat错误,玩家{}不存在", playerId);
                    return;
                }

                gamePlayer.pushTask(() -> {
                    PlayerExtend playerExtend = (PlayerExtend) gamePlayer.getPlayerExtend(13);
                    if (minute == 0) {
                        playerExtend.silent = 0L;
                    } else {
                        playerExtend.silent = System.currentTimeMillis() + (long) (minute * 60) * 1000L;
                        this.chatMgr.pushTask(() -> this.chatMgr.removeChatInfo(gamePlayer.getPlayerId()));
                    }

                    gamePlayer.updatePlayerExtend(13);
                });
            } catch (Exception e) {
                logger.error("命令:cmdSilentChat错误:{}", e.getMessage(), e);
            }

        } else {
            logger.error("命令:cmdSilentChat错误,参数roleId:{},参数minuteTime:{}", roleId, minuteTime);
        }
    }

    private void cmdToRoleName(String roleId, String roleName) {
        if (!StringUtils.isEmpty(roleId) && !StringUtils.isEmpty(roleName)) {
            try {
                int playerId = Integer.parseInt(roleId);
                GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
                if (gamePlayer == null) {
                    logger.error("命令:cmdToRoleName错误,玩家{}不存在", playerId);
                    return;
                }

                gamePlayer.pushTask(() -> {
                    PlayerDao playerDao = gamePlayer.getPlayerDao();
                    playerDao.playerName = roleName;
                    playerDao.updateOp();
                    gamePlayer.notifyPlayerData(PlayerDefine.PLAYER_NAME, roleName);
                });
            } catch (Exception e) {
                logger.error("命令:cmdToRoleName错误:{}", e.getMessage(), e);
            }

        } else {
            logger.error("命令:cmdToRoleName错误,参数roleId:{},参数roleName:{}", roleId, roleName);
        }
    }

    private void cmdTransferUnionLeader(String unionId, String newLeaderId) {
        if (!StringUtils.isEmpty(unionId) && !StringUtils.isEmpty(newLeaderId)) {
            try {
                int union = Integer.parseInt(unionId);
                int playerId = Integer.parseInt(newLeaderId);
                GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
                if (gamePlayer == null) {
                    logger.error("命令:cmdTransferUnionLeader错误,玩家{}不存在", playerId);
                    return;
                }

                gamePlayer.pushTask(() -> {
                    PlayerPublicDao playerPublicDao = gamePlayer.getPublicDao();
                    if (playerPublicDao.unionId <= 0) {
                        logger.error("命令:cmdTransferUnionLeader错误,玩家{}没有加入军团", gamePlayer.getPlayerId());
                    } else if (playerPublicDao.unionId != union) {
                        logger.error("命令:cmdTransferUnionLeader错误,玩家{}不在军团{}中", gamePlayer.getPlayerId(), union);
                    } else {
                        this.unionMgrParent.pushTask(() -> {
                            UnionMgr unionMgr = this.unionMgrParent.getUnionMgr(playerPublicDao.unionId);
                            if (unionMgr != null && unionMgr.getUnion() != null) {
                                UnionMemberDao unionMemberDao = unionMgr.getUnionMember(gamePlayer.getPlayerId());
                                if (unionMemberDao == null) {
                                    logger.error("命令:cmdTransferUnionLeader错误,玩家{}不在军团{}中", gamePlayer.getPlayerId(), union);
                                } else if (unionMemberDao.position == 1) {
                                    logger.error("命令:cmdTransferUnionLeader错误,玩家{}已是军团长", gamePlayer.getPlayerId());
                                } else {
                                    UnionMemberDao oldLeader = unionMgr.getUnionMember(unionMgr.getUnion().leaderId);
                                    if (oldLeader == null) {
                                        logger.error("命令:cmdTransferUnionLeader错误,军团长{}成员信息不存在", unionMgr.getUnion().leaderId);
                                    } else {
                                        unionMgr.changeLeader(oldLeader, unionMemberDao, false);
                                    }
                                }
                            } else {
                                logger.error("命令:cmdTransferUnionLeader错误,军团{}不存在", union);
                            }
                        });
                    }
                });
            } catch (Exception e) {
                logger.error("命令:cmdTransferUnionLeader错误:{}", e.getMessage(), e);
            }

        } else {
            logger.error("命令:cmdTransferUnionLeader错误,参数unionId:{},newLeaderId:{}", unionId, newLeaderId);
        }
    }

    private void cmdKickOutUnionMember(String roleId) {
        if (StringUtils.isEmpty(roleId)) {
            logger.error("命令:cmdKickOutUnionMember错误,参数playerId:{}", roleId);
        } else {
            try {
                int playerId = Integer.parseInt(roleId);
                GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
                if (gamePlayer == null) {
                    logger.error("命令:cmdKickOutUnionMember错误,玩家{}不存在", playerId);
                    return;
                }

                gamePlayer.pushTask(() -> {
                    PlayerPublicDao playerPublicDao = gamePlayer.getPublicDao();
                    if (playerPublicDao.unionId <= 0) {
                        logger.error("命令:cmdKickOutUnionMember错误,玩家{}没有加入军团", gamePlayer.getPlayerId());
                    } else {
                        this.unionMgrParent.pushTask(() -> {
                            UnionMgr unionMgr = this.unionMgrParent.getUnionMgr(playerPublicDao.unionId);
                            if (unionMgr != null && unionMgr.getUnion() != null) {
                                if (this.unionMgrParent.warStatus > 0 && unionMgr.warIsMatch) {
                                    logger.error("命令:cmdKickOutUnionMember错误,军团争霸期间不允许踢人");
                                } else if (unionMgr.getUnionMembers().size() <= 1) {
                                    logger.error("命令:cmdKickOutUnionMember错误,军团{}只剩下一个人", playerPublicDao.unionId);
                                } else {
                                    UnionMemberDao unionMemberDao = unionMgr.getUnionMember(gamePlayer.getPlayerId());
                                    if (unionMemberDao == null) {
                                        logger.error("命令:cmdKickOutUnionMember错误,玩家{}不在军团{}中", gamePlayer.getPlayerId(), playerPublicDao.unionId);
                                    } else {
                                        if (unionMemberDao.position == 1) {
                                            unionMgr.changeLeaderToMaxPower(gamePlayer.getPlayerId());
                                        }

                                        unionMgr.exitUnion(gamePlayer.getPlayerId());
                                    }
                                }
                            } else {
                                logger.error("命令:cmdKickOutUnionMember错误,军团{}不存在", playerPublicDao.unionId);
                            }
                        });
                    }
                });
            } catch (Exception e) {
                logger.error("命令:cmdKickOutUnionMember错误:{}", e.getMessage(), e);
            }

        }
    }

    private void cmdNotifyMainServerMergeBegin(String slaveServerList) {
        String[] array = slaveServerList.split(";");
        HashSet<Integer> slaveServerSet = new HashSet();

        for (String serverId : array) {
            slaveServerSet.add(Integer.parseInt(serverId));
        }

        this.worldMgr.pushTaskEx("mainServerMergeBegin", new Object[]{slaveServerSet});
    }

    private void cmdNotifySlaveServerMergeBegin(String mainServerId) {
        this.worldMgr.pushTaskEx("slaveServerMergeBegin", new Object[]{Integer.parseInt(mainServerId)});
    }

    private void cmdNotifyMainServerMergeFinish(String slaveServerList) {
        String[] array = slaveServerList.split(";");
        HashSet<Integer> slaveServerSet = new HashSet();

        for (String serverId : array) {
            slaveServerSet.add(Integer.parseInt(serverId));
        }

        this.worldMgr.pushTaskEx("mainServerMergeFinish", new Object[]{slaveServerSet});
    }

    public void cmdSetIsLoginLimit(String isLoginLimit) {
        AppArgs.isLoginLimit = Integer.parseInt(isLoginLimit) != 0;
    }

    public void cmdSetAvatar(String type, String roleId, String headId) {
        if (!StringUtils.isEmpty(roleId) && !StringUtils.isEmpty(headId)) {
            try {
                int playerId = Integer.parseInt(roleId);
                GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
                if (gamePlayer == null) {
                    logger.error("命令:cmdSetAvatar错误,玩家{}不存在", playerId);
                    return;
                }

                int newHeadId = Integer.parseInt(headId);
                if (newHeadId > 0) {
                    newHeadId = Integer.parseInt(headId);
                    GeneralAvatarModel generalAvatarModel = (GeneralAvatarModel) ApplicationContextProvider.getModelPoolEntity("GeneralAvatar", newHeadId);
                    if (generalAvatarModel == null) {
                        logger.error("命令:cmdSetAvatar错误,设置玩家{}头像{}不存在", playerId, newHeadId);
                        return;
                    }
                } else if (newHeadId == 0) {
                    newHeadId = gamePlayer.getPlayerDao().sex == 1 ? 1 : 2;
                } else {
                    newHeadId = Integer.parseInt(headId);
                }

                int finalNewHeadId = newHeadId;
                gamePlayer.pushTask(() -> {
                    PlayerDao playerDao = gamePlayer.getPlayerDao();
                    playerDao.head = finalNewHeadId;
                    playerDao.updateOp();
                    gamePlayer.notifyPlayerData(PlayerDefine.PLAYER_HEAD, finalNewHeadId);
                });
            } catch (Exception e) {
                logger.error("命令:cmdSetAvatar错误:{}", e.getMessage(), e);
            }

        } else {
            logger.error("命令:cmdSetAvatar错误,参数roleId:{},参数headId:{}", roleId, headId);
        }
    }

    private void cmdAddWhiteList(String account, String opType) {
        if (!StringUtils.isEmpty(account) && !StringUtils.isEmpty(opType)) {
            try {
                int op = Integer.parseInt(opType);
                Map<String, AccountWhiteListDao> allAccountWhiteList = this.getAllAccountWhiteList();
                AccountWhiteListDao accountWhiteListDao = null;
                switch (op) {
                    case 0:
                        accountWhiteListDao = (AccountWhiteListDao) allAccountWhiteList.get(account);
                        if (accountWhiteListDao == null) {
                            logger.warn("命令:cmdAddWhiteList删除不存在的白名单账号:{}", account);
                            return;
                        }

                        this.gameCachePool.deleteDao(accountWhiteListDao, false);
                        break;
                    case 1:
                        if (allAccountWhiteList.containsKey(account)) {
                            logger.warn("命令:cmdAddWhiteList新增白名单账号,已存在:{}", account);
                            return;
                        }

                        accountWhiteListDao = new AccountWhiteListDao();
                        accountWhiteListDao.account = account;
                        this.gameCachePool.insertDao(accountWhiteListDao, false);
                        break;
                    default:
                        logger.error("命令:cmdAddWhiteList错误,无效的opType:{}", opType);
                }
            } catch (Exception e) {
                logger.error("命令:cmdAddWhiteList错误:{}", e.getMessage(), e);
            }

        } else {
            logger.error("命令:cmdAddWhiteList错误,参数account:{},参数opType:{}", account, opType);
        }
    }

    private void cmdRefund(String roleId, String goldStr) {
        if (!StringUtils.isEmpty(roleId) && !StringUtils.isEmpty(goldStr)) {
            try {
                if (!this.worldMgr.country.equals("jp")) {
                    logger.error("命令:cmdRefund错误,非日本渠道");
                    return;
                }

                int playerId = Integer.parseInt(roleId);
                int goldNum = Integer.parseInt(goldStr);
                GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
                if (gamePlayer == null) {
                    logger.error("命令:cmdRefund错误,玩家{}不存在", playerId);
                    return;
                }

                gamePlayer.pushTask(() -> {
                    logger.info("后台扣除玩家 {} 元宝: 【{}】", playerId, goldNum);
                    if (gamePlayer.checkResourceNum(1, PlayerDefine.PLAYER_GOLD, goldNum)) {
                        gamePlayer.delResource(1, PlayerDefine.PLAYER_GOLD, (long) goldNum, 49, 4903, PlayerDefine.PLAYER_GOLD, 0, "");
                    } else {
                        logger.info("后台扣除玩家 {} 元宝，因元宝不足，封号14天", playerId);
                        PlayerDao playerDao = gamePlayer.getPlayerDao();
                        gamePlayer.delResource(1, PlayerDefine.PLAYER_GOLD, playerDao.gold, 49, 4903, PlayerDefine.PLAYER_GOLD, 0, "");
                        this.gmBanRole(playerId, 20160);
                    }

                });
            } catch (Exception e) {
                logger.error("命令:cmdRefund错误:{}", e.getMessage(), e);
            }

        } else {
            logger.error("命令:cmdRefund错误,参数roleId:{},goldStr:{}", roleId, goldStr);
        }
    }

    private void cmdChangeNameByRandom(String roleId) {
        if (StringUtils.isEmpty(roleId)) {
            logger.error("命令:cmdChangeNameByRandom错误,参数roleId:{}", roleId);
        } else {
            try {
                if (!this.worldMgr.country.equals("jp")) {
                    logger.error("命令:cmdChangeNameByRandom错误,非日本渠道");
                    return;
                }

                int playerId = Integer.parseInt(roleId);
                GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
                if (gamePlayer == null) {
                    logger.error("命令:cmdChangeNameByRandom错误,玩家{}不存在", playerId);
                    return;
                }

                this.worldMgr.pushTask(() -> {
                    logger.info("后台修改玩家 {} 名称", playerId);
                    String randomName = null;
                    int count = 1;

                    label36:
                    while (true) {
                        ++count;
                        if (count >= 10003) {
                            break;
                        }

                        randomName = PlayerNameModel.randomName(gamePlayer.getPublicDao().sex);
                        Set<String> nameSet = this.worldMgr.getPlayerName();
                        if (!nameSet.contains(randomName)) {
                            break;
                        }

                        if (count == 10000) {
                            int temp = 10000;
                            int suffix = 1;

                            do {
                                ++count;
                                if (count >= 20003) {
                                    break label36;
                                }

                                randomName = PlayerNameModel.randomName(gamePlayer.getPublicDao().sex);
                                randomName = this.joinRandomName(randomName, suffix);
                                if (!nameSet.contains(randomName)) {
                                    break label36;
                                }

                                if (count - temp == 100) {
                                    temp = count;
                                    ++suffix;
                                }
                            } while (count != 20000);

                            logger.error("后台修改玩家 {} 名称失败,随机名称全被使用", playerId);
                            return;
                        }
                    }

                    String finalRandomName = randomName;
                    gamePlayer.pushTask(() -> {
                        PlayerDao playerDao = gamePlayer.getPlayerDao();
                        playerDao.playerName = finalRandomName;
                        playerDao.updateOp();
                        gamePlayer.notifyPlayerData(PlayerDefine.PLAYER_NAME, playerDao.playerName);
                        Map<Integer, TreeMap<Integer, CentreAwardModel>> allAwardModelMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
                        TreeMap<Integer, CentreAwardModel> treeMap = (TreeMap) allAwardModelMap.get(CentreAwardModel.TYPE_CHANGE_NAME);
                        if (null != treeMap) {
                            CentreAwardModel awardModel = (CentreAwardModel) treeMap.firstEntry().getValue();
                            MailPart mailPart = (MailPart) gamePlayer.getMgrPart(MailPart.class);
                            int logReason = 4904;
                            mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, awardModel.getTitle(), awardModel.getDesc(), awardModel.getItems(), 604800000L, 49, logReason);
                        }

                    });
                });
            } catch (Exception e) {
                logger.error("命令:cmdChangeNameByRandom错误:{}", e.getMessage(), e);
            }

        }
    }

    private void cmdUnionNoticeModifySwitch(String unionId, String state) {
        try {
            this.unionMgrParent.pushTask(() -> {
                UnionMgr unionMgr = this.unionMgrParent.getUnionMgr(Integer.parseInt(unionId));
                if (unionMgr == null) {
                    logger.error("命令:cmdUnionNoticeModifySwitch错误,军团{}不存在", unionId);
                } else {
                    UnionDao unionDao = unionMgr.getUnion();
                    if (unionDao == null) {
                        logger.error("命令:cmdUnionNoticeModifySwitch错误,军团{}数据不存在", unionId);
                    } else {
                        unionDao.modifySwitch = Integer.parseInt(state);
                        unionDao.updateOp();
                    }
                }
            });
        } catch (Exception e) {
            logger.error("命令:cmdUnionNoticeModifySwitch错误:{}", e.getMessage(), e);
        }

    }

    private String joinRandomName(String randomName, int suffix) {
        String result = randomName + suffix;
        int l = result.length();
        if (l <= 6) {
            return result;
        } else {
            int end = randomName.length() - (l - 6);
            randomName = randomName.substring(0, end);
            return randomName + suffix;
        }
    }

    public void loadBadWordsHttpCallback(String param, String result) {
        logger.info("获取屏蔽词列表结果:{}", result);
        if (StringUtils.isEmpty(result)) {
            logger.error("获取屏蔽词出错,结果为空");
            WordsFilter.load(this.worldMgr.badWordsPath);
            NameFilter.load(this.worldMgr.getNameFilterPath());
        } else {
            JSONObject jsonObject = JSONObject.parseObject(result);
            Integer ret = jsonObject.getInteger("ret");
            if (ret != null && ret == 0) {
                logger.info("获取屏蔽词成功,刷新屏蔽词列表缓存");
                if (jsonObject.containsKey("data")) {
                    JSONArray badWordList = jsonObject.getJSONArray("data");
                    Set<String> badWords = new HashSet();

                    for (int i = 0; i < badWordList.size(); ++i) {
                        JSONArray badWord = badWordList.getJSONArray(i);
                        badWords.add(badWord.getString(0));
                    }

                    WordsFilter.insertNode(badWords);
                } else {
                    WordsFilter.load(this.worldMgr.badWordsPath);
                    NameFilter.load(this.worldMgr.getNameFilterPath());
                }
            } else {
                logger.error("获取屏蔽词出错,消息:{}", jsonObject.getString("msg"));
                WordsFilter.load(this.worldMgr.badWordsPath);
                NameFilter.load(this.worldMgr.getNameFilterPath());
            }

        }
    }

    private void addMailResources(SystemMailDao systemMailDao) {
        Map<Integer, ResourceModel> itemResourceMap = new HashMap();

        for (Field field : systemMailDao.getClass().getFields()) {
            String itemFiledName = field.getName();
            if (itemFiledName.startsWith("item")) {
                try {
                    int index = Integer.parseInt(itemFiledName.replaceAll(".*[^\\d](?=(\\d+))", ""));
                    ResourceModel resourceModel = (ResourceModel) itemResourceMap.computeIfAbsent(index, (v) -> new ResourceModel());
                    if (itemFiledName.contains("Id")) {
                        resourceModel.setId(field.getInt(systemMailDao));
                    } else if (itemFiledName.contains("Num")) {
                        resourceModel.setValue(field.getInt(systemMailDao));
                    } else if (itemFiledName.contains("Type")) {
                        resourceModel.setType(field.getInt(systemMailDao));
                    }
                } catch (IllegalAccessException e) {
                    logger.error("获取后台邮件物品出错,{}", e.getMessage(), e);
                }
            }
        }

        for (ResourceModel resourceModel : itemResourceMap.values()) {
            if (resourceModel.getId() != 0 && resourceModel.getValue() != 0 && resourceModel.getType() != 0) {
                if (resourceModel.getType() == 1) {
                    PlayerProperty playerProperty = (PlayerProperty) ApplicationContextProvider.getModelPoolEntity("playerProperty", resourceModel.getId());
                    if (playerProperty == null) {
                        logger.error("发送后台邮件,属性:{}不存在", resourceModel.getId());
                        continue;
                    }
                } else if (resourceModel.getType() == 2) {
                    ItemModel itemModel = (ItemModel) ApplicationContextProvider.getModelPoolEntity("item", resourceModel.getId());
                    if (itemModel == null) {
                        logger.error("发送后台邮件,物品:{}不存在", resourceModel.getId());
                        continue;
                    }
                } else {
                    if (resourceModel.getType() != 3) {
                        continue;
                    }

                    HeroModel heroModel = (HeroModel) ApplicationContextProvider.getModelPoolEntity("hero", resourceModel.getId());
                    if (heroModel == null) {
                        logger.error("发送后台邮件,英雄:{}不存在", resourceModel.getId());
                        continue;
                    }
                }

                resourceModel.addResourceToList(systemMailDao.resourceModels);
            }
        }

        if (systemMailDao.coin > 0) {
            ResourceModel.addResourceToList(systemMailDao.resourceModels, new ResourceModel(1, PlayerDefine.PLAYER_COPPER, systemMailDao.coin));
        }

        if (systemMailDao.gold > 0) {
            ResourceModel.addResourceToList(systemMailDao.resourceModels, new ResourceModel(1, PlayerDefine.PLAYER_GOLD, systemMailDao.gold));
        }

    }

    private void sendPersonalMail(SystemMailDao systemMailDao, GamePlayer gamePlayer) {
        gamePlayer.pushTask(() -> {
            MailPart mailPart = (MailPart) gamePlayer.getMgrPart(MailPart.class);
            mailPart.addMailOfEndTime(MailDefine.MailType.MAIL_TYPE_SYSTEM, systemMailDao.subject, systemMailDao.content, systemMailDao.resourceModels, systemMailDao.invalidTime, 49, 4901, System.currentTimeMillis(), 0);
        });
    }

    private void sendServerMail(SystemMailDao systemMailDao) {
        logger.info("添加后台全服系统邮件【邮件ID:{},标题:{},内容:{},元宝:{},铜钱:{},资源:{}】", new Object[]{systemMailDao.systemMailId, systemMailDao.subject, systemMailDao.content, systemMailDao.gold, systemMailDao.coin, systemMailDao.resourceModels});
        this.mailWorldMgr.addCommonMailExcludeMap(MailDefine.MailType.MAIL_TYPE_SYSTEM, systemMailDao.subject, systemMailDao.content, systemMailDao.resourceModels, systemMailDao.invalidTime, 49, 4901, 0);
    }

    private void recordPlayerTodayOnline() {
        int cHour = DateUtil.cHour();
        int cMinute = DateUtil.cMinute();
        int randomTime = RandomUtil.randInt(120000, 240000);
        if (cHour == 0 && cMinute == 0) {
            this.schedule((long) randomTime, this::recordPlayerTodayOnline);
        } else {
            WorldMgrPushTaskPart worldMgrPushTaskPart = (WorldMgrPushTaskPart) this.worldMgr.getMgrPart(WorldMgrPushTaskPart.class);
            worldMgrPushTaskPart.pushTaskEx("recordPlayerTodayOnline", new Object[0]);
            this.schedule((long) randomTime, this::recordPlayerTodayOnline);
        }
    }

    public void gmForbidChat(int playerId, int minute) {
        this.cmdForbidChat(String.valueOf(playerId), String.valueOf(minute));
    }

    public void gmBanRole(int playerId, int minute) {
        this.cmdBanRole(String.valueOf(playerId), String.valueOf(minute));
    }

    public void gmMergeMainBegin(String slavesStr) {
        this.cmdNotifyMainServerMergeBegin(slavesStr.replaceAll(",", ";"));
    }

    public void gmMergeSlaveBegin(String mainId) {
        this.cmdNotifySlaveServerMergeBegin(mainId);
    }

    public Map<String, AccountWhiteListDao> getAllAccountWhiteList() {
        return this.gameCachePool.getAllTableByMap("tb_account_white_list");
    }
}
