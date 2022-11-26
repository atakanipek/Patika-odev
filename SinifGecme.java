import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        Scanner not = new Scanner(System.in);
        int mat, fiz, kim, tur, muz, enDusuk = 0, enBuyuk = 100, toplam = 0;
        /*
         ilk olarak integer türünde derslerimizi tanımladık.
         Şimdi verilerimizi girerken aynı zamanda bunları if blocklarına koşullu şekilde yazacağız.
         */
        System.out.print("Matematik notunuzu giriniz: ");
        mat = not.nextInt();
        if ((mat < enDusuk) || (mat > enBuyuk)) {
            mat = 0;
            System.out.println("Yanlış veri girdiniz. Dersiniz ortalamanıza katılmadı.");

        }
        toplam = toplam + mat;
        System.out.print("Fizik notunuzu giriniz: ");
        fiz = not.nextInt();
        if ((fiz < enDusuk) || (fiz > enBuyuk)) {
            fiz = 0;
            System.out.println("Yanlış veri girdiniz. Dersiniz ortalamanıza katılmadı.");
        }
        toplam = toplam + fiz;
        System.out.print("Türkçe notunuzu giriniz: ");
        tur = not.nextInt();
        if ((tur < enDusuk) || (tur > enBuyuk)) {
            tur = 0;
            System.out.println("Yanlış veri girdiniz. Dersiniz ortalamanıza katılmadı.");
        }
        toplam = toplam + tur;
        System.out.print("Kimya notunuzu giriniz: ");
        kim = not.nextInt();
        if ((kim < enDusuk) || (kim > enBuyuk)) {
            kim = 0;
            System.out.println("Yanlış veri girdiniz. Dersiniz ortalamanıza katılmadı.");
        }
        toplam = toplam + kim;

        System.out.print("Müzik notunuzu giriniz: ");
        muz = not.nextInt();

        if ((muz < enDusuk) || (muz > enBuyuk)) {
            muz = 0;
            System.out.println("Yanlış veri girdiniz. Dersiniz ortalamanıza katılmadı.");
        }
        toplam = toplam + muz;

        double ort;
        ort = toplam / 5;

// son olarak ortalamamız sınıf geçme notundan yüksekse ne yazılacağını, değilse ne yazılacağını if bloğu eşliğinde yazıyoruz.
        if (ort >= 55) {
            System.out.print("Sınıfı başarı ile geçtiniz. Tebrikler!");
        } else {
            System.out.print("Sınıf geçmek konusunda başarısız oldunuz.");
        }
        System.out.print("Ortalamanız: " + ort);
    }
}
