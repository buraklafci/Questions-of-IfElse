package day07_OdevlerIfElse;

import java.util.Scanner;

public class C08_OdevGün {
    public static void main(String[] args) {
        //gün ismi isteyin haftaiçimi haftasonumu onu öğrenin
        Scanner scanner = new Scanner(System.in);
        System.out.print("lütfen gün ismini giriniz : ");
        String günİsmi = scanner.next().toLowerCase();

        if (günİsmi.equals("pazartesi") || günİsmi.equals("sali") || günİsmi.equals("carsamba")
                || günİsmi.equals("persembe") || günİsmi.equals("cuma")) {
            System.out.println("girilen gün haftaiçidir");
        } else if (günİsmi.equals("cumartesi") || günİsmi.equals("pazar")) {
            System.out.println("girilen gün haftasonudur");
        } else {
            System.out.println("lütfen geçerli bir gün ismi giriniz");
        }
    }
}