enum WasteType {
    ORGANIC, RECYCLABLE, HAZARDOUS
}


class WasteContainer {
    private WasteType type;
    private int capacity; // in liters

    public WasteContainer(WasteType type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public WasteType getType() { return type; }
    public int getCapacity() { return capacity; }
}