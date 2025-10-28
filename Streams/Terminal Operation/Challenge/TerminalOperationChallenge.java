import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TerminalOperationChallenge {
    public static void main(String[] args) {
        List<Book3> books = new ArrayList<>();

        // Fiction category
        books.add(new Book3("The Great Gatsby", 25.99, 1925, 19.99, "Fiction"));
        books.add(new Book3("To Kill a Mockingbird", 22.50, 1960, 17.99, "Fiction"));
        books.add(new Book3("1984", 28.00, 1949, 21.50, "Fiction"));
        books.add(new Book3("Pride and Prejudice", 20.00, 1813, 15.99, "Fiction"));

        // Science category
        books.add(new Book3("A Brief History of Time", 35.99, 1988, 29.99, "Science"));
        books.add(new Book3("The Selfish Gene", 32.50, 1976, 26.99, "Science"));

        // Programming category
        books.add(new Book3("Clean Code", 45.99, 2008, 39.99, "Programming"));
        books.add(new Book3("Effective Java", 48.00, 2001, 42.50, "Programming"));
        books.add(new Book3("Head First Java", 40.50, 2005, 34.99, "Programming"));

        // Biography category
        books.add(new Book3("Steve Jobs", 30.00, 2011, 24.99, "Biography"));
        books.add(new Book3("Becoming", 28.50, 2018, 22.99, "Biography"));

        // Mystery category
        books.add(new Book3("The Da Vinci Code", 24.99, 2003, 19.49, "Mystery"));
        books.add(new Book3("Gone Girl", 26.50, 2012, 20.99, "Mystery"));

        // Total Cost of all books
        System.out.println("==========Total Cost of Books=========");
        double totalCost = books.stream().map(book -> book.OGprice).reduce(0.0, Double::sum);
        System.out.println("TOTAL COST OF ALL BOOKS : " + totalCost);

        // Collecting books into list of titles
        List<String> bookTitle = books.stream().map(book -> book.title.toUpperCase()).collect(Collectors.toList());
        System.out.println("==========Collecting Books of title in list =========");
        bookTitle.forEach(System.out::println);

        // Grouping Books by category
        // Does not understood 
        Map<String,List<Book3>> bycategory = books.stream().collect(Collectors.groupingBy(booksCategory));
        bycategory.forEach((category,listofbooks) -> listofbooks.forEach(System.out::println));
    }
    public static Function<Book3,String> booksCategory = book -> book.getCategory();
}
