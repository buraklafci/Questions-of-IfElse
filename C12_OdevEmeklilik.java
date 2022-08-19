package day07_OdevlerIfElse;

import java.util.Scanner;

public class C12_OdevEmeklilik {
    public static void main(String[] args) {
        //yaşını isteyin emekli olurmu olmazmı öğrenin
        Scanner scanner = new Scanner(System.in);
        System.out.print("lütfen yaşınızı girin : ");
        int yas= scanner.nextInt();

        if (yas<0) {
            System.out.println("gecerli yas giriniz");
        }
        else if (yas<65){
            System.out.println("emekli olamazsınız emekliliğe " + (65-yas)+ " yıl var");
        }
        else {
            System.out.println("emekli olabilirsiniz");
        }
    }
}
