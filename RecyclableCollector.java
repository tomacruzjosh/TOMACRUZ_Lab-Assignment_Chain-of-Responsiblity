class RecyclableCollector extends WasteCollector {
    @Override
    protected boolean canHandle(WasteContainer container) {
        return container.getType() == WasteType.RECYCLABLE;
    }

    @Override
    protected void process(WasteContainer container) {
        System.out.println("Recyclable Collector: Sorting and processing " + container.getCapacity() + "L of recyclable materials.");
    }
}