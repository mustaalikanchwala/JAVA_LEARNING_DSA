public class Book3 {
    String title;
    double OGprice;
    int publishYear;
    double discountPrice;
    String category;

    public Book3(String title, double oGprice, int publishYear, double discountPrice, String category) {
        this.title = title;
        OGprice = oGprice;
        this.publishYear = publishYear;
        this.discountPrice = discountPrice;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getOGprice() {
        return OGprice;
    }

    public void setOGprice(double oGprice) {
        OGprice = oGprice;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book3 [title=" + title + ", OGprice=" + OGprice + ", publishYear=" + publishYear + ", discountPrice="
                + discountPrice + ", category=" + category + "]";
    }

}