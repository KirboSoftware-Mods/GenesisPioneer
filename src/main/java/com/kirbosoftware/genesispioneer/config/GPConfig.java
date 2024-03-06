package com.kirbosoftware.genesispioneer.config;

import dev.isxander.yacl3.config.v2.api.ConfigClassHandler;
import dev.isxander.yacl3.config.v2.api.SerialEntry;
import dev.isxander.yacl3.config.v2.api.serializer.GsonConfigSerializerBuilder;
import dev.isxander.yacl3.platform.YACLPlatform;

public class GPConfig {
    public static final ConfigClassHandler<GPConfig> INSTANCE = ConfigClassHandler.createBuilder(GPConfig.class)
            .serializer(config -> GsonConfigSerializerBuilder.create(config)
                    .setJson5(true)
                    .setPath(YACLPlatform.getConfigDir().resolve("genesis_pioneer.json5"))
                    .build()
            ).build();

    @SerialEntry(comment = "Enable/Disable this setting to either enable or disable tree punching")
    public boolean booleanAllowTreePunching = false;
}
