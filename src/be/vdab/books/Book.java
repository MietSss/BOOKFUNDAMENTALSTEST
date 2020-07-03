package be.vdab.books;

public class Book extends Author {
    private String nameBook;
    private String author;
    private double price;
    private int qty = 0;

    public Book(String nameBook, String author, double price, int qty) {
        this.nameBook = nameBook;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    @Override
    public String getNameAuthor() {
        return nameBook;
    }

    @Override
    public void setNameAuthor(String nameAuthor) {
        this.nameBook = nameAuthor;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + nameBook + '\'' +


                ", author='" + author.toString() + '\'' +



                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
