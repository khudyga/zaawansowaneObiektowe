import java.util.ArrayList;

public class LibraryApp {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new AcademicBook("Math", "Author1", true, "User1", "Math"));
        books.add(new FictionBook("Dune", "Author2", true, "User2", "Science Fiction"));
        books.add(new AcademicBook("History", "Author3", true, "User3", "History"));

        for (Book book : books){
            book.displayInfo();
        }
        books.get(1).borrowBook("User2");

        System.out.println(books.get(1).isAvailable());

        books.get(1).borrowBook("User4");
        books.get(1).returnBook();

        System.out.println(books.get(1).isAvailable());

    }
}
