// Write a function which calculates the average of the numbers in a given array.
// Note: Empty arrays should return 0.

public class calculateAverage {

    public static double calculateAverageFunc(int[] array) {
        int arrayLength = array.length;
        int sum = 0;

        if(arrayLength == 0){
            return 0;
        }

        for(int i = 0; i < arrayLength; i++){
            sum += array[i];
        }

        return (double) sum / arrayLength;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(calculateAverageFunc(array));
    }
}   


