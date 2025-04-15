public class Math3Practice {
    public static boolean palindrome(int x){
        int y = 0, z = x;
        if (x < 0) {
            return false;
        }
        while (x > 0) {
            int last = x % 10;
            y = y * 10 + last;
            x  =  x / 10;
        }
        return (y == z);
    }


    // factorial findinding
    public static int factorial(int x){
        if (x  < 0) {
            return -1;
        }
        if (x == 0) {
            return 1;
        }
        return x*factorial(x-1);
    }


    // iterative way find factorial 
    public static int fact2(int x){
        if (x  < 0) {
            return -1;
        }
        if (x == 0) {
            return 1;
        }
        int fact = 1;
       for (int i = 2; i <= x; i++) {
            fact = fact * i;
       }
       return fact;
    }


    // trailing zero eg 8 fact = 40320  at the end 1
    public static int trailing(int x){
        int trail = fact2(x);
        int res = 0;
        while (trail % 10 == 0) {
            res++;
            trail = trail / 10;
        }
        return res;
    }


    public static void main(String[] args) {

      System.out.println(palindrome(78987));  
      System.out.println(factorial(4));
      System.out.println(fact2(4));
      System.out.println(trailing(5));
    }
}