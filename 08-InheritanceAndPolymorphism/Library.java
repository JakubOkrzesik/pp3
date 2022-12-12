public class Library {
    private Book[] lib1;

    public Library(Book[] books){
        this.lib1 = books;
    }

    public void display(){
        for(Book book:lib1){
            System.out.println(book.display());
        }
    }


    public static void main(String args[]){
        Book[] mylib = {new Audiobook("Adams Family", "Ridley Scott", 40, 5), new Ebook("Cronicles of Narnia", "Quentin Tarantino", "Cronicles of Narnia.epub"), new Book("Slimewire", "A.A Milne")};

        Library mylib1 = new Library(mylib);
        mylib1.display();
    }
}
