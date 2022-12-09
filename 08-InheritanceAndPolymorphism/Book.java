public class Book{
    protected String name;
    protected String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String displayInfo(){
        return "Book name: " + name + " " + "Author: " + author;
    }
}
