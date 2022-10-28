import java.util.Scanner;

public class recursiveAsal {
    static void asal(int x) {
        int counter = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            System.out.print(x + " Bir Asal Sayıdır!");
        } else if (x == 1) {
            System.out.print(x + " Bir Asal Sayıdır!");
        } else {
            System.out.print(x + " Bir Asal Sayı Değildir!");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int x = scan.nextInt();
        asal(x);
    }
}
