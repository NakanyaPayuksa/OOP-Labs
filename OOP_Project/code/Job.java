public abstract class Job implements JobInterface {
    private String jobID;
    private String customerName;
    private String address;
    private double cost;

    public Job(String jobID, String customerName, String address, double cost) {
        this.jobID = jobID;
        this.customerName = customerName;
        this.address = address;
        this.cost = cost;
    }

    @Override
    public final String getJobID() {       // final: subclasses cannot override
        return jobID;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public abstract String toString();     // each subclass writes its own
}
