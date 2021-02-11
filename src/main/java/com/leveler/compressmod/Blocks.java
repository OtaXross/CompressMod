package com.leveler.compressmod;

import com.leveler.compressmod.CompressMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Blocks {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CompressMod.MOD_ID);
    
    // 木炭ブロック
    public static final RegistryObject<Block> CHARCOAL_BLOCK = BLOCKS.register("charcoal_block", () -> new Block(AbstractBlock.Properties
            .create(Material.ROCK)
            .setRequiresTool()
            .hardnessAndResistance(5.0F, 6.0F)
            .sound(SoundType.STONE)
            .harvestTool(ToolType.PICKAXE)
            .harvestLevel(1)
    ));

    // 土ブロック・銅
    public static final RegistryObject<Block> COMPRESSED_DIRT1 = BLOCKS.register("compressed_dirt1", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 土ブロック・銀
    public static final RegistryObject<Block> COMPRESSED_DIRT2 = BLOCKS.register("compressed_dirt2", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 土ブロック・金
    public static final RegistryObject<Block> COMPRESSED_DIRT3 = BLOCKS.register("compressed_dirt3", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 土ブロック・白金
    public static final RegistryObject<Block> COMPRESSED_DIRT4 = BLOCKS.register("compressed_dirt4", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 土ブロック・黒
    public static final RegistryObject<Block> COMPRESSED_DIRT5 = BLOCKS.register("compressed_dirt5", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));

    // 草ブロック・銅
    public static final RegistryObject<Block> COMPRESSED_GRASS1 = BLOCKS.register("compressed_grass1", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 草ブロック・銀
    public static final RegistryObject<Block> COMPRESSED_GRASS2 = BLOCKS.register("compressed_grass2", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 草ブロック・金
    public static final RegistryObject<Block> COMPRESSED_GRASS3 = BLOCKS.register("compressed_grass3", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 草ブロック・白金
    public static final RegistryObject<Block> COMPRESSED_GRASS4 = BLOCKS.register("compressed_grass4", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 草ブロック・黒
    public static final RegistryObject<Block> COMPRESSED_GRASS5 = BLOCKS.register("compressed_grass5", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    
    // 丸石・銅
    public static final RegistryObject<Block> COMPRESSED_COBBLESTONE1 = BLOCKS.register("compressed_cobblestone1", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 丸石・銀
    public static final RegistryObject<Block> COMPRESSED_COBBLESTONE2 = BLOCKS.register("compressed_cobblestone2", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 丸石・金
    public static final RegistryObject<Block> COMPRESSED_COBBLESTONE3 = BLOCKS.register("compressed_cobblestone3", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 丸石・白金
    public static final RegistryObject<Block> COMPRESSED_COBBLESTONE4 = BLOCKS.register("compressed_cobblestone4", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 丸石・黒
    public static final RegistryObject<Block> COMPRESSED_COBBLESTONE5 = BLOCKS.register("compressed_cobblestone5", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));

    // 焼石・銅
    public static final RegistryObject<Block> COMPRESSED_STONE1 = BLOCKS.register("compressed_stone1", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 焼石・銀
    public static final RegistryObject<Block> COMPRESSED_STONE2 = BLOCKS.register("compressed_stone2", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 焼石・金
    public static final RegistryObject<Block> COMPRESSED_STONE3 = BLOCKS.register("compressed_stone3", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 焼石・白金
    public static final RegistryObject<Block> COMPRESSED_STONE4 = BLOCKS.register("compressed_stone4", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 焼石・黒
    public static final RegistryObject<Block> COMPRESSED_STONE5 = BLOCKS.register("compressed_stone5", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));

    // 花崗岩・銅
    public static final RegistryObject<Block> COMPRESSED_GRANITE1 = BLOCKS.register("compressed_granite1", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 花崗岩・銀
    public static final RegistryObject<Block> COMPRESSED_GRANITE2 = BLOCKS.register("compressed_granite2", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 花崗岩・金
    public static final RegistryObject<Block> COMPRESSED_GRANITE3 = BLOCKS.register("compressed_granite3", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 花崗岩・白金
    public static final RegistryObject<Block> COMPRESSED_GRANITE4 = BLOCKS.register("compressed_granite4", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 花崗岩・黒
    public static final RegistryObject<Block> COMPRESSED_GRANITE5 = BLOCKS.register("compressed_granite5", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));

    // 閃緑岩・銅
    public static final RegistryObject<Block> COMPRESSED_DIORITE1 = BLOCKS.register("compressed_diorite1", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 閃緑岩・銀
    public static final RegistryObject<Block> COMPRESSED_DIORITE2 = BLOCKS.register("compressed_diorite2", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 閃緑岩・金
    public static final RegistryObject<Block> COMPRESSED_DIORITE3 = BLOCKS.register("compressed_diorite3", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 閃緑岩・白金
    public static final RegistryObject<Block> COMPRESSED_DIORITE4 = BLOCKS.register("compressed_diorite4", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 閃緑岩・黒
    public static final RegistryObject<Block> COMPRESSED_DIORITE5 = BLOCKS.register("compressed_diorite5", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));

    // 安山岩・銅
    public static final RegistryObject<Block> COMPRESSED_ANDESITE1 = BLOCKS.register("compressed_andesite1", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 安山岩・銀
    public static final RegistryObject<Block> COMPRESSED_ANDESITE2 = BLOCKS.register("compressed_andesite2", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 安山岩・金
    public static final RegistryObject<Block> COMPRESSED_ANDESITE3 = BLOCKS.register("compressed_andesite3", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 安山岩・白金
    public static final RegistryObject<Block> COMPRESSED_ANDESITE4 = BLOCKS.register("compressed_andesite4", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 安山岩・黒
    public static final RegistryObject<Block> COMPRESSED_ANDESITE5 = BLOCKS.register("compressed_andesite5", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));

    // 黒曜石・銅
    public static final RegistryObject<Block> COMPRESSED_OBSIDIAN1 = BLOCKS.register("compressed_obsidian1", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 黒曜石・銀
    public static final RegistryObject<Block> COMPRESSED_OBSIDIAN2 = BLOCKS.register("compressed_obsidian2", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 黒曜石・金
    public static final RegistryObject<Block> COMPRESSED_OBSIDIAN3 = BLOCKS.register("compressed_obsidian3", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 黒曜石・白金
    public static final RegistryObject<Block> COMPRESSED_OBSIDIAN4 = BLOCKS.register("compressed_obsidian4", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 黒曜石・黒
    public static final RegistryObject<Block> COMPRESSED_OBSIDIAN5 = BLOCKS.register("compressed_obsidian5", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));

    // 石炭ブロック・銅
    public static final RegistryObject<Block> COMPRESSED_COAL1 = BLOCKS.register("compressed_coal1", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 石炭ブロック・銀
    public static final RegistryObject<Block> COMPRESSED_COAL2 = BLOCKS.register("compressed_coal2", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 石炭ブロック・金
    public static final RegistryObject<Block> COMPRESSED_COAL3 = BLOCKS.register("compressed_coal3", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 石炭ブロック・白金
    public static final RegistryObject<Block> COMPRESSED_COAL4 = BLOCKS.register("compressed_coal4", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 石炭ブロック・黒
    public static final RegistryObject<Block> COMPRESSED_COAL5 = BLOCKS.register("compressed_coal5", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));

    // 木炭ブロック・銅
    public static final RegistryObject<Block> COMPRESSED_CHARCOAL1 = BLOCKS.register("compressed_charcoal1", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 木炭ブロック・銀
    public static final RegistryObject<Block> COMPRESSED_CHARCOAL2 = BLOCKS.register("compressed_charcoal2", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 木炭ブロック・金
    public static final RegistryObject<Block> COMPRESSED_CHARCOAL3 = BLOCKS.register("compressed_charcoal3", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 木炭ブロック・白金
    public static final RegistryObject<Block> COMPRESSED_CHARCOAL4 = BLOCKS.register("compressed_charcoal4", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 木炭ブロック・黒
    public static final RegistryObject<Block> COMPRESSED_CHARCOAL5 = BLOCKS.register("compressed_charcoal5", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));

    // 鉄ブロック・銅
    public static final RegistryObject<Block> COMPRESSED_IRON1 = BLOCKS.register("compressed_iron1", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 鉄ブロック・銀
    public static final RegistryObject<Block> COMPRESSED_IRON2 = BLOCKS.register("compressed_iron2", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 鉄ブロック・金
    public static final RegistryObject<Block> COMPRESSED_IRON3 = BLOCKS.register("compressed_iron3", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 鉄ブロック・白金
    public static final RegistryObject<Block> COMPRESSED_IRON4 = BLOCKS.register("compressed_iron4", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 鉄ブロック・黒
    public static final RegistryObject<Block> COMPRESSED_IRON5 = BLOCKS.register("compressed_iron5", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));

    // 金ブロック・銅
    public static final RegistryObject<Block> COMPRESSED_GOLD1 = BLOCKS.register("compressed_gold1", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 金ブロック・銀
    public static final RegistryObject<Block> COMPRESSED_GOLD2 = BLOCKS.register("compressed_gold2", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 金ブロック・金
    public static final RegistryObject<Block> COMPRESSED_GOLD3 = BLOCKS.register("compressed_gold3", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 金ブロック・白金
    public static final RegistryObject<Block> COMPRESSED_GOLD4 = BLOCKS.register("compressed_gold4", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 金ブロック・黒
    public static final RegistryObject<Block> COMPRESSED_GOLD5 = BLOCKS.register("compressed_gold5", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));

    // ダイヤブロック・銅
    public static final RegistryObject<Block> COMPRESSED_DIAMOND1 = BLOCKS.register("compressed_diamond1", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // ダイヤブロック・銀
    public static final RegistryObject<Block> COMPRESSED_DIAMOND2 = BLOCKS.register("compressed_diamond2", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // ダイヤブロック・金
    public static final RegistryObject<Block> COMPRESSED_DIAMOND3 = BLOCKS.register("compressed_diamond3", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // ダイヤブロック・白金
    public static final RegistryObject<Block> COMPRESSED_DIAMOND4 = BLOCKS.register("compressed_diamond4", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // ダイヤブロック・黒
    public static final RegistryObject<Block> COMPRESSED_DIAMOND5 = BLOCKS.register("compressed_diamond5", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));

    // ラピスブロック・銅
    public static final RegistryObject<Block> COMPRESSED_LAPIS_LAZULI1 = BLOCKS.register("compressed_lapis_lazuli1", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // ラピスブロック・銀
    public static final RegistryObject<Block> COMPRESSED_LAPIS_LAZULI2 = BLOCKS.register("compressed_lapis_lazuli2", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // ラピスブロック・金
    public static final RegistryObject<Block> COMPRESSED_LAPIS_LAZULI3 = BLOCKS.register("compressed_lapis_lazuli3", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // ラピスブロック・白金
    public static final RegistryObject<Block> COMPRESSED_LAPIS_LAZULI4 = BLOCKS.register("compressed_lapis_lazuli4", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // ラピスブロック・黒
    public static final RegistryObject<Block> COMPRESSED_LAPIS_LAZULI5 = BLOCKS.register("compressed_lapis_lazuli5", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));

    // クォーツブロック・銅
    public static final RegistryObject<Block> COMPRESSED_QUARTZ1 = BLOCKS.register("compressed_quartz1", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // クォーツブロック・銀
    public static final RegistryObject<Block> COMPRESSED_QUARTZ2 = BLOCKS.register("compressed_quartz2", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // クォーツブロック・金
    public static final RegistryObject<Block> COMPRESSED_QUARTZ3 = BLOCKS.register("compressed_quartz3", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // クォーツブロック・白金
    public static final RegistryObject<Block> COMPRESSED_QUARTZ4 = BLOCKS.register("compressed_quartz4", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // クォーツブロック・黒
    public static final RegistryObject<Block> COMPRESSED_QUARTZ5 = BLOCKS.register("compressed_quartz5", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));

    // 砂利・銅
    public static final RegistryObject<Block> COMPRESSED_GRAVEL1 = BLOCKS.register("compressed_gravel1", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 砂利・銀
    public static final RegistryObject<Block> COMPRESSED_GRAVEL2 = BLOCKS.register("compressed_gravel2", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 砂利・金
    public static final RegistryObject<Block> COMPRESSED_GRAVEL3 = BLOCKS.register("compressed_gravel3", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 砂利・白金
    public static final RegistryObject<Block> COMPRESSED_GRAVEL4 = BLOCKS.register("compressed_gravel4", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 砂利・黒
    public static final RegistryObject<Block> COMPRESSED_GRAVEL5 = BLOCKS.register("compressed_gravel5", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));

    // 砂岩Ｎ・銅
    public static final RegistryObject<Block> COMPRESSED_SANDSTONE1 = BLOCKS.register("compressed_sandstone1", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 砂岩Ｎ・銀
    public static final RegistryObject<Block> COMPRESSED_SANDSTONE2 = BLOCKS.register("compressed_sandstone2", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 砂岩Ｎ・金
    public static final RegistryObject<Block> COMPRESSED_SANDSTONE3 = BLOCKS.register("compressed_sandstone3", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 砂岩Ｎ・白金
    public static final RegistryObject<Block> COMPRESSED_SANDSTONE4 = BLOCKS.register("compressed_sandstone4", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 砂岩Ｎ・黒
    public static final RegistryObject<Block> COMPRESSED_SANDSTONE5 = BLOCKS.register("compressed_sandstone5", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));

    // 赤砂岩Ｎ・銅
    public static final RegistryObject<Block> COMPRESSED_RED_SANDSTONE1 = BLOCKS.register("compressed_red_sandstone1", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 赤砂岩Ｎ・銀
    public static final RegistryObject<Block> COMPRESSED_RED_SANDSTONE2 = BLOCKS.register("compressed_red_sandstone2", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 赤砂岩Ｎ・金
    public static final RegistryObject<Block> COMPRESSED_RED_SANDSTONE3 = BLOCKS.register("compressed_red_sandstone3", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 赤砂岩Ｎ・白金
    public static final RegistryObject<Block> COMPRESSED_RED_SANDSTONE4 = BLOCKS.register("compressed_red_sandstone4", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 赤砂岩Ｎ・黒
    public static final RegistryObject<Block> COMPRESSED_RED_SANDSTONE5 = BLOCKS.register("compressed_red_sandstone5", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));

    // オークの原木・銅
    public static final RegistryObject<Block> COMPRESSED_OAK_LOG1 = BLOCKS.register("compressed_oak_log1", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // オークの原木・銀
    public static final RegistryObject<Block> COMPRESSED_OAK_LOG2 = BLOCKS.register("compressed_oak_log2", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // オークの原木・金
    public static final RegistryObject<Block> COMPRESSED_OAK_LOG3 = BLOCKS.register("compressed_oak_log3", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // オークの原木・白金
    public static final RegistryObject<Block> COMPRESSED_OAK_LOG4 = BLOCKS.register("compressed_oak_log4", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // オークの原木・黒
    public static final RegistryObject<Block> COMPRESSED_OAK_LOG5 = BLOCKS.register("compressed_oak_log5", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));

    // マツの原木・銅
    public static final RegistryObject<Block> COMPRESSED_SPRUCE_LOG1 = BLOCKS.register("compressed_spruce_log1", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // マツの原木・銀
    public static final RegistryObject<Block> COMPRESSED_SPRUCE_LOG2 = BLOCKS.register("compressed_spruce_log2", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // マツの原木・金
    public static final RegistryObject<Block> COMPRESSED_SPRUCE_LOG3 = BLOCKS.register("compressed_spruce_log3", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // マツの原木・白金
    public static final RegistryObject<Block> COMPRESSED_SPRUCE_LOG4 = BLOCKS.register("compressed_spruce_log4", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // マツの原木・黒
    public static final RegistryObject<Block> COMPRESSED_SPRUCE_LOG5 = BLOCKS.register("compressed_spruce_log5", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));

    // シラカバの原木・銅
    public static final RegistryObject<Block> COMPRESSED_BIRCH_LOG1 = BLOCKS.register("compressed_birch_log1", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // シラカバの原木・銀
    public static final RegistryObject<Block> COMPRESSED_BIRCH_LOG2 = BLOCKS.register("compressed_birch_log2", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // シラカバの原木・金
    public static final RegistryObject<Block> COMPRESSED_BIRCH_LOG3 = BLOCKS.register("compressed_birch_log3", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // シラカバの原木・白金
    public static final RegistryObject<Block> COMPRESSED_BIRCH_LOG4 = BLOCKS.register("compressed_birch_log4", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // シラカバの原木・黒
    public static final RegistryObject<Block> COMPRESSED_BIRCH_LOG5 = BLOCKS.register("compressed_birch_log5", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));

    // ジャングルの原木・銅
    public static final RegistryObject<Block> COMPRESSED_JUNGLE_LOG1 = BLOCKS.register("compressed_jungle_log1", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // ジャングルの原木・銀
    public static final RegistryObject<Block> COMPRESSED_JUNGLE_LOG2 = BLOCKS.register("compressed_jungle_log2", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // ジャングルの原木・金
    public static final RegistryObject<Block> COMPRESSED_JUNGLE_LOG3 = BLOCKS.register("compressed_jungle_log3", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // ジャングルの原木・白金
    public static final RegistryObject<Block> COMPRESSED_JUNGLE_LOG4 = BLOCKS.register("compressed_jungle_log4", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // ジャングルの原木・黒
    public static final RegistryObject<Block> COMPRESSED_JUNGLE_LOG5 = BLOCKS.register("compressed_jungle_log5", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));

    // アカシアの原木・銅
    public static final RegistryObject<Block> COMPRESSED_ACACIA_LOG1 = BLOCKS.register("compressed_acacia_log1", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // アカシアの原木・銀
    public static final RegistryObject<Block> COMPRESSED_ACACIA_LOG2 = BLOCKS.register("compressed_acacia_log2", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // アカシアの原木・金
    public static final RegistryObject<Block> COMPRESSED_ACACIA_LOG3 = BLOCKS.register("compressed_acacia_log3", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // アカシアの原木・白金
    public static final RegistryObject<Block> COMPRESSED_ACACIA_LOG4 = BLOCKS.register("compressed_acacia_log4", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // アカシアの原木・黒
    public static final RegistryObject<Block> COMPRESSED_ACACIA_LOG5 = BLOCKS.register("compressed_acacia_log5", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));

    // ダークオークの原木・銅
    public static final RegistryObject<Block> COMPRESSED_DARK_OAK_LOG1 = BLOCKS.register("compressed_dark_oak_log1", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // ダークオークの原木・銀
    public static final RegistryObject<Block> COMPRESSED_DARK_OAK_LOG2 = BLOCKS.register("compressed_dark_oak_log2", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // ダークオークの原木・金
    public static final RegistryObject<Block> COMPRESSED_DARK_OAK_LOG3 = BLOCKS.register("compressed_dark_oak_log3", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // ダークオークの原木・白金
    public static final RegistryObject<Block> COMPRESSED_DARK_OAK_LOG4 = BLOCKS.register("compressed_dark_oak_log4", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // ダークオークの原木・黒
    public static final RegistryObject<Block> COMPRESSED_DARK_OAK_LOG5 = BLOCKS.register("compressed_dark_oak_log5", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));

    // 真紅の幹・銅
    public static final RegistryObject<Block> COMPRESSED_CRIMSON_STEM1 = BLOCKS.register("compressed_crimson_stem1", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 真紅の幹・銀
    public static final RegistryObject<Block> COMPRESSED_CRIMSON_STEM2 = BLOCKS.register("compressed_crimson_stem2", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 真紅の幹・金
    public static final RegistryObject<Block> COMPRESSED_CRIMSON_STEM3 = BLOCKS.register("compressed_crimson_stem3", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 真紅の幹・白金
    public static final RegistryObject<Block> COMPRESSED_CRIMSON_STEM4 = BLOCKS.register("compressed_crimson_stem4", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 真紅の幹・黒
    public static final RegistryObject<Block> COMPRESSED_CRIMSON_STEM5 = BLOCKS.register("compressed_crimson_stem5", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));

    // 歪んだ幹・銅
    public static final RegistryObject<Block> COMPRESSED_WARPED_STEM1 = BLOCKS.register("compressed_warped_stem1", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 歪んだ幹・銀
    public static final RegistryObject<Block> COMPRESSED_WARPED_STEM2 = BLOCKS.register("compressed_warped_stem2", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 歪んだ幹・金
    public static final RegistryObject<Block> COMPRESSED_WARPED_STEM3 = BLOCKS.register("compressed_warped_stem3", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 歪んだ幹・白金
    public static final RegistryObject<Block> COMPRESSED_WARPED_STEM4 = BLOCKS.register("compressed_warped_stem4", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 歪んだ幹・黒
    public static final RegistryObject<Block> COMPRESSED_WARPED_STEM5 = BLOCKS.register("compressed_warped_stem5", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // オークの木材・銅
    public static final RegistryObject<Block> COMPRESSED_OAK_PLANKS1 = BLOCKS.register("compressed_oak_planks1", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // オークの木材・銀
    public static final RegistryObject<Block> COMPRESSED_OAK_PLANKS2 = BLOCKS.register("compressed_oak_planks2", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // オークの木材・金
    public static final RegistryObject<Block> COMPRESSED_OAK_PLANKS3 = BLOCKS.register("compressed_oak_planks3", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // オークの木材・白金
    public static final RegistryObject<Block> COMPRESSED_OAK_PLANKS4 = BLOCKS.register("compressed_oak_planks4", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // オークの木材・黒
    public static final RegistryObject<Block> COMPRESSED_OAK_PLANKS5 = BLOCKS.register("compressed_oak_planks5", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));

    // マツの木材・銅
    public static final RegistryObject<Block> COMPRESSED_SPRUCE_PLANKS1 = BLOCKS.register("compressed_spruce_planks1", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // マツの木材・銀
    public static final RegistryObject<Block> COMPRESSED_SPRUCE_PLANKS2 = BLOCKS.register("compressed_spruce_planks2", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // マツの木材・金
    public static final RegistryObject<Block> COMPRESSED_SPRUCE_PLANKS3 = BLOCKS.register("compressed_spruce_planks3", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // マツの木材・白金
    public static final RegistryObject<Block> COMPRESSED_SPRUCE_PLANKS4 = BLOCKS.register("compressed_spruce_planks4", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // マツの木材・黒
    public static final RegistryObject<Block> COMPRESSED_SPRUCE_PLANKS5 = BLOCKS.register("compressed_spruce_planks5", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));

    // シラカバの木材・銅
    public static final RegistryObject<Block> COMPRESSED_BIRCH_PLANKS1 = BLOCKS.register("compressed_birch_planks1", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // シラカバの木材・銀
    public static final RegistryObject<Block> COMPRESSED_BIRCH_PLANKS2 = BLOCKS.register("compressed_birch_planks2", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // シラカバの木材・金
    public static final RegistryObject<Block> COMPRESSED_BIRCH_PLANKS3 = BLOCKS.register("compressed_birch_planks3", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // シラカバの木材・白金
    public static final RegistryObject<Block> COMPRESSED_BIRCH_PLANKS4 = BLOCKS.register("compressed_birch_planks4", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // シラカバの木材・黒
    public static final RegistryObject<Block> COMPRESSED_BIRCH_PLANKS5 = BLOCKS.register("compressed_birch_planks5", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));

    // ジャングルの木材・銅
    public static final RegistryObject<Block> COMPRESSED_JUNGLE_PLANKS1 = BLOCKS.register("compressed_jungle_planks1", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // ジャングルの木材・銀
    public static final RegistryObject<Block> COMPRESSED_JUNGLE_PLANKS2 = BLOCKS.register("compressed_jungle_planks2", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // ジャングルの木材・金
    public static final RegistryObject<Block> COMPRESSED_JUNGLE_PLANKS3 = BLOCKS.register("compressed_jungle_planks3", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // ジャングルの木材・白金
    public static final RegistryObject<Block> COMPRESSED_JUNGLE_PLANKS4 = BLOCKS.register("compressed_jungle_planks4", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // ジャングルの木材・黒
    public static final RegistryObject<Block> COMPRESSED_JUNGLE_PLANKS5 = BLOCKS.register("compressed_jungle_planks5", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));

    // アカシアの木材・銅
    public static final RegistryObject<Block> COMPRESSED_ACACIA_PLANKS1 = BLOCKS.register("compressed_acacia_planks1", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // アカシアの木材・銀
    public static final RegistryObject<Block> COMPRESSED_ACACIA_PLANKS2 = BLOCKS.register("compressed_acacia_planks2", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // アカシアの木材・金
    public static final RegistryObject<Block> COMPRESSED_ACACIA_PLANKS3 = BLOCKS.register("compressed_acacia_planks3", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // アカシアの木材・白金
    public static final RegistryObject<Block> COMPRESSED_ACACIA_PLANKS4 = BLOCKS.register("compressed_acacia_planks4", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // アカシアの木材・黒
    public static final RegistryObject<Block> COMPRESSED_ACACIA_PLANKS5 = BLOCKS.register("compressed_acacia_planks5", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));

    // ダークオークの木材・銅
    public static final RegistryObject<Block> COMPRESSED_DARK_OAK_PLANKS1 = BLOCKS.register("compressed_dark_oak_planks1", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // ダークオークの木材・銀
    public static final RegistryObject<Block> COMPRESSED_DARK_OAK_PLANKS2 = BLOCKS.register("compressed_dark_oak_planks2", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // ダークオークの木材・金
    public static final RegistryObject<Block> COMPRESSED_DARK_OAK_PLANKS3 = BLOCKS.register("compressed_dark_oak_planks3", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // ダークオークの木材・白金
    public static final RegistryObject<Block> COMPRESSED_DARK_OAK_PLANKS4 = BLOCKS.register("compressed_dark_oak_planks4", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // ダークオークの木材・黒
    public static final RegistryObject<Block> COMPRESSED_DARK_OAK_PLANKS5 = BLOCKS.register("compressed_dark_oak_planks5", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));

    // 真紅の木材・銅
    public static final RegistryObject<Block> COMPRESSED_CRIMSON_PLANKS1 = BLOCKS.register("compressed_crimson_planks1", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 真紅の木材・銀
    public static final RegistryObject<Block> COMPRESSED_CRIMSON_PLANKS2 = BLOCKS.register("compressed_crimson_planks2", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 真紅の木材・金
    public static final RegistryObject<Block> COMPRESSED_CRIMSON_PLANKS3 = BLOCKS.register("compressed_crimson_planks3", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 真紅の木材・白金
    public static final RegistryObject<Block> COMPRESSED_CRIMSON_PLANKS4 = BLOCKS.register("compressed_crimson_planks4", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 真紅の木材・黒
    public static final RegistryObject<Block> COMPRESSED_CRIMSON_PLANKS5 = BLOCKS.register("compressed_crimson_planks5", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));

    // 歪んだ木材・銅
    public static final RegistryObject<Block> COMPRESSED_WARPED_PLANKS1 = BLOCKS.register("compressed_warped_planks1", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 歪んだ木材・銀
    public static final RegistryObject<Block> COMPRESSED_WARPED_PLANKS2 = BLOCKS.register("compressed_warped_planks2", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 歪んだ木材・金
    public static final RegistryObject<Block> COMPRESSED_WARPED_PLANKS3 = BLOCKS.register("compressed_warped_planks3", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 歪んだ木材・白金
    public static final RegistryObject<Block> COMPRESSED_WARPED_PLANKS4 = BLOCKS.register("compressed_warped_planks4", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 歪んだ木材・黒
    public static final RegistryObject<Block> COMPRESSED_WARPED_PLANKS5 = BLOCKS.register("compressed_warped_planks5", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));

    // 俵・銅
    public static final RegistryObject<Block> COMPRESSED_HAY_BLOCK1 = BLOCKS.register("compressed_hay_block1", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 俵・銀
    public static final RegistryObject<Block> COMPRESSED_HAY_BLOCK2 = BLOCKS.register("compressed_hay_block2", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 俵・金
    public static final RegistryObject<Block> COMPRESSED_HAY_BLOCK3 = BLOCKS.register("compressed_hay_block3", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 俵・白金
    public static final RegistryObject<Block> COMPRESSED_HAY_BLOCK4 = BLOCKS.register("compressed_hay_block4", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 俵・黒
    public static final RegistryObject<Block> COMPRESSED_HAY_BLOCK5 = BLOCKS.register("compressed_hay_block5", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));

    // マグマバケツ・銅
    public static final RegistryObject<Block> COMPRESSED_LAVA_BUCKET1 = BLOCKS.register("compressed_lava_bucket1", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
            .setLightLevel((state) -> {
                    return 15;
            })
    ));
    // マグマバケツ・銀
    public static final RegistryObject<Block> COMPRESSED_LAVA_BUCKET2 = BLOCKS.register("compressed_lava_bucket2", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
            .setLightLevel((state) -> {
                    return 15;
            })
    ));
    // マグマバケツ・金
    public static final RegistryObject<Block> COMPRESSED_LAVA_BUCKET3 = BLOCKS.register("compressed_lava_bucket3", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
            .setLightLevel((state) -> {
                    return 15;
            })
    ));
    // マグマバケツ・白金
    public static final RegistryObject<Block> COMPRESSED_LAVA_BUCKET4 = BLOCKS.register("compressed_lava_bucket4", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
            .setLightLevel((state) -> {
                    return 15;
            })
    ));
    // マグマバケツ・黒
    public static final RegistryObject<Block> COMPRESSED_LAVA_BUCKET5 = BLOCKS.register("compressed_lava_bucket5", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
            .setLightLevel((state) -> {
                    return 15;
            })
    ));

    // 火打石・銅
    public static final RegistryObject<Block> COMPRESSED_FLINT1 = BLOCKS.register("compressed_flint1", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 火打石・銀
    public static final RegistryObject<Block> COMPRESSED_FLINT2 = BLOCKS.register("compressed_flint2", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 火打石・金
    public static final RegistryObject<Block> COMPRESSED_FLINT3 = BLOCKS.register("compressed_flint3", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 火打石・白金
    public static final RegistryObject<Block> COMPRESSED_FLINT4 = BLOCKS.register("compressed_flint4", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 火打石・黒
    public static final RegistryObject<Block> COMPRESSED_FLINT5 = BLOCKS.register("compressed_flint5", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));

    // 腐肉・銅
    public static final RegistryObject<Block> COMPRESSED_ZOMBEEF1 = BLOCKS.register("compressed_zombeef1", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 腐肉・銀
    public static final RegistryObject<Block> COMPRESSED_ZOMBEEF2 = BLOCKS.register("compressed_zombeef2", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 腐肉・金
    public static final RegistryObject<Block> COMPRESSED_ZOMBEEF3 = BLOCKS.register("compressed_zombeef3", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 腐肉・白金
    public static final RegistryObject<Block> COMPRESSED_ZOMBEEF4 = BLOCKS.register("compressed_zombeef4", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 腐肉・黒
    public static final RegistryObject<Block> COMPRESSED_ZOMBEEF5 = BLOCKS.register("compressed_zombeef5", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));

    // 種・銅
    public static final RegistryObject<Block> COMPRESSED_SEEDS1 = BLOCKS.register("compressed_seeds1", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 種・銀
    public static final RegistryObject<Block> COMPRESSED_SEEDS2 = BLOCKS.register("compressed_seeds2", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 種・金
    public static final RegistryObject<Block> COMPRESSED_SEEDS3 = BLOCKS.register("compressed_seeds3", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 種・白金
    public static final RegistryObject<Block> COMPRESSED_SEEDS4 = BLOCKS.register("compressed_seeds4", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // 種・黒
    public static final RegistryObject<Block> COMPRESSED_SEEDS5 = BLOCKS.register("compressed_seeds5", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));

    // POT-8・銅
    public static final RegistryObject<Block> COMPRESSED_POTATO1 = BLOCKS.register("compressed_potato1", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // POT-8・銀
    public static final RegistryObject<Block> COMPRESSED_POTATO2 = BLOCKS.register("compressed_potato2", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // POT-8・金
    public static final RegistryObject<Block> COMPRESSED_POTATO3 = BLOCKS.register("compressed_potato3", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // POT-8・白金
    public static final RegistryObject<Block> COMPRESSED_POTATO4 = BLOCKS.register("compressed_potato4", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // POT-8・黒
    public static final RegistryObject<Block> COMPRESSED_POTATO5 = BLOCKS.register("compressed_potato5", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));

    // ベイクドポテト・銅
    public static final RegistryObject<Block> COMPRESSED_BAKED_POTATO1 = BLOCKS.register("compressed_baked_potato1", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // ベイクドポテト・銀
    public static final RegistryObject<Block> COMPRESSED_BAKED_POTATO2 = BLOCKS.register("compressed_baked_potato2", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // ベイクドポテト・金
    public static final RegistryObject<Block> COMPRESSED_BAKED_POTATO3 = BLOCKS.register("compressed_baked_potato3", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // ベイクドポテト・白金
    public static final RegistryObject<Block> COMPRESSED_BAKED_POTATO4 = BLOCKS.register("compressed_baked_potato4", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));

    public static final RegistryObject<Block> COMPRESSED_BAKED_POTATO5 = BLOCKS.register("compressed_baked_potato5", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));

    // さとうきび・銅
    public static final RegistryObject<Block> COMPRESSED_SUGAR_CANE1 = BLOCKS.register("compressed_sugar_cane1", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // さとうきび・銀
    public static final RegistryObject<Block> COMPRESSED_SUGAR_CANE2 = BLOCKS.register("compressed_sugar_cane2", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // さとうきび・金
    public static final RegistryObject<Block> COMPRESSED_SUGAR_CANE3 = BLOCKS.register("compressed_sugar_cane3", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // さとうきび・白金
    public static final RegistryObject<Block> COMPRESSED_SUGAR_CANE4 = BLOCKS.register("compressed_sugar_cane4", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // さとうきび・黒
    public static final RegistryObject<Block> COMPRESSED_SUGAR_CANE5 = BLOCKS.register("compressed_sugar_cane5", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));

    // ネザーラック・銅
    public static final RegistryObject<Block> COMPRESSED_NETHERRACK1 = BLOCKS.register("compressed_netherrack1", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // ネザーラック・銀
    public static final RegistryObject<Block> COMPRESSED_NETHERRACK2 = BLOCKS.register("compressed_netherrack2", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // ネザーラック・金
    public static final RegistryObject<Block> COMPRESSED_NETHERRACK3 = BLOCKS.register("compressed_netherrack3", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // ネザーラック・白金
    public static final RegistryObject<Block> COMPRESSED_NETHERRACK4 = BLOCKS.register("compressed_netherrack4", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));
    // ネザーラック・黒
    public static final RegistryObject<Block> COMPRESSED_NETHERRACK5 = BLOCKS.register("compressed_netherrack5", () -> new Block(AbstractBlock.Properties
            .create(Material.IRON)
            .setRequiresTool()
            .hardnessAndResistance(0.5F, 30.0F)
            .sound(SoundType.NETHER_BRICK)
            .harvestTool(ToolType.SHOVEL)
            .harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.AXE)
            .harvestTool(ToolType.HOE)
            .harvestLevel(1)
    ));


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}