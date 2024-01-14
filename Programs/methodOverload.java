public class methodOverload {
    public static int add(int a, int b) {
        return a + b;
    }
    public static String add(String str1, String str2) {
        return str1 + str2;
    }
    public static void main(String[] args) {
        int sumIntegers = add(5, 7);
        System.out.println("Sum of two integers: " + sumIntegers);
        String concatenatedStrings = add("Mounisha ", "is Intelligent");
        System.out.println("Concatenated strings: " + concatenatedStrings);
    }
}
