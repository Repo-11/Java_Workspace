//Write a program to print all prime numbers within 1 to 20

public class primeUntil20 {
    public static void main(String[] args) {
        int i, k, n, flag;
        for (i = 0; i <= 20; i++) {
            flag = 0;
            n = i;
            for (k = 2; k < n; k++)
                if (n % k == 0) {
                    flag = 1;
                    break;
                }

            if (flag == 0)
                System.out.println(n + " prime no");
            else
                System.out.println(n + " not prime no");
        }
    }
}
