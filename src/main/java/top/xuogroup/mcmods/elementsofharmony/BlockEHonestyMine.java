package top.xuogroup.mcmods.elementsofharmony;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BlockEHonestyMine extends Block {
    public BlockEHonestyMine(){
        super(Properties.create(Material.ROCK).hardnessAndResistance(30).harvestTool(ToolType.get("pickaxe")).harvestLevel(3));
    }
}
