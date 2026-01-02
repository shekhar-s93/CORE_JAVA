import java.util.Scanner;


public class hello{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // start taking input from here
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.print("Enter your age : ");
        int age = sc.nextInt();


        System.out.print("Enter your salary : ");
        double salary = sc.nextDouble();

        System.out.print("Hey buddy your name is \n : "+name+"\n and your age is: "+age);

        sc.close();
    }
}