package lab4;

public abstract class PSUStudent {
    protected int age;
    protected double gpa;

    public PSUStudent(int age, double gpa) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        if (gpa < 0.0 || gpa > 4.0) {
            throw new IllegalArgumentException("GPA must be between 0.0 and 4.0");
        }
        this.age = age;
        this.gpa = gpa;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // ลูกทุกตัวต้องเขียนเอง
    public abstract double revealGrade();

    // เมธอดว่างๆ ไว้ให้ test ของอาจารย์ที่ใช้ตัวแปรชนิด PSUStudent คอมไพล์ผ่าน
    // คลาสลูกจะ override ไปใช้งานจริง
    public void setCurrentYear(int currentYear) {
    }

    public void setPassThesis(boolean passThesis) {
    }
}
