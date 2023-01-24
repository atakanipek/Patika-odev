import java.util.Scanner;

public class UsAlma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, us;
        System.out.println("Sayınızı giriniz: ");
        sayi = input.nextInt();
        System.out.println("Kaçlı kuvvetini alacaksınız?:");
        us = input.nextInt();
        int total = 1;
        for (int i=1 ; i<=us ; i++){
            total*=sayi;
        }
System.out.println(total);
    }
}
