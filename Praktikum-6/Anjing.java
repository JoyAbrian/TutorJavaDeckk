abstract class Anjing implements Bergerak {
    protected int position;
    protected int averageLength;

    public Anjing(Integer position, Integer averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }

    abstract void describe();
}