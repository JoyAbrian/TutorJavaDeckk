class Bulldog extends Anjing {
    public Bulldog(Integer position, Integer averageLength) {
        super(position,  averageLength);
    }

    public void move() {
        position += 1;
        System.out.println("Bulldog berpindah ke garis "+ position);
    }

    public void describe() {
        System.out.println("Bulldog itu seperti kulkas berjalan, mereka mungkin terlihat pendek dan gemuk tetapi mereka memiliki hati yang besar dan selalu siap melindungi Anda.");
    }
}