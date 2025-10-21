package com.furtabs.forcepatch.mixin;

import com.shynieke.geore.registry.GeOreRegistry;
import com.shynieke.geore.registry.GeOreBlockReg;
import net.minecraft.world.level.material.MapColor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GeOreRegistry.class)
public class GeOreRegistryMixin {

    @Inject(method = "<clinit>", at = @At("TAIL"))
    private static void addForceGeOre(CallbackInfo ci) {
        // Add force geore to the registry
        GeOreBlockReg FORCE_GEORE = GeOreRegistry.createGeOre("force", MapColor.COLOR_PURPLE, 0x8B008B);
    }
}
