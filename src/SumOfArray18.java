public class SumOfArray18 {
    public static void main(String[] args) {
        // Numeric array
        // Calculate sum of array elements
        int[] array = {3, 4, 7, 1, 8};

        int sum = 0;

        for (int num : array) {
            sum += num;
        }

        System.out.println("Sum of the array: " + sum);
    }

}
