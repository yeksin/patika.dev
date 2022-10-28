public class AsalSayi {
    public static void main(String[] args) {

        for (int a=1; a<=100; a++) {
            int toplam =0;
            for (int n=1; n<=a; n++) {
                if (a%n==0) {
                    toplam++;
                }
            } if (toplam==2) { /* eğer sadece 2 tam böleni varsa asal sayıdır */
                System.out.print(a+",");
            }
        }System.out.print("\b");
    }
}
