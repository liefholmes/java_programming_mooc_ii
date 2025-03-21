

public class Student implements Comparable<Student> {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    public int compareTo(Student stu) {
        return this.name.compareToIgnoreCase(stu.getName());
    }

}
