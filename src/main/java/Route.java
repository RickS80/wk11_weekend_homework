public class Route {

    private String destination;
    private int distanceFromHub;

    public Route(String destination, int distanceFromHub){
        this.destination = destination;
        this.distanceFromHub = distanceFromHub;
    }

    public String getDestination(){
        return this.destination;
    }

    public int getDistance(){
        return this.distanceFromHub;
    }


    }

