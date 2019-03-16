package silverbranch.caffeinepower.tileentities;

import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.items.ItemStackHandler;

public class TileCoffeeGen extends TileEntity {

    public static final int SIZE = 9;

    // This item handler will hold our nine inventory slots
    private ItemStackHandler itemStackHandler = new ItemStackHandler(SIZE) {
        @Override
        protected void onContentsChanged(int slot) {
            // We need to tell the tile entity that something has changed so
            // that the chest contents is persisted
            TileCoffeeGen.this.markDirty();
        }
    };
}
