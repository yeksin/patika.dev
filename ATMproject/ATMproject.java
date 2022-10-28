import java.util.Scanner;

public class ATMproject {
    public static void main(String[] args) {

        String user, password;
        int choice;
        Scanner scan= new Scanner(System.in);
        int right= 3;
        int balance=15000;

        while (right>0) {
            System.out.print("Kullanýcý adý: ");
            user= scan.nextLine();
            System.out.print("Þifre: ");
            password= scan.nextLine();

            if (user.equals("yeksin") && password.equals("1235")) {
                System.out.println("Giriþ baþarýlý!");

                do {
                    System.out.print("1- Para yatýrma \n2- Para çekme \n3- Bakiye sorgula \n4- Çýkýþ yap\nLütfen Yapmak istediðiniz iþlemi seçiniz: ");
                    choice = scan.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.print("Yatýracaðýnýz tutarý giriniz: ");
                            int yatirilacakTutar = scan.nextInt();
                            balance+=yatirilacakTutar;
                            System.out.println("Paranýzý para yatýrma bölmesine yerleþtiriniz!");
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                        case 2:
                            System.out.print("Çekmek istediðiniz miktarý giriniz: ");
                            int cekim = scan.nextInt();
                            if (cekim > balance) {
                                System.out.println("Yetersiz bakiye!");
                            }else {
                                System.out.println("Lütfen paranýzý para çekme bölmesinden alýnýz! ");
                                balance-=cekim;
                                System.out.println("Kalan bakiyeniz: " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Bakiye: " + balance);
                            break;

                        case 4:
                            System.out.println("Çýkýþ yapýlýyor. Kartýnýzý unutmayýnýz!");
                            right = 0;
                            break;
                    }
                } while (choice!=4);
            } else {
                right--;
                if (right==0) {
                    System.out.println("Kartýnýz bloke olmuþtur. Bankanýzla iletiþime geçiniz!");
                }else {
                    System.out.println("Kalan hakkýnýz: "+right);
                    System.out.println("Hatalý kullanýcý adý veya þifre! Tekrar deneyiniz. ");
                }
            }
        }
    }
}
