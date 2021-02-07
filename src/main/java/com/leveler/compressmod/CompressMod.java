package com.leveler.compressmod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.world.GrassColors;
import net.minecraft.world.biome.BiomeColors;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
@Mod(CompressMod.MOD_ID)

public class CompressMod {

    public static final String MOD_ID = "compressmod";
    public static final ItemGroup COMPRESSED_BLOCKS = new CreativeTab();

    public CompressMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        Blocks.register(modEventBus);
        Items.register(modEventBus);
    }

    @EventBusSubscriber(modid = CompressMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class registerColors {
        @SubscribeEvent
        public static void registerBlockColor(ColorHandlerEvent.Block event) {
            BlockColors blockColors = event.getBlockColors();
    
            blockColors.register((state, worldIn, pos, i) -> worldIn != null && pos != null ? BiomeColors.getGrassColor(worldIn, pos) : 0x5E9D34, Blocks.COMPRESSED_GRASS1.get(), Blocks.COMPRESSED_GRASS2.get(), Blocks.COMPRESSED_GRASS3.get(), Blocks.COMPRESSED_GRASS4.get(), Blocks.COMPRESSED_GRASS5.get());
        }
    
        @SubscribeEvent
        public static void registerItemColor(ColorHandlerEvent.Item event) {
            ItemColors itemColors = event.getItemColors();
            BlockColors blockColors = event.getBlockColors();
    
            itemColors.register((stack, i) -> {
                BlockState state = ((BlockItem) stack.getItem()).getBlock().getDefaultState();
                return blockColors.getColor(state, null, null, i);
            },Items.COMPRESSED_GRASS1.get(), Items.COMPRESSED_GRASS2.get(), Items.COMPRESSED_GRASS3.get(), Items.COMPRESSED_GRASS4.get(), Items.COMPRESSED_GRASS5.get());
        }
    }
}