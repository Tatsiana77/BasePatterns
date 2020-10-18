package adapter1;

public class DuckTestDrive {


    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        DuckAdapter duckAdapter = new DuckAdapter(duck);

        System.out.println(" The turkey says - ");
        turkey.gobble();
        turkey.fly();
        testTurkey(turkey);

        System.out.println("\n Duck says - " );
        duck.quack();
        duck.fly();
        testDuck(duck);


        System.out.println("\n The TurkeyAdapter says - " );
        testDuck(turkeyAdapter);

        System.out.println("\n The DuckAdapter says - ");
        testTurkey(duckAdapter);


    }

     static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

    static void testTurkey(Turkey turkey){
        turkey.gobble();
        turkey.fly();
    }
}
