package aggregation;

public class TextBook {
    private String title;
    private String author;
    private String publisher;

    //Constructor
    public TextBook(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    //Copy constructor
    public TextBook(TextBook targetInstance) {
        this.title = targetInstance.title;
        this.author = targetInstance.author;
        this.publisher = targetInstance.publisher;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }


}
