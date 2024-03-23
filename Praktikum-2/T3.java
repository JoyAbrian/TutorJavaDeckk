class Cuboid {
    double height;
    double width;
    double length;

    double getVolume() {
        // Lengkapi
        return length * width * height;
    }
}

public class T3 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        // Lengkapi
        cuboid.height = 80;
        cuboid.length = 45;
        cuboid.width = 1.25;

        System.out.printf("Volume = %2.f", cuboid.getVolume());
    }
}