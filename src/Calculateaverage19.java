public class Calculateaverage19 {

    public static void main(String[] args) {
        // Numeric array
        // sum of array elements
        int[] array = {5, 4, 7, 1, 8};

        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        double average = (double) sum / array.length;

        System.out.println("Average value of array elements: " + average);
    }
}
