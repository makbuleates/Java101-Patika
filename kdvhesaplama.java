import java.util.Scanner;
public class kdvhesaplama {
    public static void main(String[] args) {
        double fiyat, kdvoranibir = 0.18, kdvoraniiki = 0.08, kdvlifiyat;

        Scanner input = new Scanner(System.in);

        System.out.print("Fiyatı giriniz:");
        fiyat = input.nextDouble();

        if ((0 < fiyat) && (fiyat< 1000)) {

            kdvlifiyat = fiyat + (fiyat * kdvoranibir);

            System.out.println("KDV'li Fiyat:" + kdvlifiyat);
        } else {
            kdvlifiyat = fiyat + (fiyat * kdvoraniiki);

            System.out.println("KDV'li Fiyat:" + kdvlifiyat);
        }
    }
}







