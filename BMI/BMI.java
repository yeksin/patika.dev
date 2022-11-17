import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        double bmi, weight, height;
        String status = null;

        Scanner scan = new Scanner(System.in);

        System.out.print("Boyunuzu Giriniz(cm): ");
        height = scan.nextDouble() / 100; // Meter to Centimeters

        System.out.print("Kilonuzu Giriniz(kg): ");
        weight = scan.nextInt();

        bmi = (weight / (height * height));

        if (bmi < 18.5) {
            status = "Zayıfsınız";
        }
        if (18.5 <= bmi && bmi < 25) {
            status = "İdeal kilodasınız";
        }
        if (25 <= bmi && bmi < 30) {
            status = "Şişmansınız";
        }
        if (30 <= bmi && bmi < 35) {
            status = "Obezsiniz";
        }
        if (35 <= bmi) {
            status = "Aşırı Obezsiniz";
        }

        System.out.print("Vücut Kitle İndeksiniz: " + Math.round(bmi) + "\nSonuca göre: " + status);
    }
}
