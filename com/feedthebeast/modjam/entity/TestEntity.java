package com.feedthebeast.modjam.entity;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class TestEntity extends EntityLiving {

	public TestEntity(World par1World) {
		super(par1World);
		this.setSize(1.4F, 1.6F);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
	}

	public int getMaxHealth() {
		return 20;
	}
}
