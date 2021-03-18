package com.leveler.compressmod.burn_times;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class LavaItem extends Item {

    public LavaItem(Properties properties) {
        super(properties);
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public int getBurnTime(ItemStack itemStack) {
        return 20000;
    }  
}
