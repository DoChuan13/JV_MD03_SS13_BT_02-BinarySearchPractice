import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Mảng ban đầu là: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Mảng sắp xếp là: " + Arrays.toString(array));
        int left = 0, right = array.length;
        int value = (int) (Math.random() * 100);
        int index = binarySearch(array, left, right, value);
        if (index < 0) {
            System.err.println("Không tìm thấy " + value + " trong mảng.");
        } else {
            System.out.println("Vị trí index của " + value + " trong mảng là: " + index);
        }
    }

    private static int binarySearch(int[] array, int left, int right, int value) {
        if (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] == value) {
                return middle;
            } else if (value > array[middle]) {
                left = middle + 1;
                return binarySearch(array, left, right, value);
            } else {
                right = middle - 1;
                return binarySearch(array, left, right, value);
            }
        } else return -1;
    }
}
