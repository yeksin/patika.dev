import java.util.Scanner;

public class HipotenusHesaplama {
    public static void main(String[] args) {

        double a, b,hipo;

        Scanner input= new Scanner(System.in);

        System.out.print("1. Kenar� Giriniz: ");
        a=input.nextDouble();

        System.out.print("2. Kenar� Giriniz: ");
        b=input.nextDouble();

        hipo= Math.sqrt((a*a)+(b*b));

        System.out.print("Hipoten�s Uzunlu�u: "+ hipo);

    }
}
