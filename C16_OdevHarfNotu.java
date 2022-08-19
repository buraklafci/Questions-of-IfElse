package day07_OdevlerIfElse;

import java.util.Scanner;

public class C16_OdevHarfNotu {
    public static void main(String[] args) {
        //notunu iste harf notunu yansıt
        //sifirdan kücük 100 den büyük notta tekrardan iste
        Scanner scanner = new Scanner(System.in);
        System.out.print("notunuzu girin : ");
        double not = scanner.nextDouble();

        if (not < 0 || not > 100) {
            System.out.println("gecerli not girin");
        } else if (not < 50) {
            System.out.println("Harf notunuz : D");
        } else if (not < 60) {
            System.out.println("Harf notunuz : C");
        } else if (not < 80) {
            System.out.println("Harf notunuz : B");
        } else  {
            System.out.println("Harf notunuz : A");
        }
    }
}