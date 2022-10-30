import java.util.Scanner;

public class DaireAlaniVeCevresi {
    public static void main(String[] args) {
        Scanner yariCap = new Scanner(System.in);
int r;  double pi=3.14;

    System.out.print("Dairenin yarıçapını giriniz: ") ;
    r=yariCap.nextInt();

    double cevre= 2 * pi * r;             double alan = pi * r * r;
    System.out.println("Alanınız: " + alan);
    System.out.println("Çevreniz: " + cevre);
    }
}
