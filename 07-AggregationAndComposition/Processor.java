public class Processor{
    
    private String name;
    private double timing;
    private int coreNumber;
    private String socket;
    
    
    
    public Processor(String name, double timing, int coreNumber, String socket) {
        this.name = name;
        this.timing = timing;
        this.coreNumber = coreNumber;
        this.socket = socket;
    }
    
    public String getName() {
        return name;
    }
    public double getTiming() {
        return timing;
    }
    public int getCoreNumber() {
        return coreNumber;
    }
    public String getSocket() {
        return socket;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTiming(double timing) {
        this.timing = timing;
    }
    public void setCoreNumber(int coreNumber) {
        this.coreNumber = coreNumber;
    }
    public void setSocket(String socket) {
        this.socket = socket;
    } 
}
