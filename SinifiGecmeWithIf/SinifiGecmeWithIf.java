import java.util.Scanner;

public class SinifiGecmeWithIf {
    public static void main(String[] args) {
        int turkce,mat,fizik,muzik,kimya,n=5;

        Scanner input= new Scanner(System.in);

        System.out.print("T�rk�e notunu giriniz: ");
        turkce=input.nextInt();

        System.out.print("Matematik notunu giriniz: ");
        mat=input.nextInt();

        System.out.print("Fizik notunu giriniz: ");
        fizik=input.nextInt();

        System.out.print("M�zik notunu giriniz: ");
        muzik=input.nextInt();

        System.out.print("Kimya notunu giriniz: ");
        kimya=input.nextInt();

        if (0== turkce || turkce==100){
            n=(n-1);
            turkce=0;
        } if (0 == mat || mat == 100) {
            n=(n-1);
            mat=0;
        } if (0== fizik || fizik==100) {
            n=(n-1);
            fizik=0;
        } if ( 0== muzik || muzik==100){
            n=(n-1);
            muzik=0;

        } if (0== kimya || kimya==100){
            n=(n-1);
            kimya=0;
        }
        double avr= (kimya+muzik+fizik+mat+turkce)/n;

        System.out.println("Ortalaman�z: "+avr);

        if (avr <55) {
            System.out.println("S�n�fta kald�n�z!");
        }else {
            System.out.println("S�n�f� Ge�tiniz!");
        }
    }
}
