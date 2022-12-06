import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner year = new Scanner(System.in);
        int artik;

        System.out.print("Yılınızı giriniz: ");
        artik = year.nextInt();

        if ((artik % 4) == 0) {
            System.out.print(artik + " artık yıldır.");
        } else {
            System.out.print(artik + " artık yıl değildir.");
        }
        if (artik > 100) {
            if (artik % 100 == 0 && artik % 400 == 0) {
                System.out.print(artik + " artık yıldır.");
            }
        } else {
            System.out.print(artik + " artık yıl değildir.");
        }
    }
}
