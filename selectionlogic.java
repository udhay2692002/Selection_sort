import java.util.Arrays;

public class selectionlogic {

    public static void main(String[] args) {
        int[] a = {3, 4, 1, 2};
        System.out.println(Arrays.toString(selectionSort(a)));
    }

    private static int[] selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }
        return a;
    }
}
