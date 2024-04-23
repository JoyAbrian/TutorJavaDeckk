public class Laptop extends Product {
    int ramSize;
    String processType;

    public Laptop(String brand, int seriesNumber, double price, int ramSize, String processType) {
        super(brand, seriesNumber, price);
        this.ramSize = ramSize;
        this.processType = processType;
    }
    
    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public String getProcessType() {
        return processType;
    }

    public void setProcessType(String processType) {
        this.processType = processType;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Processor Type: " + getProcessType());
        System.out.println("RAM Size: " + getRamSize() + "GB\n");
    }
}