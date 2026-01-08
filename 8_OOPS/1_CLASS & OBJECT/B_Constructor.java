class Students{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public Students(String name, int age) { // here i create our own constructor.
        this.name = name;
        this.age = age;
    }
    
}
public class B_Constructor {
    public static void main(String[] args) {
        Students obj = new Students("Shekhar Suman", 20);
        obj.printInfo();
    }
}
