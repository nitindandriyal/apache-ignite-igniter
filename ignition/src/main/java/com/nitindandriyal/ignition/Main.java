package com.nitindandriyal.ignition;

import org.apache.ignite.Ignite;
import org.apache.ignite.Ignition;
import org.apache.ignite.configuration.CacheConfiguration;

public class Main{
	public static void main(String[] a){
		try(Ignite ignite = Ignition.start()){
			ignite.getOrCreateCache(new CacheConfiguration<Integer, String>("myCache"));
			
		}
	}
}