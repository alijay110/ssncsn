package com.pearson.sam.sessioncaching;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;

import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by Java Developer Zone on 13-11-2017.
 */
//@Configuration
//@EnableRedisHttpSession
public class HttpSessionConfig2 extends AbstractHttpSessionApplicationInitializer {

	@Value("${redis.hostName}")
	private String hostName;

	@Value("${redis.port}")
	private int port;

	@Value("${redis.password}")
	private String password;

	@Value("${redis.timeout}")
	private int timeout;
//
//    @Bean
//    public JedisConnectionFactory jedisConnectionFactory() {
//        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
//        jedisConnectionFactory.setHostName("127.0.0.1");
//        jedisConnectionFactory.setPort(6379);
//        jedisConnectionFactory.afterPropertiesSet();
//        return jedisConnectionFactory;
//    }
//    
//	@Bean
//	public JedisConnectionFactory jedisConnectionFactory(JedisPoolConfig jedisPoolConfig) {
//		JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
//		jedisConnectionFactory.setHostName(hostName);
//		jedisConnectionFactory.setPort(port);
//		jedisConnectionFactory.setPassword(password);
//		jedisConnectionFactory.setUsePool(true);
//		jedisConnectionFactory.setPoolConfig(jedisPoolConfig);
//		jedisConnectionFactory.setTimeout(timeout);
//		return jedisConnectionFactory;
//	}
//
//	@Bean
//	public JedisPoolConfig jedisPoolConfig() {
//		JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
//		jedisPoolConfig.setMaxTotal(30);
//		jedisPoolConfig.setMaxIdle(10);
//		jedisPoolConfig.setNumTestsPerEvictionRun(1024);
//		jedisPoolConfig.setTimeBetweenEvictionRunsMillis(30000);
//		jedisPoolConfig.setMinEvictableIdleTimeMillis(1800000);
//		jedisPoolConfig.setSoftMinEvictableIdleTimeMillis(10000);
//		jedisPoolConfig.setMaxWaitMillis(1500);
//		jedisPoolConfig.setTestOnBorrow(true);
//		jedisPoolConfig.setTestWhileIdle(true);
//		jedisPoolConfig.setBlockWhenExhausted(false);
//		return jedisPoolConfig;
//	}
//
//	 @Bean
//	    public RedisTemplate<String, Object> redisTemplate(JedisConnectionFactory redisConnectionFactory) {
//	        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<String, Object>();
//	        redisTemplate.setConnectionFactory(jedisConnectionFactory());
//	        redisTemplate.setKeySerializer(new StringRedisSerializer());
//	        redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
//	        redisTemplate.afterPropertiesSet();
//	        return redisTemplate;
//	    }
	 
//	@Bean
//	public JedisConnectionFactory connectionFactory1() { // It will create filter for Redis store which will override
//															// default Tomcat Session
//		return new JedisConnectionFactory();
//	}
}