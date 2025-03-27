public class MathPart2 {   
  
    // Neive method gcd  
    public static int gcd(int a, int b){ 
        if ( b == 0) {  
            return a;
        }
        return gcd(b, a % b);
    }

    // efficient solution
    public static int gcd2(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // gcd 3 way solution
    public static int gcd3(int a, int b){
        int res = Math.min(a, b);  
        while (res > 0) {
            if (a % res == 0 && b % res == 0) {
                break;
            }
            res--;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(gcd(100, 200));
        System.out.println(gcd2(100, 200));
        System.out.println(gcd3(100, 200));
    }
}
