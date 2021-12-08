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
        System.out.println("캐릭터를 선택하시오");
        System.out.println("1:전사, 2:마법사, 3:궁수");
        
        CreateCharacter.createCharacter();
    }
}
