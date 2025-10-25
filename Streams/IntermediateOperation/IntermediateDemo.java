import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateDemo {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("Paulo Coelho", 1988, 14.99, "The Alchemist"));
        books.add(new Book("Khaled Hosseini", 2003, 15.99, "The Kite Runner"));
        books.add(new Book("Paulo Coelho", 1994, 12.99, "By the River Piedra I Sat Down and Wept"));
        books.add(new Book("Khaled Hosseini", 2007, 16.99, "A Thousand Splendid Suns"));
        books.add(new Book("Delia Owens", 2018, 17.99, "Where the Crawdads Sing"));
        books.add(new Book("Delia Owens", 2018, 17.99, "Where the Crawdads Sing"));
        books.add(new Book("Markus Zusak", 2005, 14.50, "The Book Thief"));
        books.add(new Book("Anthony Doerr", 2014, 16.50, "All the Light We Cannot See"));
        books.add(new Book("Yann Martel", 2001, 13.99, "Life of Pi"));
        books.add(new Book("John Boyne", 2006, 12.99, "The Boy in the Striped Pyjamas"));
        books.add(new Book("Alice Sebold", 2002, 14.99, "The Lovely Bones"));

        // 1. Filtering books which is less then 7$
        List<Book> filteredBook = books.stream().filter(filteringbook).collect(Collectors.toList());
        // filteredBook.forEach(System.out::println);
        System.out.println("Filtering Books Based on Price");
        for(Book book : filteredBook){
            System.out.println(book.toString());
        }
        // 2. Mapping : Convert title of book to Upper case
        System.out.println("Mapping the title to Upper Case");
        Stream<String> upperCaseTitle = filteredBook.stream().map(titleUppercase);
        upperCaseTitle.forEach(System.out::println);

        // 3. Sort Book By Publication date
        System.out.println("Sorting the Books based on Published year");
        filteredBook = filteredBook.stream().sorted(Comparator.comparingInt(book -> book.publishYear)).collect(Collectors.toList());
        for(Book book : filteredBook){
            System.out.println(book.toString());
        }
        // 4. Distinc Remove Duplicate Title
        System.out.println("removing the duplicate but logic is still not correct");
        Stream<Book> uniqueBook = filteredBook.stream().distinct();
        uniqueBook.forEach(System.out::println);

        // 5. Limit Display only first 3 books
        System.out.println("Only first 3 Books");
        Stream<Book> firstThreeBook = filteredBook.stream().limit(3);
        firstThreeBook.forEach(System.out::println);
        
        // 6. Skip the First 2 books
        System.out.println("Skipping the first two books ");
        Stream<Book> skippedfirst2book = filteredBook.stream().skip(2);
        skippedfirst2book.forEach(System.out::println);


    }

    // Filtering Method 
    public static Predicate<Book> filteringbook = book -> book.price > 10; 
    // Mapping Method
    public static Function<Book , String> titleUppercase = book -> book.title = book.title.toUpperCase();
}
