package net.toughnut.tutorialmod.utils;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.toughnut.tutorialmod.item.ModItems;

import java.util.function.Supplier;

import static net.toughnut.tutorialmod.block.ModBlocks.BLOCKS;

public class RegistryHelper {
    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.
                register(name, () -> new BlockItem( block.get(), new Item.Properties()));
    }
    public static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block, DeferredRegister.Blocks BLOCK){
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }


}
