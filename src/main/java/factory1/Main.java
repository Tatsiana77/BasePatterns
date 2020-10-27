package factory1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DoughnutFactory doughnutFactory = new DoughnutFactory();

        Doughnut cherry = doughnutFactory.getDoughnut(DoughnutType.CHERRY);
        Doughnut chocolate = doughnutFactory.getDoughnut(DoughnutType.CHOCOLATE);
        Doughnut almond = doughnutFactory.getDoughnut(DoughnutType.ALMOND);
        cherry.eat();
        chocolate.eat();
        almond.eat();
        for (int i = 0; i < 50; i++) {
            eatRandomDoughnut(doughnutFactory);
        }
        doughnutFactory.count();

    }

    public static void eatRandomDoughnut(DoughnutFactory doughnutFactory) {
        Doughnut randomDoughnut = getRandomDoughnut(doughnutFactory);
    }


    private static Doughnut getRandomDoughnut(DoughnutFactory doughnutFactory) {
        Random random = new Random();
        DoughnutType type = DoughnutType.values()[random.nextInt(DoughnutType.values().length)];
        return (doughnutFactory.getDoughnut(type));
    }
}
