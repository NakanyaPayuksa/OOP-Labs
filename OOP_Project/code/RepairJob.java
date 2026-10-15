public class RepairJob extends Job {
    private String faultDescription;       // unique attribute

    public RepairJob(String jobID, String customerName, String address,
                     double cost, String faultDescription) {
        super(jobID, customerName, address, cost);
        this.faultDescription = faultDescription;
    }

    public String getFaultDescription() {  // unique method
        return faultDescription;
    }

    @Override
    public String toString() {
        return "Repair | ID: " + getJobID() + " | Customer: " + getCustomerName()
                + " | Address: " + getAddress() + " | Cost: " + getCost()
                + " | Fault: " + faultDescription + "\n";
    }
}
