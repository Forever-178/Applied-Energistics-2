package appeng.parts.reporting;

import java.util.List;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import appeng.client.texture.CableBusTextures;
import appeng.core.sync.GuiBridge;
import appeng.tile.inventory.AppEngInternalInventory;
import appeng.tile.inventory.IAEAppEngInventory;
import appeng.tile.inventory.InvOperation;

public class PartCraftingTerminal extends PartTerminal implements IAEAppEngInventory
{

	AppEngInternalInventory craftingGrid = new AppEngInternalInventory( this, 9 );

	@Override
	public void getDrops(List<ItemStack> drops, boolean wrenched)
	{
		for (ItemStack is : craftingGrid)
			if ( is != null )
				drops.add( is );
	}

	public PartCraftingTerminal(ItemStack is) {
		super( PartCraftingTerminal.class, is );
		frontBright = CableBusTextures.PartCraftingTerm_Bright;
		frontColored = CableBusTextures.PartCraftingTerm_Colored;
		frontDark = CableBusTextures.PartCraftingTerm_Dark;
		frontSolid = CableBusTextures.PartCraftingTerm_Solid;
	}

	public GuiBridge getGui()
	{
		return GuiBridge.GUI_CRAFTING_TERMINAL;
	}

	@Override
	public void onChangeInventory(IInventory inv, int slot, InvOperation mc, ItemStack removedStack, ItemStack newStack)
	{
		// :)
	}

}
