package com.feedthebeast.modjam.block;

import java.util.List;

import com.feedthebeast.modjam.entity.TestEntity;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
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
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {
    	TestEntity e = new TestEntity(world);
		e.setPositionAndUpdate(x + 1.5F, y + 2, z - 8 + 1.5F);
		if(!world.isRemote) {
			world.spawnEntityInWorld(e);
		}
    	return true;
	}

    @Override
    public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4) {
    	
    	System.out.println("is this even getting called?...");
    	System.out.println("Yes, of course it is ... " + par1IBlockAccess.getBlockMetadata(par2, par3, par4));
    	
    	switch(par1IBlockAccess.getBlockMetadata(par2, par3, par4)) {
    	case 0:
    		//Train
    		//Center/Turn
    		this.setBlockBounds(0, 0, 0, 1, 0.1875F, 1);
    		break;
    	case 1:
    		//Train
    		//Right hand side, Facing X
    		this.setBlockBounds(0.0625F, 0, 0, 1, 0.1875F, 1);
    		break;
    	case 2:
    		//Train
    		//Right hand side, facing Z
    		this.setBlockBounds(0, 0, 0.0625F, 1, 0.1875F, 1);
    		break;
    	case 3:
    		//Train
    		//Left hand side, Facing X
    		this.setBlockBounds(0, 0, 0, 0.9375F, 0.1875F, 1);
    		break;
    	case 4:
    		//Train
    		//Left hand side, Facing Z
    		this.setBlockBounds(0, 0, 0, 1, 0.1875F, 0.9375F);
    		break;
    	case 5:
    		//Coaster
    		//Center/Turn
    		this.setBlockBounds(0, 0, 0, 16, 16, 10);
    		break;
    	case 6:
    		//Coaster
    		//Right hand side, facing X
    		this.setBlockBounds(14, 0, 0, 16, 16, 10);
    		break;
    	case 7:
    		//Coaster
    		//Right hand side, facing Z
    		this.setBlockBounds(0, 14, 0, 16, 16, 10);
    		break;
    	case 8:
    		//Coaster
    		//Left hand side, facing X
    		this.setBlockBounds(0, 0, 0, 2, 16, 10);
    		break;
    	case 9:
    		//Coaster
    		//Left hand side, Facing Z
    		this.setBlockBounds(0, 0, 0, 16, 2, 10);
    		break;
    	case 10:
    		//Coaster
    		//Center/Turn - Upside down
    		this.setBlockBounds(0, 0, 6, 16, 16, 16);
    		break;
    	case 11:
    		//Coaster
    		//Right hand side, facing X - Upside down
    		this.setBlockBounds(14, 0, 6, 16, 16, 16);
    		break;
    	case 12:
    		//Coaster
    		//Right hand side, facing Z - Upside down
    		this.setBlockBounds(0, 14, 6, 16, 16, 16);
    		break;
    	case 13:
    		//Coaster
    		//Left hand side, facing X - Upside down
    		this.setBlockBounds(0, 0, 6, 2, 16, 16);
    		break;
    	case 14:
    		//Coaster
    		//Left hand side, Facing Z - Upside down
    		this.setBlockBounds(0, 0, 6, 16, 2, 16);
    		break;
    	case 15:
    		//Coaster
    		//Other
    		this.setBlockBounds(0, 0, 0, 16, 16, 16);
    		break;
    	}
    }
    

    @Override
    public void addCollisionBoxesToList(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity) {
        this.setBlockBoundsBasedOnState(par1World, par2, par3, par4);
        super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
    }
}
