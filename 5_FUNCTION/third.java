// Print the multiplication of two number using function and the number are the given by the user.

/* 

import java.util.Scanner;
class third{
    public static int Multiplication(int a, int b){
        int mul = a*b;
        return mul;
    }

    public static void main(String[] args){
        // User object 
        Scanner Multiply = new Scanner(System.in);

        // Taking first number input
        System.out.print("Enter first Number : ");
        int c = Multiply.nextInt();

        // Taking second number input
        System.out.print("Enter second Number : ");
        int d = Multiply.nextInt();

        // Creating new variable where we assigned function with c, and d arguments
        int sum = Multiplication(c, d);

        // Print the output:
        System.out.println("The Multiplication is : "+sum);

    }
}

*/


// SECOND METHOD

import java.util.Scanner;

class third{

    // Creating the function
    public static int Multiplication(int a, int b){
        return a*b;
    }

    // Creating the main function

    public static void main(String[] args){
        
        // Creating the Input object
        Scanner multiplication = new Scanner(System.in);

        // Taking the first input
        System.out.print("Enter first number : ");
        int x = multiplication.nextInt();

        // Taking the second input
        System.out.print("Enter second number : ");
        int y = multiplication.nextInt();

        // We can direct print the output without creating new variable
        System.out.println("The multiplication is : "+Multiplication(x, y));
    }
}