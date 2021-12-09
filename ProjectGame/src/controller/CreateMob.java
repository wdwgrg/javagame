package controller;

import model.Mob;

public class CreateMob {
    public static Mob createMob(String name, int hp, int attackPt, int exp) {
//        Mob[] mobs = {new Mob(), new Mob(), new Mob()}
        Mob m =  new Mob(name, hp,exp,attackPt);
        return m;
    }
    public static void createBossMob(String name, int hp, int attackPt, int exp) {
//        Mob mob = new Mob();
    }

//    public static Mob createMob(int gold){
////        Mob m1 = new Mob(gold);
////        return m1;
////    }
}
