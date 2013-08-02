package com.feedthebeast.modjam.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.Icon;

public class ModBlock extends Block{

	public ModBlock(int id, Material material) {
		super(id, material);
	}
	
	@SideOnly(Side.CLIENT)
    public Icon getIcon(int par1, int par2) {
        return this.blockIcon;
    }
}
