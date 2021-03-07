package com.leveler.compressmod;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import com.leveler.compressmod.burn_times.CCBBT;
import com.leveler.compressmod.burn_times.LavaBucket;
import com.leveler.compressmod.burn_times.Logs1;
import com.leveler.compressmod.burn_times.Logs2;
import com.leveler.compressmod.burn_times.Logs3;
import com.leveler.compressmod.burn_times.Logs4;
import com.leveler.compressmod.burn_times.Logs5;
import com.leveler.compressmod.burn_times.Planks1;
import com.leveler.compressmod.burn_times.Planks2;
import com.leveler.compressmod.burn_times.Planks3;
import com.leveler.compressmod.burn_times.Planks4;
import com.leveler.compressmod.burn_times.Planks5;
import com.leveler.compressmod.burn_times.Coals1;
import com.leveler.compressmod.burn_times.Coals2;
import com.leveler.compressmod.burn_times.Coals3;
import com.leveler.compressmod.burn_times.Coals4;
import com.leveler.compressmod.burn_times.Coals5;


public class Items extends CompressMod {
        private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
        // 木炭ブロック追加
        public static final RegistryObject<Item> CCBBT = ITEMS.register("charcoal_block",() -> new CCBBT(Blocks.CHARCOAL_BLOCK.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));

