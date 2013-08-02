package com.feedthebeast.modjam.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockRail extends ModBlock {

	public BlockRail(int id) {
		super(id, Material.iron);
	}

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4) {
    	
    	//Do meta stuff here in future, for microblock support :D
    	
    	this.setBlockBounds(0, 0, 0, 16, 16, 3);
    }
}
