public enum Plane {

    BOEING_737_800(189, 80000),
    AIRBUS_A_380(500, 290000),
    BOEING_777(388, 26980);

    private final int capacity;

    private final int totalWeight;


    Plane(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }


}
