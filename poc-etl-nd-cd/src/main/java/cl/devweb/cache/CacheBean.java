package cl.devweb.cache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//TODO: we should (must?) use: org.springframework.cache.concurrent.ConcurrentCacheFactoryBean

public class CacheBean {

	private Map<Object, Object> customCache;

	public void initialize() {
		this.customCache = new ConcurrentHashMap();
	}

	public Map<Object, Object> getCustomCache() {
		return customCache;
	}

	public void setCustomCache(Map<Object, Object> customCache) {
		this.customCache = customCache;
	}

}
