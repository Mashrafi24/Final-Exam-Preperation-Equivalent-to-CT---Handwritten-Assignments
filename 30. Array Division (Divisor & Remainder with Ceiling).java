import java.util.*;

class ArrayDivision {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // n > 20
        int[] a = new int[n];
        int[] b = new int[n / 10];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        for (int i = 0; i < b.length; i++)
            b[i] = sc.nextInt();

        for (int i = 0; i < b.length; i++) {
            double div = Math.ceil((double) a[i] / b[i]);
            int rem = a[i] % b[i];
            System.out.println("Divisor = " + div + ", Remainder = " + rem);
        }
    }
}
