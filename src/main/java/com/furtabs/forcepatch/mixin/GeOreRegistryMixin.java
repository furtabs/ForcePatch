package com.furtabs.forcepatch.mixin;

import com.shynieke.geore.registry.GeOreRegistry;
import com.shynieke.geore.registry.GeOreBlockReg;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.lang.reflect.Field;
import java.util.List;

@Mixin(GeOreRegistry.class)
public class GeOreRegistryMixin {

    @Inject(method = "<clinit>", at = @At("TAIL"))
    private static void addForceGeOre(CallbackInfo ci) {
        try {
            // Access the private GEORES list using reflection
            Field georesField = GeOreRegistry.class.getDeclaredField("GEORES");
            georesField.setAccessible(true);
            @SuppressWarnings("unchecked")
            List<GeOreBlockReg> geores = (List<GeOreBlockReg>) georesField.get(null);
            
            // Create force geore manually
            GeOreBlockReg forceGeore = new GeOreBlockReg("force", MapColor.COLOR_PURPLE, () -> new Item(new Item.Properties()), 0x8B008B);
            geores.add(forceGeore);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            // If reflection fails, the force geore will still work through data files
            System.err.println("Failed to add force geore programmatically: " + e.getMessage());
        }
    }
}
