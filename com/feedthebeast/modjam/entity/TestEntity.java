package com.feedthebeast.modjam.entity;

import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class TestEntity extends EntityMob {

	public TestEntity(World par1World) {
		super(par1World);
		
	}

	public int getMaxHealth() {
		return 20;
	}
}
