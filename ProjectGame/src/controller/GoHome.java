package controller;
import model.Model;

import java.util.Scanner;
public class GoHome {
        public static void gohome(Model model){
            Scanner sc = new Scanner(System.in);

            System.out.println("당신은 마을에 도착했습니다");
            System.out.println("1: 상점, 2:스테이지로 이동");
            String num = sc.nextLine();
            if(num.equals("1")){
                System.out.println("상점에 도착했습니다");
            }else {
                System.out.println("되돌아갑니다");


            }

        }
}
