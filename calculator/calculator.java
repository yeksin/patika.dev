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

        String menu = "1- Toplama ��lemi\n" +
                "2- ��karma ��lemi\n" +
                "3- �arpma ��lemi\n" +
                "4- B�lme i�lemi\n" +
                "5- �sl� Say� Hesaplama\n" +
                "6- Faktoriyel Hesaplama\n" +
                "7- Mod Alma\n" +
                "8- Dikd�rtgen Alan ve �evre Hesab�\n" +
                "9- ��k�� Yap";
        do {
            System.out.println(menu);
            System.out.print("Bir i�lem se�iniz: ");
            select = scan.nextInt();

            if (select == 6) {
                System.out.print("De�eri giriniz: ");
                int a = scan.nextInt();
                switch (select) {
                    case 6:
                        System.out.println("Sonu�: " + factorial(a));
                        break;
                }
            } else if (select != 9) {
                System.out.print("�lk de�er: ");
                int a = scan.nextInt();
                System.out.print("�kinci de�er: ");
                int b = scan.nextInt();

                switch (select) {
                    case 1:
                        System.out.println("Sonu�: " + plus(a, b));
                        break;
                    case 2:
                        System.out.println("Sonu�: " + minus(a, b));
                        break;
                    case 3:
                        System.out.println("Sonu�: " + times(a, b));
                        break;
                    case 4:
                        System.out.println("Sonu�: " + divided(a, b));
                        break;
                    case 5:
                        System.out.println("Sonu�: " + power(a, b));
                        break;
                    case 7:
                        System.out.println("Sonu�: " + mod(a, b));
                        break;
                    case 8:
                        System.out.println("Sonu�: \nAlan�: " + area(a, b) + "\n�evresi: " + perimeter(a, b));

                }

            }
        } while (select != 9);
    }
}