import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        Scanner date = new Scanner(System.in);

        int year;
        double zodiac;
        System.out.print("Doğum yılınızı giriniz: ");
        year = date.nextInt();

        zodiac = (year % 12);

        if (zodiac == 0) {
            System.out.print("Maymun");
        }
        if (zodiac == 1) {
            System.out.print("Horoz");
        }
        if (zodiac == 2) {
            System.out.print("Köpek");
        }
        if (zodiac == 3) {
            System.out.print("Domuz");
        }
        if (zodiac == 4) {
            System.out.print("Fare");
        }
        if (zodiac == 5) {
            System.out.print("Öküz");
        }
        if (zodiac == 6) {
            System.out.print("Kaplan");
        }
        if (zodiac == 7) {
            System.out.print("Tavşan");
        }
        if (zodiac == 8) {
            System.out.print("Ejderha");
        }
        if (zodiac == 9) {
            System.out.print("Yılan");
        }
        if (zodiac == 10) {
            System.out.print("At");
        }
        if (zodiac == 11) {
            System.out.print("Koyun");
        }
    }
}
