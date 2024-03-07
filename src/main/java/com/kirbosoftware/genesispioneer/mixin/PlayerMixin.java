package com.kirbosoftware.genesispioneer.mixin;

import com.kirbosoftware.genesispioneer.config.GPConfig;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Player.class)
public abstract class PlayerMixin {
    @Shadow @Final private Inventory inventory;

    @Inject(method = "getDestroySpeed", at = @At("RETURN"), cancellable = true)
    private void genesis_pioneer$getDestroySpeed(@NotNull BlockState blockState, CallbackInfoReturnable<Float> cir) {
        Item item = this.inventory.getSelected().getItem();
        if (blockState.is(BlockTags.LOGS) && !(item instanceof AxeItem)) {
            if (!GPConfig.INSTANCE.instance().booleanAllowTreePunching) {
                cir.setReturnValue(0.0f);
            }
        }
    }
}
