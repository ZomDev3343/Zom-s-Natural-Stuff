package fr.zomdev.zomnaturalstuff.init;

import fr.zomdev.zomnaturalstuff.blocks.ZNSBlock;
import fr.zomdev.zomnaturalstuff.utils.References;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by ZomDev on 06/02/2017.
 */
public class ModBlocks {

    public static Block oreNaturalGem;

    private Block[] blocks;

    public ModBlocks() {
        init();
        registers();
        registerItemBlocks();
        registerRenders();
    }

    private void registerItemBlocks() {
        for(Block block : this.blocks){
            ItemBlock ib = new ItemBlock(block);
            ib.setRegistryName(block.getRegistryName());

            GameRegistry.register(ib);
        }


    }

    @SideOnly(Side.CLIENT)
    private void registerRenders() {
        for(Block block : this.blocks){
            registerRender(block);
        }


    }

    private void registers() {
        for(Block block : this.blocks){
            GameRegistry.register(block);
        }


    }

    private void init() {
        oreNaturalGem = new ZNSBlock("oreNaturalGem");

        this.blocks = new Block[]{oreNaturalGem};
    }

    private void registerRender(Block block){
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(References.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
    }

    private void registerRenderMeta(Block block, int meta){
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(new ResourceLocation(References.MODID, block.getUnlocalizedName().substring(5) + "_" + meta), "inventory"));
    }

}
