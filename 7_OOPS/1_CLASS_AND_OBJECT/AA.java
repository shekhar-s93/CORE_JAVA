class Pen{ // here i am creating the function Pen. in this function we decides what's the actuall work of this function.

// As we know i am taking the example of pen now we have to decide what is the color of pen and their type.

// The color of pen is Black and there type is Black.

    String color; // So we take the String variable Color.
    String type; // and another String variable type.

    // After taking the variable now we need to decide the what is the actual work of pen.

    // Here i'm going to take (Writting anything as we want) as work.

    public void write(){
        System.out.println("Writting anything as we want.");
    }
}

public class AA {
    public static void main(String[] args) {
        // Now create the object of the function.
        Pen obj = new Pen();

        // Define the types here
        obj.color = "Black";
        obj.type = "Ball pen";

        // Call the function here.
        obj.write();
    }
    
}