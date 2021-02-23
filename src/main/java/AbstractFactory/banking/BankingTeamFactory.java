package AbstractFactory.banking;

import AbstractFactory.Developer;
import AbstractFactory.ProjectManager;
import AbstractFactory.ProjectTeamFactory;
import AbstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    public Tester getTester() {
        return new QATester();
    }

    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
