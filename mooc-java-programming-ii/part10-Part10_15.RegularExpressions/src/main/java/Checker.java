
public class Checker {

    public Checker() {

    }

    public boolean isDayOfWeek(String string) {
        if (string.matches("mon|tue|wed|thu|fri|sat|sun")) {
            System.out.println("The form is correct.");
            return true;
        }
        System.out.println("The form is incorrect.");
        return false;
    }

    public boolean allVowels(String string) {
        if (string.matches("[aeiouAEIOU]+")) {
            System.out.println("The form is correct.");
            return true;
        }
        System.out.println("The form is incorrect.");
        return false;
    }

    public boolean timeOfDay(String string) {
        if (string.matches("[0-2][0-9]:[0-6][0-9]:[0-6][0-9]")) {
            String[] parts = string.split(":");
            if (Integer.valueOf(parts[0]) <= 23 && Integer.valueOf(parts[1]) <= 59 && Integer.valueOf(parts[2]) <= 59) {
                System.out.println("The form is correct.");
                return true;
            }
            System.out.println("The form is incorrect.");
            return false;
        }
        System.out.println("The form is incorrect.");
        return false;
    }
}
