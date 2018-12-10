package silverbranch.caffeinepower;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import silverbranch.caffeinepower.blocks.BlockBrewer;
import silverbranch.caffeinepower.blocks.BlockCoffeeGen;

public class ModBlocks {
    @GameRegistry.ObjectHolder("caffeinepower:coffeegen")
    public static BlockCoffeeGen blockCoffeeGen;

    @GameRegistry.ObjectHolder("caffeinepower:brewer")
    public static BlockBrewer blockBrewer;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        blockCoffeeGen.initModel();
        blockBrewer.initModel();
    }
}
