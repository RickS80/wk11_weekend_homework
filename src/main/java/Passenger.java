import java.util.ArrayList;

public class Passenger {

    private String name;
    private int luggage;
    public ArrayList<Booking> bookings;

    public Passenger(String name, int luggage){
        this.name = name;
        this.luggage = luggage;
        this.bookings = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getLuggage(){
        return this.luggage;
    }

    public int getBookings(){
        return this.bookings.size();
    }

    public void addBooking(Booking booking){

        this.bookings.add(booking);
    }




}
