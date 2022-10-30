import java.util.Scanner;

public class ManavSepeti {
    public static void main(String[] args) {

        Scanner deger= new Scanner(System.in);

        double armut , elma , domates , muz , patlican, kilo;
        double armutBir= 2.14 , domatesBir= 1.11 , muzBir= 0.95 , elmaBir= 3.67 , patlicanBir=5;

        System.out.print("Aldığınız armutun kilosunu giriniz: ");
        armut= deger.nextInt();

        System.out.print("Aldığınız elmanın kilosunu giriniz: ");
        elma= deger.nextInt();

        System.out.print("Aldığınız domatesin kilosunu giriniz: ");
        domates= deger.nextInt();

        System.out.print("Aldığınız muzun kilosunu giriniz: ");
        muz=deger.nextInt();

        System.out.print("Aldığınız patlıcanın kilosunu giriniz: ");
        patlican=deger.nextInt();

        kilo= (armut * armutBir ) + (elma * elmaBir) + (domates * domatesBir) + (muz * muzBir) + (patlican * patlicanBir);
        System.out.print("Ödenecek tutar: " + kilo + "TL");
    }}
