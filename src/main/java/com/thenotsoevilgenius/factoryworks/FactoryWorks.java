package com.thenotsoevilgenius.factoryworks;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "factoryworks",name = "Factory Works",version = "1.7.10-1.0")
public class FactoryWorks
{

    @Mod.Instance("factoryworks")
    public static FactoryWorks recipe;


    @Mod.EventHandler
    public void prep(FMLPreInitializationEvent ingredients)
    {

    }

    @Mod.EventHandler
    public void cook(FMLInitializationEvent oven)
    {

    }

    @Mod.EventHandler
    public void serve(FMLPostInitializationEvent platter)
    {

    }

}
