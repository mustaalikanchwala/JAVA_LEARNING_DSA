
public class Book {
    String title;
    double OGprice;
    int publishYear;
    double discountPrice;

    public Book(String title, double oGprice, int publishYear, double discountPrice) {
        this.title = title;
        this.OGprice = oGprice;
        this.publishYear = publishYear;
        this.discountPrice = discountPrice;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", OGprice=" + OGprice + ", publishYear=" + publishYear + ", discountPrice="
                + discountPrice + "]";
    }

}
