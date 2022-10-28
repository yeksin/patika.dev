import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        int m,n,i;

        Scanner scan= new Scanner(System.in);
        System.out.print("Üssünü almak istediðiniz sayýyý giriniz: ");
        m= scan.nextInt();

        System.out.print("Üs sayýsýný giriniz: ");
        n= scan.nextInt();

        for (i=1; n>=1; i*=m) {
            n-=1;
        }
        System.out.println(i);
    }
}
