import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        ArrayFiller arrayFiller = new ArrayFiller();
//        int[] resultArray;
//        resultArray=arrayFiller.fill(new int[10], 5);
//
//        System.out.println(Arrays.toString(resultArray));
        ArraySumCalculator arraySumCalculator = new ArraySumCalculator();

        int arraySum;

        arraySum = arraySumCalculator.sum(new int[]{1, 2, 3});

        System.out.println(arraySum);


    }
}
