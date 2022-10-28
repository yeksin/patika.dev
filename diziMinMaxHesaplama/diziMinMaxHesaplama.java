import java.util.Scanner;
import java.util.Arrays;

public class diziMinMaxHesaplama {
    public static void main(String[] args) {

        int[] list = {1, 2, 5, -3, 15, 45, 12, 0, 4};
        Arrays.sort(list);

        System.out.print("Dizi: ");
        System.out.println(Arrays.toString(list));

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayý giriniz, en yakýn sayýlarý bulacaðým: ");
        int sayi = scan.nextInt();

        int min = 0;

        for (int i : list) {
            if (i < sayi) {
                min = i;
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + list[Arrays.binarySearch(list, min) + 1]);

    }
}
