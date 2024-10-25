import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
    private List<Book> books;
    private List<User> users;
    private int bookIdCounter;
    private int userIdCounter;

    public LibraryManager() {
        books = new ArrayList<>();
        users = new ArrayList<>();
        bookIdCounter = 1;
        userIdCounter = 1;
    }

    public void addBook(String title, String author) {
        Book newBook = new Book(bookIdCounter++, title, author, true);
        books.add(newBook);
        System.out.println("Book added successfully: " + newBook);
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public void addUser(String name, String email) {
        User newUser = new User(userIdCounter++, name, email);
        users.add(newUser);
        System.out.println("User added successfully: " + newUser);
    }

    public void listUsers() {
        if (users.isEmpty()) {
            System.out.println("No users available.");
        } else {
            for (User user : users) {
                System.out.println(user);
            }
        }
    }
}