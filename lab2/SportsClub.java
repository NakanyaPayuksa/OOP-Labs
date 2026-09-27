package lab2;

public class SportsClub extends Club {

    // Constructor ทำงานเหมือน Club โดยส่งค่าไปให้คลาสแม่ด้วย super
    public SportsClub(String c, int m) {
        super(c, m);
    }

    // Overriding: คำนวณงบประมาณตามสูตรใหม่ของ SportsClub
    @Override
    public int determineBudget() {
        return (numMember * 1000) + (numMember - minNumMember) * 100;
    }

    // Overriding: โจทย์ระบุว่าห้ามเปลี่ยน clubName จึงไม่แก้ไขค่าใดๆ
    @Override
    public void changeName(String newName) {
        // ห้ามเปลี่ยนชื่อ (ทำเป็นเมธอดว่างไว้)
    }
}