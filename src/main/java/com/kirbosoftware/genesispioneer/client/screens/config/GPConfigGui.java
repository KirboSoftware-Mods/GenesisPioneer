package com.kirbosoftware.genesispioneer.client.screens.config;

import com.kirbosoftware.genesispioneer.config.GPConfig;
import dev.isxander.yacl3.api.*;
import dev.isxander.yacl3.api.controller.BooleanControllerBuilder;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

public class GPConfigGui {
    public static Screen getModConfigScreenFactory(Screen parent) {
        return YetAnotherConfigLib.create(GPConfig.INSTANCE, ((defaults, config, builder) -> builder
                .title(Component.literal("Genesis: Pioneer"))
                .category(ConfigCategory.createBuilder()
                        .name(Component.literal("Gameplay"))
                        .option(
                                Option.<Boolean>createBuilder()
                                .name(Component.literal("Tree punching"))
                                .description(OptionDescription.of(Component.literal("""
                                If you want the full immersion of this mod, you should disable this setting.\s
                                However, if you desire to enable it. You do have the option to do so!
                                """
                                )))
                                .binding(
                                        false,
                                        () -> defaults.booleanAllowTreePunching,
                                        (newVal) -> defaults.booleanAllowTreePunching = newVal
                                )
                                .controller(opt -> BooleanControllerBuilder.create(opt)
                                        .formatValue(value -> value ? Component.literal("Enabled") : Component.literal("Disabled"))
                                )
                                .build()
                        )
                        .build()
                )
        )).generateScreen(parent);
    }
}
