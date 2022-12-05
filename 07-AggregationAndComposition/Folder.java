import java.util.ArrayList;

public class Folder {
    private String name;
    private ArrayList<File> folders = new ArrayList<File>();
    
    
    
    public Folder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addFile(File file){
        folders.add(file);
    }

    public String toString(){
        return "Folder name: " + name + "\n" + "Number of files: " + folders.size() + "\n" + 
        "Contents: " + folders.toString();
    }


    public static void main(String args[]){
        Folder newFolder1 = new Folder("Myfolder");
        newFolder1.addFile(new File("Myfile.txt", 45));
        System.out.print(newFolder1);
        newFolder1.addFile(new File("Myfile2.txt", 70));
        System.out.print(newFolder1);
    }
}
