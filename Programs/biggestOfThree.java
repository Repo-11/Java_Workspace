public class biggestOfThree {
    public static void main(String[] args) {
        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int num3 = Integer.parseInt(args[2]);
            int largest = 0;
            if (num1 > largest)
                largest = num1;
            if (num2 > largest)
                largest = num2;
            if (num3 > largest)
                largest = num3;
            System.out.println("The largest number is: " + largest);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        }
    }
}
