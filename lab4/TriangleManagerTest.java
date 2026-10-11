package lab4;

public class TriangleManagerTest {
    public static void main(String[] args) {
        TriangleManager manager = new TriangleManager(true); // true = ArrayList

        manager.addTriangle(new EquilateralTriangle(5));   // perimeter 15
        manager.addTriangle(new RightTriangle(3, 4, 5));   // perimeter 12
        manager.addTriangle(new EquilateralTriangle(10));  // perimeter 30

        Triangle biggest = manager.findTriangleWithLargestPerimeter();
        System.out.println("Largest perimeter: " + biggest.getPerimeter());
        System.out.println("Longest side: " + biggest.getLongestSideLength());

        // ทดสอบ LinkedList
        TriangleManager manager2 = new TriangleManager(false);
        manager2.addTriangle(new RightTriangle(6, 8, 10));
        System.out.println("LinkedList largest perimeter: "
                + manager2.findTriangleWithLargestPerimeter().getPerimeter());

        // ทดสอบ exception
        try {
            manager.addTriangle(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
