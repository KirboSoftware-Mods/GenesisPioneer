package com.kirbosoftware.genesispioneer.item;

import com.kirbosoftware.genesispioneer.GenesisPioneer;
import com.kirbosoftware.genesispioneer.item.custom.ChiselItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;

import java.util.HashMap;
import java.util.Map;

public class GPItems {
    public static Map<String,Item> ITEMS = new HashMap<>();
    public static final Item GRASS_FIBER = new Item(new Item.Properties());
    public static final Item GRASS_FIBER_BINDER = new Item(new Item.Properties());
    public static final Item FLINT_CHISEL = new ChiselItem(100, new Item.Properties());

    static {
        ITEMS.put("grass_fiber", GRASS_FIBER);
        ITEMS.put("grass_fiber_binder", GRASS_FIBER_BINDER);
        ITEMS.put("flint_chisel", FLINT_CHISEL);
    }

    public static void init() {
        ITEMS.forEach(GPItems::register);
    }

    private static void register(String name, Item item) {
        Registry.register(BuiltInRegistries.ITEM, GenesisPioneer.id(name), item);
    }
}
