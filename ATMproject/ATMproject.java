import java.util.Scanner;

public class ATMproject {
    public static void main(String[] args) {

        String user, password;
        int choice;
        Scanner scan= new Scanner(System.in);
        int right= 3;
        int balance=15000;

        while (right>0) {
            System.out.print("Kullan�c� ad�: ");
            user= scan.nextLine();
            System.out.print("�ifre: ");
            password= scan.nextLine();

            if (user.equals("yeksin") && password.equals("1235")) {
                System.out.println("Giri� ba�ar�l�!");

                do {
                    System.out.print("1- Para yat�rma \n2- Para �ekme \n3- Bakiye sorgula \n4- ��k�� yap\nL�tfen Yapmak istedi�iniz i�lemi se�iniz: ");
                    choice = scan.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.print("Yat�raca��n�z tutar� giriniz: ");
                            int yatirilacakTutar = scan.nextInt();
                            balance+=yatirilacakTutar;
                            System.out.println("Paran�z� para yat�rma b�lmesine yerle�tiriniz!");
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                        case 2:
                            System.out.print("�ekmek istedi�iniz miktar� giriniz: ");
                            int cekim = scan.nextInt();
                            if (cekim > balance) {
                                System.out.println("Yetersiz bakiye!");
                            }else {
                                System.out.println("L�tfen paran�z� para �ekme b�lmesinden al�n�z! ");
                                balance-=cekim;
                                System.out.println("Kalan bakiyeniz: " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Bakiye: " + balance);
                            break;

                        case 4:
                            System.out.println("��k�� yap�l�yor. Kart�n�z� unutmay�n�z!");
                            right = 0;
                            break;
                    }
                } while (choice!=4);
            } else {
                right--;
                if (right==0) {
                    System.out.println("Kart�n�z bloke olmu�tur. Bankan�zla ileti�ime ge�iniz!");
                }else {
                    System.out.println("Kalan hakk�n�z: "+right);
                    System.out.println("Hatal� kullan�c� ad� veya �ifre! Tekrar deneyiniz. ");
                }
            }
        }
    }
}
