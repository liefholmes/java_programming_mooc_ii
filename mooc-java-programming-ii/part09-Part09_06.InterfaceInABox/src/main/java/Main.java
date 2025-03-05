
public class Main {

    public static void main(String[] args) {
        // test your classes here
        
        Box a = new Box(60);
        Box b = new Box(9999);
        
        a.add(new Book("aaa", "bbb", 20));
        a.add(new Book("ccc", "ddd", 10));
        a.add(new Book("aaa", "bbb", 25));
        b.add(new Book("sex", " ddd", 33));
        b.add(a);
        System.out.println(b);
    }

}
