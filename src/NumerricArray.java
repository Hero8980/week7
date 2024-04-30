import java.util.Arrays;

public class NumerricArray {
    public static void main(String[] args) {
        int[] numericArray = {3, 4, 11, 1, 8};

        Arrays.sort(numericArray);

        System.out.println("Sorted Numeric Array:");
        for (int num : numericArray) {
            System.out.print(num + " ");
        }
    }
}
