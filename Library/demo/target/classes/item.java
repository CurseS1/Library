public class item {
    private int id;
    private String type;
    private String title;
    private String author;
    private int year;
    private String publisher;

   public Item() {
        // Constructor kosong
    }

    public Item(int id, String type, String title, String author, int year, String publisher) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
