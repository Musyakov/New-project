package HW12;

public class Book {
    private String name;
    private Author Author;
    private int publicationYear;

    public Book(String name, Author Author, int publicationYear) {
        this.name = name;
        this.Author = Author;
        this.publicationYear = publicationYear;
    }
    public String getName() {
        return this.name;
    }
    public HW12.Author getAuthor() {
        return this.Author;
    }
    public int getPublicationYear() {
        return this.publicationYear;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
