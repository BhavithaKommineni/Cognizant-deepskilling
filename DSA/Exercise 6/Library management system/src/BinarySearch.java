public class BinarySearch {
    public static Book binarySearch(Book[] books, String targetTitle) {
        int low = 0;
        int high = books.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            String midTitle = books[mid].getTitle();

            if (midTitle.equalsIgnoreCase(targetTitle)) {
                return books[mid];
            } else if (midTitle.compareToIgnoreCase(targetTitle) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }
}
