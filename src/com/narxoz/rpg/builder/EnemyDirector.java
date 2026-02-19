package com.narxoz.rpg.builder;
import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.factory.*;

public class EnemyDirector {
    public Enemy constructFireDragon(EnemyBuilder builder) {
        return builder.setType("boss").setName("Огненный Лорд").setHealth(10000)
                .setTheme(new FireEnemyComponentFactory()).build();
    }
    public Enemy constructIceGoblin(EnemyBuilder builder) {
        return builder.setType("goblin").setName("Ледяной Вор").setHealth(300)
                .setTheme(new IceEnemyComponentFactory()).build();
    }
}