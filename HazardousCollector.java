class HazardousCollector extends WasteCollector {
    @Override
    protected boolean canHandle(WasteContainer container) {
        return container.getType() == WasteType.HAZARDOUS;
    }

    @Override
    protected void process(WasteContainer container) {
        System.out.println("Hazardous Collector: CAUTION! Handling " + container.getCapacity() + "L of hazardous waste using safety protocols.");
    }
}