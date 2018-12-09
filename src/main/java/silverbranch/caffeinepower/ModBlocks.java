package silverbranch.caffeinepower;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import silverbranch.caffeinepower.furnace.BlockCoffeeGen;

public class ModBlocks {
    @GameRegistry.ObjectHolder("caffeinepower:coffeegen")
    public static BlockCoffeeGen blockCoffeeGen;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        blockCoffeeGen.initModel();
    }
}
