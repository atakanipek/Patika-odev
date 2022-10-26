import java.util.Scanner;

public class HipotenusHesabi {
    public static void main(String[] args) {
        Scanner kenarUzunlugu = new Scanner(System.in);

                int a, b;           double c;

        System.out.print("Birinci kenar uzunluğunuzu giriniz:  ");
        a = kenarUzunlugu.nextInt();
        System.out.print("İkinci kenar uzunluğunuzu girin:  ");
        b= kenarUzunlugu.nextInt();

        c = Math.sqrt((a*a) + (b*b));

        System.out.println("Hipotenüsünüz:  " + c);

                double ucgencevresi, alan;

        ucgencevresi = a + b + c;
        System.out.println("Üçgeninizin çevre uzunluğu  :" +  ucgencevresi);

        alan = a*b/ 2;
        System.out.println("Üçgeninizin alanı:  "  + alan);




    }
}
