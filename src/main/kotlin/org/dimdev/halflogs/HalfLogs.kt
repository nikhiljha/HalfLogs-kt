package org.dimdev.halflogs

import net.minecraft.block.Block
import net.minecraft.block.BlockSlab
import net.minecraft.block.SoundType
import net.minecraft.block.material.MapColor
import net.minecraft.block.material.Material
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.util.ResourceLocation
import org.dimdev.rift.listener.BlockAdder
import org.dimdev.rift.listener.ItemAdder

class HalfLogs : BlockAdder, ItemAdder {
    internal var OAK_LOG_SLAB: Block = BlockSlab(Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0f, 3.0f).soundType(SoundType.WOOD))
    internal var SPRUCE_LOG_SLAB: Block = BlockSlab(Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0f, 3.0f).soundType(SoundType.WOOD))
    internal var BIRCH_LOG_SLAB: Block = BlockSlab(Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0f, 3.0f).soundType(SoundType.WOOD))
    internal var JUNGLE_LOG_SLAB: Block = BlockSlab(Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0f, 3.0f).soundType(SoundType.WOOD))
    internal var ACACIA_LOG_SLAB: Block = BlockSlab(Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0f, 3.0f).soundType(SoundType.WOOD))
    internal var DARK_OAK_LOG_SLAB: Block = BlockSlab(Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0f, 3.0f).soundType(SoundType.WOOD))
    internal var STRIPPED_OAK_LOG_SLAB: Block = BlockSlab(Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0f, 3.0f).soundType(SoundType.WOOD))
    internal var STRIPPED_SPRUCE_LOG_SLAB: Block = BlockSlab(Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0f, 3.0f).soundType(SoundType.WOOD))
    internal var STRIPPED_BIRCH_LOG_SLAB: Block = BlockSlab(Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0f, 3.0f).soundType(SoundType.WOOD))
    internal var STRIPPED_JUNGLE_LOG_SLAB: Block = BlockSlab(Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0f, 3.0f).soundType(SoundType.WOOD))
    internal var STRIPPED_ACACIA_LOG_SLAB: Block = BlockSlab(Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0f, 3.0f).soundType(SoundType.WOOD))
    internal var STRIPPED_DARK_OAK_LOG_SLAB: Block = BlockSlab(Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0f, 3.0f).soundType(SoundType.WOOD))

    override fun registerBlocks() {
        Block.registerBlock(ResourceLocation("halflogs:oak_log_slab"), OAK_LOG_SLAB)
        Block.registerBlock(ResourceLocation("halflogs:spruce_log_slab"), SPRUCE_LOG_SLAB)
        Block.registerBlock(ResourceLocation("halflogs:birch_log_slab"), BIRCH_LOG_SLAB)
        Block.registerBlock(ResourceLocation("halflogs:jungle_log_slab"), JUNGLE_LOG_SLAB)
        Block.registerBlock(ResourceLocation("halflogs:acacia_log_slab"), ACACIA_LOG_SLAB)
        Block.registerBlock(ResourceLocation("halflogs:dark_oak_log_slab"), DARK_OAK_LOG_SLAB)
        Block.registerBlock(ResourceLocation("halflogs:stripped_oak_log_slab"), STRIPPED_OAK_LOG_SLAB)
        Block.registerBlock(ResourceLocation("halflogs:stripped_spruce_log_slab"), STRIPPED_SPRUCE_LOG_SLAB)
        Block.registerBlock(ResourceLocation("halflogs:stripped_birch_log_slab"), STRIPPED_BIRCH_LOG_SLAB)
        Block.registerBlock(ResourceLocation("halflogs:stripped_jungle_log_slab"), STRIPPED_JUNGLE_LOG_SLAB)
        Block.registerBlock(ResourceLocation("halflogs:stripped_acacia_log_slab"), STRIPPED_ACACIA_LOG_SLAB)
        Block.registerBlock(ResourceLocation("halflogs:stripped_dark_oak_log_slab"), STRIPPED_DARK_OAK_LOG_SLAB)
    }

    override fun registerItems() {
        Item.registerItemBlock(OAK_LOG_SLAB, ItemGroup.BUILDING_BLOCKS)
        Item.registerItemBlock(SPRUCE_LOG_SLAB, ItemGroup.BUILDING_BLOCKS)
        Item.registerItemBlock(BIRCH_LOG_SLAB, ItemGroup.BUILDING_BLOCKS)
        Item.registerItemBlock(JUNGLE_LOG_SLAB, ItemGroup.BUILDING_BLOCKS)
        Item.registerItemBlock(ACACIA_LOG_SLAB, ItemGroup.BUILDING_BLOCKS)
        Item.registerItemBlock(DARK_OAK_LOG_SLAB, ItemGroup.BUILDING_BLOCKS)
        Item.registerItemBlock(STRIPPED_OAK_LOG_SLAB, ItemGroup.BUILDING_BLOCKS)
        Item.registerItemBlock(STRIPPED_SPRUCE_LOG_SLAB, ItemGroup.BUILDING_BLOCKS)
        Item.registerItemBlock(STRIPPED_BIRCH_LOG_SLAB, ItemGroup.BUILDING_BLOCKS)
        Item.registerItemBlock(STRIPPED_JUNGLE_LOG_SLAB, ItemGroup.BUILDING_BLOCKS)
        Item.registerItemBlock(STRIPPED_ACACIA_LOG_SLAB, ItemGroup.BUILDING_BLOCKS)
        Item.registerItemBlock(STRIPPED_DARK_OAK_LOG_SLAB, ItemGroup.BUILDING_BLOCKS)
    }
}
