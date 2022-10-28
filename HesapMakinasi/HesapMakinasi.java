import java.util.Scanner;

public class HesapMakinasi {
    public static void main(String[] args) {

        int n1, n2,islem;
        Scanner inp= new Scanner(System.in);

        System.out.print("Ýlk sayýyý giriniz: ");
        n1= inp.nextInt();
        System.out.print("Ýkinci sayýyý giriniz: ");
        n2= inp.nextInt();
        System.out.println("Yapmak istediðiniz iþlemi seçiniz: \n1-Toplama \n2-Çýkarma \n3-Bölme \n4-Çarpma ");
        islem=inp.nextInt();

        switch (islem) {
            case 1:
                System.out.println("Sonuç: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Sonuç: " + (n1 - n2));
                break;
            case 3:
                if (n2==0) {
                    System.out.println("Bir sayý 0'a bölünemez!");
                }else {
                    System.out.println("Sonuç: " + (n1 / n2));
                }
                break;
            case 4:
                System.out.println("Sonuç: " + (n1 * n2));
                break;

        }
    }
}
