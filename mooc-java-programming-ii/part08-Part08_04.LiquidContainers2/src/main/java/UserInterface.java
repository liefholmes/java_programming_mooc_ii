
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author liefh
 */
public class UserInterface {

    private Container container1;
    private Container container2;
    private Scanner scanner;

    public UserInterface(Container c1, Container c2, Scanner scanner) {
        this.scanner = scanner;
        this.container1 = c1;
        this.container2 = c2;
    }

    public void start() {
        while (true) {
            System.out.println("First: " + container1.getAmount() + "/100");
            System.out.println("Second" + container2.getAmount() + "/100");
            String inputs = scanner.nextLine();
            if (inputs.equals("quit")) {
                break;
            }
            String[] parts = inputs.split(" ");
            String input = parts[0];
            int amount = Integer.valueOf(parts[1]);
            condition(input, amount);

        }
    }

    public void condition(String input, int amount) {
        if (input.equals("add")) {
            add(amount);
        }
        if (input.equals("move")) {
            move(amount);
        }
        if (input.equals("remove")) {
            remove(amount);
        }
    }

    public void add(int amount) {
        container1.add(amount);
    }

    public void move(int amount) {
        if (container1.getAmount() - amount <= 0) {
            container2.add(container1.getAmount());
            container1.remove(amount);
            return;
        }
        container1.remove(amount);
        container2.add(amount);

    }

    public void remove(int amount) {
        container2.remove(amount);
    }

    public String toString() {
        return container1 + "\n" + container2;
    }

}
