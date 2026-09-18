package lab1;

public class BookDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Developing Java Softwarenull", "Russel Windernull", 79.75);
        System.out.println("Titel : " + book1.getTitle());
        System.out.println("Author : " + book1.getAuthor());
        System.out.println("Price : " + book1.getPrice());
    }
}
