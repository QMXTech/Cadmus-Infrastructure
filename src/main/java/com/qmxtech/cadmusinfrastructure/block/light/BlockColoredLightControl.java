package com.qmxtech.cadmusinfrastructure.block.light;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// BlockColoredLightControl.java
// Matthew J. Schultz (Korynkai) | Created : 20AUG19 | Last Modified : 27AUG19 by Matthew J. Schultz (Korynkai)
// Version : 0.0.1
// This is a source file for 'Cadmus Infrastructure'; it defines the Colored Light Controller block.
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
import com.qmxtech.cadmusinfrastructure.registry.CreativeTab;
import com.qmxtech.cadmusinfrastructure.tile.light.TEColoredLightController;
import com.qmxtech.qmxmcstdlib.block.BlockBase;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// The 'BlockColoredLightControl' Class
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class BlockColoredLightControl extends BlockBase implements ITileEntityProvider
{
    // Public Constructor

        public BlockColoredLightControl()
        {
            super( Material.GLASS );
            setRegistryName( "coloredlightcontrol" );
            setTranslationKey( BuildInfo.MOD_ID + ".coloredlightcontrol" );
            setHardness( .5F );
            setLightLevel( 1.0F );
            setCreativeTab( CreativeTab.INSTANCE );
        }

    // Public Methods

        @Nullable @Override public TileEntity createNewTileEntity( @Nonnull World world, int i )
        {
            return new TEColoredLightController();
        }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// End of 'BlockColoredLightControl.java'
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
