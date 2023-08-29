public class User {
    // Feilds (attributes)
    public String name;
    public int age;

    // a class can have a constructor
    // a constructor is a method that gets called
    // when an instance of a class is made

    public User( String name, int age){
        // the 'this' keyword is used to reference the current object
        this.name = name;
        this.age = age;

    }

    // methods

    public void sayHello(){
        System.out.println("Hello, my name is " + name + " and my age " + age);
    }
}
