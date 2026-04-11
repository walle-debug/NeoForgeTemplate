package net.toughnut.tutorialmod.item.custom;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.toughnut.tutorialmod.block.ModBlocks;


import java.util.Map;

public class GarnetChiselItem extends Item{
    public GarnetChiselItem(Properties properties) {
        super(properties);
    }
    private static final Map<Block, Block> GARNET_CHISEL_MAP = Map.of(
            Blocks.DIAMOND_BLOCK, Blocks.DIRT,
            Blocks.DIRT, Blocks.DIAMOND_BLOCK,
            Blocks.STONE, Blocks.STONE_BRICKS,
            Blocks.STONE_BRICKS, Blocks.STONE,
            Blocks.END_STONE, Blocks.END_STONE_BRICKS,
            ModBlocks.MORPHER_BLOCK.get(), ModBlocks.MAGIC_BLOCK.get(),
            Blocks.AMETHYST_BLOCK, Blocks.BEDROCK,
            Blocks.BEDROCK, Blocks.AMETHYST_BLOCK
    );

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        Block clickedBlock = level.getBlockState(context.getClickedPos()).getBlock();
        if(GARNET_CHISEL_MAP.containsKey(clickedBlock)){
            if(!level.isClientSide){
                level.setBlockAndUpdate(context.getClickedPos(), GARNET_CHISEL_MAP.get(clickedBlock).defaultBlockState());
            }
        }

        return super.useOn(context);
    }
}
