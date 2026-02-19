package com.narxoz.rpg.builder;
import com.narxoz.rpg.enemy.*;
import com.narxoz.rpg.factory.EnemyComponentFactory;

public class EnemyBuilder {
    private String name;
    private int health;
    private String type;
    private EnemyComponentFactory factory;

    public EnemyBuilder setType(String type) { this.type = type; return this; }
    public EnemyBuilder setName(String name) { this.name = name; return this; }
    public EnemyBuilder setHealth(int health) { this.health = health; return this; }
    public EnemyBuilder setTheme(EnemyComponentFactory factory) { this.factory = factory; return this; }

    public Enemy build() {
        Enemy enemy = (type != null && type.equalsIgnoreCase("boss")) ? new DragonBoss() : new Goblin();
        enemy.name = this.name;
        enemy.health = this.health;
        if (factory != null) {
            enemy.ability = factory.createAbility();
            enemy.loot = factory.createLoot();
        }
        return enemy;
    }
}