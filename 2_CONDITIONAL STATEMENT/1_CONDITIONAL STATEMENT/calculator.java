import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a = obj.nextInt();

        System.out.print("Enter Operator (*, -, /, and +) : ");
        char operator = obj.next().charAt(0);

        System.out.print("Enter Second Number: ");
        int b = obj.nextInt();

        int sum = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        int mod = a%b;

        if(operator == '+'){
            System.out.println("Addition is : "+sum);
        } else if(operator == '-'){
            System.out.println("Subtration is : "+sub);
        } else if(operator == '*'){
            System.out.println("Multiplication is: "+mul);
        }
        
        else if(operator == '/' ){
            if(operator == '/' && b == 0){
                System.out.println("Cannot divided by zero");
            } else {
                System.out.println("Divion is : "+div);
            }
        }

        else if(operator == '%'){
            System.out.println("Remainder is : "+mod);
        } else {
            System.out.println("Invalid Operator");
        }

    }
}
