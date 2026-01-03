import java.util.Scanner;

public class secondDynamicArray {
    public static void main(String[] args) {
        
        // Creating the input object
        Scanner input = new Scanner(System.in);
         
        // Taking the input of size 
        System.out.print("Enter the size of Array : ");
        int size = input.nextInt();

        // Creating the array 
        int array[] = new int[size];

        // Taking input of element
        for(int i = 0; i<size; i++){
            System.out.print("Enter the : "+i+"th Element : ");
            array[i] = input.nextInt();
        }

        // Printing the element
        for(int j = 0; j<size; j++){
            System.out.println(array[j]);
        }
    }
}
