import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlik {
    public static void main(String[] args) {

        int temp;

        Scanner input= new Scanner(System.in);

        System.out.print("L�tfen hava s�cakl���n� giriniz?: ");
        temp=input.nextInt();

        if (temp <= 5){
            System.out.print("Kayak yapabilirsiniz!");
        } else if ((temp >5) && (temp <=15)) {
            System.out.print("Sinemaya gidebilirsiniz!");
        } else if (temp >= 25 ) {
            System.out.print("Y�zmeye gidebilirsiniz!");
        } if (temp >10 && temp <=25) {
            System.out.println(" Veya piknik yapabilirsiniz!");
        }
    }
}
