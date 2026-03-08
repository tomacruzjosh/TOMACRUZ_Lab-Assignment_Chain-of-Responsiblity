class OrganicCollector extends WasteCollector {
    @Override
    protected boolean canHandle(WasteContainer container) {
        return container.getType() == WasteType.ORGANIC;
    }

    @Override
    protected void process(WasteContainer container) {
        System.out.println("Organic Collector: Disposing " + container.getCapacity() + "L of organic waste into the compost bin.");
    }
}