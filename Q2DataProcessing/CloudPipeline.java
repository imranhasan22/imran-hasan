class CloudPipeline extends DataProcessingPipeline {
    @Override
    protected boolean connect(String URL) {
        boolean connected = false;
        System.out.println("Connecting to cloud...");
        connected = true;
        return connected;
    }
    @Override
    protected boolean transformData() {
        boolean transformed = false;
        System.out.println("Transforming data for cloud...");
     
        transformed = true;
        return transformed;
    }
    @Override
    protected boolean storeData() {
        boolean stored = false;
        System.out.println("Storing data in cloud...");
        stored = true;
        return stored;
    }
}