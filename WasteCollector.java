abstract class WasteCollector {
    protected WasteCollector nextCollector;

    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    public void collect(WasteContainer container) {
        if (canHandle(container)) {
            process(container);
        } else if (nextCollector != null) {
            nextCollector.collect(container);
        } else {
            System.out.println("Error: No collector found for " + container.getType() + " waste.");
        }
    }

    // Template methods for subclasses
    protected abstract boolean canHandle(WasteContainer container);
    protected abstract void process(WasteContainer container);
}