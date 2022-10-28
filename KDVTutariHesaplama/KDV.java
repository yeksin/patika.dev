import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {

       double para;

       Scanner inp= new Scanner(System.in);

       System.out.print("Fiyatý giriniz:  ");
       para= inp.nextInt();

      double kdvli= para+(para*18/100);
       double kdvT= para*18/100;

        System.out.println("Kdv'siz tutar:   "+  para);
        System.out.println("Kdv'li tutar:   "+kdvli);
        System.out.println("Kdv tutarý:   "+ kdvT);











    }
}


