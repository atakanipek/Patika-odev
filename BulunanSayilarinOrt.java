import java.util.Scanner;

public class BulunanSayilarinOrt {
    public static void main(String[] args) {
        int i, j, adet = 0;
        double ort, toplam = 0;
        Scanner num = new Scanner(System.in);

        System.out.print("Sayınızı giriniz: ");
        j = num.nextInt();
        System.out.println(" Bu dizilimdeki  3'e ve 4'e bölünen sayılar: ");
        for (i = 1; i <= j; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                toplam += i;
                adet += 1;
                System.out.println(i);
            }
        }
        ort = toplam / adet;
        System.out.println("Sayıların ortalaması: " + ort);
    }
}
