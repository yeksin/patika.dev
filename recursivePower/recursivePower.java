import java.util.Scanner;
public class recursivePower {
    static int power(int x, int y) {
        int result = 1;
        for (int i = 1; i <= y; i++) {
            result *= x;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban de�erini giriniz: ");
        int x = scan.nextInt();
        System.out.print("�s de�erini giriniz: ");
        int y = scan.nextInt();
        System.out.print("Sonu�: " + power(x, y));
    }
}
