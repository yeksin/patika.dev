import java.util.Scanner;

public class HesapMakinasi {
    public static void main(String[] args) {

        int n1, n2,islem;
        Scanner inp= new Scanner(System.in);

        System.out.print("�lk say�y� giriniz: ");
        n1= inp.nextInt();
        System.out.print("�kinci say�y� giriniz: ");
        n2= inp.nextInt();
        System.out.println("Yapmak istedi�iniz i�lemi se�iniz: \n1-Toplama \n2-��karma \n3-B�lme \n4-�arpma ");
        islem=inp.nextInt();

        switch (islem) {
            case 1:
                System.out.println("Sonu�: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Sonu�: " + (n1 - n2));
                break;
            case 3:
                if (n2==0) {
                    System.out.println("Bir say� 0'a b�l�nemez!");
                }else {
                    System.out.println("Sonu�: " + (n1 / n2));
                }
                break;
            case 4:
                System.out.println("Sonu�: " + (n1 * n2));
                break;

        }
    }
}
