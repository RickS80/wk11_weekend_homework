public class Booking {

    private String name;
    private int flightNumber;
    private String destination;
    private int luggageAllowance;


    public Booking(String name, int flightNumber, String destination, int luggageAllowance){
        this.name = name;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.luggageAllowance = luggageAllowance;
    }

    public String getBookingName(){
        return this.name;
    }

    public int getBookingFlightNumber(){
        return this.flightNumber;
    }

    public String getBookingDestination(){
        return this.destination;
    }

    public int getBookingLuggageAllowance(){
        return this.luggageAllowance;
    }
}
