import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println(" ==== BANGUN RUANG ==== ");
        System.out.println("1. KUBUS");
        System.out.println("2. BALOK");
        System.out.println("3. BOLA");
        System.out.println("4. TABUNG\n\n");
        System.out.println(" ==== BANGUN DATAR ==== ");
        System.out.println("5. PERSEGI");
        System.out.println("6. PERSEGI PANJANG");
        System.out.println("7. LINGKARAN");
        System.out.println("8. SEGITIGA");
        System.out.println("9. TRAPESIUM");

        System.out.print("> ");
        int pilih = inp.nextInt();
        System.out.println(" ====================== ");
        if (pilih == 1) {
            Kubus kubus = new Kubus();
            System.out.print("Masukkan panjang sisi : ");
            Double angka = inp.nextDouble();
            kubus.setSisi(angka);

            System.out.println("Luas Permukaan : " + kubus.hitungLuas());
            System.out.println("Volume         : " + kubus.hitungVolume());

        } else if (pilih == 2) {
            Balok balok = new Balok();
            System.out.print("Masukkan panjang balok : ");
            Double angka1 = inp.nextDouble();
            balok.setPanjang(angka1);

            System.out.print("Masukkan lebar balok  : ");
            Double angka2 = inp.nextDouble();
            balok.setLebar(angka2);

            System.out.print("Masukkan tinggi balok : ");
            Double angka3 = inp.nextDouble();
            balok.setTinggi(angka3);

            System.out.println("Luas Permukaan : " + balok.hitungLuas());
            System.out.println("Volume         : " + balok.hitungVolume());

        } else if (pilih == 3) {
            Bola bola = new Bola();
            System.out.print("Masukkan jari-jari bola : ");
            Double angka = inp.nextDouble();
            bola.setJari(angka);

            System.out.println("Luas Permukaan : " + bola.hitungLuas());
            System.out.println("Volume         : " + bola.hitungVolume());

        } else if (pilih == 4) {
            Tabung tabung = new Tabung();
            System.out.print("Masukkan jari-jari tabung : ");
            Double angka1 = inp.nextDouble();
            tabung.setJari(angka1);

            System.out.print("Masukkan tinggi tabung : ");
            Double angka2 = inp.nextDouble();
            tabung.setTinggi(angka2);

            System.out.println("Luas Permukaan : " + tabung.hitungLuas());
            System.out.println("Volume         : " + tabung.hitungVolume());

        } else if (pilih == 5) {
            Persegi persegi = new Persegi();
            System.out.print("Masukkan panjang sisi : ");
            Double angka = inp.nextDouble();
            persegi.setSisi(angka);

            System.out.println("Keliling : " + persegi.hitungKeliling());
            System.out.println("Luas     : " + persegi.hitungLuas());

        } else if (pilih == 6) {
            PersegiPanjang persegiPanjang = new PersegiPanjang();
            System.out.print("Masukkan panjang : ");
            Double angka1 = inp.nextDouble();
            persegiPanjang.setPanjang(angka1);

            System.out.print("Masukkan lebar : ");
            Double angka2 = inp.nextDouble();
            persegiPanjang.setLebar(angka2);

            System.out.println("Keliling : " + persegiPanjang.hitungKeliling());
            System.out.println("Luas     : " + persegiPanjang.hitungLuas());

        } else if (pilih == 7) {
            Lingkaran lingkaran = new Lingkaran();
            System.out.print("Masukkan jari-jari : ");
            Double angka = inp.nextDouble();
            lingkaran.setJari(angka);

            System.out.println("Keliling : " + lingkaran.hitungKeliling());
            System.out.println("Luas     : " + lingkaran.hitungLuas());

        } else if (pilih == 8) {
            Segitiga segitiga = new Segitiga();
            System.out.print("Masukkan alas : ");
            Double angka1 = inp.nextDouble();
            segitiga.setAlas(angka1);

            System.out.print("Masukkan sisi kiri : ");
            Double angka2 = inp.nextDouble();
            segitiga.setSisikiri(angka2);

            System.out.print("Masukkan sisi kanan : ");
            Double angka3 = inp.nextDouble();
            segitiga.setSisikanan(angka3);

            System.out.print("Masukkan tinggi : ");
            Double angka4 = inp.nextDouble();
            segitiga.setTinggi(angka4);

            System.out.println("Keliling : " + segitiga.hitungKeliling());
            System.out.println("Luas     : " + segitiga.hitungLuas());

        } else if (pilih == 9) {
            Trapesium trapesium = new Trapesium();
            System.out.print("Masukkan alas : ");
            Double angka1 = inp.nextDouble();
            trapesium.setAlas(angka1);

            System.out.print("Masukkan sisi miring : ");
            Double angka2 = inp.nextDouble();
            trapesium.setSisimiring(angka2);

            System.out.print("Masukkan atas : ");
            Double angka3 = inp.nextDouble();
            trapesium.setAtas(angka3);

            System.out.print("Masukkan tinggi : ");
            Double angka4 = inp.nextDouble();
            trapesium.setTinggi(angka4);

            System.out.println("Keliling : " + trapesium.hitungKeliling());
            System.out.println("Luas     : " + trapesium.hitungLuas());

        } else {
            System.out.println("Pilih Apa Kau Cok!!");
        }

        inp.close();
    }
}