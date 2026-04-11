package net.toughnut.tutorialmod.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.toughnut.tutorialmod.block.ModBlocks;

public class GoofyBlock extends Block {

    public GoofyBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void onPlace(BlockState state, Level level, BlockPos pos,
                        BlockState oldState, boolean isMoving) {

        if (!level.isClientSide && state.getBlock() == this) {
            level.setBlock(pos, Blocks.ACACIA_DOOR.defaultBlockState(), 3);
        }
    }
}
