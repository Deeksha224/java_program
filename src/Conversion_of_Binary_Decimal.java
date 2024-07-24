import java.util.Scanner;

public class Conversion_of_Binary_Decimal {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            double sum = 0;
            int count = 0;
            while (num > 0){
                int num1 = num % 10;
                double n = (Math.pow(2,count)) * num1;
                //System.out.println(n);
                sum = sum + n;
                num = num / 10;
                count ++ ;
            }
            // type casting (double - integer)
            int val = (int)(Math.round(sum));
            System.out.print(val);
        }
    }

