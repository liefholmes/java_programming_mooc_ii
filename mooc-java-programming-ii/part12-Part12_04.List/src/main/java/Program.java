
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your class here
        List<Integer> test = new List<>();
        
        for(int i = 0; i < 20; i ++) {
            test.add(i);
        }
        
        System.out.println(test.contains(1));
        System.out.println(test.contains(50));
    }

}
