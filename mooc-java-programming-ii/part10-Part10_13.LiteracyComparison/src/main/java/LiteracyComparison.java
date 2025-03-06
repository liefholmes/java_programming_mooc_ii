
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.Comparator;

public class LiteracyComparison {

    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(country -> country.split(","))
                    .map(country -> new Countries(country[3], Double.parseDouble(country[5]), country[2], Integer.valueOf(country[4])))     
//                    .sorted((c1, c2) -> Double.compare(c1.getLr(), c2.getLr()))
                    .sorted(Comparator.comparingDouble(Countries::getLr))
                    .forEach(c -> System.out.println(c.getCName()+ " (" + c.getYear() + "), " + c.modGender() + ", " + c.getLr()));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
}
