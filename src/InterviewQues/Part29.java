package InterviewQues;

public class Part29 {
    public static void main(String[] args) {
        int[] array = {33, 39, 45, 51, 57, 63, 69, 75, 81, 87, 93, 99}; // Example input array
        int commonDifference = array[1] - array[0]; // Calculate the common difference

        int missingNumber = findMissingNumber(array, commonDifference);

        System.out.println("The missing number is: " + missingNumber);
    }

    public static int findMissingNumber(int[] array, int commonDifference) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] - array[i] != commonDifference) {
                return array[i] + commonDifference;
            }
        }
        return -1; // Missing number not found
    }
}
