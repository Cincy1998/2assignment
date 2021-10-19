public class cinassignment1 {
    public static void main(String args[]){

        int num;
        try {
            // code that generate exception
            int divideByZero = 8 / 0;
            System.out.println("Rest of code in try block");
        }

        catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage());
        }

        finally {
            // finally block always executes
            System.out.println("Hi");
        }
    }
}
