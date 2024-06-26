class Alamat {
    String jalan;
    String kota;

    public String getJalan() {
        return jalan;
    }
    public void setJalan(String jalan) {
        this.jalan = jalan;
    }
    public String getKota() {
        return kota;
    }
    public void setKota(String kota) {
        this.kota = kota;
    }
}

class Mahasiswa {
    Alamat alamat; 
    String nama;
    String nim;

    public String getAlamat() {
        if (alamat != null) {
            return alamat.getJalan() + ", " + alamat.getKota();
        } else {
            return "Alamat not set";
        }
    }

    public void setAlamat(Alamat alamat) {
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
}

public class T4 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Tamalanrea Indah";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Farhan";
        mahasiswa.nim = "H071231025";

        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("Nim: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat());
    }
}