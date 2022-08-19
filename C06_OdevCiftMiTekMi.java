package day07_OdevlerIfElse;

import java.util.Scanner;

public class C06_OdevCiftMiTekMi {
    public static void main(String[] args) {
        //tam sayi isteyin tekmi çiftmi bulun
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir tam sayi giriniz");
        int sayi=scan.nextInt();

        if (sayi%2==0) {
            System.out.println("sayi = " + "cifttir");
        }
        else {
            System.out.println("sayi = " + "tektir");
        }
    }
}
