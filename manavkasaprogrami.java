import java.util.Scanner;
public class manavkasaprogrami{
    public static void main(String[] args) {
     double armut=2.14 , elma=3.67 , domates=1.11 , muz=0.95 , patlican=5.0 , a , e , d , m , p , tutar;
     Scanner input =new Scanner(System.in);

        System.out.print("Kaç kilo armut?");
        a=input.nextDouble();

        System.out.print("Kaç kilo elma?");
        e=input.nextDouble();

        System.out.print("Kaç kilo domates?");
        d=input.nextDouble();

        System.out.print("Kaç kilo muz?");
        m=input.nextDouble();

        System.out.print("Kaç kilo patlıcan?");
        p=input.nextDouble();

        tutar=(a*armut)+(e*elma)+(d*domates)+(m*muz)+(p*patlican);

        System.out.print("Toplam tutar:"+tutar);
    }
}