import java.util.Scanner;

public class AlanHesaplama {
    public static void main(String[] args) {

        double bir, iki, uc;

        Scanner input= new Scanner(System.in);
        System.out.print("1.kenar� giriniz: ");
        bir= input.nextInt();

        System.out.print("2.kenar� giriniz: ");
        iki= input.nextInt();

        System.out.print("3.kenar� giriniz: ");
        uc=input.nextInt();

        double u= (bir+iki+uc)/2;
        double cevre =2*u;
        double alan= Math.sqrt(u*(u-bir)*(u-iki)*(u-uc));


        System.out.println("��genin �evresi: "+ cevre);
        System.out.println("��genin Alan�: "+alan);











    }
}
