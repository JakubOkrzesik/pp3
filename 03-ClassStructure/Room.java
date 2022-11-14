public class Room
{

    String number;
    String beds;
    Boolean occupied;
    String guestName;

    public Room(String number){
        this.number = number;
    }

    public Room(String number, String beds){
        this.number = number;
        this.beds = beds;
    }

    public void checkIn(String guestName){
        this.guestName = guestName;
        this.occupied = true;
    }

    public void checkOut(){
        this.guestName = "";
        this.occupied = false;
    }

    public String isOccupied(){
        if (occupied!=false){
            return "The room is occupied";
        }
        else{
            return "The room is not occupied";
        }
    }

    public String toString(){
        return "Room number: " + number + "\n" + "Beds: " + beds
        + "\n" + isOccupied() + "Guest name: " + guestName;
    }
    
    public static void main(String args[]){
        Room[] rooms = new Room[3];
        Room room1 = new Room("123", "2");
        Room room2 = new Room("124", "1");
        Room room3 = new Room("169", "5");
        room1.checkIn("John Doe");
        room2.checkIn("Baby Tron");
        room3.checkIn("Max Kowalski");
        rooms[0] = room1;
        rooms[1] = room2;
        rooms[2] = room3;
    
        for(int i=0; i<rooms.length; i++){
            System.out.println(rooms[i]);
        }
    }

}