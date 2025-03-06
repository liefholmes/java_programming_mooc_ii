
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while(true) {
            System.out.println("Input the name of the book, empty stops:");
            String input = scanner.nextLine();
            
            if (input.isEmpty()) {
                break;
            }
            
            System.out.println("Input the age recommendation");
            int input2 = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(input, input2));
        }
        
        System.out.println(books.size() + " books in total.");
        System.out.println("Books:");
        books.stream()
                .sorted(Comparator.comparing(Book :: getnA).thenComparing(Book :: getName))
                .forEach(book -> System.out.println(book));
        
            
    }

}
