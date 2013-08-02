package com.feedthebeast.modjam.proxy;

import com.feedthebeast.modjam.entity.TestEntity;
import com.feedthebeast.modjam.renderer.RenderTest;

import net.minecraft.client.model.ModelPig;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
	public void init() {
		
	}
//	
//	@Override
//	public void registerRenders() {
//		System.out.println("registering renders!");
//		RenderingRegistry.registerEntityRenderingHandler(TestEntity.class, new RenderTest(new ModelPig(), 0.3F));
//	}
}
