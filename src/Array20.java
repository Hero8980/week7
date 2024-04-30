public class Array20 {

    public static void main(String[] args) {

        int[] array = {3, 2, 9, 1, 8};

        int valueToCheck = 9;

        boolean found = false;


        for (int num : array) {
            if (num == valueToCheck) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("array contains the value " + valueToCheck);
        } else {
            System.out.println("array does not contain the value " + valueToCheck);
        }
    }
}