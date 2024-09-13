package net.optionalpoop.stufftotestwith.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.optionalpoop.stufftotestwith.block.ModBlocks;
import net.optionalpoop.stufftotestwith.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

    private static Object Items;
    private static List<ItemConvertible> SIGMA_SMELTABLES = List.of(ModBlocks.MUSICMAN, ModBlocks.PIKACHU, ModBlocks.POULTRYMAN, net.minecraft.item.Items.STICK);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, SIGMA_SMELTABLES, RecipeCategory.MISC, ModItems.SIGMA, 1.0f, 100, "sigma");
        offerBlasting(exporter, SIGMA_SMELTABLES, RecipeCategory.MISC, ModItems.SIGMA, 1.0f, 10, "sigma");
    }


}
