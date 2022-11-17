import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        int m,n,i;

        Scanner scan= new Scanner(System.in);
        System.out.print("Üssünü almak istediğiniz sayıyı giriniz: ");
        m= scan.nextInt();

        System.out.print("Üs sayısını giriniz: ");
        n= scan.nextInt();

        for (i=1; n>=1; i*=m) {
            n-=1;
        }
        System.out.println(i);
    }
}
