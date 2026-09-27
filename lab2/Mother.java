package lab2;

public class Mother extends Parent {
    private Father husband;

    public Mother() {
        super(0); // ส่งค่า money = 0 ไปให้ Parent (แก้ปัญหา Error Constructor)
    }

    @Override
    public String getFirstName() {
        return "Ms." + firstName;
    }
}