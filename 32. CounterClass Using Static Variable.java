class CounterClass {

    static int instanceCount = 0;

    CounterClass() {
        instanceCount++;
        if (instanceCount > 50)
            instanceCount = 0;
    }

    static int getCount() {
        return instanceCount;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 55; i++)
            new CounterClass();

        System.out.println(instanceCount);
    }
}
