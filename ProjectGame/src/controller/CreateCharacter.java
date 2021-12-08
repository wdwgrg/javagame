package controller;
import java.util.Scanner;

public class CreateCharacter {

        public static void createCharacter(){
            Scanner sc = new Scanner(System.in);
            System.out.println("캐릭터를 선택하시오");
            System.out.println("1:전사, 2:마법사, 3:궁수");
            String characterNum = sc.nextLine();

        if (characterNum.equals("1")) {
            System.out.println("전사를 선택하였습니다");

        } else if (characterNum.equals("2")) {
            System.out.println("마법사를 선택했습니다");

        } else {
            System.out.println("궁수를 선택했습니다");
        }

        }

}



