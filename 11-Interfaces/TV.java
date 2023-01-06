public class TV implements CanOnOff, CanChangeChannel, CanChangeVolume{
    private boolean tvStatus;
    private final String name;
    private int channel;
    private int volume;

    public TV(final String name) {
        this.name = name;
    }

    @Override
    public void setChannel(int channelNum){
        if(channel>=1 || channel<=99){
            channel = channelNum;
        }
        else{
            throw new IllegalArgumentException("Channel out of range");
        }
    }

    @Override
    public boolean setOff() {
        tvStatus=false;
        return tvStatus;
    }

    @Override
    public boolean setOn() {
        tvStatus=true;
        channel=1;
        return tvStatus;
    }

    @Override
    public void changeOneUp(){
        setChannel(this.channel+1);;
    }


    @Override
    public void changeOneDown(){
        setChannel(this.channel-1);;
    }

    @Override
    public void setVolume(int volume){
        if(tvStatus || volume>=1 || volume<=10){
            this.volume = volume;
        }
        else{
            throw new IllegalArgumentException("Volume out of range or Tv is off");
        }
    }

    @Override
    public void changeUpVolume(){
        setVolume(volume+1);
    }

    @Override
    public void changeDownVolume(){
        setVolume(volume-1);
    }
    
    
    public String displayStatus() {
        return "Name: " + name + "\n" + "isOn: " + tvStatus + "\n" + "Channel number: " + channel;
    }

    public static void main(final String args[]){
        final TV mytv = new TV("LG");
        mytv.setOn();
        System.out.println(mytv.displayStatus());
        mytv.changeOneUp();
        mytv.setChannel(7);
        mytv.setChannel(142);
        System.out.println(mytv.displayStatus());
        mytv.changeOneDown();

    }
}
