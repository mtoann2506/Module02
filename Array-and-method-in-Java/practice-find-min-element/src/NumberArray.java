public class NumberArray {
    public static int minValue(int[] arr) {
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        int[] arr = {15, 22, 9, 4, 5};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);

    }
}
