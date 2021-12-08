import controller.Battle;
import model.Barbarian;
import model.Mob;
import model.Model;
import repository.Repository;
import repository.RepositoryImpl;
import view.GameStarter;
import view.GameStarterImple;

public class Main {
    public static void main(String[] args) {
        Barbarian ba = new Barbarian(150);
        Mob mob = new Mob("고블린", 100, 10, 50);
        Repository rp = new RepositoryImpl();
//        Battle.battle(ba, mob);
//        GameStarter gs = new GameStarterImple();
//        gs.gameStarter();
//        gs.createCharacter();
        rp.addModel(ba);
        double a = 5.0;
        double b = 10.0;
        System.out.println((int)(a+b));

//        Barbarian m = (Barbarian)rp.getModel(0);
//        System.out.println("name: " + m.getName() +"\nhp: " + m.getHp() +"\nmp: " + m.getMp() + "\npower:" + m.getPower());
    }
}
