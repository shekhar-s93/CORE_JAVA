import java.util.Scanner;

public class firstPractice {
    public static int Addition(int a, int b){
        int add = a+b;
        return add;
    }

    public static void main(String[] args) {
        Scanner calculate = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int c = calculate.nextInt();

        System.out.print("Enter Second Number : ");
        int d = calculate.nextInt();

        int sum = Addition(c, d);

        System.out.println("Addition is : "+sum);
    }
}
