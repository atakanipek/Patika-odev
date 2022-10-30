import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        Scanner deger = new Scanner(System.in);

                 double boy, kilo;


        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy= deger.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo= deger.nextDouble();

                  double vucut;
         vucut= kilo / (boy*boy);
         System.out.print("Vücut Kütle İndeksiniz: " + vucut );









    }
}
