package com.narxoz.rpg.enemy;
import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;

public abstract class Enemy implements Cloneable {
    public String name;
    public int health;
    public Ability ability;
    public LootTable loot;

    @Override
    public abstract Enemy clone();

    public void status() {
        System.out.println(" name: " + name );
        System.out.println("HP: " + health);
        if (ability != null) ability.execute();
        if (loot != null) loot.generate();
    }
}