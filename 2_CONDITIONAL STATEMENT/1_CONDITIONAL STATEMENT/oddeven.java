import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num = obj.nextInt();

        if(num % 2 == 0){
            System.out.print("Even : ");
        } else{
            System.out.print("Odd : ");
        }
    }
}
