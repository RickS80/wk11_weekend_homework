public class Plane {

    private PlaneType plane;
    private int baggageCapacity;
    private int cargoCapacity;
    private int range;

    public Plane(PlaneType plane, int baggageCapacity, int cargoCapacity, int range){
        this.plane = plane;
        this.baggageCapacity = baggageCapacity;
        this.cargoCapacity = cargoCapacity;
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

    public int getCargoCapacity(){
        return this.cargoCapacity;
    }

    public int getRange(){
        return this.range;
    }

}
