package silverbranch.caffeinepower.furnace;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import silverbranch.caffeinepower.CaffeinePower;

public class BlockFastFurnace extends Block {

    public static final ResourceLocation FASTFURNACE = new ResourceLocation(CaffeinePower.MODID, "fastfurnace");

    public BlockFastFurnace() {
        super(Material.IRON);
        setRegistryName(FASTFURNACE);
        setUnlocalizedName(CaffeinePower.MODID + ".fastfurnace");
        setHarvestLevel("pickaxe", 2);
        setCreativeTab(CaffeinePower.creativeTab);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
