package Proxy;

public class RealProject implements Project {
    private final String url;

    public RealProject(String url) {
        this.url = url;
        load();
    }

    public void load() {
        System.out.println("Loading project from" + url + "...");

    }

    public void run() {
        System.out.println(" Running project " + url + "...");
    }
}
