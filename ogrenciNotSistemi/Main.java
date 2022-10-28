import javax.xml.namespace.QName;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Tesla", "158561615", "FZK");
        Teacher t2 = new Teacher("Carl Jung", "546816544", "DKAB");
        Teacher t3 = new Teacher("Fatih Sultan Mehmet", "46846848", "TRH");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t3);
        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t1);
        Course din = new Course("Din Kültürü ve Ahlak Bilgisi", "104", "DKAB");
        din.addTeacher(t2);

        Student s1 = new Student("Edison", "68485189", "4 ", fizik, din, tarih);
        s1.addBulkExamNote(50, 70, 70,55,70,75);
        s1.isPass();

        Student s2 = new Student("Nietzsche", "64784", "1", fizik, din, tarih);
        s2.addBulkExamNote(70, 90, 100,100,85,80);
        s2.isPass();

        Student s3 = new Student("II. Murad", "65468", "3", fizik, din, tarih);
        s3.addBulkExamNote(20, 35, 100,100,55,30);
        s3.isPass();


    }


}
