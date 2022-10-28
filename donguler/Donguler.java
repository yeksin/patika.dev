import java.util.Scanner;

public class Donguler {
    public static void main(String[] args) {

        int num,i;
        Scanner scan=new Scanner(System.in);
        System.out.print("Sayý giriniz:" );
        num= scan.nextInt();

        for (i=1; i<=num; i*=4) {
            System.out.print(i+",");
        }for (i=1; i<=num; i*=5){
            System.out.print(i+",");
        }
    }
}
