import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> productList = new ArrayList<>();
        productList.add(new Smartphone("Samsung", 123456, 899.99, 6.5, 0));
        productList.add(new Laptop("Dell", 987654, 1299.99, 16, "Intel Core i7"));
        productList.add(new Camera("Canon", 456789, 699.99, 24, "Telephoto"));

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Tampilkan Semua Produk");
            System.out.println("3. Beli Produk");
            System.out.println("4. Keluar");

            System.out.print(">>> Pilih menu (1-4): ");
            int choose = Integer.parseInt(sc.next());
            if (choose == 1) {
                System.out.print("Masukkan nama produk: "); String productName = sc.next();

                System.out.print("Masukkan nomor seri: "); 
                int seriesNumber = Integer.parseInt(sc.next());
                System.out.print("Masukkan harga: "); 
                double price = Double.parseDouble(sc.next());

                System.out.print("Pilih tipe produk : \n1. Smartphone \n2. Laptop \n3. Camera");
                System.out.print("Pilih tipe produk (1-3): "); 
                int type = Integer.parseInt(sc.next());

                if (type == 1) {
                    System.out.println("Masukkan ukuran layar (inci): "); 
                    double screenSize = Double.parseDouble(sc.next());

                    System.out.println("Masukkan kapasitas penyimpanan (GB): "); 
                    int storageCapacity = Integer.parseInt(sc.next());

                    productList.add(new Smartphone(productName, seriesNumber, price, screenSize, storageCapacity));
                } else if (type == 2) {
                    System.out.println("Masukkan tipe processor: "); 
                    String processType = sc.next();

                    System.out.println("Masukkan ukuran RAM: "); 
                    int ramSize = Integer.parseInt(sc.next());

                    productList.add(new Laptop(productName, seriesNumber, price, ramSize, processType));
                } else if (type == 3) {
                    System.out.println("Masukkan resolusi: "); 
                    int resolution = Integer.parseInt(sc.next());

                    System.out.println("Masukkan tipe lensa: "); 
                    String lensType = sc.next();

                    productList.add(new Camera(productName, seriesNumber, price, resolution, lensType));
                } else {
                    System.out.println("Pilihan tidak ada!");
                }
            } else if (choose == 2) {
                System.out.println("Daftar Produk:");
                for (Product product : productList) {
                    product.displayInfo();
                }
            } else if (choose == 3) {
                System.out.print("Masukkan nomor seri produk yang ingin dibeli: "); int seriesNumber = Integer.parseInt(sc.next());
                Product boughProduct = null;
                
                for (Product product : productList) {
                    if (product.getSeriesNumber() == seriesNumber) {
                        boughProduct = product;
                        break;
                    }
                }
                if (boughProduct != null) {
                    System.out.println("Anda telah membeli produk:");
                    boughProduct.displayInfo();
                } else {
                    System.out.println("Produk dengan nomor seri tersebut tidak ditemukan");
                }
            } else if (choose == 4) {
                System.out.println("Terima kasih telah menggunakan layanan kami. Sampai jumpa!");
                break;
            }
        }
        sc.close();
    }
}
