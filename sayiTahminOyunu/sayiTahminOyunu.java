import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class sayiTahminOyunu {
    public static void main(String[] args) {

        Random random = new Random();
        int rand = random.nextInt(100);
        System.out.println(rand);

        Scanner scan = new Scanner(System.in);
        boolean isWin = false;

        int[] list = new int[5];

        for (int i = 0; i < 5; i++) {

            System.out.println("================== TAHM�N " + (i + 1) + " ==================");
            System.out.print("L�tfen tahmininizi giriniz: ");
            int num = scan.nextInt();
            if (num > 0 && num < 100) {
                list[i] = num;
                int mutlak = Math.abs(rand - num);
                if (Math.abs(rand - num) > 50) {
                    System.out.println("BUZ G�B� BUZZZZZZZZZ!!!");
                } else if (mutlak > 30 && mutlak < 50) {
                    System.out.println("SO�UKKKKKKKKKKKKK!!!");
                } else if (mutlak > 15 && mutlak < 30) {
                    System.out.println("ILIK G�B� B�RAZ!");
                } else if (mutlak > 5 && mutlak < 15) {
                    System.out.println("SICAKKKK!!!");
                } else if (mutlak < 5) {
                    System.out.println("�OK SICAKKKK!!! YANIYOR!!");
                }
            } else {
                System.out.println("Hatal� giri� yapt�n�z! L�tfen 0-100 aral���nda bir de�er girin! Kalan hakk�n�z: " + (4 - i));
                continue;
            }
            if (rand != num) {
                System.out.println("Hatal� tahmin! Kalan hakk�n�z: " + (4 - i));
            }
            if (rand == num) {
                System.out.println("Tebrikler tahmnininiz do�ru! ");
                isWin = true;
            }
            System.out.println("Tahminleriniz: " + Arrays.toString(Arrays.copyOf(list, i + 1)));
            if (isWin) {
                i = 5;
            }
        }
    }
}
