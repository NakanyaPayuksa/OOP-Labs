package lab3;

public class ESportsClubTest {
    public static void main(String[] args) {
        System.out.println("=== ESportsClub e = new ESportsClub ===");
        ESportsClub e = new ESportsClub("Esport", 100);
        System.out.println("clubName = " + e.clubName);
        System.out.println("minNumMember = " + e.minNumMember);
        System.out.println("numMember = " + e.numMember);
        e.advertise();
        System.out.println("determineBudget = " + e.determineBudget());
        System.out.println("getName = " + e.getName());

        System.out.println();
        System.out.println("=== Club c = new ESportsClub ===");
        Club c = new ESportsClub("Esport", 100);
        System.out.println("clubName = " + c.clubName);
        System.out.println("minNumMember = " + c.minNumMember);
        System.out.println("numMember = " + c.numMember);
        c.advertise();
        System.out.println("determineBudget = " + c.determineBudget());
        System.out.println("getName = " + c.getName());
    }
}