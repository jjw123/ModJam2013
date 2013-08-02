package com.feedthebeast.modjam.entity;

import com.feedthebeast.modjam.FeedTheTrain;

import cpw.mods.fml.common.registry.EntityRegistry;
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
	
	public static void registerEntity(Class <? extends Entity> entity, String entityName, FeedTheTrain mod, int primaryColor, int secondaryColor) {
		int id = getUniqueEntityId();
		
		EntityRegistry.registerModEntity(entity, entityName, id, mod, 80, 3, true);
		
		EntityList.IDtoClassMapping.put(id, entity);
		EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor, secondaryColor));
	}
}
