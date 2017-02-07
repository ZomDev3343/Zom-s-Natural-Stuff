package fr.zomdev.zomnaturalstuff.items;

import fr.zomdev.zomnaturalstuff.ZomNaturalStuff;
import net.minecraft.item.Item;

/**
 * Created by ZomDev on 06/02/2017.
 */
public class ZNSItem extends Item {

    public ZNSItem(String name) {
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(ZomNaturalStuff.tab);
    }
}
