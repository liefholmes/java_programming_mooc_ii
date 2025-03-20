
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the random number generation here
        Random nums = new Random();
        int i = 0;
        while(true) {
            int drawnNum = nums.nextInt(40) + 1;
            if (containsNumber(drawnNum) == true) {
                continue;
            }
            this.numbers.add(drawnNum);
            if (this.numbers.size() == 7) {
                break;
            }
        }
        // the method containsNumber is probably useful
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        
        return this.numbers.contains(number);
    }
}

