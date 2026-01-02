/*
SYNTAX 

do{
    write your code here

}while(conditon);

*/

// NOTE : In do while loop if your condition is true ethier false then atleast one time the statement has been printed.

public class first{
    public static void main(String[] args) {
        int i = 0;
        do { 
            System.out.println(i);
            i++;
        } while (i<11);
    }
}