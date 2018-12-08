package silverbranch.caffeinepower;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import silverbranch.caffeinepower.proxy.CommonProxy;


@Mod(modid = CaffeinePower.MODID, name = CaffeinePower.MODNAME, version = CaffeinePower.MODVERSION, dependencies = "required-after:forge@[14.23.5.2796,)", useMetadata = true)
public class CaffeinePower {

    public static final String MODID = "caffeinepower";
    public static final String MODNAME = "Caffeine Power";
    public static final String MODVERSION= "0.0.1";

    @SidedProxy(clientSide = "silverbranch.caffeinepower.proxy.ClientProxy", serverSide = "silverbranch.caffeinepower.proxy.ServerProxy")
    public static CommonProxy proxy;

    public static CreativeTabs creativeTab = new CreativeTabs("CaffeinePower") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModBlocks.blockFastFurnace);
        }
    };

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