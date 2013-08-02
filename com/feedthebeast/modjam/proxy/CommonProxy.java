package com.feedthebeast.modjam.proxy;

import net.minecraft.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import cpw.mods.fml.common.FMLCommonHandler;


public class CommonProxy {
	
	public Entity getEntityByID(World worldObj, int id) {
		if (worldObj instanceof WorldServer) {
			return ((WorldServer)worldObj).getEntityByID(id);
		}
		return null;
	}
	
	public MinecraftServer getMCServer() {
		return FMLCommonHandler.instance().getMinecraftServerInstance();
	}
	
	public void preinit()
	{
	}
	
	public void init()
	{
	}
	
	public void postinit()
	{
	}
}
