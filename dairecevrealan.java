import java.util.Scanner;
public class dairecevrealan {
    public static void main(String[] args) {
        double pi =3.14 ,r, cevre, alan;
        Scanner input = new Scanner(System.in);
        System.out.print("Darirenin yarı çapını giriniz:");
        r= input.nextInt();
        cevre= 2*pi*r;
        alan = pi*r*r;
        System.out.println("Dairenin çevresi:"+ cevre);
        System.out.print("Dairein alanı:"+ alan);

    }
}