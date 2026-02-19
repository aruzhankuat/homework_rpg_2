package com.narxoz.rpg.factory;
import com.narxoz.rpg.combat.*;
import com.narxoz.rpg.loot.*;

public class IceEnemyComponentFactory implements EnemyComponentFactory {
    public Ability createAbility() { return new IceAbility(); }
    public LootTable createLoot() { return new IceLoot(); }
}
