import java.io.*;
import java.util.*;

class FileProcess {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(new File("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");

        int max = Integer.MIN_VALUE;

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n > max)
                max = n;
        }

        long sum = (long) max * (max + 1) / 2;

        pw.println(max + ", " + sum);

        sc.close();
        pw.close();
    }
}
