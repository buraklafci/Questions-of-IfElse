package day07_OdevlerIfElse;

import java.util.Scanner;

public class C15_OdevMatematikselIslem {
    public static void main(String[] args) {
        //iki sayi isteyin sifirdan büyükse topla
        //sifirdan küçükse çarp
        //farkli işaretliyse işlem yapamazsin yazdir
        //sayilar sifir ise yutan elemandır yazdir
        Scanner scanner = new Scanner(System.in);
        System.out.print("birinci sayiyi girin : ");
        double birinciSayi= scanner.nextDouble();
        System.out.print("ikinci sayiyi girin : ");
        double ikinciSayi= scanner.nextDouble();

        if (birinciSayi>0&&ikinciSayi>0) {
            System.out.println("iki sayiyinin toplamı = " + (birinciSayi+ikinciSayi));

        }
        else if (birinciSayi<0&&ikinciSayi<0) {
            System.out.println("iki sayiyinin carpimi = " + (birinciSayi*ikinciSayi));

        }else if ((birinciSayi<0&&ikinciSayi>0)||birinciSayi>0&&ikinciSayi<0) {
            System.out.println("farkli isaretlerde sayilarla islem yapamazsin");
        }else if ((birinciSayi==0||ikinciSayi==0)) {
            System.out.println("Sifir carpmaya göre yutan elemandır");
        }
    }
}
