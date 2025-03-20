
public class Program {

    public static void main(String[] args) {
        int[][] matrix = {
            {1},
            {2, 2},
            {3, 3, 3},
            {4, 4, 4, 4}
        };
        System.out.println(arrayAsString(matrix));

    }

    public static String arrayAsString(int[][] array) {
        StringBuilder sb = new StringBuilder();

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                sb.append(array[row][column]);
            }
            sb.append("\n");
        }
        String result = sb.toString();
        return result;
    }

}
