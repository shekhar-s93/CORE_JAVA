
import java.util.Scanner;

class practiceMarks{
    public static void main(String[] args) {
        
        // Creating the input Object 
        Scanner input = new Scanner(System.in);
        
        // Taking input how many students in class ;
        System.out.print("Enter number of Student : ");
        int numberOfStudents = input.nextInt();

        // Crating the array one for Student name and another for marsk
        String name [] = new String[numberOfStudents];
        int marks[][] = new int[numberOfStudents][4];

        // Taking inputs of all details of Student.
        for(int i = 0; i<numberOfStudents; i++){
            System.out.println("\nEnter Details of Student : "+(i+1));

            System.out.print("Enter the Name : ");
            name[i] = input.next();

            System.out.println("\nMARKS FILLING");
            System.out.print("Enter marks of MATHS : ");
            marks[i][0] = input.nextInt();

            System.out.print("Enter marks of CHEMESTRY : ");
            marks[i][1] = input.nextInt();

            System.out.print("Enter marks of PHYSICS : ");
            marks[i][2] = input.nextInt();

            System.out.print("Enter marks of ENGLISH : ");
            marks[i][3] = input.nextInt();       

        }

        System.out.println("\n------------RESULT-----------");
        for(int i = 0; i<numberOfStudents; i++){

            System.out.println("___________________________");
            System.out.println("NAME : "+name[i]);
            System.out.println("___________________________");
            System.out.println("SUBJECT         :  MARKS");
            System.out.println("---------------------------");
            System.out.println("MATHS           :   "+marks[i][0]);
            System.out.println("CHEMISTRY       :   "+marks[i][0]);
            System.out.println("PHYSICS         :   "+marks[i][0]);
            System.out.println("ENGLISH         :   "+marks[i][0]);
            System.out.println("---------------------------");
        }

    }
}