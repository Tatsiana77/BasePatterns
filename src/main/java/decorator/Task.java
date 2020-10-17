package decorator;

public class Task {
    public static void main(String[] args) {
        Developer developer;
        developer = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));


        System.out.println(developer.makeJob());
    }
}
