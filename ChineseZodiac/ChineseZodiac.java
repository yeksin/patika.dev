import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {

        int age, zodiac, at=10;
        Scanner scan = new Scanner(System.in);

        System.out.print("L�tfen do�um y�l�n�z� giriniz: ");
        age= scan.nextInt();

        zodiac= age%12;

        if (zodiac==10) {
            System.out.println("�in burcunuz: At");
        } else if (zodiac==0) {
            System.out.println("�in burcunuz: Maymun");
        } else if (zodiac==1) {
            System.out.println("�in burcunuz: Horoz");
        } else if (zodiac==2) {
            System.out.println("�in burcunuz: K�pek");
        } else if (zodiac==3) {
            System.out.println("�in burcunuz: Domuz");
        } else if (zodiac==4) {
            System.out.println("�in burcunuz: Fare");
        } else if (zodiac==5) {
            System.out.println("�in burcunuz: �k�z");
        } else if (zodiac==6) {
            System.out.println("�in burcunuz: Kaplan");
        } else if (zodiac==7) {
            System.out.println("�in burcunuz: Tav�an");
        } else if (zodiac==8) {
            System.out.println("�in burcunuz: Ejderha");
        } else if (zodiac==9) {
            System.out.println("�in burcunuz: Y�lan");
        } else if (zodiac==11) {
            System.out.println("�in burcunuz: Koyun");
        }
    }
}
