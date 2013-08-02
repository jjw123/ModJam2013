package com.feedthebeast.modjam;

import com.feedthebeast.modjam.util.Config;
import com.feedthebeast.modjam.util.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID)
public class FeedTheTrain {

	@Instance
	public static FeedTheTrain INSTANCE;
	
	public Config config;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		config = new Config(event.getSuggestedConfigurationFile());
		config.loadConfig();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
}
