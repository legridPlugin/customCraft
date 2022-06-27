package me.legrid.newplugin;

import org.bukkit.*;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;



public final class NewPlugin extends JavaPlugin implements Listener {




    @Override
    public void onEnable() {
        Bukkit.addRecipe(goldThread());
        Bukkit.addRecipe(steelIngot());
        Bukkit.addRecipe(sandLivingSouls());
        Bukkit.addRecipe(slimeColor());
        Bukkit.addRecipe(magicDust());
        Bukkit.addRecipe(superObsidian());
        Bukkit.addRecipe(pBrewing());
        Bukkit.addRecipe(potionWithoutEffect());
    }


    //Тир1:

    //Золотая нить
    public ShapedRecipe goldThread(){
        ItemStack item = new ItemStack(Material.STRING);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.YELLOW + "Золотая нить");
        meta.addEnchant(Enchantment.ARROW_FIRE, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("gold_thread"), item);
        recipe.shape(" G ", "GTG", " G ");
        recipe.setIngredient('G', Material.GOLD_INGOT);
        recipe.setIngredient('T', Material.STRING);

        return recipe;
    }

    public ShapedRecipe steelIngot(){
        ItemStack item = new ItemStack(Material.IRON_INGOT);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.YELLOW + "Стальной слиток");
        meta.addEnchant(Enchantment.ARROW_FIRE, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("steel_ingot"), item);
        recipe.shape("SIS", "GFG", "BMB");
        recipe.setIngredient('S', Material.FLINT);
        recipe.setIngredient('I', Material.IRON_INGOT);
        recipe.setIngredient('G', Material.SULPHUR);
        recipe.setIngredient('F', Material.FURNACE);
        recipe.setIngredient('B', Material.BLAZE_POWDER);
        recipe.setIngredient('M', Material.MAGMA);

        return recipe;
    }

    public ShapedRecipe sandLivingSouls(){
        ItemStack item = new ItemStack(Material.SOUL_SAND);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.YELLOW + "Песок живых жуш");
        meta.addEnchant(Enchantment.ARROW_FIRE, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("sand_living_souls"), item);
        recipe.shape("GSP", "LDM", "BAB");
        recipe.setIngredient('G', Material.GHAST_TEAR);
        recipe.setIngredient('S', Material.SOUL_SAND);
        recipe.setIngredient('P', Material.SULPHUR);
        recipe.setIngredient('D', Material.GLOWSTONE_DUST);
        recipe.setIngredient('M', Material.MAGMA);
        recipe.setIngredient('L', Material.SPECKLED_MELON);
        recipe.setIngredient('A', Material.NETHER_STALK);
        recipe.setIngredient('B', Material.BREWING_STAND_ITEM);

        return recipe;
    }

    public ShapedRecipe slimeColor(){
        ItemStack item = new ItemStack(Material.MAGMA_CREAM);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.YELLOW + "Сгусток красок");
        meta.addEnchant(Enchantment.ARROW_FIRE, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("slime_color"), item);
        recipe.shape("ABC", "BAD", "CDA");
        recipe.setIngredient('A', Material.GHAST_TEAR);
        recipe.setIngredient('B', Material.LIME_GLAZED_TERRACOTTA);
        recipe.setIngredient('C', Material.INK_SACK);
        recipe.setIngredient('D', Material.BLACK_GLAZED_TERRACOTTA);

        return recipe;
    }

    public ShapedRecipe magicDust(){
        ItemStack item = new ItemStack(Material.GLOWSTONE_DUST);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.YELLOW + "Магическая пыль");
        meta.addEnchant(Enchantment.ARROW_FIRE, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("magic_dust"), item);
        recipe.shape("BBB", "BAB", "BBB");
        recipe.setIngredient('A', Material.CHORUS_FLOWER);
        recipe.setIngredient('B', Material.NETHER_STAR);

        return recipe;
    }

    public ShapedRecipe superObsidian(){
        ItemStack item = new ItemStack(Material.OBSIDIAN);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.YELLOW + "Спресованный обсидиан");
        meta.addEnchant(Enchantment.ARROW_FIRE, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("super_obsidian"), item);
        recipe.shape("BBB", "BAB", "BBB");
        recipe.setIngredient('B', Material.OBSIDIAN);
        recipe.setIngredient('A', Material.PISTON_BASE);

        return recipe;
    }

    public ShapedRecipe pBrewing(){
        ItemStack item = new ItemStack(Material.BREWING_STAND_ITEM);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.YELLOW + "Персональная зельеварка");
        meta.addEnchant(Enchantment.ARROW_FIRE, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("p_brewing"), item);
        recipe.shape("BAB", "BCB", "BDB");
        recipe.setIngredient('B', Material.SPECKLED_MELON);
        recipe.setIngredient('A', Material.GHAST_TEAR);
        recipe.setIngredient('C', Material.BREWING_STAND_ITEM);
        recipe.setIngredient('D', Material.BLAZE_POWDER);

        return recipe;
    }
    public ShapedRecipe potionWithoutEffect(){
        ItemStack item = new ItemStack(Material.POTION, 1, (byte)0);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.YELLOW + "Зелье без эффекта");
        item.setItemMeta(meta);

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("potion_without_effect"), item);
        recipe.shape("BAB", "BCB", "BDB");
        recipe.setIngredient('B', Material.SPECKLED_MELON);
        recipe.setIngredient('A', Material.GHAST_TEAR);
        recipe.setIngredient('C', Material.BREWING_STAND_ITEM);
        recipe.setIngredient('D', Material.GLASS_BOTTLE);

        return recipe;
    }

}



