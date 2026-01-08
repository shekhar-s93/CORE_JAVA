
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int a = sc.nextInt();

        if(a == 1){
            System.out.println("Hello");
        } else if(a == 2){
            System.out.println("Namaste");
        } else if(a == 3){
            System.out.println("Bonjour");
        } else {
            System.out.println("Envalid Greating.");
        }
    }
}
