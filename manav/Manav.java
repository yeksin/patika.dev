import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {

    double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5,toplam;

    Scanner inp= new Scanner(System.in);

        System.out.print("Alýnan ARMUT miktarý (KG): ");
        armut=inp.nextInt()*2.14;

        System.out.print("Alýnan ELMA miktarý (KG): ");
        elma=inp.nextInt()*3.67;

        System.out.print("Alýnan DOMATES miktarý (KG): ");
        domates=inp.nextInt()*1.11;

        System.out.print("Alýnan MUZ miktarý (KG): ");
        muz=inp.nextInt()*0.95;

        System.out.print("Alýnan PATLICAN miktarý (KG): ");
        patlican=inp.nextInt()*5;

        toplam= patlican+muz+domates+elma+armut;

        System.out.print("Toplam Tutar: "+ toplam);
    }
}
