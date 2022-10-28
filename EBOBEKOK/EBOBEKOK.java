import java.util.Scanner;

public class EBOBEKOK {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Birinci sayýyý giriniz: ");
        int n1= scan.nextInt();

        System.out.print("Ýkinci sayýyý giriniz: ");
        int n2= scan.nextInt();

        int i=2;
        while (i<=n1) {
            if (n1%i==0 && n2%i==0) {
                System.out.println("EBOB: "+i);
            }
            i++;
        }

        int k=1;
        while (k<=n1*n2) {
        if (k%n1==0 && k%n2==0) {
            System.out.println("EKOK: "+k);
            break;
            }
            k++;
        }
    }
}
