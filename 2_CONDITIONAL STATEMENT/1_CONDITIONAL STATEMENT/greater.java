import java.util.Scanner;


public class greater {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = obj.nextInt();

        System.out.print("Enter Second number : ");
        int b = obj.nextInt();

        if(a == b){
            System.out.println("Equal");
        } else {
            if (a>b){
                System.out.println("A is greater");
            } else {
                System.out.println("B is greater and A is lesser");
            }
        }
    }
}
