import java.util.Scanner;

public class Burc {
    public static void main(String[] args) {

        int ay,gun;

        Scanner scan = new Scanner(System.in);

        System.out.print("1-Ocak \n2-�ubat \n3-Mart \n4-Nisan \n5-May�s \n6-Haziran " +
                "\n7-Temmuz \n8-A�ustos \n9-Eyl�l \n10-Ekim \n11-Kas�m \n12-Aral�k \nDo�du�unuz ay� se�iniz: ");
        ay= scan.nextInt();

        System.out.print("Do�du�unuz g�n� giriniz: ");
        gun = scan.nextInt();

        if (ay==1 && gun<=21) {
            System.out.println("Burcunuz O�lak");
        }else if (ay==1 && gun>=21){
            System.out.println("Burcunuz Kova");
        }
        if (ay==2 && gun <= 19){
            System.out.println( "Burcunuz Kova");
        }else if (ay==2 && gun >= 19){
            System.out.println("Burcunuz Bal�k");
        }if (ay==3 && gun <=20){
            System.out.println("Burcunuz Bal�k");
        }else if (ay==3 && gun >=20){
            System.out.println("Burcunuz Ko�");
        }if (ay==4 && gun <=20) {
            System.out.println("Burcunuz Ko�");
        }else if (ay==4 && gun >=20){
            System.out.println("Burcunuz Bo�a");
        }if (ay==5 && gun<=21){
            System.out.println("Burcunuz Bo�a");
        }else if (ay==5 && gun>=21){
            System.out.println("Burcunuz �kizler");
        }if (ay==6 && gun <=22){
            System.out.println("Burcunuz �kizler");
        }else if (ay==6 && gun >=22){
            System.out.println("Burcunuz Yenge�");
        }if (ay==7 && gun <=22){
            System.out.println("Burcunuz Yenge�");
        }else if (ay==7 && gun >=22){
            System.out.println("Burcunuz Aslan");
        }if (ay==8 && gun<=22){
            System.out.println("Burcunuz Aslan");
        }else if (ay==8 && gun>=22){
            System.out.println("Burcunuz Ba�ak");
        }if (ay==9 && gun<=22){
            System.out.println("Burcunuz Ba�ak");
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
            System.out.println("Burcunuz O�lak");
        }

    }
}
