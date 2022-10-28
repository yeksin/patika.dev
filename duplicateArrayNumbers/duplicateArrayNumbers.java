import java.util.Arrays;
public class duplicateArrayNumbers {
    public static void main(String[] args) {
        int[] list = {1, 3, 4, 5, 9, 9, 7, 6, 6, 2, 1, 3, 0, 15, 8, 15, 14};
        Arrays.sort(list);

        System.out.println(Arrays.toString(list));

        for (int i = 1; i < list.length; i++) {
            if (list[i] == list[i - 1]) {
                System.out.print(list[i] + " ");
            }
        }
    }
}
