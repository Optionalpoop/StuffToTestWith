package net.optionalpoop.stufftotestwith.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.optionalpoop.stufftotestwith.StuffToTestWith;
import net.optionalpoop.stufftotestwith.block.custom.SoundBlock;


public class ModBlocks {
    public static final Block POULTRYMAN = registerBlock("poultryman",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block PIKACHU = registerBlock("pikachu",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));


    public static final Block MUSICMAN = registerBlock("musicman",
            new SoundBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(StuffToTestWith.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(StuffToTestWith.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        StuffToTestWith.LOGGER.info("Registering ModBlocks for " + StuffToTestWith.MOD_ID);
    }
}
