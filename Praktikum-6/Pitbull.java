class Pitbull extends Anjing {
    public Pitbull(Integer position, Integer averageLength) {
        super(position,  averageLength);
    }

    public void move() {
        position += 3;
        System.out.println("Pitbull berpindah ke garis "+ position);
    }

    public void describe() {
        System.out.println("Anjing Pitbull itu seperti Donatello, terlihat menakutkan tetapi sebenarnya mereka penuh kasih sayang.");
    }
}
