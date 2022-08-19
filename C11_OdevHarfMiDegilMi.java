package day07_OdevlerIfElse;

import java.util.Scanner;

public class C11_OdevHarfMiDegilMi {
    public static void main(String[] args) {
        //karakter isteyin harfmi değilmi öğrenin
        Scanner scanner = new Scanner(System.in);
        System.out.print("lütfen bir karakter giriniz : ");
        char harf=scanner.next().charAt(0);


        if (harf>='a'&& harf<='z')  {
            System.out.println("girilen karakter harftir");
        }else if (harf>='A'&&harf<='Z') {
            System.out.println("girilen karakter harftir");
        }
         else if (!((harf>='a'&& harf<='z')||(harf>='A'&&harf<='Z')))
             System.out.println("girilen karakter harf değildir");

    }
}
