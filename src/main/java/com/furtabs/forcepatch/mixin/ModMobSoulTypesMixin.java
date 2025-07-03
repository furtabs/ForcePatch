package com.furtabs.forcepatch.mixin;

import com.blakebr0.mysticalagriculture.api.registry.IMobSoulTypeRegistry;
import com.blakebr0.mysticalagriculture.api.soul.MobSoulType;
import com.blakebr0.mysticalagriculture.lib.ModMobSoulTypes;
import com.blakebr0.mysticalagriculture.MysticalAgriculture;
import net.minecraft.resources.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ModMobSoulTypes.class)
public class ModMobSoulTypesMixin {

    @Inject(method = "onRegisterMobSoulTypes", at = @At("TAIL"))
    private static void onRegisterMobSoulTypes(IMobSoulTypeRegistry registry, CallbackInfo ci) {
        MobSoulType bat = new MobSoulType(MysticalAgriculture.resource("bat"), ResourceLocation.parse("minecraft:bat"), 6, 0x4A4A4A);
        registry.register(bat);
    }
}