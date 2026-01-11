// Static
// 1.Belongs to class
// 2.Shared by all objects
// 3.Access using class name

// Final
// 1.Value cannot change
// 2.Method cannot be overridden
// 3.Class cannot be inherited //


class Demo {
    static int x = 10;
    final int y = 20;
}

public class Test {
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.x); // Allowed (not recommended)
        System.out.println(Demo.x); // Correct
    }
}
