public class Books {
    String title;
    String author;
    int pageNum;
    boolean isOpen=false;

    public void displayInfo(){
        
        if (isOpen==true){
            System.out.println("Title: " + title + "\n" + "Author: " + author
        + "\n" + "Page number: " + pageNum + "\n" + "The book is open");
        } else{
            System.out.println("The book is closed - open it to display its information");
        }
 
    }

    public void interactBook(){
        isOpen = !isOpen;
    }

    
    public static void main(String args[]){
        Books myBook = new Books();
        myBook.title = "Harry Potter";
        myBook.author = "Belmondo";
        myBook.pageNum = 196;
        myBook.displayInfo();
        myBook.interactBook();
        myBook.displayInfo();
    }
}



