import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        ArrayFiller arrayFiller = new ArrayFiller();
//        int[] resultArray;
//        resultArray=arrayFiller.fill(new int[10], 5);
//        System.out.println(Arrays.toString(resultArray));

//        ArraySumCalculator arraySumCalculator = new ArraySumCalculator();
//        int arraySum;
//        arraySum = arraySumCalculator.sum(new int[]{1, 2, 3});
//        System.out.println(arraySum);

//        ArrayPositiveFinder arrayPositiveFinder = new ArrayPositiveFinder();
//        int showFirstPositiveNumber;
//        int showLastpositiveNumber;
//        showFirstPositiveNumber = arrayPositiveFinder.findFirstPositiveNumber(new int[]{-65, -10, 20, 5});
//        showLastpositiveNumber = arrayPositiveFinder.findLastPositiveNumber(new int[] {4, 3, 2, -1});
//        System.out.println(showFirstPositiveNumber);
//        System.out.println(showLastpositiveNumber);

//
//        SequenceArrayCreator sequenceArrayCreator = new SequenceArrayCreator();
//        int [] create;
//        create = sequenceArrayCreator.createSequenceArray(-2);
//        System.out.println(Arrays.toString(create));
//        MatrixPrinter matrixPrinter = new MatrixPrinter();
//     matrixPrinter.matrixPrinter(new int[][]{{1, 2, 3}, {1, 2, 3}, {1, 2, 3}});
        MatrixAverageCalculator matrixAverageCalculator = new MatrixAverageCalculator();
        double averageMatrix;
        averageMatrix = matrixAverageCalculator.MatrixAverageCalculator(new int [][]{{1,2,3}, {1,2,3}, {1,2,3}});

        System.out.println(averageMatrix);








    }


}
