package top.xuogroup.mcmods.elementsofharmony;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import javax.annotation.Nonnull;

public class TireELaughter implements IItemTier {
    @Override
    public int getMaxUses() {
        return 1800;
    }

    @Override
    public float getEfficiency() {
        return 12.0F;
    }

    @Override
    public float getAttackDamage() {
        return 5.0F;
    }

    @Override
    public int getHarvestLevel() {
        return 5;
    }

    @Override
    public int getEnchantability() {
        return 22;
    }

    @Override @Nonnull
    public Ingredient getRepairMaterial() {
        return Ingredient.fromItems(ItemRegistry.itemELaughterGem.get());
    }
}
