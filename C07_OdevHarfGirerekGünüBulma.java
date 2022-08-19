package day07_OdevlerIfElse;

import java.util.Scanner;

public class C07_OdevHarfGirerekGünüBulma {
    public static void main(String[] args) {
        //harf ismi isteyin hangi gün olduğunu bulun
        Scanner scanner = new Scanner(System.in);
        System.out.print("lütfen gün isminin ilk harfini giriniz : ");
        Character günİlkHarfi  = scanner.next().toLowerCase().charAt(0);


        if (günİlkHarfi.equals('p')){
            System.out.println("p ile baslayan günler = pazartesi,persembe,pazar");
        }
        else if (günİlkHarfi.equals('s')) {
            System.out.println("s ile baslayan günler = salı");
        }
        else if (günİlkHarfi.equals('c')){
            System.out.println("c ile baslayan günler = carsamba,cuma,cumartesi");
        }
        else {
            System.out.println("lütfen gecerli bir harf giriniz");
        }
    }
}
