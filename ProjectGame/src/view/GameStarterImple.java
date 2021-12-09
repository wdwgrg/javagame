package view;
import java.util.Scanner;
import controller.CreateCharacter;
import controller.Starter;

public class GameStarterImple implements GameStarter{
    Scanner sc = new Scanner(System.in);
    @Override
    public void gameStarter() {
        Starter.starter();
    }

    @Override
    public void gameRestarter() {

    }

    @Override
    public void createCharacter() {
        CreateCharacter.createCharacter();
    }
}
