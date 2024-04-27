class SiberianHusky extends Anjing {
    public SiberianHusky(Integer position, Integer averageLength) {
        super(position,  averageLength);
    }

    public void move() {
        position += 2;
        System.out.println("Siberian Husky berpindah ke garis "+ position);
    }

    public void describe() {
        System.out.println("Siberian Husky itu seperti atlet lari marathon, mereka senang berlari jauh dan cepat, bahkan jika itu hanya untuk mengambil tong sampah Anda.");
    }
}