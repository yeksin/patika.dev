import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {

        int counter,num,min=1,max=1;
        Scanner scan =new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        counter= scan.nextInt();

        for (int i=1; i<=counter; i++) {
            System.out.print(i+". sayıyı giriniz: ");
            num= scan.nextInt();

            if (counter==1) {
                min=num;
                max=num;
            }
            if (num>max) {
                max=num;
            }
            if (num<min)
                min=num;
        }
        System.out.println("En küçük sayı: "+min);
        System.out.println("En büyük sayı: "+max);
    }
}
