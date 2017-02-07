package fr.zomdev.zomnaturalstuff;

import fr.zomdev.zomnaturalstuff.init.ModItems;
import fr.zomdev.zomnaturalstuff.proxy.CommonProxy;
import fr.zomdev.zomnaturalstuff.utils.References;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by ZomDev on 06/02/2017.
 */
@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION)
public class ZomNaturalStuff {

    @Mod.Instance(References.MODID)
    public static ZomNaturalStuff instance;

    @SidedProxy(clientSide = References.CLIENT_PROXY, serverSide = References.SERVER_PROXY)
    public static CommonProxy proxy;

    public static CreativeTabs tab = new CreativeTabs("zomnaturalstuff_tab") {
        @Override
        public Item getTabIconItem() {
            return ModItems.naturalGem;
        }
    };

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e){
        proxy.preInit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e){
        proxy.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e){
        proxy.postInit();
    }
}
