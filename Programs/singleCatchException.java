public class singleCatchException {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int result = numbers[4]; // Accessing an element that doesn't exist
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Generic Exception caught.");
        }
    }
}
