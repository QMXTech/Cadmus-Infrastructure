package com.qmxtech.cadmusinfrastructure.registry;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// ContentRegistry.java
// Matthew J. Schultz (Korynkai) | Created : 20AUG19 | Last Modified : 27AUG19 by Matthew J. Schultz (Korynkai)
// Version : 0.0.1
// This is a source file for 'Cadmus Infrastructure'; it defines the mod's content registration event bus subscriber.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Copyright (C) 2019 QuantuMatriX Software, a QuantuMatriX Technologies Cooperative Partnership.
//
// This file is part of 'Cadmus Infrastructure'.
//
// 'Cadmus Infrastructure' is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free
// Software Foundation, either version 3 of the License, or (at your option) any later version.
//
// 'Cadmus Infrastructure' is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
// FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
//
// You should have received a copy of the GNU General Public License along with 'Cadmus Infrastructure'.  If not, see <http://www.gnu.org/licenses/>.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Imports
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import com.qmxtech.cadmusinfrastructure.BuildInfo;
//import com.qmxtech.cadmusinfrastructure.block.light.BlockColoredLight;
//import com.qmxtech.cadmusinfrastructure.block.light.BlockColoredLightControl;
import com.qmxtech.cadmusinfrastructure.block.light.BlockSmartColoredLight;
//import com.qmxtech.cadmusinfrastructure.tile.light.TEColoredLight;
//import com.qmxtech.cadmusinfrastructure.tile.light.TEColoredLightController;
import com.qmxtech.cadmusinfrastructure.item.ItemTabIcon;
import com.qmxtech.cadmusinfrastructure.tile.light.TESmartColoredLight;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.Objects;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// The 'ContentRegistry' Class
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

@SuppressWarnings( "WeakerAccess" )
@Mod.EventBusSubscriber public final class ContentRegistry
{
    // Public Constant Block Instances

        //public static final Block blockColoredLight;
        //public static final Block blockColoredLightControl;
        public static final Block blockSmartColoredLight = new BlockSmartColoredLight();

    // Public Constant Item Instances

        //public static final Item itemColoredLight = new ItemBlock( blockColoredLight ).setRegistryName( blockColoredLight.getRegistryName().toString() );
        //public static final Item itemColoredLightControl = new ItemBlock( blockColoredLightControl ).setRegistryName( blockColoredLightControl.getRegistryName().toString() );
        public static final Item itemSmartColoredLight = new ItemBlock( blockSmartColoredLight ).setRegistryName( Objects.requireNonNull( blockSmartColoredLight.getRegistryName() ).toString() );
        public static final Item itemTabIcon = new ItemTabIcon();

    // Public Static Methods (Event Listeners)

        @SubscribeEvent public static void registerItems( RegistryEvent.Register< Item > event )
        {
            event.getRegistry().registerAll( itemSmartColoredLight, itemTabIcon ); // Only smart colored light for current tests
        }

        @SubscribeEvent public static void registerBlocks( RegistryEvent.Register< Block > event )
        {
            event.getRegistry().registerAll( blockSmartColoredLight );

            registerTileEntities();
        }

        @SubscribeEvent public static void registerModels( ModelRegistryEvent event )
        {
            ModelLoader.setCustomModelResourceLocation( itemSmartColoredLight, 0, new ModelResourceLocation( "cadmusinfrastructure:smartcoloredlight", "inventory" ) );
            ModelLoader.setCustomModelResourceLocation( itemTabIcon, 0, new ModelResourceLocation( "cadmusinfrastructure:ciicon", "inventory" ) );
        }

    // Private Methods

        private static void registerTileEntities()
        {
            //GameRegistry.registerTileEntity( TEColoredLight.class, new ResourceLocation( BuildInfo.MOD_ID,  "tile_colored_light") );
            //GameRegistry.registerTileEntity( TEColoredLightController.class, new ResourceLocation( BuildInfo.MOD_ID,  "tile_colored_light_controller") );
            GameRegistry.registerTileEntity( TESmartColoredLight.class, new ResourceLocation( BuildInfo.MOD_ID,  "TESmartColoredLight") );
        }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// End of 'ContentRegistry.java'
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
