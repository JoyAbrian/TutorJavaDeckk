import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan judul film\n> ");
        String text = sc.nextLine();

        String hasil = "";
        for (int j = 0; j < text.length(); j++) {
            if (j == 0 || (j > 0 && text.charAt(j-1) == ' ')) {
                hasil += text.toUpperCase().charAt(j);
            } else {
                hasil += text.toLowerCase().charAt(j);
            }
        }

        System.out.println(hasil);
        sc.close();
    }
}