public class ArraySum {

    static int sumArray(int[] arr) {
        int sum = 0;
        for (int x : arr)
            sum += x;
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println("Sum = " + sumArray(a));
    }
}
