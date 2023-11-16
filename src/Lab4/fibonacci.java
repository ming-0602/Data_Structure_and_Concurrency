package Lab4;

public class fibonacci {

    public static void main(String[] args) {
        System.out.println(fibonaci(0));
        int result = recursiveFibonacci(3);
        System.out.println(result);
    }

    public static int fibonaci(int n){

        if (n == 0){
            return 0;
        } else if (n == 1) {
            return 1;
        }else {
            int result = (n - 1) + (n -2);
            return result;
        }
    }


    public static int recursiveFibonacci(int n) {
        if (n < 0) {
            // Handle negative input if needed
            return -1; // Or throw an exception
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
        }
    }


}
