public class Smartphone implements Bergerak {
    private int price;
    private String brand;

    public Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    public void move() {
        System.out.println("Smartphone berpindah");
    }
}