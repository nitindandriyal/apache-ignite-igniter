package com.nitindandriyal.ignition;

import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCache;
import org.apache.ignite.Ignition;
import org.apache.ignite.configuration.CacheConfiguration;

public class Main{
	public static void main(String[] a){
		try(Ignite ignite = Ignition.start()){
			CacheConfiguration<Integer, String> config = new CacheConfiguration<>("testCache");
			IgniteCache<Integer, String> cache = ignite.getOrCreateCache(config);
			cache.put(1234, "Test Data 1234");
			cache.put(1235, "Test Data 1235");
			cache.put(1236, "Test Data 1236");
			cache.put(1237, "Test Data 1237");
			cache.put(1238, "Test Data 1238");
			
			cache.forEach(i -> System.out.println(i));
		}
	}
}