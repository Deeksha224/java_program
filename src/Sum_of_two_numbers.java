import java.util.Scanner;
public class Sum_of_two_numbers {
    public static int sum (int a , int b){
        return (a + b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the two number: ");
        int a , b ;
        a = in.nextInt();
        b = in.nextInt();
        System.out.print("The sum of two number is : " + sum(a,b));
    }
}


