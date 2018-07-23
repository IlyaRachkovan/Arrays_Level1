public class ArrayPositiveFinder {

    int findFirstPositiveNumber(int[] array) {
        int index = 0;
        for (int i : array) {

            if (i > 0) {
                break;
            }
            if (i < 0 && index == array.length - 1) {
                index = -1;
                break;
            }
            index++;
        }
        return index;
    }

    int findLastPositiveNumber(int[] array) {
        int index = 0;
        for (index = array.length -1; index >= 0; index--) {
            if (array[index] > 0) {
                return index;
            }
        }
        return -1;

    }

}
