import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {

        int counter, sayi=0, onceki=1,sonraki=0;
        Scanner scan= new Scanner(System.in);

        System.out.print("Lütfen Fibonacci sayýsýnýn eleman sayýsýný giriniz: ");
        counter= scan.nextInt();

        for (int i=1; i<counter; i++) {
            System.out.println(sayi);
            sayi=sonraki+onceki;
            onceki=sonraki;
            sonraki=sayi;
        }
    }
}
