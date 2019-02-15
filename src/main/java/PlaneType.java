public enum PlaneType {
    BOEING747(400),
    BOEING777(300),
    BOEING737(150),
    AIRBUSA380(500),
    AIRBUSA350(250),
    AIRBUSA220(100);

    private final int value;

    PlaneType(int value){
        this.value = value;
    }

    public int getValueFromEnum(){
        return this.value;
    }
}
