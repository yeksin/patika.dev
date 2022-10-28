public class employee {

    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax;
    int bonus;
    double raise;

    employee(String name, int hireYear, int workHours, int salary) {
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.name = name;
    }

    double tax() {
        if (salary > 1000) {
            tax = salary * 0.03;
            return tax;
        }
        return 0;
    }

    int bonus() {
        if (workHours > 40) {
            bonus = (workHours - 40) * 30;
            return bonus;
        }
        return 0;
    }

    double raiseSalary() {
        if (2021 - hireYear < 10) {
            raise = (salary * 0.05);
            return raise;
        }
        if (2021 - hireYear > 9 && 2021 - hireYear <= 20) {
            raise = (salary * 0.1);
            return raise;
        }
        if (2021 - hireYear >= 19) {
            raise = (salary * 0.15);
            return raise;
        }
        return 0;
    }

    void toPrint() {
        System.out.println("================================");
        System.out.println("Ad� : "+this.name);
        System.out.println("Maa�� : "+ this.salary);
        System.out.println("�al��ma Saati : "+ this.workHours);
        System.out.println("Ba�lang�� Y�l� : "+this.hireYear);
        System.out.println("Vergi : "+tax());
        System.out.println("Bonus : "+bonus());
        System.out.println("Maa� art��� : "+raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maa� : "+(salary +bonus() - tax()));
        System.out.println("Toplam Maa� : "+ (salary -tax() + bonus() + raiseSalary()));
    }
}
