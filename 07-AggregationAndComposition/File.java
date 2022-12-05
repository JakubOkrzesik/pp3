public class File {
    private String name;
    private int size;
    
    
    
    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public File(){
    }

    public String getName() {
        return name;
    }
    
    public int getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "File [name=" + name + ", size=" + size + "]";
    }

}
