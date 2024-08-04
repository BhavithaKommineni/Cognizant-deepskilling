import java.util.Arrays;
import java.util.Comparator;

public class LibraryExample {
    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"),
            new Book(2, "1984", "George Orwell"),
            new Book(3, "To Kill a Mockingbird", "Harper Lee")
        };

        // Linear search
        Book foundBookLinear = LinearSearch.linearSearch(books, "1984");
        System.out.println("Linear Search Result: " + foundBookLinear);

        // Sort books by title for binary search
        Arrays.sort(books, Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));

        // Binary search
        Book foundBookBinary = BinarySearch.binarySearch(books, "1984");
        System.out.println("Binary Search Result: " + foundBookBinary);
    }
}
