import java.util.Scanner;

public class BasamakToplama {
    public static void main(String[] args) {
        int a,b,res=0;

        Scanner scan = new Scanner(System.in);
        System.out.print("L�tfen say�y� giriniz: ");
        a = scan.nextInt();

        b=a;
       while (a!=0) {
           b=a%10;
           a/=10;
           res+=b;
           System.out.print(b+"+");
       }
        System.out.println("\b="+res);
    }
}
