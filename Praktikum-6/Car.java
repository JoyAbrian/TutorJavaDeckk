public class Car implements Bergerak {
    private int totalForwardGear;
    private String color;
    private int maxSpeed;

    public Car(int totalForwardGear, String color, int maxSpeed) {
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void move() {
        System.out.println("Mobil sedang berakselerasi");
    }
}