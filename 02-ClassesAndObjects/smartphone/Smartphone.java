public class Smartphone{
    boolean isOn;
    String model;
    String color;
    String os;
    String dateOfProduction;

    public void turnOn(){
        isOn = !isOn;
    }

    public void listInfo(){
        System.out.println("Model: " + model + "\n"
        + "Color: " + color
        + "\n" + "Operating System: " + os);
    }

    public void listDateOfProduction(){
        System.out.println("Date of production: " + dateOfProduction);
    }


}
