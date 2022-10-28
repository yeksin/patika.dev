import java.util.Arrays;
import java.util.Scanner;
public class arrayOrder {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");
        int n = scan.nextInt();

        int[] list = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Dizinin " + (i + 1) + ". elemanýný giriniz: ");
            int number = scan.nextInt();
            list[i] = number;
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
