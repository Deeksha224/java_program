// Ques 15
//import java.util.Scanner;
//public class Assignment_2_remain {
//    public static int factorial (int n) {
//        if (n == 0) {
//            return 1;
//        }
//        int fact = 1;
//        for (int i = 1 ; i <= n ; i++) {
//            fact *=i;
//        }
//        return fact;
//    }
//    public static int ncr (int n , int r){
//        if (r > n){
//            System.out.print("n must be greater then r");
//        }
//        return factorial(n) / factorial(r) * factorial((n - r));
//    }
//
//    public static int npr (int n , int r){
//        if (r > n){
//            System.out.print("n must be greater then r");
//        }
//        return factorial(n) / factorial((n - r));
//    }
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int r = in.nextInt();
//        System.out.println("The nCr is : " + ncr(n,r));
//        System.out.print("The nPr is : " + npr(n,r));
//    }
//
//}

// Ques 19
//import java.util.Scanner;
//public class Assignment_2_remain {
//    public static int hcf (int a, int b){
//        int max = 0;
//        int n = Math.min(a,b);
//        for (int i = 1 ; i <= n ; i ++ ){
//            if (a % i == 0 && b % i == 0){
//                max = Math.max(max,i);
//            }
//        }
//        return max;
//    }
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        System.out.print("The HCF of two numbers is " + hcf(a,b));
//    }
//}

// Ques 20
//import java.util.Scanner;
//public class Assignment_2_remain {
//    public static int hcf (int a, int b){
//        int max = 0;
//        int n = Math.min(a,b);
//        for (int i = 1 ; i <= n ; i ++ ){
//            if (a % i == 0 && b % i == 0){
//                max = Math.max(max,i);
//            }
//        }
//        return max;
//    }
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int lcm = Math.abs(a * b) / hcf(a,b);
//        System.out.print("The LCM of the numbers is: " + lcm);
//
//    }
//}

// Ques 22
import java.util.Scanner;
public class Assignment_2_remain {
    public static int factor (int a){
        if ( a == 0){
            return 0;
        }
        int fact = 0;
        for (int i = 1 ; i < a ; i ++ ){
            if (a % i == 0){
                fact += i;
            }
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a == factor(a)){
            System.out.print("It's a perfect number");
        }
        else {
            System.out.print("Not a perfect number");
        }
    }
}
