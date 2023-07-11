public class MyClass {
    private String name;
    private int age;
    
    public MyClass(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
    public static void main(String[] args) {
        MyClass myObject = new MyClass("John Doe", 25);
        myObject.printDetails();
    }
}
