package controller;

import model.Model;
import model.Portion;

import java.util.Scanner;

public class ShopPurchase {

    public static void shop(Model m) {
        System.out.println("********물약 상점*******");

        Scanner sc = new Scanner(System.in);
        System.out.println("포션을 선택하시오");
        System.out.println("1:작은포션, 2:중간포션, 3:대형포션");
        String shopPurchase = sc.nextLine();
        if (shopPurchase.equals("1")) {
            if (m.getGold() <= 0) {
                System.out.println("구입을 하지 못합니다");
            } else {
                System.out.println("작은포션을 선택하였습니다");
                Portion p = new Portion(100, 300);
                m.getGold();
                m.setPortion();
                m.eating();
            }
        } else if (shopPurchase.equals("2")) {
            if (m.getGold() <= 0) {
                System.out.println("구입을 하지 못합니다");
            } else {
                System.out.println("중간포션을 선택했습니다");
                Portion p = new Portion(200, 500);
                m.getGold();
                m.setPortion();
                m.eating();
            }
        } else if (shopPurchase.equals("3")) {
            if (m.getGold() <= 0) {
                System.out.println("구입을 하지 못합니다");
            } else {
                System.out.println("대형포션을 선택했습니다");
                Portion p = new Portion(500, 1000);
                m.getGold();
                m.setPortion();
                m.eating();
            }
        } else {
            System.out.println("");
        }
    }

//    public static void shopPurchase() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("포션을 선택하시오");
//        System.out.println("1:작은포션, 2:중간포션, 3:대형포션");
//        String shopPurchase = sc.nextLine();
//
//        if (shopPurchase.equals("1")) {
//            System.out.println("작은포션을 선택하였습니다");
//
//        } else if (shopPurchase.equals("2")) {
//            System.out.println("중간포션을 선택했습니다");
//
//        } else if (shopPurchase.equals("3")) {
//            System.out.println("대형포션을 선택했습니다");
//        } else {
//            System.out.println("");
//        }
//
//    }
}
