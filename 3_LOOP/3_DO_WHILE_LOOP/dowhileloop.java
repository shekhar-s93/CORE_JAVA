import java.util.Scanner;

public class dowhileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int a = sc.nextInt();

        int b = 0;
        do { 
            System.out.println(b);
            b++;
        } while (b <= a);
    }
}
