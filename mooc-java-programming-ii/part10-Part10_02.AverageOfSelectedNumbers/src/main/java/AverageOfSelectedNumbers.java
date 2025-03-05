
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> inputs = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop");
                
        while(true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            
            inputs.add(input);
        }
        
        System.out.println("Print then average of the negative numbers or the positive numbers?(n/p)");
        String input = scanner.nextLine();
        if (input.equals("n")) {
            System.out.println("Average of the negative numbers: " + inputs.stream().mapToInt(s -> Integer.valueOf(s)).filter(num -> num < 0).average().getAsDouble());
        } else {
            System.out.println("Average of the positive numbers: " + inputs.stream().mapToInt(s -> Integer.valueOf(s)).filter(num -> num > 0).average().getAsDouble());
        }

    }
}
