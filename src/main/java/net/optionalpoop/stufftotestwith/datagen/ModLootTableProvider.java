package net.optionalpoop.stufftotestwith.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.optionalpoop.stufftotestwith.block.ModBlocks;
import net.optionalpoop.stufftotestwith.item.ModItems;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.MUSICMAN);
        addDrop(ModBlocks.PIKACHU);

        // First thing (ModBlocks) is with Silk Touch, ModItems is normal drop!

        addDrop(ModBlocks.POULTRYMAN, oreDrops(ModBlocks.POULTRYMAN, ModItems.SIGMA));
    }
}
