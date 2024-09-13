package net.optionalpoop.stufftotestwith.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.optionalpoop.stufftotestwith.block.ModBlocks;
import net.optionalpoop.stufftotestwith.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POULTRYMAN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PIKACHU);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MUSICMAN);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.BARTSIMPSON, Models.GENERATED);
        itemModelGenerator.register(ModItems.SIGMA, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.SONIC, Models.GENERATED);
        itemModelGenerator.register(ModItems.YOURBROTHERISDEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.METAL_DETECTOR, Models.GENERATED);

    }
}
