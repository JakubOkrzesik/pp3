public class Email extends Message{
    private String subject;
    private String address;
    
    
    
    public Email(String text, String subject, String address) {
        super(text);
        this.subject = subject;
        this.address = address;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String send() {
        return "The email has been sent";
    }

    
}
