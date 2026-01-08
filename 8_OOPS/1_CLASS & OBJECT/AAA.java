class pen{
    // Create the variable.
    String color;
    String type;

    // Create function.
    public void working(){
        System.out.println("Writting anythig which we want to write.");
    }

    // Create another function.
    public void work(){
        System.out.println(this.color);
    }
}

// Creating anoter class Students

class Students{
    // Now decide the what's properties of student 

    String name;
    int age;

    // Creating the function to print there name.
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class AAA {
    // Create main function 
    public static void main(String[] args) {
        
        // create object
        pen obj = new pen();
        obj.color = "Blue";
        obj. type = "Ball Pen";

        pen object = new pen();
        object.color = "Black";
        object.type = "Gel Pen";
        obj.work();
        object.work();

        // Now Create object for Students class.
        Students s1 = new Students();
        s1.name = "Shekhar";
        s1.age = 19;
        s1.printInfo();
    }
    
}
