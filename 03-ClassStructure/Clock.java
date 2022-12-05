public class Clock {
    String hour;
    String minute;
    String alarmMinute;
    String alarmHour;

    Clock(){
        this.hour = "00";
        this.minute = "00";
    }

    Clock(String hour, String minute){
        this.hour = hour;
        this.minute = minute;
    }

    public void setClock(){
        this.hour = "00";
        this.minute = "00";

    }

    public void setClock(String hour,String minute){
        this.hour = hour;
        this.minute = minute;
        
        if(this.hour==this.alarmHour&&this.minute==this.alarmMinute){
            System.out.println(getAlarm());
        }
    
    }
    
    public void addOneMinute(){
        this.minute = this.minute + 1;

        if(this.hour==this.alarmHour&&this.minute==this.alarmMinute){
            System.out.println(getAlarm());
        }
    }

    public String toString(){
        return this.hour + ":" + this.minute;
    }

    public void setAlarm(String hour, String minute){
        this.alarmHour = hour;
        this.alarmMinute = minute;
        
        if(this.hour==this.alarmHour&&this.minute==this.alarmMinute){
            System.out.println(getAlarm());
        }
    }

    public String getAlarm(){
        return "beep-beep-beep-beep !!";
    }

    public static void main(String args[]){
        Clock clock1 = new Clock("12","37");
        System.out.println(clock1);
        clock1.setAlarm("12", "37");
        clock1.setClock("13","45");
        clock1.setAlarm("13","45");
    }


}
