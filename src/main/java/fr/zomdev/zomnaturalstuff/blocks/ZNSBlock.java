package fr.zomdev.zomnaturalstuff.blocks;

import fr.zomdev.zomnaturalstuff.ZomNaturalStuff;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by ZomDev on 06/02/2017.
 */
public class ZNSBlock extends Block {

    public ZNSBlock(String name) {
        super(Material.ROCK);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(ZomNaturalStuff.tab);
    }


}
