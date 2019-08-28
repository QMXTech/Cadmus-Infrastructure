package com.qmxtech.cadmusinfrastructure;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// CadmusInfrastructure.java
// Matthew J. Schultz (Korynkai) | Created : 20AUG19 | Last Modified : 20AUG19 by Matthew J. Schultz (Korynkai)
// Version : 0.0.1
// This is a source file for 'Cadmus Infrastructure'; it defines the base mod class.
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

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.qmxtech.cadmusinfrastructure.proxy.CommonProxy;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// The 'CadmusInfrastructure' Class
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

@Mod( modid = BuildInfo.MOD_ID, name = BuildInfo.NAME, version = BuildInfo.VERSION ) public class CadmusInfrastructure
{
	// Fields

		@Instance( BuildInfo.MOD_ID ) public static CadmusInfrastructure instance;
		@SidedProxy( clientSide = BuildInfo.CLIENT_PROXY, serverSide = BuildInfo.SERVER_PROXY ) public static CommonProxy proxy;

	// Methods

		@EventHandler public void preInit( FMLPreInitializationEvent event )
		{
			// Perform necessary pre-initialization.

				proxy.preInit();
		}

		@EventHandler public void init( FMLInitializationEvent event )
		{
			// Perform necessary initialization.

				proxy.init();
		}

		@EventHandler public void postInit( FMLPostInitializationEvent event )
		{
			// Perform necessary post-initialization.

				proxy.postInit();
		}
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// End of 'CadmusInfrastructure.java'
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
