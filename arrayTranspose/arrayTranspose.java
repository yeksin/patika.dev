public class arrayTranspose {
    public static void main(String[] args) {

        int[][] list = {
                {1, 2, 3, 789},
                {4, 5, 6, 0}
        };

        int[][] secondList = new int[list[0].length][list.length];

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                secondList[j][i] = list[i][j];
            }
        }
        for (int i = 0; i < secondList.length; i++) {
            for (int j = 0; j < secondList[i].length; j++) {
                System.out.print(secondList[i][j] + " ");
            }
            System.out.println();
        }
    }
}

