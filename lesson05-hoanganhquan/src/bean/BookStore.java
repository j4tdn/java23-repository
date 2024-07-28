package bean;


public class BookStore {
	public Book[] books;

    public BookStore() {
        createBooks();
    }

    public void createBooks() {
        books = new Book[5];
        books[0] = new TextBook("SGK001", 120, "Nhi Đồng", "mới");
        books[1] = new TextBook("SGK002", 150, "Kim Đồng", "cũ");
        books[2] = new TextBook("SGK003", 90, "Nhi Đồng", "mới");
        books[3] = new ReferBook("STK001", 60, "Nhi Đồng", 10);
        books[4] = new ReferBook("STK002", 40, "Giáo Dục", 5);
    }

    public Book[] findBooksByPublisher(String publisher) {
        Book[] result = new Book[books.length];
        int count = 0;
        for (Book book : books) {
            if (book.getPublisher().equalsIgnoreCase(publisher)) {
                result[count++] = book;
            }
        }
        return trimArray(result, count);
    }

    public Book[] findBooksByPriceLessThan(double price) {
        Book[] result = new Book[books.length];
        int count = 0;
        for (Book book : books) {
            if (book.getPrice() < price) {
                result[count++] = book;
            }
        }
        return trimArray(result, count);
    }

    public TextBook[] findTextBooksByPriceRange(double minPrice, double maxPrice) {
        TextBook[] result = new TextBook[books.length];
        int count = 0;
        for (Book book : books) {
            if (book instanceof TextBook) {
                TextBook textBook = (TextBook) book;
                if (textBook.getPrice() >= minPrice && textBook.getPrice() <= maxPrice) {
                    result[count++] = textBook;
                }
            }
        }
        return trimArray(result, count);
    }

    private <T> T[] trimArray(T[] array, int size) {
        T[] result = (T[]) new Object[size];
        System.arraycopy(array, 0, result, 0, size);
        return result;
    }

    public double calculateTotalPrice(Book textBook, Book referBook) {
        return textBook.calculateTotalPrice() + referBook.calculateTotalPrice();
    }
}