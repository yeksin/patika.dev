public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Tom", 15, 100, 100, 20);
        Fighter f2 = new Fighter("Jerry", 5, 100, 55, 80);

        Match match = new Match(f1, f2, 120, 50);
        match.run();

    }
}
