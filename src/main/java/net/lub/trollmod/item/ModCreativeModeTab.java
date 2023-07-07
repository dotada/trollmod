package net.lub.trollmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ModCreativeModeTab {
    public static final CreativeModeTab CHEESES_TAB = new CreativeModeTab("cheesestab") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ModItems.cheeseore.get());
        }
    };
}
