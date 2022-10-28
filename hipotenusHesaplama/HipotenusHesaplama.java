import java.util.Scanner;

public class HipotenusHesaplama {
    public static void main(String[] args) {

        double a, b,hipo;

        Scanner input= new Scanner(System.in);

        System.out.print("1. Kenarý Giriniz: ");
        a=input.nextDouble();

        System.out.print("2. Kenarý Giriniz: ");
        b=input.nextDouble();

        hipo= Math.sqrt((a*a)+(b*b));

        System.out.print("Hipotenüs Uzunluðu: "+ hipo);

    }
}
