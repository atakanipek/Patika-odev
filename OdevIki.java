import java.util.Scanner;
public class OdevIki {
    public static void main(String[] args) {

          Scanner fiyat= new Scanner(System.in);
    double kdvsiz;

        System.out.print("İstenilen Ürünün KDV'siz Tutarı : ");

            kdvsiz = fiyat.nextDouble();
            System.out.println("KDV'siz fiyat :" + kdvsiz);


    double Kkdvli = ((kdvsiz / 100 * 18) + kdvsiz);


    double Bkdvli = ((kdvsiz / 100 * 8) + kdvsiz );



    String sonFiyat = (kdvsiz <= 1000) ? ("Ödenecek Toplam tutar : " + Kkdvli ) : ("Ödenecek Toplam tutar : " + Bkdvli ) ;

        System.out.println(sonFiyat);

    }


    }

