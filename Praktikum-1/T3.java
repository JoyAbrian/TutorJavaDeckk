import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();

        Pattern pattern = Pattern.compile("\\d\\d-\\d\\d-\\d\\d", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(date);

        if (matcher.matches()) {
            String tanggal = date.substring(0, 2);

            String bulan;
            if (date.substring(3, 5).equals("01")) { bulan = "Januari"; }
            else if (date.substring(3, 5).equals("02")) { bulan = "Februari"; }
            else if (date.substring(3, 5).equals("03")) { bulan = "Maret"; }
            else if (date.substring(3, 5).equals("04")) { bulan = "April"; }
            else if (date.substring(3, 5).equals("05")) { bulan = "Mei"; }
            else if (date.substring(3, 5).equals("06")) { bulan = "Juni"; }
            else if (date.substring(3, 5).equals("07")) { bulan = "Juli"; }
            else if (date.substring(3, 5).equals("08")) { bulan = "Agustus"; }
            else if (date.substring(3, 5).equals("09")) { bulan = "September"; }
            else if (date.substring(3, 5).equals("10")) { bulan = "Oktober"; }
            else if (date.substring(3, 5).equals("11")) { bulan = "November"; }
            else if (date.substring(3, 5).equals("12")) { bulan = "Desember"; }
            else { bulan = "KONTOL"; }

            String tahun;
            int temp = Integer.parseInt(date.substring(6, 8));
            if (temp > 24) {
                tahun = "19" + temp;
            } else {
                tahun = "20" + temp;
            }

            System.out.println(tanggal + " " + bulan + " " + tahun);
        }

        sc.close();
    }
}