import java.util.Scanner;

public class studentMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // taking input for how many students in the class.
        System.out.print("Enter Number of Student : ");
        int numberOfStudent = input.nextInt();

        // Now create the array for Student name: 
        String[] students = new String[numberOfStudent];
        int marks [] [] = new int[numberOfStudent][4]; // here 4 is for subjects.

        for(int i = 0; i<numberOfStudent; i++){
            System.out.println("\nEnter details of the student: "+(i+1));

            System.out.print("Enter the Name of Student : ");
            students[i] = input.next();

            System.err.println("\nMARKS FILLING : ");

            System.out.print("Enter the marks of MATHS : ");
            marks[i][0]=input.nextInt();

            System.out.print("Enter the marks of PHYSICS : ");
            marks[i][1] = input.nextInt();

            System.out.print("Enter the marks of CHEMISTRY : ");
            marks[i][2] = input.nextInt();

            System.out.print("Enter the marks of ENGLISH : ");
            marks[i][3] = input.nextInt();
        }
        System.out.println("\n---------------RESULT---------------");
        
        for(int i = 0;  i<numberOfStudent; i++){
            System.out.println("Student name : "+students[i]);
            System.out.println("Subject  :    MARKS : ");
            System.out.println("MATHS      :    "+marks[i][0]);
            System.out.println("PHYSICS    :    "+marks[i][1]);
            System.out.println("CHEMISTRY  :    "+marks[i][2]);
            System.out.println("ENGLISH    :    "+marks[i][3]);
            System.out.println("\n------------------------------------");
        }

    }
}
