
/**
 * Write a description of class CinemaTicket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CinemaTicket
{
    // instance variables - replace the example below with your own
    static String cinemaName = "Cinema City";
    String filmTitle;
    int row;
    int seat;
    
    public void displayInfo(){
        double price;
        if (row>2){
            price = 25.00;
        }
        else{
            price = 10.00;
        }
        
        
        System.out.println("Title: " + filmTitle + "\n" + "Cinema Name: " + cinemaName + "\n" + 
        "Row: " + row + "\n" + "Seat: " + seat + "\n" + "Price: " + price);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main(String args[]){
        CinemaTicket ticket1 = new CinemaTicket("Imbiamba Jombes", 3,20);
        ticket1.displayInfo();
        CinemaTicket ticket2 = new CinemaTicket("Siema Eniu", 1,4);
        ticket2.displayInfo();
    }

    public CinemaTicket(String film,int r,int s){
        filmTitle = film;
        row = r;
        seat = s;
    }

}
