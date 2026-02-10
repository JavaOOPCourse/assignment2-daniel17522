public class Library {

    private Book[] books;
    private int count;

    public Library(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    // TODO: Add book to array
    public void addBook(Book book) {
        if (count >= books.length) {
            System.out.println("Library is full");
            return;
        }
        books[count++] = book;
    }

    // TODO: Display all books
    public void displayBooks() {
        if (count <= 0) {
            System.out.println("Library is empty");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }

    // TODO: Search book by title
    public Book searchByTitle(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    // TODO: Borrow book by title
    public void borrowBook(String title) {
        Book book = searchByTitle(title);
        if (book == null) {
            System.out.println("Dont have this book");
        } else if (!book.isAvailable()) {
            System.out.println("Book is busy");
        } else {
            book.borrowBook();
            System.out.println("Take it");
        }
    }

    // TODO: Return book by title
    public void returnBook(String title) {
        Book book = searchByTitle(title);
        if (book == null) {
            System.out.println("Dont have this book");
        } else if (book.isAvailable()) {
            System.out.println("The book is already at library");
        } else {
            book.returnBook();
            System.out.println("Returned");
        }
    }
}