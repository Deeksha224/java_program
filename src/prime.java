import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int a = in.nextInt();
        System.out.print(isPrime(a));
    }
    public static boolean isPrime (int n){
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while ( c * c <= n){
            if (n % c == 0){
                return false;
            }
            c++ ;
        }
        return c * c > n;
    }
}
