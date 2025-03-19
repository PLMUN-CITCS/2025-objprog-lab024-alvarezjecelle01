// Person class with attributes, constructors, and methods
class Person {
    // Attributes with default access modifiers (package-private)
    String name;
    int age;

    // Parameterized constructor to initialize the attributes
    public Person(String name, int age) {
        this.name = name; // this keyword refers to the current object's instance variable
        this.age = age;
    }

    // Default constructor to initialize the attributes with default values
   
