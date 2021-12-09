import controller.Battle;
import controller.CreateStage;
import model.Barbarian;
import model.Mob;
import model.Model;
import repository.Repository;
import repository.RepositoryImpl;
import view.GameStarter;
import view.GameStarterImple;

public class Main {
    public static void main(String[] args) {
        Barbarian ba = new Barbarian(200);
        System.out.println("******************마을**************");

        CreateStage.createStage(ba, 1);
        CreateStage.createStage(ba, 2);
        CreateStage.createStage(ba, 3);
        CreateStage.createStage(ba, 4);
    }
}
