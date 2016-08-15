package fwg.data;

import java.util.ArrayList;
import java.util.Random;

import cofh.thermalfoundation.block.BlockOre;
import cpw.mods.fml.common.Loader;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

public class Planets 
{	
	/*public static PlanetData[] data_overworld = new PlanetData[]{
		new PlanetData(Blocks.leaves, Blocks.log, 15, 5, 30),
		new PlanetData(Blocks.dirt, Blocks.dirt, 15, 5, 30, Blocks.grass, false),
		new PlanetData(Blocks.dirt, Blocks.dirt, 15, 5, 10, Blocks.grass, true),
		new PlanetData(Blocks.sand, Blocks.sand, 15, 5, 10),
		new PlanetData(Blocks.clay, Blocks.clay, 12, 4, 6),
		new PlanetData(Blocks.hardened_clay, Blocks.hardened_clay, 12, 4, 5),
		new PlanetData(Blocks.dirt, Blocks.dirt, 12, 4, 4, Blocks.mycelium, false),
		
		new PlanetData(Blocks.stone, Blocks.coal_ore, 15, 9, 10),
		new PlanetData(Blocks.stone, Blocks.iron_ore, 15, 9, 10),
		new PlanetData(Blocks.stone, Blocks.gravel, 15, 8, 5),
		new PlanetData(Blocks.stone, Blocks.gold_ore, 15, 8, 5),
		new PlanetData(Blocks.stone, Blocks.redstone_ore, 15, 7, 5),
		new PlanetData(Blocks.stone, Blocks.diamond_ore, 15, 7, 5),

		new PlanetData(Blocks.glowstone, Blocks.glowstone, 15, 5, 10),
		new PlanetData(Blocks.glass, Blocks.water, 15, 8, 5),
		new PlanetData(Blocks.glass, Blocks.lava, 15, 8, 3)
	};
	
	public static PlanetData[] data_hell = new PlanetData[]{
		new PlanetData(Blocks.netherrack, Blocks.netherrack, 15, 8, 20),
		new PlanetData(Blocks.netherrack, Blocks.quartz_ore, 15, 8, 10),
		new PlanetData(Blocks.glowstone, Blocks.glowstone, 15, 5, 10),
		new PlanetData(Blocks.soul_sand, Blocks.soul_sand, 10, 5, 8)
	};*/

	public static ArrayList<PlanetData> data_overworld;
    public static ArrayList<PlanetData> data_hell;
	
	public static PlanetData startPlanet = new PlanetData(Blocks.leaves, Blocks.log, 15, 5, 30);
	
	private static int[] rarityData_overworld;
	private static int rarityLenght_overworld;
	private static int[] rarityData_hell;
	private static int rarityLenght_hell;
	
