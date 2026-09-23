package ie.atu.oop.week1;

public class Book {
    public String title;
    public String author;
    public int pageCount;
    public boolean available = true;

    public Book()
    {
    }

    public void displayDetails()
    {
        System.out.println("This book is " + title);
        System.out.println("The author of this book is " + author);
        System.out.println("The page count of this book is " + pageCount);
        System.out.println("The status of this book is " + available);
        System.out.println("\n");
    }
}
