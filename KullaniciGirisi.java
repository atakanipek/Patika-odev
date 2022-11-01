package Giris;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String userName, password;

        //username: Patika      password: Java123

        System.out.print("Kullanıcı Adınızı Giriniz: ");
        userName = in.nextLine();
        System.out.print("Şifrenizi Giriniz: ");
        password = in.nextLine();
        Scanner newPassword = new Scanner(System.in);

        if (userName.equals("Patika")&& password.equals("Java123")) {
            System.out.print("Girişiniz başarılı!");}
        else {System.out.println("Kullanıcı adı/Şifreniz hatalı");
        }
        if (!password.equals("Java123")){
            System.out.print("Yeni Şifre Belirleyiniz: ");
            password = newPassword.nextLine();

            if(password.equals("Java123")){
                System.out.print("Şifreniz Eski Şifre İle Aynı Olamaz.\nGiriş Yapmayı Tekrar Deneyiniz.");}
            else { System.out.print("Şifreniz Başarı İle Değiştirildi. Giriş Yapabilirsiniz");

            }
        }
    }
}
