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
    // pallindrome number check
    public static boolean pallindrome(int x){
        int temp = x;
        int rev = 0;
        while(temp != 0){
            rev = rev*10 + temp % 10;
            temp = temp / 10;
        }
        
        
        return (rev == x);
    }

    public static void main(String[] args) {
        System.out.println(countDigit(100));
        System.out.println(pallindrome(78987));
    }
}