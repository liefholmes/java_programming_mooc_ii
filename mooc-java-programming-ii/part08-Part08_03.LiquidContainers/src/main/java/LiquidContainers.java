
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container c1 = new Container("First");
        Container c2 = new Container("Second");
        UserInterface ui = new UserInterface(c1, c2, scan);
        ui.start();
    }

}
