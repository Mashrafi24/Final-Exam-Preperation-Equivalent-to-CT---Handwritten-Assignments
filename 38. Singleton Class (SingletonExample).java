class SingletonExample {

    private static SingletonExample instance;

    private SingletonExample() { }

    public static SingletonExample getInstance() {
        if (instance == null)
            instance = new SingletonExample();
        return instance;
    }

    public void show() {
        System.out.println("Singleton Object Created");
    }

    public static void main(String[] args) {
        SingletonExample s1 = SingletonExample.getInstance();
        SingletonExample s2 = SingletonExample.getInstance();

        System.out.println(s1 == s2); // true
    }
}
