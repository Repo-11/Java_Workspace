import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class stringFunctions {
    public static void main(String[] args) throws IOException {
        String str;
        System.out.print("Enter a string : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
        System.out.println("Character at possition 2 is : " + str.charAt(1));
        System.out.println("Length of " + str + " is : " + str.length());
        System.out.println("Substring is : " + str.substring(6));
        System.out.println("Index where 'a' appears first time in " + str + " is : " + str.indexOf('a'));
        System.out.println("Join " + str + " with Hi as : " + str.concat("Hi"));
    }
}
