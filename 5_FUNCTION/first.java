
import java.util.Scanner;

class first {
    public static void printMyName(String name){
        System.out.print(name);
        return;
    }
    public static void main(String[] args) {
        Scanner intputName = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = intputName.nextLine();

        printMyName("Your name is : "+name);
    }
}