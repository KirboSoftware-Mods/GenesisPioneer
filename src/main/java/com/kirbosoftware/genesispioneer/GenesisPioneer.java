package com.kirbosoftware.genesispioneer;

import com.kirbosoftware.genesispioneer.config.GPConfig;
import com.kirbosoftware.genesispioneer.item.GPItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GenesisPioneer implements ModInitializer {
    private static final String MOD_ID = "genesispioneer";

    public static @NotNull ResourceLocation id(String name) {
        return new ResourceLocation(MOD_ID, name);
    }
    public static Logger LOGGER = LoggerFactory.getLogger("Genesis: Pioneer");

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing components....");

        GPConfig.INSTANCE.save();
        GPConfig.INSTANCE.load();

        GPItems.init();

        LOGGER.info("Initializing done! Enjoy the early game progression....");
    }
}
