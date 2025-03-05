
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> values = new ArrayList<>();
        while(true) {
            int val = Integer.valueOf(scanner.nextLine());
            if (val < 0) {
                break;
            }
            values.add(val);
        }
        
       values.stream()
               .filter(i -> i >= 1 && i <= 5)
               .forEach(i -> System.out.println(i));
    }
}
