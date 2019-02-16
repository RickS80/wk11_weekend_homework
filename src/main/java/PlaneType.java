public enum PlaneType {
    BOEING747(400, 5000),
    BOEING777(300, 4000),
    BOEING737(150,2000),
    AIRBUSA380(500, 8000),
    AIRBUSA350(250,4000),
    AIRBUSA220(100,2000);

    private final int capacity;
    private final int range;

    PlaneType(int capacity, int range){
        this.capacity = capacity;
        this.range = range;
    }

    public int getCapacityFromEnum(){
        return this.capacity;
    }

    public int getRangeFromEnum(){
        return this.range;
    }
}
