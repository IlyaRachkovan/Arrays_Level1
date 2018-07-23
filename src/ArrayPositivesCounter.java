public class ArrayPositivesCounter {
    int countPositiveNumbers(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum = sum + array[i];
            }
        }
        return sum;
    }

}
