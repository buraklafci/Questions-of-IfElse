package day07_OdevlerIfElse;

import java.util.Scanner;

public class C17_OdevMaasTeklif {
    public static void main(String[] args) {
        //maas teklifini 60.000,80.000 ve üstünü şartlara göre yazdırın
        Scanner scanner = new Scanner(System.in);
        System.out.print("maas teklifiniz : ");
        double maas = scanner.nextDouble();

        if (maas < 60.000) {
            System.out.println("kabul edemem");
        }else if (maas < 80.000){
            System.out.println("konusabiliriz");
        }else {
            System.out.println("kabul ediyorum");
        }
    }
}
