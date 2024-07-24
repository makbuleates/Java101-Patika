import java.util.Scanner;
public class taksimetre {
    public static void main(String[] args) {
        double min=20.0, acilis=10.0, gidilen, tutar, kmbasi=2.20;

        Scanner input=new Scanner(System.in);
        System.out.print("Gidilen mesafeyi km cinsinden yazınız:");
        gidilen = input.nextInt();
        tutar = acilis+(gidilen*kmbasi);
        if(tutar<20){
            tutar= 20;
            System.out.println("Ödenecek tutar:" + tutar);
        }
        else{
            System.out.println("Ödenecek tutar:"+ tutar);
        }

        }
    }
