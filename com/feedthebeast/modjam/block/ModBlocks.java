package com.feedthebeast.modjam.block;

import com.feedthebeast.modjam.FeedTheTrain;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModBlocks {
	
	public static BlockRail rail;
	
	public ModBlocks() {
		rail = new BlockRail(FeedTheTrain.INSTANCE.config.track);
		GameRegistry.registerBlock(rail, "FTTRail");
		LanguageRegistry.addName(rail, "Rail");
	}
}
