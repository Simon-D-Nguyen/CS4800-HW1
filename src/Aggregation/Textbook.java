/*
Textbook.java
 */
package Aggregation;

public class Textbook {
    private String author;
    private String title;
    private String publisher;

    public Textbook(){
        this.author = "n/a";
        this.title = "n/a";
        this.publisher = "n/a";
    }


    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }
}