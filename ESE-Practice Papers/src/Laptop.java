public class Laptop{

    private String modelName;
    private double screenSize;
    private int RAM;
    private int diskSize;
    private Boolean hasSSD;
    private double cost; 

    public String getModelName() {
        return modelName;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public int getRAM() {
        return RAM;
    }

    public int getDiskSize() {
        return diskSize;
    }

    public Boolean getHasSSD() {
        return hasSSD;
    }

    public double getCost() {
        return cost;
    }

    public Laptop(String modelName, double screenSize, int rAM, int diskSize, Boolean hasSSD, double cost) {
        this.modelName = modelName;
        this.screenSize = screenSize;
        RAM = rAM;
        this.diskSize = diskSize;
        this.hasSSD = hasSSD;
        this.cost = cost;
    }

    public String toString() {
        return String.format(
                "\n\nLaptop Model Name: %s\nLaptop Screen Size: %.2f\nLaptop Ram: %d\nLaptop Disk Size: %d\nDoes Laptop have SSD: %s\nLaptop Cost: Rs %.2f",
                this.modelName,
                this.screenSize,
                this.RAM,
                this.diskSize,
                this.hasSSD ? "Yes" : "No",
                this.cost);
    }

}
