import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {

        int value;
        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen bir sayý giriniz: ");
        value= scan.nextInt();

        for (int i=0; i<=value; i++) {
            for (int c=1; c<=i; c++) {
                System.out.print(" ");
            }for (int k=1; k<=(2*(value-i)-1); k++) {
                System.out.print("*");
            }System.out.println();
        }
    }
}
