package com.example.examplemod;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

@Mod.EventBusSubscriber
public class CommonProxy {
    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        registerRender(ExampleMod.mySword);
    }

    private static void registerRender (Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
    }

    @SubscribeEvent
    public static void RegisterItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ExampleMod.mySword);
    }
}
