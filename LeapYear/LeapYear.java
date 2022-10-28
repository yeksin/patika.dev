import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        boolean leapYear;
        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen yýl giriniz: ");
        year = scan.nextInt();

        if (year%4==0) {
            if (year%100==0) {
                if (year%400==0){
                    leapYear=true;
                }else {
                    leapYear=false;
                }
            } else {
                leapYear=true;
            }
        }else {
            leapYear=false;
        }
        if (leapYear) {
            System.out.println(year+" artýk yýldýr!");
        }else {
            System.out.println(year+" artýk yýl deðildir!");
        }
    }
}
