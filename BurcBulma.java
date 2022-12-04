import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        Scanner date = new Scanner(System.in);

        int day, mounth;

        System.out.println("Doğduğunuz günü giriniz: ");
        day = date.nextInt();
        if ((day > 31) || (day < 1)) {
            System.out.println("Yanlış veri girdiniz.");
        }

        System.out.println("Doğduğunuz ayı giriniz: ");
        mounth = date.nextInt();
        if ((mounth > 12) || (mounth < 1)) {
            System.out.println("Yanlış veri girdiniz.");
        }

        if (mounth == 1) {
            if (day <= 21) {
                System.out.println("Burcunuz Oğlak");
            } else {
                System.out.println("Burcunuz Kova");
            }
        }
        if (mounth == 2) {
            if (day <= 19) {
                System.out.println("Burcunuz Kova");
            } else {
                System.out.println("Burcunuz Balık");
            }
        }
        if (mounth == 3) {
            if (day <= 20) {
                System.out.println("Burcunuz Balık");
            } else {
                System.out.println("Burcunuz Koç");
            }
        }
        if (mounth == 4) {
            if (day <= 20) {
                System.out.println("Burcunuz Koç");
            } else {
                System.out.println("Burcunuz Boğa");
            }
        }
        if (mounth == 5) {
            if (day <= 21) {
                System.out.println("Burcunuz Boğa");
            } else {
                System.out.println("Burcunuz İkizler");
            }
        }
        if (mounth == 6) {
            if (day <= 22) {
                System.out.println("Burcunuz İkizler");
            } else {
                System.out.println("Burcunuz Yengeç");
            }
        }
        if (mounth == 7) {
            if (day <= 22) {
                System.out.println("Burcunuz Yengeç");
            } else {
                System.out.println("Burcunuz Aslan");
            }
        }
        if (mounth == 8) {
            if (day <= 22) {
                System.out.println("Burcunuz Aslan");
            } else {
                System.out.println("Burcunuz Başak");
            }
        }
        if (mounth == 9) {
            if (day <= 22) {
                System.out.println("Burcunuz Başak");
            } else {
                System.out.println("Burcunuz Terazi");
            }
        }
        if (mounth == 10) {
            if (day <= 22) {
                System.out.println("Burcunuz Terazi");
            } else {
                System.out.println("Burcunuz Akrep");
            }
        }
        if (mounth == 11) {
            if (day <= 21) {
                System.out.println("Burcunuz Akrep");
            } else {
                System.out.println("Burcunuz Yay");
            }
        }
        if (mounth == 12) {
            if (day <= 21) {
                System.out.println("Burcunuz Yay");
            } else {
                System.out.println("Burcunuz Oğlak");
            }
        }
    }
}