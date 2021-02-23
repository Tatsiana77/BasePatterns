package AbstractFactory.website;

import AbstractFactory.Developer;
import AbstractFactory.ProjectManager;
import AbstractFactory.ProjectTeamFactory;
import AbstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    public Tester getTester() {
        return new ManualTester();
    }

    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
