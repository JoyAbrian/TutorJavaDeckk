import java.util.ArrayList;
import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        int n, total_desimal = 0, total_integer = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                n = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {  }
        }

        ArrayList<Double> list_angka = new ArrayList<>();
        while (!(list_angka.size() == n)) {
            String[] list_string = sc.nextLine().split(" ");
            try {
                for (String angka : list_string) {
                    double temp = Double.parseDouble(angka);
                    list_angka.add(temp);
                    if (temp % 1 == 0) {
                        total_integer++;
                    } else {
                        total_desimal++;
                    }
                }
            } catch (NumberFormatException e) {  }
        }

        System.out.println(total_integer + " Bilangan Bulat");
        System.out.println(total_desimal + " Bilangan Desimal");
        sc.close();
    }
}