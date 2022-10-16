
import java.util.Scanner;

public class NotOrtalamasiOdev  {
    public static void main(String[] args) {
        Scanner ders = new Scanner(System.in);

        int Matematik , Kimya , Tarih , Turkce , Muzik;

        System.out.print("Matematik Notunu Giriniz : ");
        Matematik = ders.nextInt();

        System.out.print("Kimya Notunuzu Giriniz : ");
        Kimya = ders.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz : ");
        Turkce = ders.nextInt();

        System.out.print("Tarih Notunuzu Giriniz : ");
        Tarih = ders.nextInt();

        System.out.print("Müzik Notunuzu Giriniz : ");
        Muzik = ders.nextInt();

             int toplam = (Matematik+Kimya+Turkce+Tarih+Muzik);

            double ortalama = toplam / 5;

                    String gecmeDurumu = (ortalama >= 60) ? ("Sınıfı Geçtiniz--Ortalamanız--> " + ortalama ) : ("Sınıfta Kaldınız--Ortalamanız--> " + ortalama);

        System.out.print(gecmeDurumu);
    }
}
