public class SequenceArrayCreator {
    int[] createSequenceArray(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("Size is lower then 0");
        }
        int[] result = new int[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = i;

        }
        return result;

    }
}

