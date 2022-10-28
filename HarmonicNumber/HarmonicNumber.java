import java.util.Scanner;
public class HarmonicNumber {
    public static void main(String[] args) {

        int num;
        double result=0;
        Scanner scan= new Scanner(System.in);
        System.out.print("Lüften sayýyý giriniz: ");
        num= scan.nextInt();

        for (double n=1; n<=num ; n++ ) {
            result=result+(1/n);
        }
        System.out.println(result);
    }
}
