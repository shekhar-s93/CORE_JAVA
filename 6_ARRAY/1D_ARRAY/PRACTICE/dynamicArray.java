import java.util.Scanner;

public class dynamicArray {
    public static void main(String[] args){
        // Creating the input object
        Scanner input = new Scanner(System.in);

        // Taking the input for size: 
        System.out.print("Enter the number of Size of your Array: ");
        int size = input.nextInt();

        // Creating the array
        int array[] = new int[size];

        // Create loop for taking the input.
        for(int i = 0; i<size; i++){
            System.out.print("Enter the : "+i+"th element : ");
            array[i] = input.nextInt();
        }

        // Creating the loop for print the array
        for(int i=0; i<size; i++){
            System.out.println(array[i]);
        }
        
    }
}
