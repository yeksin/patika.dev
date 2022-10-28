import java.util.Scanner;

public class Burc {
    public static void main(String[] args) {

        int ay,gun;

        Scanner scan = new Scanner(System.in);

        System.out.print("1-Ocak \n2-Þubat \n3-Mart \n4-Nisan \n5-Mayýs \n6-Haziran " +
                "\n7-Temmuz \n8-Aðustos \n9-Eylül \n10-Ekim \n11-Kasým \n12-Aralýk \nDoðduðunuz ayý seçiniz: ");
        ay= scan.nextInt();

        System.out.print("Doðduðunuz günü giriniz: ");
        gun = scan.nextInt();

        if (ay==1 && gun<=21) {
            System.out.println("Burcunuz Oðlak");
        }else if (ay==1 && gun>=21){
            System.out.println("Burcunuz Kova");
        }
        if (ay==2 && gun <= 19){
            System.out.println( "Burcunuz Kova");
        }else if (ay==2 && gun >= 19){
            System.out.println("Burcunuz Balýk");
        }if (ay==3 && gun <=20){
            System.out.println("Burcunuz Balýk");
        }else if (ay==3 && gun >=20){
            System.out.println("Burcunuz Koç");
        }if (ay==4 && gun <=20) {
            System.out.println("Burcunuz Koç");
        }else if (ay==4 && gun >=20){
            System.out.println("Burcunuz Boða");
        }if (ay==5 && gun<=21){
            System.out.println("Burcunuz Boða");
        }else if (ay==5 && gun>=21){
            System.out.println("Burcunuz Ýkizler");
        }if (ay==6 && gun <=22){
            System.out.println("Burcunuz Ýkizler");
        }else if (ay==6 && gun >=22){
            System.out.println("Burcunuz Yengeç");
        }if (ay==7 && gun <=22){
            System.out.println("Burcunuz Yengeç");
        }else if (ay==7 && gun >=22){
            System.out.println("Burcunuz Aslan");
        }if (ay==8 && gun<=22){
            System.out.println("Burcunuz Aslan");
        }else if (ay==8 && gun>=22){
            System.out.println("Burcunuz Baþak");
        }if (ay==9 && gun<=22){
            System.out.println("Burcunuz Baþak");
        }else if (ay==9 && gun>=22){
            System.out.println("Burcunuz Terazi");
        }if (ay==10 && gun<=22){
            System.out.println("Burcunuz Terazi");
        }else if (ay==10 && gun>=22){
            System.out.println("Burcunuz Akrep");
        }if (ay==11 && gun<=21){
            System.out.println("Burcunuz Akrep");
        }else if (ay==11 && gun>=21){
            System.out.println("Burcunuz Yay");
        }if (ay==12 && gun<=21){
            System.out.println("Burcunuz Yay");
        }else if (ay==12 && gun>=21){
            System.out.println("Burcunuz Oðlak");
        }

    }
}
