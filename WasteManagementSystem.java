public class WasteManagementSystem {
    public static void main(String[] args) {
        // Initialize Handlers
        WasteCollector organic = new OrganicCollector();
        WasteCollector recyclable = new RecyclableCollector();
        WasteCollector hazardous = new HazardousCollector();

        // Create the Chain: Organic -> Recyclable -> Hazardous
        organic.setNextCollector(recyclable);
        recyclable.setNextCollector(hazardous);

        // Simulate various waste containers needing disposal
        WasteContainer[] containers = {
            new WasteContainer(WasteType.ORGANIC, 50),
            new WasteContainer(WasteType.RECYCLABLE, 120),
            new WasteContainer(WasteType.HAZARDOUS, 15),
            new WasteContainer(WasteType.ORGANIC, 30)
        };

        System.out.println("--- Starting Automated Waste Collection Process ---");
        for (WasteContainer container : containers) {
            organic.collect(container);
        }
    }
}