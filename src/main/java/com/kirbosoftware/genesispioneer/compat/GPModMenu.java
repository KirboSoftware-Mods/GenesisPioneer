package com.kirbosoftware.genesispioneer.compat;

import com.kirbosoftware.genesispioneer.client.screens.config.GPConfigGui;
import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;

public class GPModMenu implements ModMenuApi {
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return GPConfigGui::getModConfigScreenFactory;
    }
}
