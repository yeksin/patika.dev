import java.util.Scanner;

public class AlanHesaplama {
    public static void main(String[] args) {

        double bir, iki, uc;

        Scanner input= new Scanner(System.in);
        System.out.print("1.kenarı giriniz: ");
        bir= input.nextInt();

        System.out.print("2.kenarı giriniz: ");
        iki= input.nextInt();

        System.out.print("3.kenarı giriniz: ");
        uc=input.nextInt();

        double u= (bir+iki+uc)/2;
        double cevre =2*u;
        double alan= Math.sqrt(u*(u-bir)*(u-iki)*(u-uc));


        System.out.println("Üçgenin Çevresi: "+ cevre);
        System.out.println("Üçgenin Alanı: "+alan);











    }
}
