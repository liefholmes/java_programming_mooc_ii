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
import java.util.List;
import java.util.Iterator;
import java.util.stream.Collectors;

public class Employees {

    private ArrayList<Person> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.employees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        Iterator<Person> iterator = peopleToAdd.iterator();
        while (iterator.hasNext()) {
            employees.add(iterator.next());
        }
    }

    public void print() {
        Iterator iterator = employees.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
//        ArrayList<Person> filtered = employees.stream()
//                .filter(person -> person.getEducation() == education)
//                .collect(Collectors.toCollection(ArrayList :: new));
//        
//        Iterator<Person> iterator = filtered.iterator();
//        
//        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
         Iterator<Person> iterator = employees.iterator();
         
         while(iterator.hasNext()) {
             Person nextPerson = iterator.next();
             if (nextPerson.getEducation() == education) {
                 System.out.println(nextPerson);
             }
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = employees.iterator();
        
        while(iterator.hasNext()) {
            Person nextPerson = iterator.next();
            if (nextPerson.getEducation() == education) {
                iterator.remove();
                continue;
            }
            System.out.println(nextPerson);
        }
        
    }

}
