/*N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
Java ile kombinasyon hesaplayan program yazınız.
 Kombinasyon formülü:
  C(n,r) = n! / (r! * (n-r)!) */
import java.util.Scanner;
public class Faktoriyel {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int kume, komb;
        int fak1 = 1;
        int fak2 = 1;
        int fak3 = 1;
        System.out.print("Kümenizin eleman sayısını giriniz: ");
        kume = num.nextInt();
        for (int n = 1; n <= kume; n++) {
            fak1 = fak1 * n;
        }
        System.out.print("Peki kaçlı kombinasyonunu arıyorsunuz?: ");
        komb = num.nextInt();
        for (int r = 1; r <= komb; r++) {
            fak2 = fak2 * r;
        }

        int fark = kume - komb;
        for (int k = 1; k <= fark; k++) {
            fak3 = fak3 * k;
        }

        int kombinasyon;
        kombinasyon = fak1 / (fak2 * fak3);
        System.out.println("İşlem sonucunuz: " + kombinasyon);
    }
}
