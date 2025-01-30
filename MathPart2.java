public class MathPart2 {

    // Neive method gcd
    public static int gcd(int a, int b){
        if ( b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // efficient solution
     

    public static void main(String[] args) {
        System.out.println(gcd(100, 200));
    }
}