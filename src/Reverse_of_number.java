import java.util.Scanner;
public class Reverse_of_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int num1 = num;
        int sum = 0;
        while (num > 0){
            int a = num % 10;
            num = num / 10;
            sum = (sum * 10) + a;
        }
        System.out.print("Reverse of " + num1 + " is " + sum);
    }
}
