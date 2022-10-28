import java.util.Scanner;

public class ATMproject {
    public static void main(String[] args) {

        String user, password;
        int choice;
        Scanner scan= new Scanner(System.in);
        int right= 3;
        int balance=15000;

        while (right>0) {
            System.out.print("Kullanıcı adı: ");
            user= scan.nextLine();
            System.out.print("Şifre: ");
            password= scan.nextLine();

            if (user.equals("yeksin") && password.equals("1235")) {
                System.out.println("Giriş başarılı!");

                do {
                    System.out.print("1- Para yatırma \n2- Para çekme \n3- Bakiye sorgula \n4- Çıkış yap\nLütfen Yapmak istediğiniz işlemi seçiniz: ");
                    choice = scan.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.print("Yatıracağınız tutarı giriniz: ");
                            int yatirilacakTutar = scan.nextInt();
                            balance+=yatirilacakTutar;
                            System.out.println("Paranızı para yatırma bölmesine yerleştiriniz!");
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz miktarı giriniz: ");
                            int cekim = scan.nextInt();
                            if (cekim > balance) {
                                System.out.println("Yetersiz bakiye!");
                            }else {
                                System.out.println("Lütfen paranızı para çekme bölmesinden alınız! ");
                                balance-=cekim;
                                System.out.println("Kalan bakiyeniz: " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Bakiye: " + balance);
                            break;

                        case 4:
                            System.out.println("Çıkış yapılıyor. Kartınızı unutmayınız!");
                            right = 0;
                            break;
                    }
                } while (choice!=4);
            } else {
                right--;
                if (right==0) {
                    System.out.println("Kartınız bloke olmuştur. Bankanızla iletişime geçiniz!");
                }else {
                    System.out.println("Kalan hakkınız: "+right);
                    System.out.println("Hatalı kullanıcı adı veya şifre! Tekrar deneyiniz. ");
                }
            }
        }
    }
}
