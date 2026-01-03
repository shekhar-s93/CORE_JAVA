import java.util.Scanner;

public class dynamicArrayUser {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        // Taking the input of Size: 
        System.out.print("Enter the Size of Array : ");
        int size = input.nextInt();

        // Declare the arrar 
        int arry[] = new int[size]; // here i passed the argument of input variable.

        for(int i = 0; i<size; i++){
            System.out.print("Enter the "+i+"th Element : ");
            arry[i] = input.nextInt();
        }

        for(int i = 0; i<size; i++){
            System.out.print(arry[i]+" ");
        }
    }
}
