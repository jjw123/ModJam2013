package com.feedthebeast.modjam.renderer;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderTest extends RenderLiving {
	private static final ResourceLocation field_110887_f = new ResourceLocation("textures/entity/pig/pig.png");
	
	public RenderTest(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
	}

	@Override
	protected ResourceLocation func_110775_a(Entity entity) {
		return field_110887_f;
	}

}
