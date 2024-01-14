import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class sumOfDigAndPalindrome {
    void calculateSumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
    void isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        System.out.println("Is a palindrome: " + (originalNum == reversedNum));
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter an integer: ");
        int number = Integer.parseInt(br.readLine());
        sumOfDigAndPalindrome ob = new sumOfDigAndPalindrome();
        ob.calculateSumOfDigits(number);
        ob.isPalindrome(number);
    }
}
