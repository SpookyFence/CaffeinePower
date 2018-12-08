package silverbranch.caffeinepower;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import silverbranch.caffeinepower.furnace.BlockFastFurnace;

public class ModBlocks {
    @GameRegistry.ObjectHolder("caffeinepower:fastfurnace")
    public static BlockFastFurnace blockFastFurnace;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        blockFastFurnace.initModel();
    }
}
