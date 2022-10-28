import java.util.Scanner;

public class Dongu {

    public static void main(String[] args) {
        int num=0, count=0, total=0;
        Scanner scan= new Scanner(System.in);

        System.out.print("Bir sayý giriniz: ");
        num= scan.nextInt();

        for ( int i=0; num>=i ; i++) {

            if (i%3==0 && i%4==0)    {
                count++;
                total += i;
            }
        }
        double ave= total/(count-1);
        System.out.println(ave);
    }
}
