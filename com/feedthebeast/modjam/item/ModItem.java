package com.feedthebeast.modjam.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ModItem extends Item {
	public ModItem(int par) {
		super(par);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister parIconRegister) {
//		itemIcon = 
	}
}
