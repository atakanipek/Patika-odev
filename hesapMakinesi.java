package Giris;

import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        Scanner number= new Scanner(System.in);

        int n1, n2, select;



        System.out.print("İLK SAYIYI GİRİNİZ: ");
        n1 = number.nextInt();

        System.out.print("İKİNCİ SAYIYI GİRİNİZ: ");
        n2 = number.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        select = number.nextInt();

    switch (select){
        case 1:
            System.out.print("Toplam: " + (n1 + n2));
            break;
        case 2:
            System.out.print("Kalan: "+ (n1 - n2));
            break;
        case 3:
            System.out.print("Çarpım: " + (n1 * n2));
            break;
        case 4:
            System.out.print("Bölüm: " + (n1 / n2));

        default:    System.out.print("hatalı işlem yaptınız.");

    }

    }
}
