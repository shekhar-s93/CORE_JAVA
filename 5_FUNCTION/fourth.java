// Print factorial using Function.

import java.util.Scanner;

class fourth{
    public static void printfactorial(int n){

        // For neagetive Number 
        if(n<=0){
            System.out.println("Invalid Number");
            return;
        }
        
        int factorial = 1;
        for(int i = n; i>=1; i--){
            factorial = factorial * i;
        }
        System.out.print("Factorial is : "+factorial);
        return;
    }
    public static void main(String[] args) {
        Scanner Fac = new Scanner(System.in);

        // Taking the input
        System.out.print("Enter Number : ");
        int n = Fac.nextInt();

        printfactorial(n);
    }
}

