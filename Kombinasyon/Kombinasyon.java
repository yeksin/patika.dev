import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        int n,r,k;
        long nt=1, rt=1, kt=1;
        Scanner scan = new Scanner(System.in);

        System.out.print("Kombinasyon formatý: C(n,r). Lütfen 'n' sayýsýný giriniz: ");
        n= scan.nextInt();

        System.out.print("Lütfen 'r' sayýsýný giriniz: ");
        r= scan.nextInt();

        for (int i=1; n>=i; i++) {
            nt*=i;
        }
        for (int i=1;r>=i; i++ ) {
            rt*=i;
        }
        k= (n-r);
        if (k<1) {
            k*=-1;
        }
        for (int i=1;k>=i; i++){
            kt*=i;
        }
        //C(n,r) = n! / (r! * (n-r)!)

       long com= nt/(rt*kt);

       System.out.println("C("+n+","+r+")= " +com);

    }
}
