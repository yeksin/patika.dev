import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        int m,n,i;

        Scanner scan= new Scanner(System.in);
        System.out.print("�ss�n� almak istedi�iniz say�y� giriniz: ");
        m= scan.nextInt();

        System.out.print("�s say�s�n� giriniz: ");
        n= scan.nextInt();

        for (i=1; n>=1; i*=m) {
            n-=1;
        }
        System.out.println(i);
    }
}
