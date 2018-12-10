package silverbranch.caffeinepower.proxy;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import silverbranch.caffeinepower.ModBlocks;
import silverbranch.caffeinepower.blocks.BlockBrewer;
import silverbranch.caffeinepower.blocks.BlockCoffeeGen;

@Mod.EventBusSubscriber
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
    }

    public void init(FMLInitializationEvent e) {
    }

    public void postInit(FMLPostInitializationEvent e) {
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new BlockCoffeeGen());
        event.getRegistry().register(new BlockBrewer());
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemBlock(ModBlocks.blockCoffeeGen).setRegistryName(BlockCoffeeGen.COFFEEGEN));
        event.getRegistry().register(new ItemBlock(ModBlocks.blockBrewer).setRegistryName(BlockBrewer.BREWER));
    }
}