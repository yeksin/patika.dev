import java.util.Scanner;
    public class MukemmelSayi {
    public static void main(String[] args) {

        int a, toplam=0;
        Scanner scan=new Scanner(System.in);

        System.out.print("L�tfen bir say� giriniz: ");
        a= scan.nextInt();

        for (int n=1; n<a; n++) {
            if ((a%n)==0) {
                toplam+=n;
            }
        }
        if (toplam==a) {
            System.out.println(a+" bir m�kemmel say�d�r!");
        }else {
            System.out.println(a+" bir m�kemmel say� de�ildir!");
        }
    }
}
