package day07_OdevlerIfElse;

import java.util.Scanner;

public class C14_OdevGün {
    public static void main(String[] args) {
        //gün isteyin ilk harfi büyük diğer ikisini küçük yazdırın
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen gün ismi girin");
        String gün=scanner.next().toLowerCase();

        if(gün.equals("pazar")||gün.equals("pazartesi")){
            System.out.println("Paz");
        }
        else if(gün.equals("sali")) {
            System.out.println("Sal");

        } else if(gün.equals("carsamba")) {
            System.out.println("Car");
        }else if(gün.equals("persembe")) {
            System.out.println("Per");
        }
        else if(gün.equals("cuma")||gün.equals("cumartesi")) {
            System.out.println("Cum");
        }
        else {
            System.out.println("lütfen gecerli bir gün ismi girin");
        }
    }
}
