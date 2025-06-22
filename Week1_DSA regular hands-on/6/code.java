import java.util.Arrays;

class Book {
    int bookId;
    String title;
    String author;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return bookId + " | " + title + " | " + author;
    }
}

public class LibrarySearch {
    static Book[] books = {
        new Book(101, "Java Programming", "James"),
        new Book(102, "Python Basics", "Guido"),
        new Book(103, "Data Structures", "Mark")
    };

    static void linearSearch(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                System.out.println("Book Found: " + book);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    static void binarySearch(String title) {
        Arrays.sort(books, (a, b) -> a.title.compareToIgnoreCase(b.title));

        int left = 0, right = books.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = title.compareToIgnoreCase(books[mid].title);
            if (cmp == 0) {
                System.out.println("Book Found: " + books[mid]);
                return;
            } else if (cmp < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println("Book not found.");
    }

    public static void main(String[] args) {
        System.out.println("Linear Search:");
        linearSearch("Python Basics");

        System.out.println("\nBinary Search:");
        binarySearch("Java Programming");
    }
}