import java.util.Scanner;
public class sayisiralama {
    public static void main(String[] args){
        int a, b, c, min, max, avrg;
        Scanner inp= new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz:");
        a= inp.nextInt();
        System.out.print("İkinci sayıyı giriniz:");
        b= inp.nextInt();
        System.out.print("Üçüncü sayıyı giriniz:");
        c= inp.nextInt();

        if((c<a)&&(b<a)){
            max=a;
            if(c<b){
                min=c;
                avrg=b;
            }
            else{
                min=b;
                avrg=c;
            }
        } else if ((c<b)&&(a<b)) {
            max=b;
            if(c<a){
                min=c;
                avrg=a;
            }
            else{
                min=a;
                avrg=c;
            }

        }

        else{
            max=c;
            if(b<a){
                min=b;
                avrg=a;
            }
            else{
                min=a;
                avrg=b;
            }
        }

        System.out.println("Büyükten küçüğe:"+ max +" " + avrg +" " + min);

    }
}
