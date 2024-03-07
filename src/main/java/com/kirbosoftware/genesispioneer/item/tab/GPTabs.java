package com.kirbosoftware.genesispioneer.item.tab;

import com.kirbosoftware.genesispioneer.GenesisPioneer;
import com.kirbosoftware.genesispioneer.item.GPItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;

import java.util.HashMap;
import java.util.Map;

public class GPTabs {
    public static Map<String, CreativeModeTab> TABs = new HashMap<>();

    public static CreativeModeTab MAIN = FabricItemGroup.builder()
            .icon(GPItems.FLINT_CHISEL::getDefaultInstance)
            .title(Component.translatable("itemGroup.genesispioneer.main"))
            .displayItems((itemDisplayParameters, output) -> GPItems.ITEMS.forEach((s, item) -> output.accept(item)))
            .build();

    static {
        register("main", MAIN);
    }

    public static void init() {
        TABs.forEach(GPTabs::register);
    }

    private static void register(String name, CreativeModeTab tab) {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, GenesisPioneer.id(name), tab);
    }
}
