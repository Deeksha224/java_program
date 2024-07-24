import java.util.Scanner;
public class Number_of_Occurance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = input.nextLong();
        System.out.print("Enter the digit you want to find: ");
        int num = input.nextInt();
        int count = 0;
        while (n > 0){
            long a = n % 10;
            n = n / 10;
            if (a == num){
                count ++ ;
            }
        }
        System.out.print(count);
    }
}
