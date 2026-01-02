
import java.util.Scanner;


class liketable{
    public static void main(String[] args) {
        Scanner tab = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int a = tab.nextInt();

        for(int i = 1; i<11; i++){
            int table = a*i;
            System.out.println(a+" * "+i+" = "+table);
        }
    }
}