package net.lub.trollmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab CHEESES_TAB = new CreativeModeTab("cheesestab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.cheddarcheese.get());
        }
    };
}
