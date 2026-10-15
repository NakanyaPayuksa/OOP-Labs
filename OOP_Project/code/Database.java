import java.util.ArrayList;
import java.util.List;

public class Database {
    private static final List<JobInterface> jobs = new ArrayList<>();

    public static void addJob(JobInterface job) {
        jobs.add(job);
    }

    public static List<JobInterface> getJobs() {
        return jobs;
    }
}
