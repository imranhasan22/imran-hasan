public class DataProcessing {
    public static void main(String[] args) {
        DataProcessingPipeline dbPipeline = new DatabasePipeline();
        DataProcessingPipeline cldPipeline = new CloudPipeline();
        dbPipeline.processData("A random URL");
        cldPipeline.processData("A random URL");
    }
}