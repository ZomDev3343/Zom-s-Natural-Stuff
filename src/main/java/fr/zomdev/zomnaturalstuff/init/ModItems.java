package fr.zomdev.zomnaturalstuff.init;

import fr.zomdev.zomnaturalstuff.items.ZNSItem;
import fr.zomdev.zomnaturalstuff.utils.References;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by ZomDev on 06/02/2017.
 */
public class ModItems {

    public static Item naturalGem;
    private Item[] allItems;

    public ModItems() {
        init();
        registers();
        registerRenders();
    }

    private void init() {
        naturalGem = new ZNSItem("naturalGem");


        this.allItems = new Item[]{naturalGem};
    }

    private void registers() {
        for(Item item : this.allItems){
            GameRegistry.register(item);
        }
    }

    @SideOnly(Side.CLIENT)
    private void registerRenders() {
        for(Item item : this.allItems){
            registerRender(item);
        }
    }

    private void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(References.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
    }

    private void registerRenderMeta(Item item, int meta){
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(References.MODID, item.getUnlocalizedName().substring(5) + "_" + meta), "inventory"));
    }

}
