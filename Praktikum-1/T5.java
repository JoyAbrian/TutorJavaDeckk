import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; 
        int number = sc.nextInt();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i][j] == number) {
                    String location = "[" + i +"]" + "[" + j +"]";
                    System.out.println("Found " + number + " at " + location);
                    break;
                }
            }
        }   

        sc.close();
    }
}