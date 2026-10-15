public class InstallationJob extends Job {
    private int numberOfOutlets;          

    public InstallationJob(String jobID, String customerName, String address,
                           double cost, int numberOfOutlets) {
        super(jobID, customerName, address, cost);
        this.numberOfOutlets = numberOfOutlets;
    }

    public int getNumberOfOutlets() {      
        return numberOfOutlets;
    }

    @Override
    public String toString() {
        return "Installation | ID: " + getJobID() + " | Customer: " + getCustomerName()
                + " | Address: " + getAddress() + " | Cost: " + getCost()
                + " | Outlets: " + numberOfOutlets + "\n";
    }
}
