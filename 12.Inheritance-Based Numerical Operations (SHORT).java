class BaseClass {
    void print(String s) {
        System.out.println(s);
    }
}

class SumClass extends BaseClass {
    void calc() {
        double s = 0;
        for (double i = 1; i >= 0.1; i -= 0.1)
            s += i;
        print("Sum = " + s);
    }
}

public class MainClass {
    public static void main(String[] args) {
        new SumClass().calc();
    }
}
