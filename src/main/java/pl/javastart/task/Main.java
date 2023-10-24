package pl.javastart.task;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[99];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - i;
        }

        int[] arr2 = new int[99];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }
        sortAndPrintInfo(1, 2, 3, 4, 5);
        sortAndPrintInfo(5, 4, 3, 2, 1);
        sortAndPrintInfo(5, 2, 3, 1, 4);
        sortAndPrintInfo(arr);
        sortAndPrintInfo(arr2);
    }

    private static void sortAndPrintInfo(int... arrayToSort) {
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println("=================");
        System.out.printf("Przed sortowaniem: %s\n", Arrays.toString(arrayToSort));
        int compareCount = bubbleSort.sort(arrayToSort);
        System.out.printf("Po sortowaniu: %s\n", Arrays.toString(arrayToSort));
        System.out.printf("Liczba porównań: %d\n", compareCount);
        System.out.println("=================");
    }
}
