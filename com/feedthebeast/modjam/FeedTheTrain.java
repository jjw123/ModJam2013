package com.feedthebeast.modjam;

import com.feedthebeast.modjam.block.ModBlocks;
import com.feedthebeast.modjam.entity.ModEntities;
import com.feedthebeast.modjam.item.ModItems;
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
	ModBlocks blocks;
	ModItems items;
	ModEntities entities;
	
	public Config config;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		config = new Config(event.getSuggestedConfigurationFile());
		config.loadConfig();
		
		blocks = new ModBlocks();
		items = new ModItems();
		entities = new ModEntities();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
//		EntityRegistry.registerModEntity(entityClass, entityName, id, mod, trackingRange, updateFrequency, sendsVelocityUpdates);
//		entities.registerEntityEgg(entity, primaryColor, secondaryColor);
	}
}
