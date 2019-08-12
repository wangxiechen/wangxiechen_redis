/**  
 *
 * @Title: RedisHashJSON.java
 * @Description: TODO
 * @author: wangxiechen
 * @date: 2019年8月12日 上午9:08:24
 * @version: V1.0  
 */
package com.wangxiechen.redis.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wangxiechen.redis.domain.User;
import com.wangxiechen.redis.utils.RandomUitl;
import com.wangxiechen.redis.utils.StringUtil;

/**
 * @ClassName: RedisHashJSON
 * @Description: TODO
 * @author: wangxiechen 
 * @date: 2019年8月12日 上午9:08:24
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-beans2.xml")
public class RedisHashJSON {
	@Resource
	private RedisTemplate<String, Serializable> redis;
	
	@Test
	public void redis_hashjson() {
		//new 一个list对象
		List<User> users = new ArrayList<>();
		//十万个user随机对象
		for (int i = 1; i <= 100000; i++) {
			//随机条件
			users.add(new User(i,StringUtil.randomChineseString()+StringUtil.randomChineseString(2),"女"+"男"+RandomUitl.randomString(1),"13"+RandomUitl.randomString(9),
					  RandomUitl.randomString(20),RandomUitl.random(18, 70)));
		}
		//开始的时间
		long start = System.currentTimeMillis();
		//for each循环
		for (User user : users) {
			redis.opsForHash().put("user_jdk", "user_id", user);
		}
		//结束的时间
		long stop = System.currentTimeMillis();
		System.out.println("hash_json需要的时间是:"+(stop-start));//11934
	}
}
