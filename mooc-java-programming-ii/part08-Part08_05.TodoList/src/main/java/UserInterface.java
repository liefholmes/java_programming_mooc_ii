/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author liefh
 */
import java.util.Scanner;

public class UserInterface {
    
    private Scanner scanner;
    private TodoList todoList;
    
    public UserInterface(TodoList todoList, Scanner scanner) {
        this.scanner = scanner;
        this.todoList = todoList;
    }
    
    public void start() {
        while(true) {
            System.out.println("Command: ");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }
            condition(input);
        }
    }
    
    public void condition(String input) {
        if (input.equals("add")) {
            System.out.println("To add: ");
            String todo = scanner.nextLine();
            add(todo);
        }
        if (input.equals("list")) {
            list();
        }
        if (input.equals("remove")) {
            remove();
        }
    }
    
    public void add(String input) {
        todoList.add(input);
    }
    
    public void list() {
        todoList.print();
    }
    
    public void remove() {
        System.out.println("Which one is removed? ");
        int number = Integer.valueOf(scanner.nextLine());
        
        todoList.remove(number);
    }
}
