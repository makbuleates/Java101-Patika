import java.util.Scanner;
public class dairealanbulma {
    public static void main(String[] args) {
        double pi =3.14 ,r,aci,alan;
        Scanner input = new Scanner(System.in);
        System.out.print("Darirenin yarı çapını giriniz:");
        r= input.nextInt();
        System.out.print("Merkez açıyı giriniz:");
        aci= input.nextInt();
        alan = (pi*r*r*aci)/360;
        System.out.print("Dairein alanı:"+ alan);

    }
}