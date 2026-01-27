package com.gzbz.redis;

import javax.annotation.PostConstruct;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import redis.RedissonTool;

@Component
public class GameRedisTool extends RedissonTool {
   @Value("${redisUrl}")
   private String url;
   @Value("${ServerId}")
   public int GAME_SERVER_ID;
   @Value("${ServerName}")
   public String GAME_SERVER_NAME;
   @Value("${PlatformId}")
   public int PLATFORM_ID;
   @Value("${PlatformName}")
   public String PLATFORM_NAME;
   private RedissonClient client;

   @PostConstruct
   public void init() {
      this.client = this.connect(this.url);
   }

   public RedissonClient getClient() {
      return this.client;
   }
}
