package com.masiv.test.repository;
import java.util.List;
import java.util.Map;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.masiv.test.model.Roulette;
@Repository
public class RouletteRepository {
	public static final String key= "roulette";
	private HashOperations hashOperations;
	private RedisTemplate redisTemplate;
	public RouletteRepository(RedisTemplate redisTemplate) {
		this.redisTemplate=redisTemplate;
		this.hashOperations=this.redisTemplate.opsForHash();
	}
	public void save(Roulette roulette) {
		hashOperations.put(key,roulette.getId(),roulette.getNumber());
	}
	public List findAll() {
		
		return hashOperations.values(key);
	}
	public void close(Roulette roulette) {
		save(roulette);
	}
	public void update(String id) {
		hashOperations.delete(key,id);
	}
	public Roulette findById(String id) {
		
		return (Roulette) hashOperations.get(key, id);
	}
	
}
