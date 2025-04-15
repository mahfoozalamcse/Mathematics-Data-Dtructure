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
    

    public static void main(String[] args) {

      System.out.println(palindrome(78987));  
    }
}