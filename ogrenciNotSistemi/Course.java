public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int vNote;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        int vNote=0;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.print("Öðretmen konuya pek vakýf deðil.");
        }

    }

    void printTeacherInfo() {
        this.teacher.print();

    }
}
