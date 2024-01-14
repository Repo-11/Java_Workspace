public class factorial {
    int fact(int var) {
        if(var == 0)
            return 1;
        else
            return var * fact(var - 1);
    }
    public static void main(String[] args) {
        int num = 6;
        factorial ob = new factorial();
        System.out.println("Factorial of " + num + " is : " + ob.fact(num));
    }
}
