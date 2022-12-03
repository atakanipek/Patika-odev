import java.util.Scanner;

public class HavaEtkilik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int heat;

        System.out.println("Sıcaklığı giriniz");
        heat = input.nextInt();

        if ( heat < 5) {
            System.out.println("Kayağa gidilebilir.");
        } else if (heat < 25) {
            if (heat <= 15) {
                System.out.println("sinemaya gidilebilir.");
            }
            if (heat >= 10) {
                System.out.println("Pikniğe gidilebilir");
            } else {
                System.out.println("Yüzmeye gidilebilir");
            }

        }
    }
}
