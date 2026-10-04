package lab3;

public class SportsClub extends Club {

    public SportsClub(String c, int m) {
        super(c, m);
    }

    @Override
    public void changeName(String newName) {
        
    }

    @Override
    public int determineBudget() {
        return super.determineBudget() + (numMember - minNumMember) * 100;
    }

}