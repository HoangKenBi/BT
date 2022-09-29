package BTVNB10;

public class News implements INews{
    int id;
    String title;
    String publishDate;
    String author;
    String content;
    float averageRate;



    // Câu A
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    // Câu C
    @Override
    public void Display() {
        System.out.println("Title: "+title);
        System.out.println("Publish date: "+publishDate);
        System.out.println("Author: "+author);
        System.out.println("content: "+content);
        System.out.println("Average rate: "+averageRate);
    }
    // Câu D
    int[] RateLish = new int[3];
}
