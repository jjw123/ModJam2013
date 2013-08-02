package com.feedthebeast.modjam.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemRail extends ModItem {

	public ItemRail(int id) {
		super(id);
	}
	
	@Override
	public boolean onItemUse(ItemStack itemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
        return false;
    }
}
