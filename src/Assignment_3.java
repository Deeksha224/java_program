// Ques 1
//import java.util.Scanner;
//public class Assignment_3 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int a, b, c;
//        System.out.print("Enter three number: ");
//        a = in.nextInt();
//        b = in.nextInt();
//        c = in.nextInt();
//        System.out.println("The Maximum among three is: " + max(a, b, c));
//        System.out.print("The Minimum among three is: " + min(a, b, c));
//    }
//
//    public static int max (int a , int b , int c){
//        int s = Math.max(a, b);
//        return Math.max (s, c);
//    }
//    public static int min (int a , int b , int c){
//        int s = Math.min(a, b);
//        return Math.min (s, c);
//    }
//}

// Ques 2
//import java.util.Scanner;
//public class Assignment_3 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        System.out.print(num(a));
//    }
//
//    public static boolean num (int a){
//        return a % 2 == 0;
//    }
//}

// Ques 3
//import java.util.Scanner;
//public class Assignment_3 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter your age: ");
//        int a = in.nextInt();
//        System.out.print(vote(a));
//    }
//    public static boolean vote (int a){
//        return a >= 18;
//    }
//}

// Ques 4 & 5
//import java.util.Scanner;
//public class Assignment_3 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the two numbers: ");
//        int a , b;
//        a = in.nextInt();
//        b = in.nextInt();
//        System.out.println("The sum of two numbers is: " + sum(a , b));
//        System.out.print("The product of two number is: " + product(a , b));
//    }
//
//    public static int sum (int a, int b){
//        return a + b;
//    }
//
//    public static int product (int a, int b){
//        return a * b;
//    }
//}

// Ques 12
import java.util.Scanner;
public class Assignment_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter three numbers: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        if (py(a, b, c)){
            System.out.print("Its a Pythagoras triplet");
        }
        else {
            System.out.print("Not a Pythagoras triplet");
        }
    }
    public static boolean py(int a, int b, int c){
        return (Math.pow(a , 2) + (Math.pow(b , 2)) == (Math.pow(c , 2)));
    }


}
