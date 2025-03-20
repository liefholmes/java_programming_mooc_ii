
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = {3, -1, 8, 5};
        
        System.out.println(sum(numbers, -1, 9899, -10, 10));

    }
    
    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
        if (fromWhere <0) {
            fromWhere =0;
        }
        if (toWhere > array.length -1) {
            toWhere = array.length -1;
        }
        int sum = 0;
        for (int i = fromWhere ; i <= toWhere; i ++) {
            if (array[i] >= smallest && array[i] <= largest ) {
                sum += array[i];
            }
        }
        return sum;
    }
    
//    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
//        if (fromWhere < 0) {
//            fromWhere = 0;
//        }
//        if (toWhere > array.length -1) {
//            toWhere = array.length -1;
//        }
//        
//        int[] array1 = new int[toWhere - fromWhere + 1];
//        
//        int j = 0;
//        for (int i = fromWhere; i <= toWhere; i ++) {
//            array1[j] = array[i];
//            j ++;
//        }
//        
//        int[] array2 = new int[array1.length];
//        
//        for (int i = 0; i < array2.length; i++) {
//            if (array1[i] >= smallest && array1[i] <= largest) {
//                array2[i] = array1[i];
//            }
//        }
//        
//        int sum = 0;
//        
//        for (int i = 0; i < array2.length; i ++) {
//            sum += array2[i];
//        }
//        
//        return sum;
//    }
    
    

}
