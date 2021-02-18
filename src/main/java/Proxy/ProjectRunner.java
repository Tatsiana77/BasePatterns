package Proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("http://www.github.com/Tatsiana77/realProject");


        project.run();
    }
}
