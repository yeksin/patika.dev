public class isPalindrom {
    static boolean isPalindrom(int sayi) {
        int temp = sayi, yeniSayi = 0, sonSayi;

        while (temp != 0) {
            sonSayi = temp % 10;
            yeniSayi = (yeniSayi * 10) + sonSayi;
            temp /= 10;
        }if (sayi==yeniSayi)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrom(9889));
    }
}
