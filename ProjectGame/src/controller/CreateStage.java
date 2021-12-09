package controller;

import model.Mob;
import model.Model;

import java.util.Scanner;

public class CreateStage {
    public static void createStage(Model Model, int n) {
        

        String[] names = {"r", "a", "b", "c"};
        int hp = 500;
        int attackPt = 30;
        int exp = 200;

        System.out.println("*************Stage" + n + "******************");
        Mob[] mobs = new Mob[n];
        for (int i = 0; i < n; i++) {
            if(Model.getHp() <= 0) {
                break;
            }
            if(i == 3) {
                mobs[i] = CreateMob.createMob(names[i], hp + (hp * 30), attackPt + (attackPt * 20), exp + (exp * 5));
            }
            else mobs[i] = CreateMob.createMob(names[i], hp + (hp * i * 2), attackPt + (attackPt * i * 2), exp + (exp * i));
        }
        for (int i = 0; i < n; i++) {

            if(Model.getHp() <= 0) {
                break;
            }

            Battle.battle(Model, mobs[i]);
        }

        System.out.println("1. 다음 스테이지      2. 마을로");
        Scanner sc = new Scanner(System.in);
        sc.next();
    }
}
