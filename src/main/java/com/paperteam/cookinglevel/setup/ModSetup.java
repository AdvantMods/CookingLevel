package com.paperteam.cookinglevel.setup;

import com.paperteam.cookinglevel.CookingLevel;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import org.jetbrains.annotations.NotNull;

@Mod.EventBusSubscriber(modid = CookingLevel.ModId, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModSetup {

    public static final CreativeModeTab CLASSIC_TAB = new CreativeModeTab(CookingLevel.ModId + ".classic_tab") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(Registration.CUCUMBER.get());
        }
    };

    public static void init(final FMLCommonSetupEvent event) {

    }
}