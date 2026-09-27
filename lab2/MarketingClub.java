package lab2;

public class MarketingClub extends Club {
    // เพิ่มแอตทริบิวต์ budget
    private int budget;

    // Constructor รับค่าเพิ่มอีก 1 ตัวคือ budget
    public MarketingClub(String c, int m, int budget) {
        super(c, m); // เรียก Constructor ของคลาสแม่
        this.budget = budget;
    }

    // เมธอดสำหรับใช้องบประมาณ
    public boolean useBudget(int amount) {
        if (this.budget - amount < 0) {
            return false; // หักแล้วติดลบ -> ไม่ยอมให้หัก คืนค่า false
        }
        this.budget -= amount;
        return true; // หักงบสำเร็จ คืนค่า true
    }

    // Overriding: คำนวณงบตามเงื่อนไขของ MarketingClub
    @Override
    public int determineBudget() {
        if (this.budget > 1000) {
            return 0;
        }
        // ถ้า budget <= 1000 ให้เรียกใช้การคำนวณแบบเดิมของคลาสแม่ผ่าน super
        return super.determineBudget();
    }
}