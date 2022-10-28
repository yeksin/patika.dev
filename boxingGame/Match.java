public class Match {

    Fighter f1;
    Fighter f2;
    int maxWeight;
    int minWeight;

    Match(Fighter f1, Fighter f2, int maxWeight, int minWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

    void run() {
        if (isCheck()) {
            int round = 1;
            double whoIsFirst = Math.random() * 100;

            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("============ ROUND " + round++ + " ============");
                if (whoIsFirst <= 50) {
                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin()) {
                        break;
                    }
                }

                this.f1.health = this.f2.hit(this.f1);
                if (isWin()) {
                    break;
                }
                printScore();
                whoIsFirst = 1;
            }
        } else {
            System.out.println("Sikletler geçerli aralýklarda deðil.");
        }
    }


    boolean isCheck() {
        return ((this.f1.weight <= 100 && this.f1.weight > 0) && (this.f2.weight <= 100 && this.f2.weight > 0));
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(f2.name + " kazandý!");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(f1.name + " kazandý!");
            return true;
        }
        return false;
    }

    public void printScore() {
        System.out.println("------------");
        System.out.println(this.f1.name + " kalan saðlýk: " + this.f1.health);
        System.out.println(this.f2.name + " kalan saðlýk: " + this.f2.health);
    }
}
