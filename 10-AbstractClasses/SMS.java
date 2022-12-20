public class SMS extends Message{
    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public SMS(String text, String number) {
        super(text);
        this.number = number;
    }

    @Override
    public String send(){
        return "The SMS has been sent";
    }
}
