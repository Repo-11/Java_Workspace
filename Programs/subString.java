import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class subString {
    public static void main(String[] args) throws IOException {
        String str;
        System.out.print("Enter a string : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
        System.out.println("Substring is " + str.substring(6));
        //Here 6 is the starting index
    }
}
