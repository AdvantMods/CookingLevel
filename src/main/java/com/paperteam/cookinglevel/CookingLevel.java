package com.paperteam.cookinglevel;

import com.paperteam.cookinglevel.setup.ModSetup;
import com.paperteam.cookinglevel.setup.Registration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(CookingLevel.ModId)
@Mod.EventBusSubscriber(modid = CookingLevel.ModId, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CookingLevel {
    public static final String ModId = "cookinglevel";
    public static final Logger LOGGER = LogManager.getLogger();

    public CookingLevel() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        IEventBus forgeEventBus = MinecraftForge.EVENT_BUS;

        Registration.init();

        eventBus.addListener(ModSetup::init);
    }
}