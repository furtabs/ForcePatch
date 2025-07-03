package com.furtabs.forcepatch;

import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.bus.api.SubscribeEvent;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL43;
import org.lwjgl.opengl.GLDebugMessageCallback;

@Mod(ForcePatch.MODID)
public class ForcePatch {
    public static final String MODID = "forcepatch";
}