import java.util.Scanner;

public class hackerrank {
    public static void main(String []argh){

        //Daha çirkini yazýlabilir miydi? Yazýlamazdý.(Ayrýca çalýþmýyor)

        String cikti;
        String can = " can be fitted in: ";
        Scanner inp= new Scanner(System.in);
        int n= inp.nextInt();

        System.out.print(n>=-128 && n<=127 ? n + can + "\n*byte" : n + can);

        System.out.print(n>=-32768 && n<=32767 ? "\n*short " : "");

        System.out.print(n>=-2147483648 && n<=2147483647 ?  "\n*int" : "");

        System.out.print(n>=-9223372036854775808L && n<=9223372036854775807L ? "\n*long" : n+ "can't be fitted anywhere");


    }
}
