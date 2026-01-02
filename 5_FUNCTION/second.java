import java.util.Scanner;

class second{
    public static int calculateSum(int a, int b){ // here int show us which data type we want to use in the function and calculateSum is the function name.
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner calculate = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int x = calculate.nextInt(); // here we can take another variable instied of function variable a or b.

        System.out.print("Enter Second Number : ");
        int y = calculate.nextInt(); // here we can take another variable instied of function variable a or b.

        int add = calculateSum(x, y); // which variable we takes in main function like (x, and y) we have to pass argument in new variable.
        System.out.println("Sum of two number is : "+add);
    }
}