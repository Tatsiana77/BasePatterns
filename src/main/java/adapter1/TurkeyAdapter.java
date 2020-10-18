package adapter1;

public class TurkeyAdapter implements Duck {
   Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void quack() {
        for (int i = 0; i < 3; i++) {
            turkey.gobble();
        }
    }

    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
