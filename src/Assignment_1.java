// Ques 1
//import java.util.Scanner;
//public class Assignment_1 {
//    public static void main(String[] args) {
//       Scanner input = new Scanner (System.in);
//       System.out.print("Enter a number: ");
//       int num1 = input.nextInt();
//       if (num1 % 2 == 0)
//        System.out.print("Even");
//       else
//        System.out.print("Odd");
//
//    }
//}

// Ques 2
//import java.util.Scanner;
//public class Assignment_1{
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a name: ");
//        String a = input.nextLine();
//        System.out.println("Welcome "+a + "!");
//    }
//}

// Ques 3
//import java.util.Scanner;
//public class Assignment_1{
//    public static void main (String[] args){
//        Scanner input = new Scanner (System.in);
//        System.out.print("Enter Principal Amount: ");
//        int p = input.nextInt();
//        System.out.print("Enter the Rate of interest: ");
//        float r = input.nextFloat();
//        System.out.print("Enter the time: ");
//        int t = input.nextInt();
//        float si = p*r*t /100;
//        System.out.print("The Simple Interest is : " + si);
//    }
//}

// Ques 4
//import java.util.Scanner;
//public class Assignment_1{
//    public static void main(String[] args) {
//        Scanner input = new Scanner (System.in);
//        System.out.print("Enter first number: ");
//        int num1 = input.nextInt();
//        System.out.print("Enter second number: ");
//        int num2 = input.nextInt();
//        System.out.print("Enter the operator (+,-,*,/): ");
//        String a = input.next();
//        if (a.equals("+"))
//            System.out.print("The addition is " + (num1 + num2));
//        else if (a.equals("-"))
//            System.out.print("The subtraction is " + (num1 - num2));
//        else if (a.equals("*"))
//            System.out.print("The multiplication is " + (num1 * num2));
//        else if (a.equals("/"))
//            if (num2 != 0)
//                System.out.print("The division is " + (num1 / num2));
//            else
//                System.out.print("Zero Division Error");
//        else
//            System.out.print("Invalid Input");
//    }
//}

// Ques 5
//import java.util.Scanner;
//public class Assignment_1{
//    public static void main(String[] args) {
//        Scanner input = new Scanner (System.in);
//        System.out.print("Enter first number: ");
//        int num1 = input.nextInt();
//        System.out.print("Enter second number: ");
//        int num2 = input.nextInt();
//        if (num1 > num2)
//            System.out.print(num1 + " is greater");
//        else if (num1 == num2)
//            System.out.print("Both are equal");
//        else
//            System.out.print(num2 + " is greater");
//    }
//}

// Ques 6
//import java.util.Scanner;
//public class Assignment_1{
//    public static void main(String[] args) {
//        Scanner input = new Scanner (System.in);
//        System.out.print("Enter the amount in rupee: ");
//        int a = input.nextInt();
//        float currency = 0.012f * a;
//        System.out.print("The amount in USD is: " + currency);
//    }
//}

// Ques 7
//import java.util.Scanner;
//public class Assignment_1 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int a = 0;
//        int b = 1;
//        System.out.print("Enter a number: ");
//        int num = input.nextInt();
//        if (num >=1)
//         System.out.print(a);
//        if (num >=2)
//            System.out.print("," + b);
//        for (int i = 2; i < num; i++){
//            int c = a + b;
//            a = b;
//            b = c;
//            System.out.print("," + c);
//        }
//    }
//}

// Ques 8
import java.util.Scanner;
public class Assignment_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String a = input.nextLine();
        String b = a;

    }
}