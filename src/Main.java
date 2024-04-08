public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "The Lord of the Rings. Boxed Set";
        book1.author = "J. R. R. Tolkien";
        book1.price = 71;

        Book book2 = new Book();
        book2.title = "Harry Potter. Boxed Set";
        book2.author = "J. K. Rowling";
        book2.price = 56;

        printBookDetails(book1);
        printBookDetails(book2);
    }
    public static void printBookDetails(Book book) {
        System.out.println("Title: " + book.title + "\n"
        + "Author: " + book.author + "\n"
        + "Price: " + book.price);
    }
}