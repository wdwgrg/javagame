package controller;

import model.Mob;
import model.Model;

public class Battle {
    public static void battle(Model model, Mob mob){
        System.out.println("전투를 시작합니다.");
        System.out.println("1. 공격   2. 도망");
        // 공격선택
        model.attack(mob);
        if(mob.getHp() < 0) {
            System.out.println(mob.getName() + "을 잡았습니다!");
            model.setExp(mob.getExp());
            if(model.getExp() > model.getNeedExp()) {
                System.out.println("레벨이 올랐습니다.");
                model.levelUp();
            }
        }



    }
}
