public class Ebook extends Book{
    private String filename;

    public Ebook(String name, String author, String filename){
        super(name,author);
        this.filename = filename;
    }

    public String display(){
        return "Book name: " + getName() + "Author: " + getAuthor() + "Filename: " + filename;
    }

}