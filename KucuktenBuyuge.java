import java.util.Scanner;

public class KucuktenBuyuge {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        int num1, num2, num3;
        System.out.println("İlk sayıyı giriniz");
        num1 = number.nextInt();
        System.out.println("İkinci sayıyı giriniz");
        num2 = number.nextInt();
        System.out.println("Üçüncü sayıyı giriniz");
        num3 = number.nextInt();

        if ((num1 < num2) && (num1 < num3)) {
            if ((num2 < num3)) {
                System.out.println("num1 < num2 < num3");
            } else {
                System.out.println("num1 < num3 < num2");
            }
        } else if ((num2 < num1) && (num2 < num3)) {
            if (num1 < num3) {
                System.out.println("num2 < num1 < num3");
            } else {
                System.out.println("num2 < num3 < num1");
            }
        } else if ((num3 < num1) && (num3 < num2)) {
            if (num1 < num2) {
                System.out.println("num3 < num1 < num2");
            } else {
                System.out.println("num3 < num2 < num1");
            }
        }
    }
}
