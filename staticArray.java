/*
    ARRAY are two types 
    1. Dynamic array
    2. Static array 

    In dynamic array we can change and add the value and element whenever we want. While in Static array we can not 
    add the elenment after array size declaration.

    DYNAMIC ARRAY is changeable 
    STATIC ARRAY is not changeanle


*/

// S T A T I C   A R R A Y
public class staticArray {
    public static void main(String[] args) {
        // declare the static array in java.

        int a[] = new int[5]; // int[5] is the sizes of memory after declaring the memory size you can not add value more than 5 sizes of memory.

        // inserting the value in the array
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        // same as dynamic array we can print at a time one data of element using indexing number.
        System.out.println(a[3]);

        // all array
        for(int i = 0; i<5; i++){ // here if we write i<6 instid of i<5 then here we get warning of out of bounds for length.
            System.out.println(a[i]);
        }
    }
}
