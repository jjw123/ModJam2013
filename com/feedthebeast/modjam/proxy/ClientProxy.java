package com.feedthebeast.modjam.proxy;

import java.util.logging.Level;

import net.minecraft.client.model.ModelPig;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;

import com.feedthebeast.modjam.entity.TestEntity;
import com.feedthebeast.modjam.renderer.RenderTest;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {
	
	@Override
	public void init() {
		registerEntityRenderers();
	}
	
	private void registerEntityRenderers() {
		FMLCommonHandler.instance().getFMLLogger().log(Level.INFO, "Adding Entity Renderers");
		
		Render render = new RenderTest(new ModelPig(), 0F);
		render.setRenderManager(RenderManager.instance);
		RenderingRegistry.registerEntityRenderingHandler(TestEntity.class, render);
	}
}
