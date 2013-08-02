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
    	switch(par1IBlockAccess.getBlockMetadata(par2, par3, par4)) {
    	case 0:
    		//Train
    		//Center/Turn
    		this.setBlockBounds(0, 0, 0, 1, 1, 3/16);
    	case 1:
    		//Train
    		//Right hand side, Facing X
    		this.setBlockBounds(1, 0, 0, 16, 16, 3);
    	case 2:
    		//Train
    		//Right hand side, facing Z
    		this.setBlockBounds(0, 1, 0, 16, 16, 3);
    	case 3:
    		//Train
    		//Left hand side, Facing X
    		this.setBlockBounds(0, 0, 0, 15, 16, 3);
    	case 4:
    		//Train
    		//Left hand side, Facing Z
    		this.setBlockBounds(0, 0, 0, 16, 15, 3);
    	case 5:
    		//Coaster
    		//Center/Turn
    		this.setBlockBounds(0, 0, 0, 16, 16, 10);
    	case 6:
    		//Coaster
    		//Right hand side, facing X
    		this.setBlockBounds(14, 0, 0, 16, 16, 10);
    	case 7:
    		//Coaster
    		//Right hand side, facing Z
    		this.setBlockBounds(0, 14, 0, 16, 16, 10);
    	case 8:
    		//Coaster
    		//Left hand side, facing X
    		this.setBlockBounds(0, 0, 0, 2, 16, 10);
    	case 9:
    		//Coaster
    		//Left hand side, Facing Z
    		this.setBlockBounds(0, 0, 0, 16, 2, 10);
    	case 10:
    		//Coaster
    		//Center/Turn - Upside down
    		this.setBlockBounds(0, 0, 6, 16, 16, 16);
    	case 11:
    		//Coaster
    		//Right hand side, facing X - Upside down
    		this.setBlockBounds(14, 0, 6, 16, 16, 16);
    	case 12:
    		//Coaster
    		//Right hand side, facing Z - Upside down
    		this.setBlockBounds(0, 14, 6, 16, 16, 16);
    	case 13:
    		//Coaster
    		//Left hand side, facing X - Upside down
    		this.setBlockBounds(0, 0, 6, 2, 16, 16);
    	case 14:
    		//Coaster
    		//Left hand side, Facing Z - Upside down
    		this.setBlockBounds(0, 0, 6, 16, 2, 16);
    	case 15:
    		//Coaster
    		//Other
    		this.setBlockBounds(0, 0, 0, 16, 16, 16);
    	}
    }
}
