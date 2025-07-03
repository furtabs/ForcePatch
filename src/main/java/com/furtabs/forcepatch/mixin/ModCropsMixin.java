package com.furtabs.forcepatch.mixin;

import com.blakebr0.mysticalagriculture.api.crop.Crop;
import com.blakebr0.mysticalagriculture.api.crop.CropTier;
import com.blakebr0.mysticalagriculture.api.crop.CropType;
import com.blakebr0.mysticalagriculture.api.registry.ICropRegistry;
import com.blakebr0.mysticalagriculture.api.lib.LazyIngredient;
import com.blakebr0.mysticalagriculture.api.util.MobSoulUtils;
import com.blakebr0.mysticalagriculture.api.soul.MobSoulType;
import com.blakebr0.mysticalagriculture.lib.ModCrops;
import com.blakebr0.mysticalagriculture.MysticalAgriculture;
import net.minecraft.resources.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ModCrops.class)
public class ModCropsMixin {

    @Inject(method = "onRegisterCrops", at = @At("TAIL"))
    private static void onRegisterCrops(ICropRegistry registry, CallbackInfo ci) {
        Crop FORCE = new Crop(MysticalAgriculture.resource("force"), CropTier.FOUR, CropType.RESOURCE, LazyIngredient.item("forcecraft:force_gem"));
        registry.register(FORCE);
        
        MobSoulType bat = new MobSoulType(MysticalAgriculture.resource("bat"), ResourceLocation.parse("minecraft:bat"), 6, 0x4A4A4A);
        Crop BAT = new Crop(MysticalAgriculture.resource("bat"), CropTier.TWO, CropType.RESOURCE, LazyIngredient.item("mysticalagriculture:soul_jar", MobSoulUtils.makeComponentMap(bat)));
        registry.register(BAT);
    }
}