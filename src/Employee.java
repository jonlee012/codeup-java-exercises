import util.Person;

public class Employee extends Person {

    public Employee(String employeeName, int age) {
        super(employeeName, age);
    }

    public int getAge() {
        return this.age;
    }

    public void sayHello() {
        System.out.println("Welcome to the Codeup, " + this.name + ", how can I help you?"); //Overriding method
    }

    public void doWork() {
        System.out.println("Are you done with work, " + this.name + " ?");
    }


    public static void main(String[] args) {
        Person unemployed = new Person("Seth");
        Employee jon = new Employee("jon", 35);

        unemployed.sayHello();
        jon.sayHello();
        System.out.println("name = " + jon.getName());
        System.out.println(jon.getName() + ", " + jon.getAge());
        jon.doWork();
//        System.out.println("unemployed.name = " +  unemployed.getName());

//        unemployedJoe.doWork();

    }

}