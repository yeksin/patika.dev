import java.util.Arrays;

public class diziHarmonikHesaplama {
    public static void main(String[] args) {

        int[] list = {1, 5, 6, 9, 71, 24, 46};

        double harmonic = 0;

        for (double i = 1; i <= list.length; i++) {
            harmonic += (1 / i);
        }

        System.out.print("Dizi: ");
        System.out.println(Arrays.toString(list));
        System.out.println("Harmonik Ortalama: " + list.length / harmonic);


    }
}
