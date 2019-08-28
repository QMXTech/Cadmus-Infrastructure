package com.qmxtech.cadmusinfrastructure.block.light;

import com.qmxtech.qmxmcstdlib.block.light.BlockLightBase;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class BlockSmartColoredLight extends BlockLightBase implements ITileEntityProvider
{
    public BlockSmartColoredLight()
    {
        super( Material.GLASS );
        setRegistryName( NAME ); // Fixme
        setTranslationKey( NAME ); // Fixme
        setHardness( .5F );
        setLightLevel( 1.0F );
        setCreativeTab( CreativeTabs.BUILDING_BLOCKS ); // Fixme
    }

    @Nullable
    @Override
    public TileEntity createNewTileEntity( World world, int i )
    {
        return null;
    }
}
