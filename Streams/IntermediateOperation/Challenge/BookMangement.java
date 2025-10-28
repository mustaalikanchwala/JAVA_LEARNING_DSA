
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BookMangement {
    public static void main(String[] args) {
         List<Book2> books = Arrays.asList(
            new Book2("The Great Gatsby", 15.99, 1925, 0),
            new Book2("To Kill a Mockingbird", 18.50, 1960, 0),
            new Book2("1984", 22.00, 1949, 17.60),
            new Book2("Pride and Prejudice", 12.99, 1813, 0),
            new Book2("The Catcher in the Rye", 25.50, 1951, 20.40),
            new Book2("Moby Dick", 30.00, 1851, 24.00),
            new Book2("War and Peace", 35.00, 2026, 0),
            new Book2("The Odyssey", 19.99, -800, 15.99),
            new Book2("Brave New World", 21.00, 2026, 16.80),
            new Book2("The Lord of the Rings", 45.00, 1954, 0),
            new Book2("Harry Potter", 28.00, 2026, 22.40),
            new Book2("The Hobbit", 24.99, 2026, 19.99)
        );
         List<Book2> allinonebooks = Arrays.asList(
            new Book2("The Great Gatsby", 15.99, 1925, 0),
            new Book2("To Kill a Mockingbird", 18.50, 1960, 0),
            new Book2("1984", 22.00, 1949, 17.60),
            new Book2("Pride and Prejudice", 12.99, 1813, 0),
            new Book2("The Catcher in the Rye", 25.50, 1951, 20.40),
            new Book2("Moby Dick", 30.00, 1851, 24.00),
            new Book2("War and Peace", 35.00, 2026, 0),
            new Book2("The Odyssey", 19.99, -800, 15.99),
            new Book2("Brave New World", 21.00, 2026, 16.80),
            new Book2("The Lord of the Rings", 45.00, 1954, 0),
            new Book2("Harry Potter", 28.00, 2026, 22.40),
            new Book2("The Hobbit", 24.99, 2026, 19.99)
        );

        // Trying to write all streams opration in one 

        allinonebooks = allinonebooks.stream().filter(isDiscount).filter(publishedBefore).sorted(Comparator.comparingDouble(book -> book.OGprice)).collect(Collectors.toList()); 
        System.out.println("========Adding All Streams operation in one  ========");
        allinonebooks.forEach(printBook);

        // Adding Coming Soon Title 

        System.out.println("========Adding 'Comming Soon' for books wil publish after 2025 ========");
        Stream<String> comingSoon = books.stream().filter(FuturePublished).map(book -> book.title + " (COMING SOON)");
        comingSoon.forEach(System.out::println);

        // Discounted Books 
        System.out.println("========Filtering the books which have discount========");
        books = books.stream().filter(isDiscount).collect(Collectors.toList());
        books.forEach(printBook);
        
        // Published Before 2000 year
        System.out.println("========Filtering the books which was published before 2000========");
        books = books.stream().filter(publishedBefore).collect(Collectors.toList());
        books.forEach(printBook);
        
        // Sort the books based on price
        System.out.println("========Sorting the Book Based on price========");
        books = books.stream().sorted(Comparator.comparingDouble(book -> book.OGprice)).collect(Collectors.toList());
        books.forEach(printBook);
        
        System.out.println("========Filter only rare Books which has tilte lenght more than 20========");
        Stream<Book2> rareBooks = books.stream().filter(rareBook);
        rareBooks.forEach(printBook);

}
    public static Predicate<Book2> FuturePublished = book -> book.publishYear > 2025;
    public static Predicate<Book2> isDiscount = book -> book.discountPrice != 0;
    public static Consumer<Book2> printBook = book -> System.out.println(book.toString());
    public static Predicate<Book2> publishedBefore = book -> book.publishYear < 2000;
    public static Predicate<Book2> rareBook = book -> book.title.length() > 20;

}
