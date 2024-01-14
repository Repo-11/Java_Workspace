public class checkForPrime {
    public static void main(String[] args) {
        int flag = 10;
        int n = 15;
        for(int i = 2; i<n; i++)
            if(n % i == 0){
                flag = 12;
                break;
            }
        if (flag == 10)
            System.out.println(n+" is Prime");
        else
            System.out.println(n+" is Not Prime");
    }
}
