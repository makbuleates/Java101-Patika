import java.util.Scanner;
public class Main {
    public static void main(String[]args){
    int mat, fizik, turkce, kimya, muzik;
    double ort;
    Scanner inp= new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz:");
        mat= inp.nextInt();
        System.out.println("Fizik notunuzu giriniz:");
        fizik= inp.nextInt();
        System.out.println("Türkçe notunuzu giriniz:");
        turkce= inp.nextInt();
        System.out.println("Kimya notunuzu giriniz:");
        kimya= inp.nextInt();
        System.out.println("Müzik notunuzu giriniz:");
        muzik= inp.nextInt();

        ort=(mat+fizik+turkce+kimya+muzik)/5.0;

        System.out.println("Ortalamanız:"+ort);
        if(ort<55){
            System.out.println("Sınıfta kaldınız.");
        }
        else{
            System.out.println("Tebrikler sınıfı geçtiniz!");
        }
    }
}
