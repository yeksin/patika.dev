import java.util.Scanner;

public class SayilarToplam {
    public static void main(String[] args) {
        int num, total=0;

        do {
            Scanner scan = new Scanner(System.in);
            System.out.print("L�tfen say� giriniz: ");
            num= scan.nextInt();

            if (num%4==0) {
                total += num;
            }
        }while (num%2==0);

        System.out.println(total);
    }
}
