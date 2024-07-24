import java.util.Scanner;
public class greatest_of_three {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
//       if (a>b & a>c) {
//           System.out.print(a + " is greatest.");
//       }
//       else if (b>c) {
//           System.out.print(b + " is greatest");
//       }
//       else {
//           System.out.print(c + " is greatest");
//       }
//    OR
//        int max = a;
//        if (b>max){
//            max = b;
//        }
//        if (c>max){
//            max = c;
//        }
//        System.out.print(max + " is greatest");
//   OR
        int max = Math.max(c,Math.max(a,b));
        System.out.print(max + " is greatest");
    }
}