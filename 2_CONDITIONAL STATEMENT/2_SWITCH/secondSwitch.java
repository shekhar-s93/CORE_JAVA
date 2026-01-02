
import java.util.Scanner;

class secondSwitch{
    public static void main(String[] args) {
        Scanner ej = new Scanner(System.in);

        System.out.print("Enter button : ");
        int button = ej.nextInt();

        switch(button){
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("Bonjour");
            break;
            default: System.out.println("Invalid button");
        }
    }
}