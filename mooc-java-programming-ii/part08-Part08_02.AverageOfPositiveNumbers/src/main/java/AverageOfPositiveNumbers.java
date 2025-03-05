
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true) {
            int nums = Integer.valueOf(scanner.nextLine());
            if (nums > 0) {
                sum += nums;
                count++;
            }
            if (nums == 0) {
                break;
            }
        }
        if (count == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double average = sum * 1.0 / count;
            System.out.println(average);
        }
    }
}
