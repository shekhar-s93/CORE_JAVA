import java.util.Scanner;

class byUser{
    public static void main(String[] args){
        Scanner user = new Scanner(System.in);

        System.out.print("Enter Rows: ");
        int a = user.nextInt();

        System.out.print("Enter Columns: ");
        int b = user.nextInt();

        for(int i = 1; i<=a; i++){ // this is outer loop it works as ROWS
            for(int j = 1; j<=b; j++){ // this is inner loop it works as COLUMS
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}