class Product {
    String brand;
    int seriesNumber;
    double price;

    public Product() {}

    public Product(String brand, int seriesNumber, double price) {
        this.brand = brand;
        this.seriesNumber = seriesNumber;
        this.price = price;
    }    

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSeriesNumber() {
        return seriesNumber;
    }

    public void setSeriesNumber(int seriesNumber) {
        this.seriesNumber = seriesNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayInfo() { 
        System.out.println("Brand: " + getBrand());
        System.out.println("Serial Number: " + getSeriesNumber());
        System.out.println("Price: $" + getPrice());
    }
}