import java.util.Scanner;

public class secondGreater {
    public static void main(String[] args){
        Scanner clds = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = clds.nextInt();

        System.out.print("Enter second number : ");
        int b = clds.nextInt();

        if(a ==b){
            System.out.println("A and B are Equal");
        } else if(a > b){
            System.out.println("A is greater than b");
        } else{
            System.out.println("B is greater than A");
        }
    }
}
