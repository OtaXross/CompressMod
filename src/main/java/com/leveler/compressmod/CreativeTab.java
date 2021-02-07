package com.leveler.compressmod;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class CreativeTab extends ItemGroup {

    public CreativeTab() {
        super("compressed_blocks");
        // TODO Auto-generated method stub
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(Items.COMPRESSED_DIRT1.get());
    }
}
