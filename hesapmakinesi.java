import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    double sayi1, sayi2, sonuc;
    int islem;

    Scanner input= new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz:");
        sayi1= input.nextDouble();

        System.out.println("İkinci sayıyı giriniz:");
        sayi2= input.nextDouble();

        System.out.println("Yapmak istediğiniz işlemi giriniz:");
        System.out.println("Toplama->1 Çıkarma->2 Çarpma->3 Bölme->4");
        islem=input.nextInt();

        switch (islem){
            case 1 :
                sonuc=(sayi1+sayi2);
                System.out.println("Sonuç:"+sonuc);
                break;

            case 2 :
                sonuc=(sayi1-sayi2);
                System.out.println("Sonuç:"+sonuc);
                break;

            case 3 :
                sonuc=(sayi1*sayi2);
                System.out.println("Sonuç:"+sonuc);
                break;

            case 4 :
                sonuc=(sayi1/sayi2);
                System.out.println("Sonuç:"+sonuc);
                break;

        }

    }
}
