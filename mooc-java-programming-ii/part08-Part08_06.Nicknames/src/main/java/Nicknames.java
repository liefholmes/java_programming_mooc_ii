
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String, String> nicknames = new HashMap<>();
        nicknames.put("matt", "matthew");
        nicknames.put("mix", "michael");
        nicknames.put("artie", "arthur");
        
        System.out.println(nicknames.get("artie"));
    }

}
