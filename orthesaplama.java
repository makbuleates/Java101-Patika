import java.util.Scanner;
public class Baslangic {
    public static void main(String[] args) {
        int mat , fizik ,turkce, tarih, muzik, kimya;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz:");
        mat=input.nextInt();

        System.out.print("Fizik notunuz:");
        fizik=input.nextInt();

        System.out.print("Türkçe notunuz:");
        turkce=input.nextInt();

        System.out.print("Tarih notunuz:");
        tarih=input.nextInt();

        System.out.print("Müzik notunuz:");
        muzik=input.nextInt();

        System.out.print("Kimya notunuz:");
        kimya=input.nextInt();

        double ortalama= (mat + fizik + turkce + tarih + muzik + kimya)/6;

        String str = (ortalama > 60)?"sınıfı geçti" : "sınıfta kaldı";


        System.out.println("Ortalamanız:" + ortalama);
        System.out.println(str);
    }
}
