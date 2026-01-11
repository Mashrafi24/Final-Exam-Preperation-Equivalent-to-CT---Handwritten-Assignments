class CmdCalculator {
    public static void main(String[] args) {

        try {
            if (args.length < 2)
                throw new Exception("Two numbers required");

            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            System.out.println("Sum: " + (a + b));
            System.out.println("Difference: " + (a - b));
            System.out.println("Product: " + (a * b));
            System.out.println("Quotient: " + (a / b));

        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


input
java CmdCalculator 10 5
 
output
  Sum: 15
Difference: 5
Product: 50
Quotient: 2
