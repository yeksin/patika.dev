public class Student {

    String name;
    String stuNo;
    String classes;
    Course c1;
    Course c2;
    Course c3;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;

    }

    void addBulkExamNote(int note1, int vNote1, int note2, int vNote2, int note3, int vNote3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
        if (vNote1 >= 0 && vNote1 <= 100) {
            this.c1.vNote = vNote1;
        }
        if (vNote2 >= 0 && vNote2 <= 100) {
            this.c2.vNote = vNote2;
        }
        if (vNote3 >= 0 && vNote3 <= 100) {
            this.c3.vNote = vNote3;
        }

    }

    void isPass() {
        System.out.println("================================");
        this.average = (((0.4 * this.c1.note + 0.6 * this.c1.vNote) + (0.3 * this.c2.note + 0.7 * this.c2.vNote) + (0.2 * this.c3.note + 0.8 * this.c3.vNote)) / 3.0);
        if (this.average >= 55) {
            System.out.println("Anadolunun kapýlarý açýldý!");
            isPass = true;
        } else {
            System.out.println("Görev baþarýsýz. Üsse dönün.");
            isPass = false;
        }
        printNote();
    }

    void printNote() {
        System.out.println(this.c1.name + " Dersinin notu(%40): " + this.c1.note + " Sözlüsü(%60): " + this.c1.vNote + " Ort: " + (0.4 * this.c1.note + 0.6 * this.c1.vNote));
        System.out.println(this.c2.name + " Dersinin notu(%30): " + this.c2.note + " Sözlüsü(%70): " + this.c2.vNote + " Ort: " + (0.3 * this.c2.note + 0.7 * this.c2.vNote));
        System.out.println(this.c3.name + " Dersinin notu(%20): " + this.c3.note + " Sözlüsü(%80): " + this.c3.vNote + " Ort : " + (0.2 * this.c3.note + 0.8 * this.c3.vNote));
        System.out.println("Genel Ortalama: " + this.average);
    }
}
