public class multiCatchException {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int result = numbers[4]; // Accessing an element that doesn't exist
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Array index out of bounds.");
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Arithmetic error.");
        } catch (Exception e) {
            System.out.println("Generic Exception caught.");
        }
    }
}
