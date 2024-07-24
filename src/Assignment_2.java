// Ques 1
//import java.util.Scanner;
//public class Assignment_2 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        float area = 3.14f * a * a;
//        System.out.print("The area of circle is: " + area);
//    }
//}

// Ques 2
//import java.util.Scanner;
//public class Assignment_2 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int b = in.nextInt();
//        int h = in.nextInt();
//        float area = 0.5f * b * h;
//        System.out.print("The area of Triangle is: " + area);
//    }
//}

// Ques 22
//import java.util.Scanner;
//public class Assignment_2 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = in.nextInt();
//        int pro = 1;
//        int sum = 0;
//        int copy = num;
//        while (num > 0){
//            int a = num%10;
//            num = num / 10;
//            pro = pro * a;
//            sum = sum + a;
//        }
//        int diff = pro - sum;
//        System.out.print("The difference between the product and sum of the number is: " + diff);
//    }
//}

// Ques 23
//import java.util.Scanner;
//public class Assignment_2 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
//        System.out.print(1);
//        for (int i = 2 ; i<=num/2 ; i++){
//            if (num % i == 0) {
//                System.out.print("," + i);
//            }
//        }
//        System.out.print("," + num);
//    }
//}

// Ques 24
//import java.util.Scanner;
//public class Assignment_2 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int sum = n * (n + 1) /2;
//        System.out.print("The sum of first " + n + " is " + sum);
//    }
//}

// Ques 25
//import java.util.Scanner;
//public class Assignment_2 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int max = 0;
//        while (true){
//            System.out.print("Enter a integer: ");
//            int a = in.nextInt();
//            if (a != 0 ){
//                max = Math.max(a,max);
//            }
//            else {
//                break;
//            }
//        }
//        System.out.print("The largest integer is " + max);
//    }
//}

//          INTERMEDIATE QUESTIONS
// Ques 3
//import java.util.Scanner;
//public class Assignment_2 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the number of numbers you want to input: ");
//        int a = in.nextInt();
//        int i = 0;
//        float sum = 0;
//        while (i < a) {
//            System. out.print("Enter the numbers: ");
//            int n = in.nextInt();
//            sum = sum + n;
//            i++;
//        }
//        float avg = sum/a;
//        System.out.print("The average of the numbers: " + avg);
//    }
//}

// Ques 5
//import java.util.Scanner;
//public class Assignment_2 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the first co-ordinates: ");
//        int x1 = in.nextInt();
//        int y1 = in.nextInt();
//        System.out.print("Enter the second co-ordinate: ");
//        int x2 = in.nextInt();
//        int y2 = in.nextInt();
//        double distance  = Math.sqrt((Math.pow((x1 - x2),2)) + Math.pow((y1 - y2),2));
//        System.out.print("The distance between the two points is: " + distance);
//    }
//}

// Ques 14
import java.util.Scanner;
public class Assignment_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = in.nextInt();
        int temp = a;
        double c =0;
        while (a > 0){
            int b = a % 10;
            a = a / 10;
            c = c + Math.pow(b,3);
        }
        if (temp == c){
            System.out.print(temp + ( " is an Armstrong number"));
        }
        else {
            System.out.print("Not an Armstrong number");
        }
    }
}
