package com.feedthebeast.modjam.renderer;

import org.lwjgl.opengl.GL11;

import com.feedthebeast.modjam.entity.TestEntity;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderTest extends RenderLiving {
	private static final ResourceLocation field_110887_f = new ResourceLocation("textures/entity/pig/pig.png");

    /** Scale of the model to use */
    private float scale;

    public RenderTest(ModelBase par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
        this.scale = 1F;
    }

    /**
     * Applies the scale to the transform matrix
     */
    protected void preRenderScale(TestEntity e, float f) {
        GL11.glScalef(this.scale, this.scale, this.scale);
    }

    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void preRenderCallback(EntityLiving par1EntityLiving, float par2) {
        this.preRenderScale((TestEntity)par1EntityLiving, par2);
    }

	@Override
	protected ResourceLocation func_110775_a(Entity entity) {
		return field_110887_f;
	}

}
