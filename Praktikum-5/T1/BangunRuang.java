abstract class BangunRuang {
    abstract double hitungLuas();
    abstract double hitungVolume();
}

class Kubus extends BangunRuang {
    double sisi;

    public Kubus() {}

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double hitungLuas() {
        return 6 * sisi * sisi;
    }

    @Override
    double hitungVolume() {
        return sisi * sisi * sisi;
    }
}

class Balok extends BangunRuang {
    double panjang;
    double lebar;
    double tinggi;

    public Balok() {}

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    double hitungLuas() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi)) ;
    }

    @Override
    double hitungVolume() {
        return panjang * lebar * tinggi;
    }
}

class Bola extends BangunRuang {
    double jari;

    public Bola() {}

    public void setJari(double jari) {
        this.jari = jari;
    }

    @Override
    double hitungLuas() {
        return 4 * Math.PI * jari * jari;
    }

    @Override
    double hitungVolume() {
        return 4/3 * Math.PI * jari * jari * jari;
    }
}

class Tabung extends BangunRuang {
    double jari;
    double tinggi;

    public Tabung() {}

    public void setJari(double jari) {
        this.jari = jari;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    double hitungLuas() {
        return 2 * Math.PI * jari * (jari + tinggi);
    }

    @Override
    double hitungVolume() {
        return Math.PI * jari * jari * tinggi;
    }
}