        // 焼石
        public static final RegistryObject<Item> COMPRESSED_STONE1 = ITEMS.register("compressed_stone1", () -> new BlockItem(Blocks.COMPRESSED_STONE1.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_STONE2 = ITEMS.register("compressed_stone2", () -> new BlockItem(Blocks.COMPRESSED_STONE2.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_STONE3 = ITEMS.register("compressed_stone3", () -> new BlockItem(Blocks.COMPRESSED_STONE3.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_STONE4 = ITEMS.register("compressed_stone4", () -> new BlockItem(Blocks.COMPRESSED_STONE4.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_STONE5 = ITEMS.register("compressed_stone5", () -> new BlockItem(Blocks.COMPRESSED_STONE5.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_GRANITE1 = ITEMS.register("compressed_granite1", () -> new BlockItem(Blocks.COMPRESSED_GRANITE1.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_GRANITE2 = ITEMS.register("compressed_granite2", () -> new BlockItem(Blocks.COMPRESSED_GRANITE2.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_GRANITE3 = ITEMS.register("compressed_granite3", () -> new BlockItem(Blocks.COMPRESSED_GRANITE3.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_GRANITE4 = ITEMS.register("compressed_granite4", () -> new BlockItem(Blocks.COMPRESSED_GRANITE4.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_GRANITE5 = ITEMS.register("compressed_granite5", () -> new BlockItem(Blocks.COMPRESSED_GRANITE5.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_DIORITE1 = ITEMS.register("compressed_diorite1", () -> new BlockItem(Blocks.COMPRESSED_DIORITE1.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_DIORITE2 = ITEMS.register("compressed_diorite2", () -> new BlockItem(Blocks.COMPRESSED_DIORITE2.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_DIORITE3 = ITEMS.register("compressed_diorite3", () -> new BlockItem(Blocks.COMPRESSED_DIORITE3.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_DIORITE4 = ITEMS.register("compressed_diorite4", () -> new BlockItem(Blocks.COMPRESSED_DIORITE4.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_DIORITE5 = ITEMS.register("compressed_diorite5", () -> new BlockItem(Blocks.COMPRESSED_DIORITE5.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_ANDESITE1 = ITEMS.register("compressed_andesite1", () -> new BlockItem(Blocks.COMPRESSED_ANDESITE1.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_ANDESITE2 = ITEMS.register("compressed_andesite2", () -> new BlockItem(Blocks.COMPRESSED_ANDESITE2.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_ANDESITE3 = ITEMS.register("compressed_andesite3", () -> new BlockItem(Blocks.COMPRESSED_ANDESITE3.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_ANDESITE4 = ITEMS.register("compressed_andesite4", () -> new BlockItem(Blocks.COMPRESSED_ANDESITE4.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_ANDESITE5 = ITEMS.register("compressed_andesite5", () -> new BlockItem(Blocks.COMPRESSED_ANDESITE5.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_GRASS1 = ITEMS.register("compressed_grass1", () -> new BlockItem(Blocks.COMPRESSED_GRASS1.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_GRASS2 = ITEMS.register("compressed_grass2", () -> new BlockItem(Blocks.COMPRESSED_GRASS2.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_GRASS3 = ITEMS.register("compressed_grass3", () -> new BlockItem(Blocks.COMPRESSED_GRASS3.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_GRASS4 = ITEMS.register("compressed_grass4", () -> new BlockItem(Blocks.COMPRESSED_GRASS4.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_GRASS5 = ITEMS.register("compressed_grass5", () -> new BlockItem(Blocks.COMPRESSED_GRASS5.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_DIRT1 = ITEMS.register("compressed_dirt1", () -> new BlockItem(Blocks.COMPRESSED_DIRT1.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_DIRT2 = ITEMS.register("compressed_dirt2", () -> new BlockItem(Blocks.COMPRESSED_DIRT2.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_DIRT3 = ITEMS.register("compressed_dirt3", () -> new BlockItem(Blocks.COMPRESSED_DIRT3.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_DIRT4 = ITEMS.register("compressed_dirt4", () -> new BlockItem(Blocks.COMPRESSED_DIRT4.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_DIRT5 = ITEMS.register("compressed_dirt5", () -> new BlockItem(Blocks.COMPRESSED_DIRT5.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_COBBLESTONE1 = ITEMS.register("compressed_cobblestone1", () -> new BlockItem(Blocks.COMPRESSED_COBBLESTONE1.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_COBBLESTONE2 = ITEMS.register("compressed_cobblestone2", () -> new BlockItem(Blocks.COMPRESSED_COBBLESTONE2.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_COBBLESTONE3 = ITEMS.register("compressed_cobblestone3", () -> new BlockItem(Blocks.COMPRESSED_COBBLESTONE3.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_COBBLESTONE4 = ITEMS.register("compressed_cobblestone4", () -> new BlockItem(Blocks.COMPRESSED_COBBLESTONE4.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_COBBLESTONE5 = ITEMS.register("compressed_cobblestone5", () -> new BlockItem(Blocks.COMPRESSED_COBBLESTONE5.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_OAK_PLANKS1 = ITEMS.register("compressed_oak_planks1", () -> new Planks1(Blocks.COMPRESSED_OAK_PLANKS1.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_OAK_PLANKS2 = ITEMS.register("compressed_oak_planks2", () -> new Planks2(Blocks.COMPRESSED_OAK_PLANKS2.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_OAK_PLANKS3 = ITEMS.register("compressed_oak_planks3", () -> new Planks3(Blocks.COMPRESSED_OAK_PLANKS3.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_OAK_PLANKS4 = ITEMS.register("compressed_oak_planks4", () -> new Planks4(Blocks.COMPRESSED_OAK_PLANKS4.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_OAK_PLANKS5 = ITEMS.register("compressed_oak_planks5", () -> new Planks5(Blocks.COMPRESSED_OAK_PLANKS5.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_SPRUCE_PLANKS1 = ITEMS.register("compressed_spruce_planks1", () -> new Planks1(Blocks.COMPRESSED_SPRUCE_PLANKS1.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_SPRUCE_PLANKS2 = ITEMS.register("compressed_spruce_planks2", () -> new Planks2(Blocks.COMPRESSED_SPRUCE_PLANKS2.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_SPRUCE_PLANKS3 = ITEMS.register("compressed_spruce_planks3", () -> new Planks3(Blocks.COMPRESSED_SPRUCE_PLANKS3.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_SPRUCE_PLANKS4 = ITEMS.register("compressed_spruce_planks4", () -> new Planks4(Blocks.COMPRESSED_SPRUCE_PLANKS4.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_SPRUCE_PLANKS5 = ITEMS.register("compressed_spruce_planks5", () -> new Planks5(Blocks.COMPRESSED_SPRUCE_PLANKS5.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_BIRCH_PLANKS1 = ITEMS.register("compressed_birch_planks1", () -> new Planks1(Blocks.COMPRESSED_BIRCH_PLANKS1.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_BIRCH_PLANKS2 = ITEMS.register("compressed_birch_planks2", () -> new Planks2(Blocks.COMPRESSED_BIRCH_PLANKS2.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_BIRCH_PLANKS3 = ITEMS.register("compressed_birch_planks3", () -> new Planks3(Blocks.COMPRESSED_BIRCH_PLANKS3.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_BIRCH_PLANKS4 = ITEMS.register("compressed_birch_planks4", () -> new Planks4(Blocks.COMPRESSED_BIRCH_PLANKS4.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_BIRCH_PLANKS5 = ITEMS.register("compressed_birch_planks5", () -> new Planks5(Blocks.COMPRESSED_BIRCH_PLANKS5.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_JUNGLE_PLANKS1 = ITEMS.register("compressed_jungle_planks1", () -> new Planks1(Blocks.COMPRESSED_JUNGLE_PLANKS1.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_JUNGLE_PLANKS2 = ITEMS.register("compressed_jungle_planks2", () -> new Planks2(Blocks.COMPRESSED_JUNGLE_PLANKS2.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_JUNGLE_PLANKS3 = ITEMS.register("compressed_jungle_planks3", () -> new Planks3(Blocks.COMPRESSED_JUNGLE_PLANKS3.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_JUNGLE_PLANKS4 = ITEMS.register("compressed_jungle_planks4", () -> new Planks4(Blocks.COMPRESSED_JUNGLE_PLANKS4.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_JUNGLE_PLANKS5 = ITEMS.register("compressed_jungle_planks5", () -> new Planks5(Blocks.COMPRESSED_JUNGLE_PLANKS5.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_ACACIA_PLANKS1 = ITEMS.register("compressed_acacia_planks1", () -> new Planks1(Blocks.COMPRESSED_ACACIA_PLANKS1.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_ACACIA_PLANKS2 = ITEMS.register("compressed_acacia_planks2", () -> new Planks2(Blocks.COMPRESSED_ACACIA_PLANKS2.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_ACACIA_PLANKS3 = ITEMS.register("compressed_acacia_planks3", () -> new Planks3(Blocks.COMPRESSED_ACACIA_PLANKS3.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_ACACIA_PLANKS4 = ITEMS.register("compressed_acacia_planks4", () -> new Planks4(Blocks.COMPRESSED_ACACIA_PLANKS4.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_ACACIA_PLANKS5 = ITEMS.register("compressed_acacia_planks5", () -> new Planks5(Blocks.COMPRESSED_ACACIA_PLANKS5.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_DARK_OAK_PLANKS1 = ITEMS.register("compressed_dark_oak_planks1", () -> new Planks1(Blocks.COMPRESSED_DARK_OAK_PLANKS1.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_DARK_OAK_PLANKS2 = ITEMS.register("compressed_dark_oak_planks2", () -> new Planks2(Blocks.COMPRESSED_DARK_OAK_PLANKS2.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_DARK_OAK_PLANKS3 = ITEMS.register("compressed_dark_oak_planks3", () -> new Planks3(Blocks.COMPRESSED_DARK_OAK_PLANKS3.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_DARK_OAK_PLANKS4 = ITEMS.register("compressed_dark_oak_planks4", () -> new Planks4(Blocks.COMPRESSED_DARK_OAK_PLANKS4.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_DARK_OAK_PLANKS5 = ITEMS.register("compressed_dark_oak_planks5", () -> new Planks5(Blocks.COMPRESSED_DARK_OAK_PLANKS5.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_CRIMSON_PLANKS1 = ITEMS.register("compressed_crimson_planks1", () -> new BlockItem(Blocks.COMPRESSED_CRIMSON_PLANKS1.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_CRIMSON_PLANKS2 = ITEMS.register("compressed_crimson_planks2", () -> new BlockItem(Blocks.COMPRESSED_CRIMSON_PLANKS2.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_CRIMSON_PLANKS3 = ITEMS.register("compressed_crimson_planks3", () -> new BlockItem(Blocks.COMPRESSED_CRIMSON_PLANKS3.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_CRIMSON_PLANKS4 = ITEMS.register("compressed_crimson_planks4", () -> new BlockItem(Blocks.COMPRESSED_CRIMSON_PLANKS4.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_CRIMSON_PLANKS5 = ITEMS.register("compressed_crimson_planks5", () -> new BlockItem(Blocks.COMPRESSED_CRIMSON_PLANKS5.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_WARPED_PLANKS1 = ITEMS.register("compressed_warped_planks1", () -> new BlockItem(Blocks.COMPRESSED_WARPED_PLANKS1.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_WARPED_PLANKS2 = ITEMS.register("compressed_warped_planks2", () -> new BlockItem(Blocks.COMPRESSED_WARPED_PLANKS2.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_WARPED_PLANKS3 = ITEMS.register("compressed_warped_planks3", () -> new BlockItem(Blocks.COMPRESSED_WARPED_PLANKS3.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_WARPED_PLANKS4 = ITEMS.register("compressed_warped_planks4", () -> new BlockItem(Blocks.COMPRESSED_WARPED_PLANKS4.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_WARPED_PLANKS5 = ITEMS.register("compressed_warped_planks5", () -> new BlockItem(Blocks.COMPRESSED_WARPED_PLANKS5.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_GRAVEL1 = ITEMS.register("compressed_gravel1", () -> new BlockItem(Blocks.COMPRESSED_GRAVEL1.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_GRAVEL2 = ITEMS.register("compressed_gravel2", () -> new BlockItem(Blocks.COMPRESSED_GRAVEL2.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_GRAVEL3 = ITEMS.register("compressed_gravel3", () -> new BlockItem(Blocks.COMPRESSED_GRAVEL3.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_GRAVEL4 = ITEMS.register("compressed_gravel4", () -> new BlockItem(Blocks.COMPRESSED_GRAVEL4.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_GRAVEL5 = ITEMS.register("compressed_gravel5", () -> new BlockItem(Blocks.COMPRESSED_GRAVEL5.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_OAK_LOG1 = ITEMS.register("compressed_oak_log1", () -> new Logs1(Blocks.COMPRESSED_OAK_LOG1.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_OAK_LOG2 = ITEMS.register("compressed_oak_log2", () -> new Logs2(Blocks.COMPRESSED_OAK_LOG2.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_OAK_LOG3 = ITEMS.register("compressed_oak_log3", () -> new Logs3(Blocks.COMPRESSED_OAK_LOG3.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_OAK_LOG4 = ITEMS.register("compressed_oak_log4", () -> new Logs4(Blocks.COMPRESSED_OAK_LOG4.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_OAK_LOG5 = ITEMS.register("compressed_oak_log5", () -> new Logs5(Blocks.COMPRESSED_OAK_LOG5.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_SPRUCE_LOG1 = ITEMS.register("compressed_spruce_log1", () -> new Logs1(Blocks.COMPRESSED_SPRUCE_LOG1.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_SPRUCE_LOG2 = ITEMS.register("compressed_spruce_log2", () -> new Logs2(Blocks.COMPRESSED_SPRUCE_LOG2.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_SPRUCE_LOG3 = ITEMS.register("compressed_spruce_log3", () -> new Logs3(Blocks.COMPRESSED_SPRUCE_LOG3.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_SPRUCE_LOG4 = ITEMS.register("compressed_spruce_log4", () -> new Logs4(Blocks.COMPRESSED_SPRUCE_LOG4.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_SPRUCE_LOG5 = ITEMS.register("compressed_spruce_log5", () -> new Logs5(Blocks.COMPRESSED_SPRUCE_LOG5.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_BIRCH_LOG1 = ITEMS.register("compressed_birch_log1", () -> new Logs1(Blocks.COMPRESSED_BIRCH_LOG1.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_BIRCH_LOG2 = ITEMS.register("compressed_birch_log2", () -> new Logs2(Blocks.COMPRESSED_BIRCH_LOG2.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_BIRCH_LOG3 = ITEMS.register("compressed_birch_log3", () -> new Logs3(Blocks.COMPRESSED_BIRCH_LOG3.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_BIRCH_LOG4 = ITEMS.register("compressed_birch_log4", () -> new Logs4(Blocks.COMPRESSED_BIRCH_LOG4.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_BIRCH_LOG5 = ITEMS.register("compressed_birch_log5", () -> new Logs5(Blocks.COMPRESSED_BIRCH_LOG5.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_JUNGLE_LOG1 = ITEMS.register("compressed_jungle_log1", () -> new Logs1(Blocks.COMPRESSED_JUNGLE_LOG1.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_JUNGLE_LOG2 = ITEMS.register("compressed_jungle_log2", () -> new Logs2(Blocks.COMPRESSED_JUNGLE_LOG2.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_JUNGLE_LOG3 = ITEMS.register("compressed_jungle_log3", () -> new Logs3(Blocks.COMPRESSED_JUNGLE_LOG3.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_JUNGLE_LOG4 = ITEMS.register("compressed_jungle_log4", () -> new Logs4(Blocks.COMPRESSED_JUNGLE_LOG4.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_JUNGLE_LOG5 = ITEMS.register("compressed_jungle_log5", () -> new Logs5(Blocks.COMPRESSED_JUNGLE_LOG5.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_ACACIA_LOG1 = ITEMS.register("compressed_acacia_log1", () -> new Logs1(Blocks.COMPRESSED_ACACIA_LOG1.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_ACACIA_LOG2 = ITEMS.register("compressed_acacia_log2", () -> new Logs2(Blocks.COMPRESSED_ACACIA_LOG2.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_ACACIA_LOG3 = ITEMS.register("compressed_acacia_log3", () -> new Logs3(Blocks.COMPRESSED_ACACIA_LOG3.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_ACACIA_LOG4 = ITEMS.register("compressed_acacia_log4", () -> new Logs4(Blocks.COMPRESSED_ACACIA_LOG4.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_ACACIA_LOG5 = ITEMS.register("compressed_acacia_log5", () -> new Logs5(Blocks.COMPRESSED_ACACIA_LOG5.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_DARK_OAK_LOG1 = ITEMS.register("compressed_dark_oak_log1", () -> new Logs1(Blocks.COMPRESSED_DARK_OAK_LOG1.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_DARK_OAK_LOG2 = ITEMS.register("compressed_dark_oak_log2", () -> new Logs2(Blocks.COMPRESSED_DARK_OAK_LOG2.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_DARK_OAK_LOG3 = ITEMS.register("compressed_dark_oak_log3", () -> new Logs3(Blocks.COMPRESSED_DARK_OAK_LOG3.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_DARK_OAK_LOG4 = ITEMS.register("compressed_dark_oak_log4", () -> new Logs4(Blocks.COMPRESSED_DARK_OAK_LOG4.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_DARK_OAK_LOG5 = ITEMS.register("compressed_dark_oak_log5", () -> new Logs5(Blocks.COMPRESSED_DARK_OAK_LOG5.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_CRIMSON_STEM1 = ITEMS.register("compressed_crimson_stem1", () -> new BlockItem(Blocks.COMPRESSED_CRIMSON_STEM1.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_CRIMSON_STEM2 = ITEMS.register("compressed_crimson_stem2", () -> new BlockItem(Blocks.COMPRESSED_CRIMSON_STEM2.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_CRIMSON_STEM3 = ITEMS.register("compressed_crimson_stem3", () -> new BlockItem(Blocks.COMPRESSED_CRIMSON_STEM3.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_CRIMSON_STEM4 = ITEMS.register("compressed_crimson_stem4", () -> new BlockItem(Blocks.COMPRESSED_CRIMSON_STEM4.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_CRIMSON_STEM5 = ITEMS.register("compressed_crimson_stem5", () -> new BlockItem(Blocks.COMPRESSED_CRIMSON_STEM5.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_WARPED_STEM1 = ITEMS.register("compressed_warped_stem1", () -> new BlockItem(Blocks.COMPRESSED_WARPED_STEM1.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_WARPED_STEM2 = ITEMS.register("compressed_warped_stem2", () -> new BlockItem(Blocks.COMPRESSED_WARPED_STEM2.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_WARPED_STEM3 = ITEMS.register("compressed_warped_stem3", () -> new BlockItem(Blocks.COMPRESSED_WARPED_STEM3.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_WARPED_STEM4 = ITEMS.register("compressed_warped_stem4", () -> new BlockItem(Blocks.COMPRESSED_WARPED_STEM4.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_WARPED_STEM5 = ITEMS.register("compressed_warped_stem5", () -> new BlockItem(Blocks.COMPRESSED_WARPED_STEM5.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_LAPIS_LAZULI1 = ITEMS.register("compressed_lapis_lazuli1", () -> new BlockItem(Blocks.COMPRESSED_LAPIS_LAZULI1.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_LAPIS_LAZULI2 = ITEMS.register("compressed_lapis_lazuli2", () -> new BlockItem(Blocks.COMPRESSED_LAPIS_LAZULI2.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_LAPIS_LAZULI3 = ITEMS.register("compressed_lapis_lazuli3", () -> new BlockItem(Blocks.COMPRESSED_LAPIS_LAZULI3.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_LAPIS_LAZULI4 = ITEMS.register("compressed_lapis_lazuli4", () -> new BlockItem(Blocks.COMPRESSED_LAPIS_LAZULI4.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_LAPIS_LAZULI5 = ITEMS.register("compressed_lapis_lazuli5", () -> new BlockItem(Blocks.COMPRESSED_LAPIS_LAZULI5.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_SANDSTONE1 = ITEMS.register("compressed_sandstone1", () -> new BlockItem(Blocks.COMPRESSED_SANDSTONE1.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_SANDSTONE2 = ITEMS.register("compressed_sandstone2", () -> new BlockItem(Blocks.COMPRESSED_SANDSTONE2.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_SANDSTONE3 = ITEMS.register("compressed_sandstone3", () -> new BlockItem(Blocks.COMPRESSED_SANDSTONE3.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_SANDSTONE4 = ITEMS.register("compressed_sandstone4", () -> new BlockItem(Blocks.COMPRESSED_SANDSTONE4.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_SANDSTONE5 = ITEMS.register("compressed_sandstone5", () -> new BlockItem(Blocks.COMPRESSED_SANDSTONE5.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_RED_SANDSTONE1 = ITEMS.register("compressed_red_sandstone1", () -> new BlockItem(Blocks.COMPRESSED_RED_SANDSTONE1.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_RED_SANDSTONE2 = ITEMS.register("compressed_red_sandstone2", () -> new BlockItem(Blocks.COMPRESSED_RED_SANDSTONE2.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_RED_SANDSTONE3 = ITEMS.register("compressed_red_sandstone3", () -> new BlockItem(Blocks.COMPRESSED_RED_SANDSTONE3.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_RED_SANDSTONE4 = ITEMS.register("compressed_red_sandstone4", () -> new BlockItem(Blocks.COMPRESSED_RED_SANDSTONE4.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_RED_SANDSTONE5 = ITEMS.register("compressed_red_sandstone5", () -> new BlockItem(Blocks.COMPRESSED_RED_SANDSTONE5.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_GOLD1 = ITEMS.register("compressed_gold1", () -> new BlockItem(Blocks.COMPRESSED_GOLD1.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_GOLD2 = ITEMS.register("compressed_gold2", () -> new BlockItem(Blocks.COMPRESSED_GOLD2.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_GOLD3 = ITEMS.register("compressed_gold3", () -> new BlockItem(Blocks.COMPRESSED_GOLD3.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_GOLD4 = ITEMS.register("compressed_gold4", () -> new BlockItem(Blocks.COMPRESSED_GOLD4.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_GOLD5 = ITEMS.register("compressed_gold5", () -> new BlockItem(Blocks.COMPRESSED_GOLD5.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_IRON1 = ITEMS.register("compressed_iron1", () -> new BlockItem(Blocks.COMPRESSED_IRON1.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_IRON2 = ITEMS.register("compressed_iron2", () -> new BlockItem(Blocks.COMPRESSED_IRON2.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_IRON3 = ITEMS.register("compressed_iron3", () -> new BlockItem(Blocks.COMPRESSED_IRON3.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_IRON4 = ITEMS.register("compressed_iron4", () -> new BlockItem(Blocks.COMPRESSED_IRON4.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_IRON5 = ITEMS.register("compressed_iron5", () -> new BlockItem(Blocks.COMPRESSED_IRON5.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_OBSIDIAN1 = ITEMS.register("compressed_obsidian1", () -> new BlockItem(Blocks.COMPRESSED_OBSIDIAN1.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_OBSIDIAN2 = ITEMS.register("compressed_obsidian2", () -> new BlockItem(Blocks.COMPRESSED_OBSIDIAN2.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_OBSIDIAN3 = ITEMS.register("compressed_obsidian3", () -> new BlockItem(Blocks.COMPRESSED_OBSIDIAN3.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_OBSIDIAN4 = ITEMS.register("compressed_obsidian4", () -> new BlockItem(Blocks.COMPRESSED_OBSIDIAN4.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_OBSIDIAN5 = ITEMS.register("compressed_obsidian5", () -> new BlockItem(Blocks.COMPRESSED_OBSIDIAN5.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_DIAMOND1 = ITEMS.register("compressed_diamond1", () -> new BlockItem(Blocks.COMPRESSED_DIAMOND1.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_DIAMOND2 = ITEMS.register("compressed_diamond2", () -> new BlockItem(Blocks.COMPRESSED_DIAMOND2.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_DIAMOND3 = ITEMS.register("compressed_diamond3", () -> new BlockItem(Blocks.COMPRESSED_DIAMOND3.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_DIAMOND4 = ITEMS.register("compressed_diamond4", () -> new BlockItem(Blocks.COMPRESSED_DIAMOND4.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_DIAMOND5 = ITEMS.register("compressed_diamond5", () -> new BlockItem(Blocks.COMPRESSED_DIAMOND5.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_NETHERRACK1 = ITEMS.register("compressed_netherrack1", () -> new BlockItem(Blocks.COMPRESSED_NETHERRACK1.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_NETHERRACK2 = ITEMS.register("compressed_netherrack2", () -> new BlockItem(Blocks.COMPRESSED_NETHERRACK2.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_NETHERRACK3 = ITEMS.register("compressed_netherrack3", () -> new BlockItem(Blocks.COMPRESSED_NETHERRACK3.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_NETHERRACK4 = ITEMS.register("compressed_netherrack4", () -> new BlockItem(Blocks.COMPRESSED_NETHERRACK4.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_NETHERRACK5 = ITEMS.register("compressed_netherrack5", () -> new BlockItem(Blocks.COMPRESSED_NETHERRACK5.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_QUARTZ1 = ITEMS.register("compressed_quartz1", () -> new BlockItem(Blocks.COMPRESSED_QUARTZ1.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_QUARTZ2 = ITEMS.register("compressed_quartz2", () -> new BlockItem(Blocks.COMPRESSED_QUARTZ2.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_QUARTZ3 = ITEMS.register("compressed_quartz3", () -> new BlockItem(Blocks.COMPRESSED_QUARTZ3.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_QUARTZ4 = ITEMS.register("compressed_quartz4", () -> new BlockItem(Blocks.COMPRESSED_QUARTZ4.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_QUARTZ5 = ITEMS.register("compressed_quartz5", () -> new BlockItem(Blocks.COMPRESSED_QUARTZ5.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_HAY_BLOCK1 = ITEMS.register("compressed_hay_block1", () -> new BlockItem(Blocks.COMPRESSED_HAY_BLOCK1.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_HAY_BLOCK2 = ITEMS.register("compressed_hay_block2", () -> new BlockItem(Blocks.COMPRESSED_HAY_BLOCK2.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_HAY_BLOCK3 = ITEMS.register("compressed_hay_block3", () -> new BlockItem(Blocks.COMPRESSED_HAY_BLOCK3.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_HAY_BLOCK4 = ITEMS.register("compressed_hay_block4", () -> new BlockItem(Blocks.COMPRESSED_HAY_BLOCK4.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_HAY_BLOCK5 = ITEMS.register("compressed_hay_block5", () -> new BlockItem(Blocks.COMPRESSED_HAY_BLOCK5.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_COAL1 = ITEMS.register("compressed_coal1", () -> new Coals1(Blocks.COMPRESSED_COAL1.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_COAL2 = ITEMS.register("compressed_coal2", () -> new Coals2(Blocks.COMPRESSED_COAL2.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_COAL3 = ITEMS.register("compressed_coal3", () -> new Coals3(Blocks.COMPRESSED_COAL3.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_COAL4 = ITEMS.register("compressed_coal4", () -> new Coals4(Blocks.COMPRESSED_COAL4.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_COAL5 = ITEMS.register("compressed_coal5", () -> new Coals5(Blocks.COMPRESSED_COAL5.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_CHARCOAL1 = ITEMS.register("compressed_charcoal1", () -> new Coals1(Blocks.COMPRESSED_CHARCOAL1.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_CHARCOAL2 = ITEMS.register("compressed_charcoal2", () -> new Coals2(Blocks.COMPRESSED_CHARCOAL2.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_CHARCOAL3 = ITEMS.register("compressed_charcoal3", () -> new Coals3(Blocks.COMPRESSED_CHARCOAL3.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_CHARCOAL4 = ITEMS.register("compressed_charcoal4", () -> new Coals4(Blocks.COMPRESSED_CHARCOAL4.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_CHARCOAL5 = ITEMS.register("compressed_charcoal5", () -> new Coals5(Blocks.COMPRESSED_CHARCOAL5.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_SEEDS1 = ITEMS.register("compressed_seeds1", () -> new BlockItem(Blocks.COMPRESSED_SEEDS1.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_SEEDS2 = ITEMS.register("compressed_seeds2", () -> new BlockItem(Blocks.COMPRESSED_SEEDS2.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_SEEDS3 = ITEMS.register("compressed_seeds3", () -> new BlockItem(Blocks.COMPRESSED_SEEDS3.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_SEEDS4 = ITEMS.register("compressed_seeds4", () -> new BlockItem(Blocks.COMPRESSED_SEEDS4.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_SEEDS5 = ITEMS.register("compressed_seeds5", () -> new BlockItem(Blocks.COMPRESSED_SEEDS5.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_SUGAR_CANE1 = ITEMS.register("compressed_sugar_cane1", () -> new BlockItem(Blocks.COMPRESSED_SUGAR_CANE1.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_SUGAR_CANE2 = ITEMS.register("compressed_sugar_cane2", () -> new BlockItem(Blocks.COMPRESSED_SUGAR_CANE2.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_SUGAR_CANE3 = ITEMS.register("compressed_sugar_cane3", () -> new BlockItem(Blocks.COMPRESSED_SUGAR_CANE3.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_SUGAR_CANE4 = ITEMS.register("compressed_sugar_cane4", () -> new BlockItem(Blocks.COMPRESSED_SUGAR_CANE4.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_SUGAR_CANE5 = ITEMS.register("compressed_sugar_cane5", () -> new BlockItem(Blocks.COMPRESSED_SUGAR_CANE5.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_FLINT1 = ITEMS.register("compressed_flint1", () -> new BlockItem(Blocks.COMPRESSED_FLINT1.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_FLINT2 = ITEMS.register("compressed_flint2", () -> new BlockItem(Blocks.COMPRESSED_FLINT2.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_FLINT3 = ITEMS.register("compressed_flint3", () -> new BlockItem(Blocks.COMPRESSED_FLINT3.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_FLINT4 = ITEMS.register("compressed_flint4", () -> new BlockItem(Blocks.COMPRESSED_FLINT4.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_FLINT5 = ITEMS.register("compressed_flint5", () -> new BlockItem(Blocks.COMPRESSED_FLINT5.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_LAVA_BUCKET1 = ITEMS.register("compressed_lava_bucket1", () -> new LavaBucket(Blocks.COMPRESSED_LAVA_BUCKET1.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_LAVA_BUCKET2 = ITEMS.register("compressed_lava_bucket2", () -> new LavaBucket(Blocks.COMPRESSED_LAVA_BUCKET2.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_LAVA_BUCKET3 = ITEMS.register("compressed_lava_bucket3", () -> new LavaBucket(Blocks.COMPRESSED_LAVA_BUCKET3.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_LAVA_BUCKET4 = ITEMS.register("compressed_lava_bucket4", () -> new LavaBucket(Blocks.COMPRESSED_LAVA_BUCKET4.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_LAVA_BUCKET5 = ITEMS.register("compressed_lava_bucket5", () -> new LavaBucket(Blocks.COMPRESSED_LAVA_BUCKET5.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_ZOMBEEF1 = ITEMS.register("compressed_zombeef1", () -> new BlockItem(Blocks.COMPRESSED_ZOMBEEF1.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_ZOMBEEF2 = ITEMS.register("compressed_zombeef2", () -> new BlockItem(Blocks.COMPRESSED_ZOMBEEF2.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_ZOMBEEF3 = ITEMS.register("compressed_zombeef3", () -> new BlockItem(Blocks.COMPRESSED_ZOMBEEF3.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_ZOMBEEF4 = ITEMS.register("compressed_zombeef4", () -> new BlockItem(Blocks.COMPRESSED_ZOMBEEF4.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_ZOMBEEF5 = ITEMS.register("compressed_zombeef5", () -> new BlockItem(Blocks.COMPRESSED_ZOMBEEF5.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_POTATO1 = ITEMS.register("compressed_potato1", () -> new BlockItem(Blocks.COMPRESSED_POTATO1.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_POTATO2 = ITEMS.register("compressed_potato2", () -> new BlockItem(Blocks.COMPRESSED_POTATO2.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_POTATO3 = ITEMS.register("compressed_potato3", () -> new BlockItem(Blocks.COMPRESSED_POTATO3.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_POTATO4 = ITEMS.register("compressed_potato4", () -> new BlockItem(Blocks.COMPRESSED_POTATO4.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_POTATO5 = ITEMS.register("compressed_potato5", () -> new BlockItem(Blocks.COMPRESSED_POTATO5.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_BAKED_POTATO1 = ITEMS.register("compressed_baked_potato1", () -> new BlockItem(Blocks.COMPRESSED_BAKED_POTATO1.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_BAKED_POTATO2 = ITEMS.register("compressed_baked_potato2", () -> new BlockItem(Blocks.COMPRESSED_BAKED_POTATO2.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_BAKED_POTATO3 = ITEMS.register("compressed_baked_potato3", () -> new BlockItem(Blocks.COMPRESSED_BAKED_POTATO3.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_BAKED_POTATO4 = ITEMS.register("compressed_baked_potato4", () -> new BlockItem(Blocks.COMPRESSED_BAKED_POTATO4.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));
        public static final RegistryObject<Item> COMPRESSED_BAKED_POTATO5 = ITEMS.register("compressed_baked_potato5", () -> new BlockItem(Blocks.COMPRESSED_BAKED_POTATO5.get(), (new Item.Properties())
                .group(COMPRESSED_BLOCKS)));

	public static void register(IEventBus modEventBus) {
                ITEMS.register(modEventBus);
	}

	
}
