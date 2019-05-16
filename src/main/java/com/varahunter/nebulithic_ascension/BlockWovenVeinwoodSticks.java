package com.varahunter.nebulithic_ascension;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import com.legacy.glacidus.creativetab.GlacidusCreativeTabs;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockWovenVeinwoodSticks extends Block {
    public static final String NAME = "woven_veinwood_sticks";
    private static final String UNLOCALIZED_NAME = "wovem_veinwood_sticks";
    private static final String REGISTRY_NAME = "woven_veinwood_sticks";

    public BlockWovenVeinwoodSticks() {
        super(Material.GROUND);

        this.setCreativeTab(GlacidusCreativeTabs.BLOCKS);

        this.setUnlocalizedName(UNLOCALIZED_NAME);
        this.setRegistryName(REGISTRY_NAME);
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.SOLID;
    }
}