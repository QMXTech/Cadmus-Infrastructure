package com.qmxtech.cadmusinfrastructure.registry;

import com.qmxtech.cadmusinfrastructure.BuildInfo;
//import com.qmxtech.cadmusinfrastructure.block.light.BlockColoredLight;
//import com.qmxtech.cadmusinfrastructure.block.light.BlockColoredLightControl;
import com.qmxtech.cadmusinfrastructure.block.light.BlockSmartColoredLight;
//import com.qmxtech.cadmusinfrastructure.tile.light.TEColoredLight;
//import com.qmxtech.cadmusinfrastructure.tile.light.TEColoredLightController;
import com.qmxtech.cadmusinfrastructure.tile.light.TESmartColoredLight;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.Objects;

@SuppressWarnings( "WeakerAccess" )
@Mod.EventBusSubscriber public class ContentRegistry
{
    //public static Block blockColoredLight;
    //public static Block blockColoredLightControl;
    public static Block blockSmartColoredLight = null;

    //public static Item itemColoredLight;
    //public static Item itemColoredLightControl;
    public static Item itemSmartColoredLight;

    @SubscribeEvent public static void registerItems( RegistryEvent.Register< Item > event )
    {
        generateBlockItems();

        event.getRegistry().registerAll( itemSmartColoredLight ); // Only smart colored light for current tests
    }

    @SubscribeEvent public static void registerBlocks( RegistryEvent.Register< Block > event )
    {
        generateBlocks();

        event.getRegistry().registerAll( blockSmartColoredLight );

        registerTileEntities();

    }

    private static void generateBlockItems()
    {
        //itemColoredLight = new ItemBlock( blockColoredLight ).setRegistryName( blockColoredLight.getRegistryName().toString() );
        //itemColoredLightControl = new ItemBlock( blockColoredLightControl ).setRegistryName( blockColoredLightControl.getRegistryName().toString() );
        itemSmartColoredLight = new ItemBlock( blockSmartColoredLight ).setRegistryName( Objects.requireNonNull( blockSmartColoredLight.getRegistryName() ).toString() );
    }

    public static void generateBlocks()
    {

        //blockColoredLight = new BlockColoredLight();
        //blockColoredLightControl = new BlockColoredLightControl();

        if( blockSmartColoredLight == null )
            blockSmartColoredLight = new BlockSmartColoredLight();
    }

    private static void registerTileEntities()
    {
        //GameRegistry.registerTileEntity( TEColoredLight.class, new ResourceLocation( BuildInfo.MOD_ID,  "tile_colored_light") );
        //GameRegistry.registerTileEntity( TEColoredLightController.class, new ResourceLocation( BuildInfo.MOD_ID,  "tile_colored_light_controller") );
        GameRegistry.registerTileEntity( TESmartColoredLight.class, new ResourceLocation( BuildInfo.MOD_ID,  "tile_smart_colored_light") );
    }
}
