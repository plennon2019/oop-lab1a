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

        System.out.println("This book is " + firstBook.title);
        System.out.println("The author of this book is " + firstBook.author);
        System.out.println("The page count of this book is " + firstBook.pageCount);
        System.out.println("The status of this book is " + firstBook.available);

    }
}