package com.feedthebeast.modjam.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.world.World;

public class ModEntities {
	static int startEntityId = 400;
	
	TestEntity npc1;
	
	public ModEntities() {
	}
	
	public static int getUniqueEntityId() {
		do {
			startEntityId++;
		} while(EntityList.getStringFromID(startEntityId) != null);
		
		return startEntityId;
	}
	
	public static void registerEntityEgg(Class <? extends Entity> entity, int primaryColor, int secondaryColor) {
		int id = getUniqueEntityId();
		EntityList.IDtoClassMapping.put(id, entity);
		EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor, secondaryColor));
	}
}
