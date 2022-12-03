import java.util.Scanner;

public class BiletFiyati {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age, km, type;
        double price, total= 0  , discount1 = 2, discount2 = 0.1, discount3 = 0.3, discount4 = 0.2,money ;

        System.out.print("Gitmek istediğiniz yolu km cinsinden giriniz: ");
        km = input.nextInt();
        if (km < 0) {
            km = 0;
            System.out.println("Hatalı giriş yaptınız. Baştan başlayınız.");
        }
        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();
        if (age < 0) {
            age = 0;
            System.out.println("Hatalı giriş yaptınız. Baştan başlayınız.");
        }
        System.out.println("Yolculuk tipiniz nasıl olacak sayısı ile belirtiniz: \n 1) Gidiş-Dönüş \n 2) Tek Yön ");
        type = input.nextInt();

        price = km * 0.10;
        if (age < 12) {
            total = price * discount1;
        }
            else if (age >= 12 && age <24 ) {
            total = (price / discount2) ;
        }
                else if (age > 65){
                    total = price * discount3;
        }
        if (type == 1){
        total = price * discount4;
        money= price - total;
    }

        System.out.println("Total " + total );
    }
}
