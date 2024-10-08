package net.optionalpoop.stufftotestwith.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.optionalpoop.stufftotestwith.StuffToTestWith;
import net.minecraft.util.Identifier;
import net.optionalpoop.stufftotestwith.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(StuffToTestWith.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.SONIC);
                        entries.add(ModItems.SIGMA);
                        entries.add(ModItems.YOURBROTHERISDEAD);

                        entries.add(ModItems.BARTSIMPSON);

                        entries.add(ModItems.METAL_DETECTOR);

                        entries.add(ModBlocks.MUSICMAN);

                        entries.add(ModBlocks.POULTRYMAN);
                        entries.add(ModBlocks.PIKACHU);

                    }).build());


    public static void registerItemGroups() {
        StuffToTestWith.LOGGER.info("Registering Item Groups for " + StuffToTestWith.MOD_ID);
    }
}
