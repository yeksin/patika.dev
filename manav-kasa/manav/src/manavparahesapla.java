import java.util.Scanner;
public class manavparahesapla {
    public static void main(String[] args) {
      double  armut = 2.14;
      double elma = 3.20;
      double muz= 10.20;
      double patlican = 20.40;
      double degergir;
      double islem;

      Scanner input = new Scanner(System.in);
      System.out.print("armut kac kilo alcan kız? " );
      degergir= input.nextDouble();

        islem = armut * degergir;
        System.out.println(islem);


      System.out.print("elma kac kilo alcan kız? " );
      degergir= input.nextDouble();

      islem = elma* degergir;
      System.out.println(islem);

      System.out.print("muz kac kilo alcan kız? " );
      degergir= input.nextDouble();

      islem = muz* degergir;
      System.out.println(islem);



      System.out.print("patlican kac kilo alcan kız? " );
      degergir= input.nextDouble();

      islem = patlican* degergir;
      System.out.println(islem);

      System.out.println("Toplam fiyat: " + (elma + armut + muz + patlican));

    }
}
