import java.util.Scanner;

public class ucgenalanhesaplama {
    public static void main(String[] args){
     int a,b,c,u;
     double alan;

     Scanner input = new Scanner(System.in);

        System.out.print("Birinci kenar uzunluğunu giriniz:");
        a = input.nextInt();

        System.out.print("İkinci kenar uzunluğunu giriniz:");
        b = input.nextInt();

        System.out.print("Üçüncü kenar uzunluğunu giriniz:");
        c = input.nextInt();

      u =(a+b+c)/2;
      alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("üçgenin alanı." + alan);
    }

}
