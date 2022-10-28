import java.util.Scanner;
public class UserLogin {
    public static void main(String[] args) {

        String x,y;
        Scanner input= new Scanner(System.in);

        System.out.print("Kullancı adını giriniz: ");
        x=input.nextLine();

        System.out.print("Şifreyi giriniz: ");
        y= input.nextLine();

       if (x.equals("yeksin") && y.equals("parola123")){
            System.out.println("Giriş yaptınız! ");
        }
        else  {
            System.out.print("Kullanıcı veya şifre hatalı! Lütfen yeni şifre belirleyin: ");
        }
        y= input.nextLine();

        if (y.equals("parola123")){
            System.out.println("Yeni şifreniz eski şifrenizle aynı olamaz, lütfen başka bir şifre belirleyin..");
        }
        else {
            System.out.println("Şifre oluşturuldu. Giriş yapılıyor..");
        }

    }
}
