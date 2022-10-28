import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {

    double vki,kg,boy;

    Scanner inp= new Scanner(System.in);

    System.out.print("Kilonuzu Giriniz: ");
    kg=inp.nextInt();

    System.out.print("Boyunuzu Giriniz: ");
    boy=inp.nextDouble();

    vki=(kg/(boy*boy));

    System.out.print("Vücut Kitle Ýndeksiniz: "+vki);
}}
