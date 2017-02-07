package fr.zomdev.zomnaturalstuff.proxy;

import fr.zomdev.zomnaturalstuff.init.ModBlocks;
import fr.zomdev.zomnaturalstuff.init.ModItems;

/**
 * Created by ZomDev on 06/02/2017.
 */
public class CommonProxy {

    public void preInit(){
        new ModItems();
        new ModBlocks();
    }

    public void init(){

    }

    public void postInit(){

    }

}
