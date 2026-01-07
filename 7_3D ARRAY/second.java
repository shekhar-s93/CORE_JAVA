
public class second {
    public static void main(String[] args) {
                            // First [3] is always for rows.
        int num [][] = new int[3][4];
                                // Second [4] is always for columns.

        // in my case i decided to create a 3 x 4 matrix (3 rows and 4 columns)


        // INPUTS TYPE

        // By intexing / position
        // By Direct Data.

        // First ways is by indexing / positon value.
        num[0][0] = 10; // First row first coloum 
        num[0][1] = 20; // First row second colum
        num[0][2] = 30; // First row third colum
        num[0][3] = 40; // First row fourth colum

        num[1][0] = 50; // Second row first colum.
        num[1][1] = 60; // Second row second colum.
        num[1][2] = 70; // Second row third colum.
        num[1][3] = 80; // Second row fourth colum.
        
        num[2][0] = 90; // Third row first colum.
        num[2][1] = 98; // Third row second colum.
        num[2][2] = 97; // Third row third colum.
        num[2][3] = 96; // Third row fourth colum.

        //OUTPUT METHOD

        // In output method you can access 2 methods 
        // First using Position
        // Second using Loop

        System.out.println("\n--------------------MANUALLY ONE BY ONE DATA ENTRY OUTPUT--------------------");
        // --------------------METHOD USING POSTION:--------------------
        System.out.println("\nUsing POSITON METHOD : ");
        // First row
        System.out.println(num[0][0]+" "+num[0][1]+" "+num[0][2]+" "+num[0][3]); // here we need to give (" "), if we don't provide then the compiler understand this for addition and we get the addition of first rows value (in my case the addition of all first row is 100).
        
        // Second row
        System.out.println(num[1][0]+" "+num[1][1]+" "+num[1][2]+" "+num[1][3]); 

        // Third row
        System.out.println(num[2][0]+" "+num[2][1]+" "+num[2][2]+" "+num[2][3]); 

        // In method of positon access the value is not to access all the value compoulsary, if we want to access any one specific value we can,

        System.out.println("\nAccess Random value from metric");
        System.out.println(num[0][0]+" "+num[1][1]+" "+num[2][2]);





        // --------------------METHOD USING LOOP--------------------
        System.out.println("\nUsing LOOP METHOD : ");
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print(num[i][j]+ " ");
            }
            System.out.println();
        }


        // ----------------------------------------DIRECT DATA----------------------------------------
        System.out.println("\n--------------------DIRECT DATA ENTRY OUTPUT--------------------");
        int nums [][] ={
            {32, 66, 81},
            {10, 20, 30},
            {40, 50, 60}
        };

        // We can print this using two method 
        // --------------------ONE BY  ONE--------------------
        System.out.println("\nRandom value access:");
        System.out.println(nums[0][0] + " "+nums[2][2]+" "+nums[1][1]);

        // Using Loop Output
        System.out.println("\nBy LOOP : ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
        

    }
}
