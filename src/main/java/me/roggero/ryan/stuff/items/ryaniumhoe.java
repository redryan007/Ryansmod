package me.roggero.ryan.stuff.items;

import cpw.mods.fml.common.registry.GameRegistry;
import me.roggero.ryan.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class ryaniumhoe extends ItemHoe{

    public final String name = "ryanium_hoe";
    
    public ryaniumhoe(ToolMaterial mat){
        super(mat);
        setMaxDamage(93);
        setCreativeTab(CreativeTabs.tabTools);
        setUnlocalizedName(Main.MODID + "_" + name);
        GameRegistry.registerItem(this,name);
        setTextureName(Main.MODID + ":" + name);
    }
}
