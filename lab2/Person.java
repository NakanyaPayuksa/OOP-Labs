package lab2;

public class Person {
    // ใช้ protected เพื่อให้ Father และ Mother ดึงไปใช้ต่อได้ง่าย
    protected String lastName;
    protected String firstName;

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }
}