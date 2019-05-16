package com.varahunter.nebulithic_ascension;

//import com.varahunter.nebulithic_ascension.BlockWovenVeinwoodSticks;
import org.apache.logging.log4j.Logger;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

@Mod(modid = NA.MODID, name = NA.NAME, version = NA.VERSION)
public class NA {
    public static final String MODID = "nebulithic_ascension";
    public static final String NAME = "Nebulithic_ascension";
    public static final String VERSION = "1.0.0";
    public static final String RESOURCE_INVENTORY  = "inventory";

    public static BlockWovenVeinwoodSticks WovenSticks;
    public static ItemBlock ItemWovenVeinwoodSticks;

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        preInitBlocks();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        logger.info("Mod initlialised :" + NAME);
    }

    private void preInitBlocks() {
        WovenSticks = new BlockWovenVeinwoodSticks();
        ForgeRegistries.BLOCKS.register(WovenSticks);

        ItemWovenVeinwoodSticks = new ItemBlock(WovenSticks);
        ItemWovenVeinwoodSticks.setRegistryName(WovenSticks.getRegistryName());
        ForgeRegistries.ITEMS.register(ItemWovenVeinwoodSticks);

        ModelResourceLocation chinaModelResourceLocation = new ModelResourceLocation(
                MODID + ":" + WovenSticks.NAME, RESOURCE_INVENTORY);
        final int DEFAULT_ITEM_SUBTYPE = 0;
        ModelLoader.setCustomModelResourceLocation(ItemWovenVeinwoodSticks, DEFAULT_ITEM_SUBTYPE, chinaModelResourceLocation);
    }
}