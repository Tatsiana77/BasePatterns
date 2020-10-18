package adapter1;

public class DuckAdapter implements Turkey {
    MallardDuck duck;

    public DuckAdapter(MallardDuck duck) {
        this.duck = duck;
    }

    public void gobble() {
        for (int i = 0; i < 2; i++) {
            duck.quack();
        }
    }

    public void fly() {
        for (int i = 0; i < 4; i++) {
            duck.fly();
        }
    }
}
