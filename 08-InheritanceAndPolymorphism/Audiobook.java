public class Audiobook extends Book{
    private int minutes;
    private int seconds;

    public Audiobook(String name, String author, int minutes, int seconds){
        super(name,author);
        this.minutes = minutes;
        this.seconds = seconds;
    }


    public String display(){
        return "Book name: " + getName() + "Author: " + getAuthor() + "Timespan: " + minutes + ":" + seconds;
    }

}
