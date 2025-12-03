public class MathPractice {     
   
    // count digit   
    public static int countDigit(int x){  
        int count  = 0;   
        while (x > 0) {
           x  =  x / 10; 
           count++; 
        } 
        return count;
    }
    // pallindrome number check time O(d) 
    public static boolean pallindrome(int x){ 
       
        int temp = x;
        int rev = 0;
        while(temp != 0){ 
            rev = rev*10 + temp % 10;
            temp = temp / 10;
        }

        
        return (rev == x);
    }
    // iterative factorial 
    public static int fact1(int x){
        int fact = 1;
        for (int i = 2; i <= x; i++) {
            fact = fact * i;
        }
        return fact;
    }

    // factorial number
    public static int factorial(int x){
        
        if (x  == 0) {
            return 1;
        }
       
        return x*factorial(x-1);
        
    }

    // factorial finding of trailing Zeros eg. 10 factorial 3628800 tailing zeros is 2

    public static int trailingFactorial(int x){
       
        int fact = 1;
        for (int i = 2; i <= x; i++) {
            fact = fact * i;
        }
        int res = 0;
        while (fact % 10 == 0) {
            res++;
            fact = fact / 10;
        }
        return res;
    }

    // efficient trailing zero
    public static int trailingzerofact(int x){
        int res = 0;
        for(int i=5; i<=x; i*=5){
            res = res + x/i;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(countDigit(100));
        System.out.println(pallindrome(78987));
        System.out.println(factorial(4));
        System.out.println(fact1(5));
        System.out.println(trailingFactorial(10));
        System.out.println(trailingzerofact(10));
    }
}
