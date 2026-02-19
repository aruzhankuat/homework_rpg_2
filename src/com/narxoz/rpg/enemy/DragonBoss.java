package com.narxoz.rpg.enemy;
public class DragonBoss extends Enemy {
    @Override
    public Enemy clone() {
        DragonBoss copy = new DragonBoss();
        copy.name = this.name;
        copy.health = this.health;
        copy.ability = this.ability;
        copy.loot = this.loot;
        return copy;
    }
}