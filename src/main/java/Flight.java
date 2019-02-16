import java.util.ArrayList;

public class Flight {

    private Plane plane;
    private int flightNumber;
    private ArrayList<Passenger> checkedInPassengers;
    private ArrayList<Booking> flightbookings;
    private Route destination;

    public Flight(Plane plane, int flightNumber, Route destination) {
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.checkedInPassengers = new ArrayList<>();
        this.flightbookings = new ArrayList<>();

    }

    public PlaneType getFlightAircraftType() {
        return this.plane.getPlaneType();
    }


    public int getFlightAircraftRange() {
        return this.plane.getRange();
    }

    public int getFlightRange() {
        return this.destination.getDistance();
    }

    public String getFlightDestination() {
        return this.destination.getDestination();
    }

    public void addBookingToFlight(Booking booking){
        this.flightbookings.add(booking);
    }

    public int getFlightPassengerCount() {
        return this.checkedInPassengers.size();
    }

    public int getFlightNumber() {
        return this.flightNumber;
    }

    public boolean checkAircraftMeetsRange() {
        if (this.getFlightAircraftRange() > this.getFlightRange()) {
            return true;
        } else {
            return false;
        }
    }


    public boolean verifyPassenger(Passenger passenger) {
        ArrayList<Passenger> verifiedPassenger = new ArrayList<>();

            for (Booking individualBooking : passenger.bookings) {
                if (individualBooking.getBookingFlightNumber() == this.flightNumber) {
                    verifiedPassenger.add(passenger);
                }
            }

        if (verifiedPassenger.size() >= 1) {
            return true;
        } else {
            return false;
        }
    }

    public void checkInPassenger(Passenger passenger) {
        if (this.verifyPassenger(passenger) == true ) {
            this.checkedInPassengers.add(passenger);
        }
    }

    public int checkFlightBookings() {
        return this.flightbookings.size();
    }

    public int checkRemainingSeatsAvailable(){
        return this.getFlightAircraftType().getCapacityFromEnum() - this.checkFlightBookings();
    }




}





