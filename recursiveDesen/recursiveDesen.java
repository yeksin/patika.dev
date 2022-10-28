import java.util.Scanner;

public class recursiveDesen {
    static void desen(int x) {
        if (x >= 0) {
            System.out.print(x + " ");
            desen(x-5);
        }
        System.out.print(x + " ");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayý giriniz: ");
        int x = scan.nextInt();
        desen(x);
    }
}
