import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        double yol, startprice=10, tarife=2.2, ucret;

        Scanner input= new Scanner(System.in);

        System.out.print("Yol uzunlu�unu giriniz: ");
        yol= input.nextInt();

        ucret= startprice+(tarife*yol);
        ucret= (ucret <20) ? 20 : ucret;

        System.out.print("�cretiniz: "+ucret);



























    }
}
