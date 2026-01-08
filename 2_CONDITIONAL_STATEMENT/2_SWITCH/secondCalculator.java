
import java.util.Scanner;

public class secondCalculator {
    public static void main(String[] args) {
        Scanner cal = new Scanner(System.in);

        System.out.print("Enter Operator (+, -, *, /, and %) : ");
        String operator = cal.next();

        switch (operator) {
            case "+":
                System.out.print("Enter First Number: ");
                int a = cal.nextInt();

                System.out.print("Enter Second Number: ");
                int b = cal.nextInt();

                int sum = a+b;

                System.out.println("Addition is : "+sum);
                
                break;

            case "-":
                System.out.print("Enter First Number: ");
                int c = cal.nextInt();

                System.out.print("Enter Second Number: ");
                int d = cal.nextInt();

                int sub = c - d;

                System.out.println("Subtraction is : "+sub);
                break;

            case "*":
                System.out.print("Enter First Number: ");
                int e = cal.nextInt();
                 
                System.out.print("Enter Second Number: ");
                int f = cal.nextInt();
                
                int mul = e * f;

                System.out.println("Multiplication is : "+mul);

                break;

            case "/":
                System.out.print("Enter First Number : ");
                float g = cal.nextFloat();

                System.out.print("Enter Second Number: ");
                float h = cal.nextFloat();

                float div = g/h;
                System.out.println("Divition is : "+div);
                
                break;

            case "%":
                System.out.print("Enter First Number: ");
                int i = cal.nextInt();

                System.out.print("Enter Second Number: ");
                int j = cal.nextInt();

                int mod = i%j;

                System.out.println("Modulous is : "+mod);

                break;

            default:
                System.out.println("Invalid Operator: ");
        }
    }
}
