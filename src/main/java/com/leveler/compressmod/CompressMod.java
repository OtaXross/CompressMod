package com.leveler.compressmod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
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
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
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
    public static class ClientEventBusSubscriber {
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

        @SubscribeEvent
        public static void onClientSetupEvent(FMLClientSetupEvent event) {
            RenderTypeLookup.setRenderLayer(Blocks.COMPRESSED_FLINT1.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(Blocks.COMPRESSED_FLINT2.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(Blocks.COMPRESSED_FLINT3.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(Blocks.COMPRESSED_FLINT4.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(Blocks.COMPRESSED_FLINT5.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(Blocks.COMPRESSED_SEEDS1.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(Blocks.COMPRESSED_SEEDS2.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(Blocks.COMPRESSED_SEEDS3.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(Blocks.COMPRESSED_SEEDS4.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(Blocks.COMPRESSED_SEEDS5.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(Blocks.COMPRESSED_SUGAR_CANE1.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(Blocks.COMPRESSED_SUGAR_CANE2.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(Blocks.COMPRESSED_SUGAR_CANE3.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(Blocks.COMPRESSED_SUGAR_CANE4.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(Blocks.COMPRESSED_SUGAR_CANE5.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(Blocks.COMPRESSED_ZOMBEEF1.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(Blocks.COMPRESSED_ZOMBEEF2.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(Blocks.COMPRESSED_ZOMBEEF3.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(Blocks.COMPRESSED_ZOMBEEF4.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(Blocks.COMPRESSED_ZOMBEEF5.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(Blocks.COMPRESSED_POTATO1.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(Blocks.COMPRESSED_POTATO2.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(Blocks.COMPRESSED_POTATO3.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(Blocks.COMPRESSED_POTATO4.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(Blocks.COMPRESSED_POTATO5.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(Blocks.COMPRESSED_BAKED_POTATO1.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(Blocks.COMPRESSED_BAKED_POTATO2.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(Blocks.COMPRESSED_BAKED_POTATO3.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(Blocks.COMPRESSED_BAKED_POTATO4.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(Blocks.COMPRESSED_BAKED_POTATO5.get(), RenderType.getTranslucent());
          }
    }
}