
import java.util.Scanner;


class hello{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // here taking the input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        System.out.print("Enter your Salary : ");
        double salary = sc.nextDouble();

        System.out.print("Your name is : "+name+", your age is : "+age+", and your Salary is : "+salary);

        sc.close();
    }
}