	public static void init()
	{
	    // Add all Overworld PlanetData to ArrayLists
        data_overworld = new ArrayList<PlanetData>();

        data_overworld.add(new PlanetData(Blocks.leaves, Blocks.log, 15, 5, 30));
        data_overworld.add(new PlanetData(Blocks.dirt, Blocks.dirt, 15, 5, 30, Blocks.grass, false));
        data_overworld.add(new PlanetData(Blocks.dirt, Blocks.dirt, 15, 5, 10, Blocks.grass, true));
        data_overworld.add(new PlanetData(Blocks.sand, Blocks.sand, 15, 5, 10));
        data_overworld.add(new PlanetData(Blocks.clay, Blocks.clay, 12, 4, 6));
        data_overworld.add(new PlanetData(Blocks.hardened_clay, Blocks.hardened_clay, 12, 4, 5));
        data_overworld.add(new PlanetData(Blocks.dirt, Blocks.dirt, 12, 4, 4, Blocks.mycelium, false));

        data_overworld.add(new PlanetData(Blocks.stone, Blocks.coal_ore, 15, 9, 10));
        data_overworld.add(new PlanetData(Blocks.stone, Blocks.iron_ore, 15, 9, 10));
        data_overworld.add(new PlanetData(Blocks.stone, Blocks.gravel, 15, 8, 5));
        data_overworld.add(new PlanetData(Blocks.stone, Blocks.gold_ore, 15, 8, 5));
        data_overworld.add(new PlanetData(Blocks.stone, Blocks.redstone_ore, 15, 7, 5));
        data_overworld.add(new PlanetData(Blocks.stone, Blocks.diamond_ore, 15, 7, 5));
	data_overworld.add(new PlanetData(Blocks.stone, Blocks.lapis_ore, 15, 8, 5));
        data_overworld.add(new PlanetData(Blocks.glowstone, Blocks.glowstone, 15, 5, 10));
        data_overworld.add(new PlanetData(Blocks.glass, Blocks.water, 15, 8, 5));
        data_overworld.add(new PlanetData(Blocks.glass, Blocks.lava, 15, 8, 3));

        // Add modded ores for Overworld
        if(Loader.isModLoaded("ThermalFoundation")) {
            data_overworld.add(new PlanetData(Blocks.stone, Block.getBlockFromItem(BlockOre.oreCopper.getItem()), 15, 9, 10));
	    data_overworld.add(new PlanetData(Blocks.stone, Block.getBlockFromItem(BlockOre.oreTin.getItem()), 15, 9, 10));
            data_overworld.add(new PlanetData(Blocks.stone, Block.getBlockFromItem(BlockOre.oreSilver.getItem()), 15, 8, 5));
            data_overworld.add(new PlanetData(Blocks.stone, Block.getBlockFromItem(BlockOre.oreLead.getItem()), 15, 8, 5));
            data_overworld.add(new PlanetData(Blocks.stone, Block.getBlockFromItem(BlockOre.oreNickel.getItem()), 15, 7, 5));
            data_overworld.add(new PlanetData(Blocks.stone, Block.getBlockFromItem(BlockOre.orePlatinum.getItem()), 12, 4, 5));
        }

        // Add all Nether PlanetData
        data_hell = new ArrayList<PlanetData>();
        data_hell.add(new PlanetData(Blocks.netherrack, Blocks.netherrack, 15, 8, 20));
        data_hell.add(new PlanetData(Blocks.netherrack, Blocks.quartz_ore, 15, 8, 10));
        data_hell.add(new PlanetData(Blocks.glowstone, Blocks.glowstone, 15, 5, 10));
        data_hell.add(new PlanetData(Blocks.soul_sand, Blocks.soul_sand, 10, 5, 8));

        // Add modded ores for Nether


		int length = 0;
		for(int i = data_overworld.size() - 1; i > -1; i--)
		{
			length += data_overworld.get(i).rarity;
		}
		
		rarityLenght_overworld = length;
		rarityData_overworld = new int[length];
		int count = 0;
		for(int j = data_overworld.size() - 1; j > -1; j--)
		{
			for(int k = 0; k < data_overworld.get(j).rarity; k++)
			{
				rarityData_overworld[count] = j;
				count++;
			}
		}
		
		length = 0;
		for(int l = data_hell.size() - 1; l > -1; l--)
		{
			length += data_hell.get(l).rarity;
		}
		
		rarityLenght_hell = length;
		rarityData_hell = new int[length];
		count = 0;
		for(int m = data_hell.size() - 1; m > -1; m--)
		{
			for(int n = 0; n < data_hell.get(m).rarity; n++)
			{
				rarityData_hell[count] = m;
				count++;
			}
		}
	}

	public static PlanetData getRandomPlanet(Random rand, int dimension)
	{
		if(dimension == 0)
		{
			return data_overworld.get(rarityData_overworld[rand.nextInt(rarityLenght_overworld)]);
		}
		else
		{
			return data_hell.get(rarityData_hell[rand.nextInt(rarityLenght_hell)]);
		}
	}
}
