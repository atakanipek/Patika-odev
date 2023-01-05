import java.util.Scanner;

public class DongulerdeCiftDortKatlari {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int number, count = 0, total = 0;
        do {
            System.out.println("Dördün katları olup çift sayıların toplamı için Sayınızı giriniz: ");
            number = num.nextInt();
            if ((number % 2 == 0) && (number % 4 == 0)) {
                total += number;
            }
        } while (number >= 0);
        System.out.println("Dördün katları olup çift sayılarınızın toplamı: " + total);
    }
}
