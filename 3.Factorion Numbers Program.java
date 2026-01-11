import java.util.*;

public class Factorion {

    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        return fact;
    }

    static boolean isFactorion(int num) {
        int sum = 0, temp = num;

        while (temp > 0) {
            int d = temp % 10;
            sum += factorial(d);
            temp /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter lower bound: ");
        int low = sc.nextInt();
        System.out.print("Enter upper bound: ");
        int high = sc.nextInt();

        System.out.println("Factorion numbers:");
        for (int i = low; i <= high; i++) {
            if (isFactorion(i))
                System.out.print(i + " ");
        }
    }
}
