package lab2;

public class ClubTest {
    public static void main(String[] args) {
  
        System.out.println("--- Sports Club Test ---");
        SportsClub sports = new SportsClub("Football Club", 10);
        sports.addMember(5); 
        
        System.out.println("Club Name: " + sports.getName());
        sports.changeName("New Football Club"); 
        System.out.println("After changeName: " + sports.getName());
        
    
        System.out.println("Sports Club Budget: " + sports.determineBudget());

        System.out.println();
   
        System.out.println("--- Marketing Club Test ---");
        MarketingClub mkt = new MarketingClub("Digital Marketing", 5, 2000);
        
  
        System.out.println("Initial Budget Check: " + mkt.determineBudget());
        

        boolean useResult1 = mkt.useBudget(2500);
        System.out.println("Use 2500 budget success? " + useResult1);
        

        boolean useResult2 = mkt.useBudget(1500);
        System.out.println("Use 1500 budget success? " + useResult2);
        
        System.out.println("Budget Check after use: " + mkt.determineBudget());
    }
}