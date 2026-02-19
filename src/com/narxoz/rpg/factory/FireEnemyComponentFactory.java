package com.narxoz.rpg.factory;
import com.narxoz.rpg.combat.*;
import com.narxoz.rpg.loot.*;

public class FireEnemyComponentFactory implements EnemyComponentFactory {
    public Ability createAbility() { return new FireAbility(); }
    public LootTable createLoot() { return new FireLoot(); }
}