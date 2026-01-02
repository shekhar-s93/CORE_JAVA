
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner cal = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a = cal.nextInt();

        System.out.print("Enter Operator (+, -, /, *, and %) : ");
        String ope = cal.next();

        System.out.print("Enter Second Number: ");
        int b = cal.nextInt();

        int sum = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        int mod = a%b;

        switch (ope) {
            case "+":
                System.out.println("Addition is : "+sum);
                break;
            
            case "-":
                System.out.println("Subtraction is : "+sub);
                break;
            
            case "*":
                System.out.println("Multiplication is : "+mul);
                break;
            
            case "/":
                System.out.println("Division is : "+div);
                break;

            case "%":
                System.out.println("Modulus is : "+mod);
                break;
            default:
                System.out.println("Envalid Operator");
        }

    }
}
