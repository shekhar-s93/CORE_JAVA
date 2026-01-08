import java.util.*;

public class tableofuser {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
    
        System.out.print("Enter number for table: ");
        int t = obj.nextInt();

        for(int i = 1; i<=10; i++){
            System.out.println(t*i);
        }
    }
}
