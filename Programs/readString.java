import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class readString {
    public static void main(String[] args) throws IOException {
        String str;
        System.out.print("Enter your name : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
        System.out.println("Name is " + str);
    }
}
