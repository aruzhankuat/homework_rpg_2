package com.narxoz.rpg.enemy;
public class Goblin extends Enemy {
    @Override
    public Enemy clone() {
        Goblin copy = new Goblin();
        copy.name = this.name;
        copy.health = this.health;
        copy.ability = this.ability;
        copy.loot = this.loot;
        return copy;
    }
}