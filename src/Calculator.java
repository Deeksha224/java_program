import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0;
        while (true){
            System.out.print("Enter the operator: ");
            char op = input.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.print ("Enter the two numbers: ");
                int a = input.nextInt();
                int b = input.nextInt();

                if (op == '+'){
                    ans = a+b;
                }
                if (op == '-'){
                    ans = a-b;
                }
                if (op == '*'){
                    ans = a*b;
                }
                if (op == '/'){
                    if (b != 0){
                        ans = a/b;
                    }
                    else{
                        System.out.println("Zero Division Error");
                    }
                }
                if (op == '%'){
                    ans = a%b;
                }
            }
            else if (op == 'X' || op == 'x'){
                break;
            }
            else{
                System.out.print("Invalid input !!");
            }
            System.out.println(ans);
        }
    }
}
