package top.xuogroup.mcmods.elementsofharmony;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, "elementsofharmony");
    // Create ITEMS Object

    public static RegistryObject<Item> itemELoyaltyGem = ITEMS.register("item_e_loyalty_gem", ItemELoyaltyGem::new);
    public static RegistryObject<Item> itemELaughterGem = ITEMS.register("item_e_laughter_gem", ItemELaughterGem::new);
    public static RegistryObject<Item> itemEGenerosityGem = ITEMS.register("item_e_generosity_gem", ItemEGenerosityGem::new);
    public static RegistryObject<Item> itemEHonestyGem = ITEMS.register("item_e_honesty_gem", ItemEHonestyGem::new);
    public static RegistryObject<Item> itemEKindnessGem = ITEMS.register("item_e_kindness_gem", ItemEKindnessGem::new);
    public static RegistryObject<Item> itemEMagicGem = ITEMS.register("item_e_magic_gem", ItemEMagicGem::new);
    // Register Six Elements

    // Sep -------------------------------------------------------------------------------------------------------------

    public static RegistryObject<Item> blockELoyaltyMine = ITEMS.register("block_e_loyalty_mine",
            () -> new BlockItem(BlockRegistry.blockELoyaltyMine.get(), new Item.Properties().group(ModGroup.elementsofharmonyGroup)));
    public static RegistryObject<Item> blockELaughterMine = ITEMS.register("block_e_laughter_mine",
            () -> new BlockItem(BlockRegistry.blockELaughterMine.get(), new Item.Properties().group(ModGroup.elementsofharmonyGroup)));
    public static RegistryObject<Item> blockEGenerosityMine = ITEMS.register("block_e_generosity_mine",
            () -> new BlockItem(BlockRegistry.blockEGenerosityMine.get(), new Item.Properties().group(ModGroup.elementsofharmonyGroup)));
    public static RegistryObject<Item> blockEHonestyMine = ITEMS.register("block_e_honesty_mine",
            () -> new BlockItem(BlockRegistry.blockEHonestyMine.get(), new Item.Properties().group(ModGroup.elementsofharmonyGroup)));
    public static RegistryObject<Item> blockEKindnessMine = ITEMS.register("block_e_kindness_mine",
            () -> new BlockItem(BlockRegistry.blockEKindnessMine.get(), new Item.Properties().group(ModGroup.elementsofharmonyGroup)));
    public static RegistryObject<Item> blockEMagicMine = ITEMS.register("block_e_magic_mine",
            () -> new BlockItem(BlockRegistry.blockEMagicMine.get(), new Item.Properties().group(ModGroup.elementsofharmonyGroup)));
    // Register Six Blocks

    // Sep -------------------------------------------------------------------------------------------------------------

    public static RegistryObject<Item> itemELoyaltyIngot = ITEMS.register("item_e_loyalty_ingot", ItemELoyaltyIngot::new);
    public static RegistryObject<Item> itemELaughterIngot = ITEMS.register("item_e_laughter_ingot", ItemELaughterIngot::new);
    public static RegistryObject<Item> itemEGenerosityIngot = ITEMS.register("item_e_generosity_ingot", ItemEGenerosityIngot::new);
    public static RegistryObject<Item> itemEHonestyIngot = ITEMS.register("item_e_honesty_ingot", ItemEHonestyIngot::new);
    public static RegistryObject<Item> itemEKindnessIngot = ITEMS.register("item_e_kindness_ingot", ItemEKindnessIngot::new);
    public static RegistryObject<Item> itemEMagicIngot = ITEMS.register("item_e_magic_ingot", ItemEMagicIngot::new);
    // Register Six Ingots

    // Sep -------------------------------------------------------------------------------------------------------------

    public static RegistryObject<Item> itemELoyaltyJewelry = ITEMS.register("item_e_loyalty_jewelry", ItemELoyaltyJewelry::new);
    public static RegistryObject<Item> itemELaughterJewelry = ITEMS.register("item_e_laughter_jewelry", ItemELaughterJewelry::new);
    public static RegistryObject<Item> itemEGenerosityJewelry = ITEMS.register("item_e_generosity_jewelry", ItemEGenerosityJewelry::new);
    public static RegistryObject<Item> itemEHonestyJewelry = ITEMS.register("item_e_honesty_jewelry", ItemEHonestyJewelry::new);
    public static RegistryObject<Item> itemEKindnessJewelry = ITEMS.register("item_e_kindness_jewelry", ItemEKindnessJewelry::new);
    public static RegistryObject<Item> itemEMagicJewelry = ITEMS.register("item_e_magic_jewelry", ItemEMagicJewelry::new);
    // Register Six Jewelries

    // Sep -------------------------------------------------------------------------------------------------------------

    public static RegistryObject<Item> itemELoyaltySword = ITEMS.register("item_e_loyalty_sword", ItemELoyaltySword::new);
    public static RegistryObject<Item> itemELaughterSword = ITEMS.register("item_e_laughter_sword", ItemELaughterSword::new);
    public static RegistryObject<Item> itemEGenerositySword = ITEMS.register("item_e_generosity_sword", ItemEGenerositySword::new);
    public static RegistryObject<Item> itemEHonestySword = ITEMS.register("item_e_honesty_sword", ItemEHonestySword::new);
    public static RegistryObject<Item> itemEKindnessSword = ITEMS.register("item_e_kindness_sword", ItemEKindnessSword::new);
    public static RegistryObject<Item> itemEMagicSword = ITEMS.register("item_e_magic_sword", ItemEMagicSword::new);
    // Register Six Swords
}
