package day07_OdevlerIfElse;

import java.util.Scanner;

public class C09_OdevDikdörtgenKareMi {
    public static void main(String[] args) {
        //dikdörtgenin kenarlarını girin kare mi değil mi onu öğrenin
        Scanner scanner = new Scanner(System.in);
        System.out.print("dikdörtgenin uzun kenarını girin : ");
        double uzunKenar= scanner.nextDouble();
        System.out.print("dikdörtgenin kısa kenarını girin : ");
        double kısaKenar= scanner.nextDouble();

        if (uzunKenar==kısaKenar) {
            System.out.println("dikdörtgen karedir");
        }
        else {
            System.out.println("dikdörtgen kare değildir");
        }
    }
}
