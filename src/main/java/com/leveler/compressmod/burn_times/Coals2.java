package com.leveler.compressmod.burn_times;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Coals2 extends BlockItem {

    public Coals2(Block blockIn, Item.Properties builder) {
        super(blockIn, builder);
        // TODO Auto-generated constructor stub
    }

    @Override
    public int getBurnTime(ItemStack itemStack) {
        return 160000;
    }
}