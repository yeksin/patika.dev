import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {

    double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5,toplam;

    Scanner inp= new Scanner(System.in);

        System.out.print("Al�nan ARMUT miktar� (KG): ");
        armut=inp.nextInt()*2.14;

        System.out.print("Al�nan ELMA miktar� (KG): ");
        elma=inp.nextInt()*3.67;

        System.out.print("Al�nan DOMATES miktar� (KG): ");
        domates=inp.nextInt()*1.11;

        System.out.print("Al�nan MUZ miktar� (KG): ");
        muz=inp.nextInt()*0.95;

        System.out.print("Al�nan PATLICAN miktar� (KG): ");
        patlican=inp.nextInt()*5;

        toplam= patlican+muz+domates+elma+armut;

        System.out.print("Toplam Tutar: "+ toplam);
    }
}
