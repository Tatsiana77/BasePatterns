package factory1;

public class DoughnutFactory {
    private Integer cherryDoughnutCount = 0;
    private Integer chocolateDoughnutCount = 0;
    private Integer almondDoughnutCount = 0;

    public Doughnut getDoughnut(DoughnutType type) {
        Doughnut doughnutToReturn;

        switch (type) {
            case CHERRY:
                cherryDoughnutCount++;
                doughnutToReturn = new CherryDoughnut();
                break;
            case CHOCOLATE:
                chocolateDoughnutCount++;
                doughnutToReturn = new ChocolateDoughnut();
                break;
            case ALMOND:
                almondDoughnutCount++;
                doughnutToReturn = new AlmondDoughnut();
                break;
            default:
                throw new IllegalArgumentException(" Wrong doughnut type: " + type);
        }
        return doughnutToReturn;
    }

    public void count() {
        System.out.println("Number of doughnuts produced: (by type)");
        System.out.println("Cherry doughnut: " + cherryDoughnutCount);
        System.out.println("Chocolate doughnut: " + chocolateDoughnutCount);
        System.out.println("Almond doughnut: " + almondDoughnutCount);
        System.out.println("Total :" + (chocolateDoughnutCount + cherryDoughnutCount + almondDoughnutCount));
    }

}
