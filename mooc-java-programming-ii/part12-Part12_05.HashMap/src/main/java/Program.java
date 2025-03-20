
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // You can test the class here
        List<Integer> test = new List<>();

        for (int i = 0; i < 15; i++) {
            test.add(i);
        }

        for (int i = 0; i < 15; i++) {
            System.out.println(test.get(i));
        }

        test.remove(14);

        for (int i = 0; i < test.size(); i++) {
            System.out.println(test.get(i));
        }

    }

}
