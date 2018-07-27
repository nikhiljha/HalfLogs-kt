package org.dimdev.halflogs

import net.minecraft.block.Block
import net.minecraft.block.BlockSlab
import net.minecraft.block.BlockStairs
import net.minecraft.block.SoundType
import net.minecraft.block.material.MapColor
import net.minecraft.block.material.Material
import net.minecraft.init.Blocks
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.util.ResourceLocation
import org.dimdev.rift.listener.BlockAdder
import org.dimdev.rift.listener.ItemAdder

class HalfLogs : BlockAdder, ItemAdder {

    //Slabs
    internal var OAK_LOG_SLAB: Block = BlockSlab(Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0f, 3.0f).soundType(SoundType.WOOD))
    internal var SPRUCE_LOG_SLAB: Block = BlockSlab(Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0f, 3.0f).soundType(SoundType.WOOD))
    internal var BIRCH_LOG_SLAB: Block = BlockSlab(Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0f, 3.0f).soundType(SoundType.WOOD))
    internal var JUNGLE_LOG_SLAB: Block = BlockSlab(Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0f, 3.0f).soundType(SoundType.WOOD))
    internal var ACACIA_LOG_SLAB: Block = BlockSlab(Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0f, 3.0f).soundType(SoundType.WOOD))
    internal var DARK_OAK_LOG_SLAB: Block = BlockSlab(Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0f, 3.0f).soundType(SoundType.WOOD))
    //Stripped
    internal var STRIPPED_OAK_LOG_SLAB: Block = BlockSlab(Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0f, 3.0f).soundType(SoundType.WOOD))
    internal var STRIPPED_SPRUCE_LOG_SLAB: Block = BlockSlab(Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0f, 3.0f).soundType(SoundType.WOOD))
    internal var STRIPPED_BIRCH_LOG_SLAB: Block = BlockSlab(Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0f, 3.0f).soundType(SoundType.WOOD))
    internal var STRIPPED_JUNGLE_LOG_SLAB: Block = BlockSlab(Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0f, 3.0f).soundType(SoundType.WOOD))
    internal var STRIPPED_ACACIA_LOG_SLAB: Block = BlockSlab(Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0f, 3.0f).soundType(SoundType.WOOD))
    internal var STRIPPED_DARK_OAK_LOG_SLAB: Block = BlockSlab(Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0f, 3.0f).soundType(SoundType.WOOD))

    //Stairs
    internal var OAK_LOG_STAIRS: Block = LOG_STAIRS.invoke()
    internal var SPRUCE_LOG_STAIRS: Block = LOG_STAIRS.invoke()
    internal var BIRCH_LOG_STAIRS: Block = LOG_STAIRS.invoke()
    internal var JUNGLE_LOG_STAIRS: Block = LOG_STAIRS.invoke()
    internal var ACACIA_LOG_STAIRS: Block = LOG_STAIRS.invoke()
    internal var DARK_OAK_LOG_STAIRS: Block = LOG_STAIRS.invoke()
    //Stripped
    internal var STRIPPED_OAK_LOG_STAIRS: Block = LOG_STAIRS.invoke()
    internal var STRIPPED_SPRUCE_LOG_STAIRS: Block = LOG_STAIRS.invoke()
    internal var STRIPPED_BIRCH_LOG_STAIRS: Block = LOG_STAIRS.invoke()
    internal var STRIPPED_JUNGLE_LOG_STAIRS: Block = LOG_STAIRS.invoke()
    internal var STRIPPED_ACACIA_LOG_STAIRS: Block = LOG_STAIRS.invoke()
    internal var STRIPPED_DARK_OAK_LOG_STAIRS: Block = LOG_STAIRS.invoke()

    override fun registerBlocks() {
        //Slabs
        Block.registerBlock(ResourceLocation("halflogs:oak_log_slab"), OAK_LOG_SLAB)
        Block.registerBlock(ResourceLocation("halflogs:spruce_log_slab"), SPRUCE_LOG_SLAB)
        Block.registerBlock(ResourceLocation("halflogs:birch_log_slab"), BIRCH_LOG_SLAB)
        Block.registerBlock(ResourceLocation("halflogs:jungle_log_slab"), JUNGLE_LOG_SLAB)
        Block.registerBlock(ResourceLocation("halflogs:acacia_log_slab"), ACACIA_LOG_SLAB)
        Block.registerBlock(ResourceLocation("halflogs:dark_oak_log_slab"), DARK_OAK_LOG_SLAB)
        //Stripped
        Block.registerBlock(ResourceLocation("halflogs:stripped_oak_log_slab"), STRIPPED_OAK_LOG_SLAB)
        Block.registerBlock(ResourceLocation("halflogs:stripped_spruce_log_slab"), STRIPPED_SPRUCE_LOG_SLAB)
        Block.registerBlock(ResourceLocation("halflogs:stripped_birch_log_slab"), STRIPPED_BIRCH_LOG_SLAB)
        Block.registerBlock(ResourceLocation("halflogs:stripped_jungle_log_slab"), STRIPPED_JUNGLE_LOG_SLAB)
        Block.registerBlock(ResourceLocation("halflogs:stripped_acacia_log_slab"), STRIPPED_ACACIA_LOG_SLAB)
        Block.registerBlock(ResourceLocation("halflogs:stripped_dark_oak_log_slab"), STRIPPED_DARK_OAK_LOG_SLAB)

        //Stairs
        Block.registerBlock(ResourceLocation("halflogs:oak_log_stairs"), OAK_LOG_STAIRS)
        Block.registerBlock(ResourceLocation("halflogs:spruce_log_stairs"), SPRUCE_LOG_STAIRS)
        Block.registerBlock(ResourceLocation("halflogs:birch_log_stairs"), BIRCH_LOG_STAIRS)
        Block.registerBlock(ResourceLocation("halflogs:jungle_log_stairs"), JUNGLE_LOG_STAIRS)
        Block.registerBlock(ResourceLocation("halflogs:acacia_log_stairs"), ACACIA_LOG_STAIRS)
        Block.registerBlock(ResourceLocation("halflogs:dark_oak_log_stairs"), DARK_OAK_LOG_STAIRS)
        //Stripped
        Block.registerBlock(ResourceLocation("halflogs:stripped_oak_log_stairs"), STRIPPED_OAK_LOG_STAIRS)
        Block.registerBlock(ResourceLocation("halflogs:stripped_spruce_log_stairs"), STRIPPED_SPRUCE_LOG_STAIRS)
        Block.registerBlock(ResourceLocation("halflogs:stripped_birch_log_stairs"), STRIPPED_BIRCH_LOG_STAIRS)
        Block.registerBlock(ResourceLocation("halflogs:stripped_jungle_log_stairs"), STRIPPED_JUNGLE_LOG_STAIRS)
        Block.registerBlock(ResourceLocation("halflogs:stripped_acacia_log_stairs"), STRIPPED_ACACIA_LOG_STAIRS)
        Block.registerBlock(ResourceLocation("halflogs:stripped_dark_oak_log_stairs"), STRIPPED_DARK_OAK_LOG_STAIRS)
    }

    override fun registerItems() {
        //Slabs
        Item.registerItemBlock(OAK_LOG_SLAB, ItemGroup.BUILDING_BLOCKS)
        Item.registerItemBlock(SPRUCE_LOG_SLAB, ItemGroup.BUILDING_BLOCKS)
        Item.registerItemBlock(BIRCH_LOG_SLAB, ItemGroup.BUILDING_BLOCKS)
        Item.registerItemBlock(JUNGLE_LOG_SLAB, ItemGroup.BUILDING_BLOCKS)
        Item.registerItemBlock(ACACIA_LOG_SLAB, ItemGroup.BUILDING_BLOCKS)
        Item.registerItemBlock(DARK_OAK_LOG_SLAB, ItemGroup.BUILDING_BLOCKS)
        //Stripped
        Item.registerItemBlock(STRIPPED_OAK_LOG_SLAB, ItemGroup.BUILDING_BLOCKS)
        Item.registerItemBlock(STRIPPED_SPRUCE_LOG_SLAB, ItemGroup.BUILDING_BLOCKS)
        Item.registerItemBlock(STRIPPED_BIRCH_LOG_SLAB, ItemGroup.BUILDING_BLOCKS)
        Item.registerItemBlock(STRIPPED_JUNGLE_LOG_SLAB, ItemGroup.BUILDING_BLOCKS)
        Item.registerItemBlock(STRIPPED_ACACIA_LOG_SLAB, ItemGroup.BUILDING_BLOCKS)
        Item.registerItemBlock(STRIPPED_DARK_OAK_LOG_SLAB, ItemGroup.BUILDING_BLOCKS)

        //Stairs
        Item.registerItemBlock(OAK_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS)
        Item.registerItemBlock(SPRUCE_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS)
        Item.registerItemBlock(BIRCH_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS)
        Item.registerItemBlock(JUNGLE_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS)
        Item.registerItemBlock(ACACIA_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS)
        Item.registerItemBlock(DARK_OAK_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS)
        //Stripped
        Item.registerItemBlock(STRIPPED_OAK_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS)
        Item.registerItemBlock(STRIPPED_SPRUCE_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS)
        Item.registerItemBlock(STRIPPED_BIRCH_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS)
        Item.registerItemBlock(STRIPPED_JUNGLE_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS)
        Item.registerItemBlock(STRIPPED_ACACIA_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS)
        Item.registerItemBlock(STRIPPED_DARK_OAK_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS)
    }

    companion object {

        private val LOG_STAIRS = {
            val block = Blocks.OAK_LOG

            object : BlockStairs(block.defaultState, Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0f, 3.0f).soundType(SoundType.WOOD)) {

            }
        }
    }
}
