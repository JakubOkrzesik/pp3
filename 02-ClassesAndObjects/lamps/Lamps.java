public class Lamps {
    boolean isOn=false;

    public void pressSwitch(){
        isOn=!isOn;
    }
    public void displayInfo(){
        if(isOn==true){
            System.out.println("The lamp is on");
        }
        else{
            System.out.println("The lamp is off");
        }
    }

    public static void main(String args[]){
        Lamps mylamp1 = new Lamps();
        mylamp1.displayInfo();
        mylamp1.pressSwitch();
        mylamp1.displayInfo();
    }

}

