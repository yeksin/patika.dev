import java.util.Scanner;

public class DaireDilimAlani {
    public static void main(String[] args) {

        double alan,r,angle, pi=3.14;

        Scanner inp=new Scanner(System.in);

        System.out.print("Yarıçapı giriniz: ");
        r= inp.nextDouble();

        System.out.print("Açıyı giriniz: ");
        angle=inp.nextDouble();

        alan= (pi*(r*r)*angle)/360;
        System.out.println("Daire diliminin alanı: "+ alan);










    }
}
