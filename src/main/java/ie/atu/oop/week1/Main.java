package ie.atu.oop.week1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello OOP");

        Book firstBook = new Book();
        firstBook.title = "Dune";
        firstBook.author = "Frank Herbert";
        firstBook.pageCount = 412;

        firstBook.displayDetails();
        System.out.println("\n");
        firstBook.borrowBook();
        System.out.println("\n");
        firstBook.displayDetails();

        Book secondBook = new Book();
        secondBook.title = "The life and times of Thunderbolt";
        secondBook.author = "Frank Black";
        secondBook.pageCount = 12;
        secondBook.available = true;

        secondBook.displayDetails();
    }
}