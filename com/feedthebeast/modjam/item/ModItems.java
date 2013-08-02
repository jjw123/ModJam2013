package com.feedthebeast.modjam.item;

import com.feedthebeast.modjam.FeedTheTrain;

public class ModItems {
	
	public static ItemRail trackItem;
	
	public ModItems() {
		trackItem = new ItemRail(FeedTheTrain.INSTANCE.config.trackItem);
	}
}
