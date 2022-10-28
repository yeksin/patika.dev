import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Bir sayý giriniz: ");
        int n= scan.nextInt();
        for (int i=1; i<=n; i++ ) {
            for (int c=1; c<=(n-i); c++) {
                System.out.print(" ");
            }for (int k=1; k<=(2*i-1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
            for (int i=1; i<=n; i++ ) {
                for (int c=1; c<=i; c++) {
                System.out.print(" ");
            }for (int k=1; k<=(2*n-2*i-1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
