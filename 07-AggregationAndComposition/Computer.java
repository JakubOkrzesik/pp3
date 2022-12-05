public class Computer{
    private String operatingSystemType;
    private String caseColor;
    private boolean isON;
    private Processor processor;
    
    
    public Computer(String caseeColor, boolean isON, String operatingSystemType){
        setCaseColor(caseColor);
        setON(isON);
        setOperatingSystemType(operatingSystemType);
        this.processor = new Processor("macbook", 3.56, 5, "1511");
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

}
