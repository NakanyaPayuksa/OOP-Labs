package lab3;

public class ClubManagingSystemTest {
    public static void main(String[] args) {
        Club student = new Club("Student", 10);
        student.addMember(190);                  

        Club football = new SportsClub("Football", 22);
        football.addMember(18);                 

        Club rov = new ESportsClub("RoV", 1);
        rov.addMember(4);                        

        Club advertising = new MarketingClub("Advertising", 2, 100);
        advertising.addMember(8);              

        Club[] list = { student, football, rov, advertising };
        ClubManagingSystem system = new ClubManagingSystem(list);

        System.out.println("Highest member club = " + system.getHighestMemberClub().getName());
        System.out.println("All budget = " + system.determineAllBudget());
        System.out.println("All members = " + system.getAllMembers());
    }
}