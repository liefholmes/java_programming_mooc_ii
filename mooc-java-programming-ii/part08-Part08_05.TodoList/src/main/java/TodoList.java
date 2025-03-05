/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author liefh
 */
import java.util.ArrayList;

public class TodoList {
    
    private ArrayList<String> todoList;
    
    public TodoList() {
        todoList = new ArrayList<>();
    }
    
    public void add(String toDo) {
        todoList.add(toDo);
    }
    
    public void remove(int number) {
        int num = number -1;
        todoList.remove(num);
    }
    
    public void print() {
        for (int i = 0; i < todoList.size(); i ++) {
            System.out.println((i +1) + ": " + todoList.get(i));
        }
    }
}
