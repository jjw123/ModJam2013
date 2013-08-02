package com.feedthebeast.modjam.item;

import com.feedthebeast.modjam.block.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatMessageComponent;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class ItemRail extends ModItem {

	public ItemRail(int id) {
		super(id);
	}
	
	@Override
	public boolean onItemUse(ItemStack itemStack, EntityPlayer entityPlayer, World world, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
		++par5;

        if (entityPlayer.canPlayerEdit(par4, par5, par6, par7, itemStack) && entityPlayer.canPlayerEdit(par4, par5 + 1, par6, par7, itemStack)) {
        	int i1 = MathHelper.floor_double((double)((entityPlayer.rotationYaw + 180.0F) * 4.0F / 360.0F) - 0.5D) & 3;
        	
        	entityPlayer.sendChatToPlayer(ChatMessageComponent.func_111066_d("i1 = " + i1));
        	
        	switch(i1) {
        	case 0:
        		world.setBlock(par4, par5, par6 - 1, ModBlocks.rail.blockID, 2, 2);
        		world.setBlock(par4, par5, par6, ModBlocks.rail.blockID, 0, 2);
        		world.setBlock(par4, par5, par6 + 1, ModBlocks.rail.blockID, 4, 2);
        		break;
        	case 1:
        		world.setBlock(par4 - 1, par5, par6, ModBlocks.rail.blockID, 1, 2);
        		world.setBlock(par4, par5, par6, ModBlocks.rail.blockID, 0, 2);
        		world.setBlock(par4 + 1, par5, par6, ModBlocks.rail.blockID, 3, 2);
        		break;
        	case 2:
        		world.setBlock(par4, par5, par6 - 1, ModBlocks.rail.blockID, 2, 2);
        		world.setBlock(par4, par5, par6, ModBlocks.rail.blockID, 0, 2);
        		world.setBlock(par4, par5, par6 + 1, ModBlocks.rail.blockID, 4, 2);        		break;
        	case 3:
        		world.setBlock(par4 - 1, par5, par6, ModBlocks.rail.blockID, 1, 2);
        		world.setBlock(par4, par5, par6, ModBlocks.rail.blockID, 0, 2);
        		world.setBlock(par4 + 1, par5, par6, ModBlocks.rail.blockID, 3, 2);
        		break;
        	}
        	
        	--itemStack.stackSize;
        	return true;
        } else {
            return false;
        }
    }
}
