package pl.javastart.task;

public class BubbleSort {

    public int sort(int[] inputArray) {
        int count = 0;
        boolean moved;

        for (int i = 0; i < inputArray.length - 1; i++) {
            moved = false;
            for (int j = 0; j < inputArray.length - i - 1; j++) {
                count++;
                if (inputArray[j] > inputArray[j + 1]) {
                    int index = inputArray[j + 1];
                    inputArray[j + 1] = inputArray[j];
                    inputArray[j] = index;
                    moved = true;
                }
            }
            if (!moved) {
                break;
            }
        }
        return count;
    }
}
