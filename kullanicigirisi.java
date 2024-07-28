import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        String username, password, cevap, yenisifre;
        Scanner input= new Scanner(System.in);

        System.out.println("Kullanıcı adınızı girin:");
        username= input.nextLine();

        System.out.println("Parolanızı girin:");
        password= input.nextLine();

        if(username.equals("patika")&&password.equals("java123")){
            System.out.println("Giriş yaptınız!");
        }
        else{
            System.out.println("Bilgileriniz yanlış!");
            System.out.println("Şifrenizi sıfırlamak isterseniz evet yazın.");
            cevap= input.nextLine();

            if(cevap.equals("evet")){
                System.out.println("Yeni şifrenizi giriniz:");
                yenisifre= input.nextLine();
                if(yenisifre.equals("java123")) {
                    System.out.println("Şifre oluşturulamadı. Lütfen başka şifre deneyiniz.");
                }
                    else{
                        System.out.println("Şifre güncellendi!");
                    }

            }
        }


    }
}
