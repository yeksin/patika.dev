import java.util.Scanner;

public class palindromString {
    static boolean isPalindrome(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen kelimeyi giriniz: ");
        String str = scan.next();

        System.out.println(isPalindrome(str));

    }
}
