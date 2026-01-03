/*
    ARRAY are two types 
    1. Dynamic array
    2. Static array 

    In dynamic array we can change and add the value and element whenever we want. While in Static array we can not 
    add the elenment after array size declaration.

    DYNAMIC ARRAY is changeable 
    STATIC ARRAY is not changeanle


*/


// D Y N A M I C   A R R A Y.
public class dynamicArray{
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
        
        // here if we want to print single value we can, like here i want to print 40.
        // to print 40 we need the find accurate indexing of 40. in array of any programming language indexing start with 0. 
        // So, the indexing of 40 is 3.
        System.out.println(a[3]);

        // if we want to print dual value or array then,
        System.out.println(a[0]+" "+a[4]);
        
        // in 27 lines of print statement if we remove " " then the value of 0th index and value of 4th will added together not concatinate.
        System.out.println(a[0]+a[4]);

        // if we want to print whole value together then we need to help of loop.
        System.out.println("Whole value together: ");
        for(int i = 0; i<5; i++){
            System.out.println(a[i]);
        }
        
    }
}