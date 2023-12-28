public class ConstructorExample {
    public ConstructorExample() {
        System.out.println("No arguments constructor called");
    }
    public ConstructorExample(int defaultValue) {
        System.out.println("Default constructor called with default value: " + defaultValue);
    }
    public ConstructorExample(String strParam) {
        System.out.println("Parameterized constructor called with String parameter: " + strParam);
    }

    public ConstructorExample(int intParam1, int intParam2) {
        System.out.println("Parameterized constructor called with two int parameters: " + intParam1 + ", " + intParam2);
    }

    public static void main(String[] args) {
        ConstructorExample obj1 = new ConstructorExample(); 
        ConstructorExample obj2 = new ConstructorExample(10);  
        ConstructorExample obj3 = new ConstructorExample("Hello"); 
        ConstructorExample obj4 = new ConstructorExample(5, 7);  
    }
}