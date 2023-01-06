import java.util.Scanner;

public class DortveBesUsleri {
    public static void main(String[] args) {
        // Girilen sayıya kadar 4 ve 5in kuvvetlerini output olarak çıkaran program?????
        int number, i;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayınızı giriniz: ");
        number = input.nextInt();
        for (i = 1; i <= number; i *= 4) {
            if ((i % 4 == 0) && (i % 5 == 0)) {
                i *= 4;

            }
            System.out.println("4'ün üslü katları: " + i);
        }
        for (i = 1; i <= number; i *= 5) {
            if ((i % 4 == 0) && (i % 5 == 0)) {
                i *= 5;
            }
            System.out.println("5'in üslü katları: " + i);
        }
    }
}