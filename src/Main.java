import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Library library = new Library(10);

        int choice;

        do {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add book");
            System.out.println("2. Add e-book");
            System.out.println("3. Display all books");
            System.out.println("4. Search book by title");
            System.out.println("5. Borrow book");
            System.out.println("6. Return book");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    // TODO: Read input and add Book
                    System.out.println("Book title");
                    String title = scanner.nextLine();
                    System.out.println("Book author");
                    String author = scanner.nextLine();
                    System.out.println("Book year");
                    int year = scanner.nextInt();
                    scanner.nextLine();
                    Book book = new Book(title, author, year);
                    library.addBook(book);
                    break;

                case 2:
                    // TODO: Read input and add EBook
                    System.out.println("Book title");
                    String etitle = scanner.nextLine();
                    System.out.println("Book author");
                    String eauthor = scanner.nextLine();
                    System.out.println("Book year");
                    int eyear = scanner.nextInt();
                    System.out.println("Book file size");
                    int filesize = scanner.nextInt();
                    scanner.nextLine();
                    EBook ebook = new EBook(etitle, eauthor, eyear, filesize);
                    library.addBook(ebook);
                    break;

                case 3:
                    library.displayBooks();
                    break;

                case 4:
                    // TODO: Search book
                    System.out.println("Enter book title");
                    String stitle = scanner.nextLine();
                    System.out.println(library.searchByTitle(stitle));
                    break;

                case 5:
                    // TODO: Borrow book
                    System.out.println("Enter book title");
                    String btitle = scanner.nextLine();
                    library.borrowBook(btitle);
                    break;

                case 6:
                    // TODO: Return book
                    System.out.println("Enter book title");
                    String rtitle = scanner.nextLine();
                    library.returnBook(rtitle);
                    break;

                case 7:
                    System.out.println("Goodbye");
                    break;

                default:
                    System.out.println("Invalid option!");
            }

        } while (choice != 7);

        scanner.close();
    }
}