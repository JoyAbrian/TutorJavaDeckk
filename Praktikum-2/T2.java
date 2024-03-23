class Toko {
    int id;
    String nama;
    int stok;
    float harga;

    public Toko(int id, String nama, int stok, float harga) {
        this.id = id;
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getStok() {
        return stok;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }
    public float getHarga() {
        return harga;
    }
    public void setHarga(float harga) {
        this.harga = harga;
    }

    public boolean canBuy() {
        if (this.getStok() == 0) {
            return false;
        } else {
            return true;
        }
    }
}
