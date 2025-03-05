
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container c1 = new Container();
        Container c2 = new Container();
        UserInterface ui = new UserInterface(c1, c2, scan);
        ui.start();

    }

}
