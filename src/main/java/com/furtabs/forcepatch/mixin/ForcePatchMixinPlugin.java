package com.furtabs.forcepatch.mixin;

import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

import java.util.List;
import java.util.Set;

public class ForcePatchMixinPlugin implements IMixinConfigPlugin {
    @Override
    public void onLoad(String mixinPackage) {}

    @Override
    public String getRefMapperConfig() { return null; }

    @Override
    public boolean shouldApplyMixin(String targetClassName, String mixinClassName) {
        if (mixinClassName.endsWith("ModCropsMixin") || mixinClassName.endsWith("ModMobSoulTypesMixin")) {
            try {
                Class.forName("com.blakebr0.mysticalagriculture.MysticalAgriculture");
                return true;
            } catch (ClassNotFoundException e) {
                return false;
            }
        }
        if (mixinClassName.endsWith("GeOreRegistryMixin")) {
            try {
                Class.forName("com.shynieke.geore.registry.GeOreRegistry");
                return true;
            } catch (ClassNotFoundException e) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void acceptTargets(Set<String> myTargets, Set<String> otherTargets) {}

    @Override
    public List<String> getMixins() { return null; }

    @Override
    public void postApply(String targetClassName, org.objectweb.asm.tree.ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {}

    @Override
    public void preApply(String targetClassName, org.objectweb.asm.tree.ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {}
}