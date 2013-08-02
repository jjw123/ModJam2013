package com.feedthebeast.modjam.util;

import java.io.File;

import net.minecraftforge.common.Configuration;

public class Config {

	Configuration config;
	
	public int track;
	public int trackItem;
	
	public Config(File file) {
		config = new Configuration(file);
	}
	
	public void loadConfig() {
		config.load();
		track = config.getBlock("track", 3200).getInt();
		trackItem = config.getItem("trackItem", 9001 /* :D */).getInt();
		config.save();
	}
}
