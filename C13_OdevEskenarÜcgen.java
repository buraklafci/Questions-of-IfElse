package day07_OdevlerIfElse;

import java.util.Scanner;

public class C13_OdevEskenarÜcgen {
    public static void main(String[] args) {
        //üçgenin kenarlarını isteyin eşkenar üçgenmi değil mi öğrenin
        Scanner scanner = new Scanner(System.in);
        System.out.print("ücgenin birinci kenarını girin : ");
        double birinciKenar= scanner.nextDouble();
        System.out.print("ücgenin ikinci kenarını girin : ");
        double ikinciKenar= scanner.nextDouble();
        System.out.print("ücgenin ücüncü kenarını girin : ");
        double ücüncüKenar= scanner.nextDouble();

        if (birinciKenar==ikinciKenar&&ikinciKenar==ücüncüKenar&&birinciKenar==ücüncüKenar)
        {
            System.out.println("eşkenar ücgendir");
        }
        else {
            System.out.println("eşkenar değildir");
        }
    }
}
