import java.util.Scanner;

public class calculator {
    static int plus(int a, int b) {
        return a + b;
    }

    static int minus(int a, int b) {
        return a - b;
    }

    static int times(int a, int b) {
        return a * b;
    }

    static int divided(int a, int b) {
        return a / b;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    static int factorial(int a) {

        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }

    static int mod(int a, int b) {
        int result = a % b;
        return result;
    }

    static int area(int a, int b) {
        return a * b;
    }

    static int perimeter(int a, int b) {
        return 2 * (a + b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;

        String menu = "1- Toplama İşlemi\n" +
                "2- Çıkarma İşlemi\n" +
                "3- Çarpma İşlemi\n" +
                "4- Bölme işlemi\n" +
                "5- Üslü Sayı Hesaplama\n" +
                "6- Faktoriyel Hesaplama\n" +
                "7- Mod Alma\n" +
                "8- Dikdörtgen Alan ve Çevre Hesabı\n" +
                "9- Çıkış Yap";
        do {
            System.out.println(menu);
            System.out.print("Bir işlem seçiniz: ");
            select = scan.nextInt();

            if (select == 6) {
                System.out.print("Değeri giriniz: ");
                int a = scan.nextInt();
                switch (select) {
                    case 6:
                        System.out.println("Sonuç: " + factorial(a));
                        break;
                }
            } else if (select != 9) {
                System.out.print("İlk değer: ");
                int a = scan.nextInt();
                System.out.print("İkinci değer: ");
                int b = scan.nextInt();

                switch (select) {
                    case 1:
                        System.out.println("Sonuç: " + plus(a, b));
                        break;
                    case 2:
                        System.out.println("Sonuç: " + minus(a, b));
                        break;
                    case 3:
                        System.out.println("Sonuç: " + times(a, b));
                        break;
                    case 4:
                        System.out.println("Sonuç: " + divided(a, b));
                        break;
                    case 5:
                        System.out.println("Sonuç: " + power(a, b));
                        break;
                    case 7:
                        System.out.println("Sonuç: " + mod(a, b));
                        break;
                    case 8:
                        System.out.println("Sonuç: \nAlanı: " + area(a, b) + "\nÇevresi: " + perimeter(a, b));

                }

            }
        } while (select != 9);
    }
}