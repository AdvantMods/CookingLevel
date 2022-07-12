package com.paperteam.cookinglevel.setup;

import com.paperteam.cookinglevel.CookingLevel;
import com.paperteam.cookinglevel.item.food.Cucumber;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Registration {
    public static final DeferredRegister<Item> ITEM = DeferredRegister.create(ForgeRegistries.ITEMS, CookingLevel.ModId);

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ITEM.register(bus);
    }
    public static final RegistryObject<Item> CUCUMBER = ITEM.register("cucumber", Cucumber::new);
}