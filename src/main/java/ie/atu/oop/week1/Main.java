package ie.atu.oop.week1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args) {

        Book first = new Book("Dune","Frank Herbert",412);
        Book middle = new Book("Animal Farm","George",162);
        Book second = new Book("Clean Code","Robert C. Martin",464);

        LibraryService service = new LibraryService();

        service.addBook(first);
        service.addBook(middle);
        service.addBook(second);

        System.out.println("Book List:" + service.getBookCount());

        for(Book book: service.getAllBooks())
        {
            System.out.println(book.getTitle());
        }

        Book found = service.findBookByTitle("Clean Code");

        if(found != null)
        {
            //Object is found so we have something to get a title from
            System.out.println(found.getTitle());
        }
        else
        {
            //Object is not found so getTitle() will not work as there is no object
            System.out.println("Book not found");
        }
        //Add the remove method yourself and then call it
        System.out.println("Book List:" + service.getBookCount());
        System.out.println("Remove Clean Code " + service.removeBook("Clean Code"));
        System.out.println("Book List:" + service.getBookCount());

        System.out.println("Remove Action Jackson " + service.removeBook("Jackson"));

    }
}