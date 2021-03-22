package com.example.examplemod;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.client.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

@Mod.EventBusSubscriber
public class CommonProxy {

    private static void registerRender (Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
    }

    @SubscribeEvent
    public static void RegisterItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ExampleMod.mySword);
    }
}
