package net.toughnut.tutorialmod.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.toughnut.tutorialmod.TutorialMod;

import net.toughnut.tutorialmod.block.custom.MagicBlock;
import net.toughnut.tutorialmod.utils.RegistryHelper;



public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(TutorialMod.MOD_ID);

public static final DeferredBlock<Block> BISMUTH_BLOCK = RegistryHelper.registerBlock("bismuth_block",
        () -> new Block(BlockBehaviour.Properties.of()
                .strength(4f)
                .requiresCorrectToolForDrops()
                .sound(SoundType.AMETHYST_CLUSTER)), BLOCKS);

    public static final DeferredBlock<Block> BISMUTH_ORE = RegistryHelper.registerBlock("bismuth_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 4),
                    BlockBehaviour.Properties.of()
                            .strength(3f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.AMETHYST)), BLOCKS);

    public static final DeferredBlock<Block> BISMUTH_DEEPSLATE_ORE = RegistryHelper.registerBlock("bismuth_deepslate_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 5),
                    BlockBehaviour.Properties.of()
                            .strength(5f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.AMETHYST_CLUSTER)), BLOCKS);
    public static final DeferredBlock<Block> MAGIC_BLOCK = RegistryHelper.registerBlock("magic_block", () ->
            new MagicBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.FROGLIGHT)
                    .requiresCorrectToolForDrops()), BLOCKS);

    public static void register(IEventBus eventbus){
        BLOCKS.register(eventbus);
    }
}
