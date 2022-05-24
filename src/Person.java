package util;

public class Person {

    public String name;
    protected int age;

    public Person(){}; //Default constructor

    public Person(String name){
        this.name = name;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        //TODO: return the person's name
        return name;
    }

    public void setName(String name){
        //TODO: change the name property to the passed value
        this.name = name;
    }

    public void sayHello(){
        //TODO: print a message to the console using the person's name
        System.out.println("Hello, " + name);
    }

    // Create a main method on the class that creates a new Person object and tests the above methods.
    public static void main(String[] args) {
        Person Jon = new Person("Jon");
        // Rewrite name to add last name, this allows us to test.test getName() and setName()
        Jon.setName(Jon.getName() +  " Lee");
        // Test new name
        Jon.sayHello();
        // Test age
//        John.getAge();
//        set age
//        John.setAge(John.getAge() + 35);
        // 2. Understanding references
        Person person1 = new Person("Kim");
        Person person2 = new Person("Kim");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);

        person1 = new Person("Kim");
        person2 = person1;
        System.out.println(person1 == person2);

        person1 = new Person("Kim");
        person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Shimmy");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

    }

}

