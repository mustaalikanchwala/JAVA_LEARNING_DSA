import java.util.Objects;

public class Book1 {
    String name;
    int publishYear;
    double price;
    String title;

    public Book1(String name, int publishYear, double price, String title) {
        this.name = name;
        this.publishYear = publishYear;
        this.price = price;
        this.title = title;
    }
     @Override
    public boolean equals(Object obj) {
        if(this == obj ) return true;
        if( obj == null || getClass() != obj.getClass()) return false;
         Book1 book = (Book1) obj;
        return publishYear == book.publishYear &&
               Double.compare(book.price, price) == 0 &&
               Objects.equals(name, book.name) &&
               Objects.equals(title, book.title);
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }
     @Override
    public String toString() {
        return "Book [name=" + name + ", publishYear=" + publishYear + ", price=" + price + ", title=" + title + "]";
    }
}
