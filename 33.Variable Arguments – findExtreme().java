class Extreme {

    static int findExtreme(String type, int... nums) {

        int result = nums[0];

        for (int n : nums) {
            if (type.equals("smallest") && n < result)
                result = n;
            if (type.equals("largest") && n > result)
                result = n;
        }
        return result;
    }

    public static void main(String[] args) {
        int x = findExtreme("smallest", 5, 2, 9, 1);
        int y = findExtreme("largest", 8, 3, 10, 4);

        System.out.println(x);
        System.out.println(y);
    }
}
