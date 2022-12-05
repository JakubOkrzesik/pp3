public class Computer{
    private String operatingSystemType;
    private String caseColor;
    private boolean isON;
    private Processor processor = new Processor();
    
    
    public Computer(String caseColor, boolean isON, String operatingSystemType, Processor processor){
        setCaseColor(caseColor);
        setON(isON);
        setOperatingSystemType(operatingSystemType);
        this.processor = processor;
    }


    public String getOperatingSystemType() {
        return operatingSystemType;
    }
    public String getCaseColor() {
        return caseColor;
    }
    public boolean isON() {
        return isON;
    }
    public void setOperatingSystemType(String operatingSystemType) {
        this.operatingSystemType = operatingSystemType;
    }
    public void setCaseColor(String caseColor) {
        this.caseColor = caseColor;
    }
    public void setON(boolean isON) {
        this.isON = isON;
    }

    public void turnON(){
        setON(true);
    }

    public void turnOff(){
        setON(false);
    }

    public String toString(){
        return "Operating system: " + operatingSystemType + "\n" + processor;
    }

    public static void main(String[] args){
        Computer c1 = new Computer(null, false, "Windows", new Processor("bruh", 3.5, 3, "1511"));
        System.out.println(c1);
    }

}
