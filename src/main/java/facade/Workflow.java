package facade;

// Шаблон фасад
//to provide unified interface instead of multiple subsystem interfaces
public class Workflow {
    Developer developer = new Developer();
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();

    public void solveProblem() {
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadLine(bugTracker);
        bugTracker.finishSprint();
        developer.doJobBeforeDeadLine(bugTracker);
    }
}
