import java.util.Scanner;
public class Switch_case {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();
//        switch (fruit) {
//            case "Mango":
//                System.out.print("King of fruits");
//                break;
//            case "Apple":
//                System.out.print("A sweet red fruit");
//                break;
//            case "orange":
//                System.out.print("A round fruit");
//                break;
//            default:
//                System.out.print("Enter a valid fruit");
//        }
        switch (fruit){
            case "Mango" -> System.out.print("King of fruits");
            case "Apple" -> System.out.print("A sweet red fruit");
            case "Orange" -> System.out.print("A round fruit");
            default -> System.out.print("Enter a valid fruit");
        }
    }
}

