package com.narxoz.rpg;
import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.builder.*;

public class Main {
    public static void main(String[] args) {
        EnemyBuilder builder = new EnemyBuilder();
        EnemyDirector director = new EnemyDirector();

        Enemy originalBoss = director.constructFireDragon(builder);
        System.out.println(" ОРИГИНАЛЬНЫЙ БОСС ");
        originalBoss.status();

        Enemy cloneBoss = originalBoss.clone();
        cloneBoss.name = "Копия Босса";

        System.out.println("\n КЛОНИРОВАННЫЙ БОСС ");
        cloneBoss.status();

        Enemy goblin = director.constructIceGoblin(builder);
        System.out.println("\n ОБЫЧНЫЙ МОБ ");
        goblin.status();
    }
}
