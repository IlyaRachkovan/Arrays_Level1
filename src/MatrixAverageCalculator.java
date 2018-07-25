public class MatrixAverageCalculator {
    double MatrixAverageCalculator(int[][] matrix) {
        double sum = 0;
        double numbers = 0;
        double average = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sum = (sum + matrix[i][j]);
            }
            numbers = matrix[i].length * matrix.length;
            average = sum / numbers;
        }
        return average;
    }
}
