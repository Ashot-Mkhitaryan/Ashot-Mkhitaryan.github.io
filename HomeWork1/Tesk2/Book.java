package HomeWork1.Tesk2;


import HomeWork1.Tesk1.Author;

public class Book  {
    private String isbn;
    private String name;
     Author author;
    private double proce;
    private int qty = 0;

    public Book(String isbn, String name, Author author, double proce) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.proce = proce;
    }

    public Book(String isbn, String name, Author author, double proce, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.proce = proce;
        this.qty = qty;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getProce() {
        return proce;
    }

    public void setProce(double proce) {
        this.proce = proce;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorName(){
        return getName();
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", name='" + name + '\'' +
                ", author=" + author +
                ", proce=" + proce +
                ", qty=" + qty +
                '}';
    }
}
