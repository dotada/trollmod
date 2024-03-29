package net.lub.trollmod.item;

import net.lub.trollmod.TrollMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TrollMod.MOD_ID);


    public static final RegistryObject<Item> cheeseore = ITEMS.register("cheese_ore",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CHEESES_TAB)));

    public static final RegistryObject<Item> plastic = ITEMS.register("plastic",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CHEESES_TAB)));

    public static final RegistryObject<Item> radcheese = ITEMS.register("radcheese",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CHEESES_TAB)));

    public static final RegistryObject<Item> sc = ITEMS.register("sc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CHEESES_TAB)));

    public static final RegistryObject<Item> tube = ITEMS.register("tube",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CHEESES_TAB)));

    public static final RegistryObject<Item> rod = ITEMS.register("rod",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CHEESES_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
