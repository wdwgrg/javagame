package controller;

import model.Mob;
import model.Model;

import java.util.Scanner;

public class Battle {
    public static void battle(Model model, Mob mob){
        System.out.println("전투를 시작합니다.");
        System.out.println("1. 공격   2. 도망");
        // 공격선택
        Scanner sc = new Scanner(System.in);
        sc.next();
            model.attack(mob);
            System.out.println(mob.getName() +"의 남은 체력 : " + mob.getHp());
            mob.attack(model);
            System.out.println(model.getName() +"의 남은 체력 : " + model.getHp());

            if(model.getHp() <= 0) {
                System.out.println("사망했습니다.");
            }
            else if(mob.getHp() <= 0) {
                System.out.println(mob.getName() + "을 잡았습니다!");

                model.setExp(mob.getExp());
                System.out.println(model.getExp());
                if(model.getExp() > model.getNeedExp()) {
                    System.out.println("레벨이 올랐습니다.");
                    model.levelUp();
                }
            }else battle(model, mob);


        // 도망 선택

    }
}
