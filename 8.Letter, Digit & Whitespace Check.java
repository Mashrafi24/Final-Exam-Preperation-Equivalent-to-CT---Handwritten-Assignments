class CheckChar {
    public static void main(String[] args) {
        char c = 'A';

        if (Character.isLetter(c))
            System.out.println("Letter");
        else if (Character.isDigit(c))
            System.out.println("Digit");
        else if (Character.isWhitespace(c))
            System.out.println("Whitespace");
    }
}
