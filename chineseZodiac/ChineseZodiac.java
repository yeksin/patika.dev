import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {

        int age, zodiac, at=10;
        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen doğum yılınızı giriniz: ");
        age= scan.nextInt();

        zodiac= age%12;

        if (zodiac==10) {
            System.out.println("Çin burcunuz: At");
        } else if (zodiac==0) {
            System.out.println("Çin burcunuz: Maymun");
        } else if (zodiac==1) {
            System.out.println("Çin burcunuz: Horoz");
        } else if (zodiac==2) {
            System.out.println("Çin burcunuz: Köpek");
        } else if (zodiac==3) {
            System.out.println("Çin burcunuz: Domuz");
        } else if (zodiac==4) {
            System.out.println("Çin burcunuz: Fare");
        } else if (zodiac==5) {
            System.out.println("Çin burcunuz: Öküz");
        } else if (zodiac==6) {
            System.out.println("Çin burcunuz: Kaplan");
        } else if (zodiac==7) {
            System.out.println("Çin burcunuz: Tavşan");
        } else if (zodiac==8) {
            System.out.println("Çin burcunuz: Ejderha");
        } else if (zodiac==9) {
            System.out.println("Çin burcunuz: Yılan");
        } else if (zodiac==11) {
            System.out.println("Çin burcunuz: Koyun");
        }
    }
}
