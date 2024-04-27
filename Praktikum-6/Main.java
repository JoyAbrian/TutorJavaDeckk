class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone(799, "iFruit");
        Car car = new Car(5, "Silver", 180);
        SiberianHusky siberianHusky = new SiberianHusky(8, 60);

        System.out.println("Class Smartphone");
        smartphone.move();
        System.out.println("=".repeat(20));
        System.out.println("Class Car");
        car.move();
        System.out.println("=".repeat(20));
        System.out.println("CLass Siberian Husky");
        siberianHusky.move();
        siberianHusky.describe();
    }
}