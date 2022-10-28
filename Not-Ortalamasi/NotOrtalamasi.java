import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {

        int turkce, mat, fizik, kimya,  tarih, muzik;

        Scanner input= new Scanner(System.in);

        System.out.print("Türkçe notunuzu giriniz:  ");
        turkce= input.nextInt();

        System.out.print("Matematik notunuzu giriniz:  ");
        mat=input.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik=input.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih=input.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya=input.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik=input.nextInt();

        int toplam = turkce+ mat +fizik+tarih+kimya+muzik;
            double sonuc= toplam/6.0;

            boolean gecti= sonuc>=60.0;



        String cevap= gecti ? "  Sýnýfý Geçti" : "  Sýnýfta Kaldý";


        System.out.println("Ortalamanýz :  " + sonuc + cevap);





    }
    }


