package com.kirbosoftware.genesispioneer.data.gen.provider;

import com.kirbosoftware.genesispioneer.item.GPItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelTemplates;

public class GPModelProvider extends FabricModelProvider {
    public GPModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        GPItems.ITEMS.forEach((s, item) -> itemModelGenerator.generateFlatItem(item, ModelTemplates.FLAT_ITEM));
    }
}
