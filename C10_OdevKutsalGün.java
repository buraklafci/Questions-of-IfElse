package day07_OdevlerIfElse;

import java.util.Scanner;

public class C10_OdevKutsalGün {
    public static void main(String[] args) {
        //gün girin kutsal gün mü değilmi onu öğrenin
        Scanner scanner = new Scanner(System.in);
        System.out.print("lütfen gün ismini giriniz : ");
        String günİsmi = scanner.next().toLowerCase();

        if (günİsmi.equals("cuma")) {
            System.out.println("Müslümanlar için kutsal gündür");
        } else if (günİsmi.equals("cumartesi")) {
            System.out.println("Yahudiler için kutsal gündür");
        } else if (günİsmi.equals("pazar")) {
            System.out.println("Hristiyanlar için kutsal gündür");
        }
        else System.out.println("lütfen geçerli bir gün giriniz");
    }
}