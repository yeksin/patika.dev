import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        String sınır = "Yanlış tartım yaptınız! Ürünün kilosu '0' ve '50' kg değerleri arasında olmak zorundadır!";
        double armut = 2.14,
                elma = 3.67,
                domates = 1.11,
                muz = 0.95,
                patlican = 5,
                toplam;

        Scanner scan = new Scanner(System.in);

        System.out.print("Armut miktarı(kg): ");
        armut *= scan.nextInt();
        if (armut < 0 || armut > 50) {
            armut = 0;
            System.out.println(sınır);
        }

        System.out.print("Elma miktarı(kg): ");
        elma *= scan.nextInt();
        if (elma < 0 || elma > 50) {
            elma = 0;
            System.out.println(sınır);
        }

        System.out.print("Domates miktarı(kg): ");
        domates *= scan.nextInt();
        if (domates < 0 || domates > 50) {
            domates = 0;
            System.out.println(sınır);
        }

        System.out.print("Muz miktarı(kg): ");
        muz *= scan.nextInt();
        if (muz < 0 || muz > 50) {
            muz = 0;
            System.out.println(sınır);
        }

        System.out.print("Patlıcan miktarı(kg): ");
        patlican *= scan.nextInt();
        if (patlican < 0 || patlican > 50) {
            patlican = 0;
            System.out.println(sınır);
        }

        toplam = patlican + muz + domates + elma + armut;

        System.out.print("Toplam Tutar: " + toplam);
    }
}
