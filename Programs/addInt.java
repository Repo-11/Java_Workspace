import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class addInt {
    public static void main(String[] args) throws IOException {
        int num1, num2, num3;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter two integers : ");
        num1 = Integer.parseInt(br.readLine());
        num2 = Integer.parseInt(br.readLine());
        num3 = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 +" is : " + num3);
    }
}
