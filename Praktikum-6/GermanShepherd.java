class GermanShepherd extends Anjing {
    public GermanShepherd(Integer position, Integer averageLength) {
        super(position,  averageLength);
    }

    public void move() {
        position += 2;
        System.out.println("German Shepherd berpindah ke garis + "+ position);
    }

    public void describe() {
        System.out.println("German Shepherd itu seperti supermodel, selalu tampil elegan dan menawan tetapi mereka juga memiliki sisi pelindung yang kuat.");
    }
}