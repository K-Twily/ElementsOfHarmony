package top.xuogroup.mcmods.elementsofharmony;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BlockEKindnessMine extends Block {
    public BlockEKindnessMine(){
        super(Properties.create(Material.ROCK).hardnessAndResistance(30).harvestTool(ToolType.get("pickaxe")).harvestLevel(3));
    }
}
