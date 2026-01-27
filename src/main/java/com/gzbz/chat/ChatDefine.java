package com.gzbz.chat;

public interface ChatDefine {
   byte CHAT_FAST_TIME = 10;
   byte CHANNEL_PERSONAL = 1;
   byte CHANNEL_WORLD = 2;
   byte CHANNEL_UNION = 3;
   byte CHANNEL_SYSTEM = 4;
   byte CHANNEL_PROVINCE = 5;
   byte CHANNEL_INTERNATIONAL = 6;
   byte CHANNEL_COUNTRY_WAR = 7;
   byte SUBCLASS_HEARSAY = 1;
   byte SUBCLASS_SYSTEM = 2;
   byte SUBCLASS_FACTION = 3;
   byte SUBCLASS_AT = 4;
   byte SUBCLASS_ROLL = 5;
   byte SUBCLASS_SHARE_HERO = 6;
   byte SUBCLASS_SHARE_BATTLE = 7;
   byte SUBCLASS_SHARE_ITEM = 8;
   byte SUBCLASS_KING_OF_CHALLENGE = 9;
   byte SUBCLASS_UNION_GATE_SHARE = 10;
   byte TYPE_SEND = 1;
   byte TYPE_RECEIVE = 2;
   byte CHAT_SEND_NUM = 20;
   String KING_OF_CHALLENGE_MAIL_ID = "kingOfChallengeMailId";
   String COMPETE_REAM = "CompeteReam";
   String COMPETE_REAM_DURATION_SEC = "CompeteReamDurationSec";
   String COMPETE_REAM_TIME = "CompeteReamTime";
   String COMPETE_REAM_OF_VIP_LV = "CompeteReamOfViplv";
   String SHARE_HERO_LIMIT = "shareHeroLimit";
}
