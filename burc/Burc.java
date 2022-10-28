import java.util.Scanner;

public class Burc {
    public static void main(String[] args) {

        int ay,gun;

        Scanner scan = new Scanner(System.in);

        System.out.print("1-Ocak \n2-Şubat \n3-Mart \n4-Nisan \n5-Mayıs \n6-Haziran " +
                "\n7-Temmuz \n8-Ağustos \n9-Eylül \n10-Ekim \n11-Kasım \n12-Aralık \nDoğduğunuz ayı seçiniz: ");
        ay= scan.nextInt();

        System.out.print("Doğduğunuz günü giriniz: ");
        gun = scan.nextInt();

        if (ay==1 && gun<=21) {
            System.out.println("Burcunuz Oğlak");
        }else if (ay==1 && gun>=21){
            System.out.println("Burcunuz Kova");
        }
        if (ay==2 && gun <= 19){
            System.out.println( "Burcunuz Kova");
        }else if (ay==2 && gun >= 19){
            System.out.println("Burcunuz Balık");
        }if (ay==3 && gun <=20){
            System.out.println("Burcunuz Balık");
        }else if (ay==3 && gun >=20){
            System.out.println("Burcunuz Koç");
        }if (ay==4 && gun <=20) {
            System.out.println("Burcunuz Koç");
        }else if (ay==4 && gun >=20){
            System.out.println("Burcunuz Boğa");
        }if (ay==5 && gun<=21){
            System.out.println("Burcunuz Boğa");
        }else if (ay==5 && gun>=21){
            System.out.println("Burcunuz İkizler");
        }if (ay==6 && gun <=22){
            System.out.println("Burcunuz İkizler");
        }else if (ay==6 && gun >=22){
            System.out.println("Burcunuz Yengeç");
        }if (ay==7 && gun <=22){
            System.out.println("Burcunuz Yengeç");
        }else if (ay==7 && gun >=22){
            System.out.println("Burcunuz Aslan");
        }if (ay==8 && gun<=22){
            System.out.println("Burcunuz Aslan");
        }else if (ay==8 && gun>=22){
            System.out.println("Burcunuz Başak");
        }if (ay==9 && gun<=22){
            System.out.println("Burcunuz Başak");
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
            System.out.println("Burcunuz Oğlak");
        }

    }
}
