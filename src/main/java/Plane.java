public class Plane {

    private PlaneType plane;
    private int baggageCapacity;
    private int range;

    public Plane(PlaneType plane, int baggageCapacity, int range){
        this.plane = plane;
        this.baggageCapacity = baggageCapacity;
        this.range = range;
    }

    public PlaneType getPlaneType(){
        return this.plane;
    }

    public int getPlaneCapacity(){
        return this.plane.getValueFromEnum();
    }

    public int getBaggageCapacity(){
        return this.baggageCapacity;
    }

    public int getRange(){
        return this.range;
    }

}
