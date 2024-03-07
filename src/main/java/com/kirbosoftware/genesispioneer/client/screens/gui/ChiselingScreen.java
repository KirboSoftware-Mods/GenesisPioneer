package com.kirbosoftware.genesispioneer.client.screens.gui;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;

public class ChiselingScreen extends Screen {
    private static ItemStack itemStack;

    public ChiselingScreen(Component component, ItemStack stack) {
        super(component);
        itemStack = stack;
    }

    @Override
    public void renderDirtBackground(GuiGraphics guiGraphics) {
        super.renderDirtBackground(guiGraphics);
    }

    //    @Override
//    public void renderBackground(GuiGraphics guiGraphics) {
//        guiGraphics.renderFakeItem(itemStack, 10, 10);
//        super.renderBackground(guiGraphics);
//    }
}
