public class ArraySumCalculator {
    int sum(int[] array) {

        int sumOfArrays = 0;
        for (int i = 0; i < array.length; i++) {
            //array[i] = (int) (Math.random() * 5);
            sumOfArrays = sumOfArrays + array[i];
        }

        return sumOfArrays;
    }
}
