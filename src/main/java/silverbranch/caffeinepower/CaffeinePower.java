package silverbranch.caffeinepower;

import mcjty.theoneprobe.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;


@Mod(modid = CaffeinePower.MODID, name = CaffeinePower.MODNAME, version = CaffeinePower.MODVERSION, dependencies = "required-after:forge@[14.23.5.2796,)", useMetadata = true)
public class CaffeinePower {

    public static final String MODID = "coffeepow";
    public static final String MODNAME = "Caffeine Power";
    public static final String MODVERSION= "0.0.1";

    @SidedProxy(clientSide = "silverbranch.caffeinepower.proxy.ClientProxy", serverSide = "silverbranch.caffeinepower.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static CaffeinePower instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}