import java.util.Arrays;

public class arrayCount {
    public static void main(String[] args) {

        int[] list = {1, 5, 5, 15, 18, 18, 18, 18, 18, 48, 15, 15, 15, 14, 14, 1, 1, 1};
        Arrays.sort(list);

        System.out.println(Arrays.toString(list));

        for (int i = 0; i < list.length; i++) {
            int counter = 0;

            int k = list[i];
            for (int n : list) {
                if (n == k) {
                    counter++;
                }
            }
            if ((i == list.length - 1) || (list[i + 1] != list[i])) {
                System.out.println(k + " sayýsý " + counter + " kez tekrar edildi");
            }
        }
    }
}
