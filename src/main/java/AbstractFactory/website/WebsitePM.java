package AbstractFactory.website;

import AbstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    public void manageProject() {
        System.out.println("Website PM manages website project");
    }
}
