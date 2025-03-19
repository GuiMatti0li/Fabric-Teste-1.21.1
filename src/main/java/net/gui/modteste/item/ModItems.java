package net.gui.modteste.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.gui.modteste.ModTeste;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ROGUE_COMBINER = registerItem("rogue_combiner", new Item(new Item.Settings()));
    //public static final Item ROGUE_PANDA = registerItem


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(ModTeste.MOD_ID, name), item);
    }

    //Registering mod Items
    public static void registerModItems(){
        ModTeste.LOGGER.info("Registering Mod Items for " + ModTeste.MOD_ID);

        //registers items in the "Tools" creative tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
           entries.add(ROGUE_COMBINER); //item to be added
        });
    }
}
