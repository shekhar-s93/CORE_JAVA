import java.util.Scanner;
class third{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ROWS : ");
        int rows = input.nextInt();

        System.out.print("Enter COLUMNS : ");
        int colms = input.nextInt();

        int num[][] = new int[rows][colms];

        // TAKING INPUT: 
        System.out.println("\nINPUT : ");
        for(int i=0; i<rows; i++){
            System.out.print("Enter "+(i+1)+" ROWS : ");
            for(int j=0; j<colms; j++){
                num[i][j] = input.nextInt();
            }
        }

        System.out.println("\nOUTPUT");
        for(int i=0; i<rows; i++){
            for(int j=0; j<colms; j++){
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nFIND VALUE: ");
        System.out.print("Enter the number for Finding : ");
        int x = input.nextInt();

        for(int i=0; i<rows; i++){
            for(int j=0; j<colms; j++){
                    if(num[i][j] == x){
                        System.out.println("ROWS is : "+(i+1)+" ,and COLUMN is : "+(j+1));
                    }
            }
        }
    }

}