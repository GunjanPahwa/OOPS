package staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean ismarried;
    static long population;
    static void messages(){
        System.out.println("Hello World!");
        //System.out.println(this.age);
        //we can't do this, as the this keyword represents an object and we are in the static method
        //so the static method will not create an object or reference to an object
    }

    public Human(int age, String name, int salary, boolean ismarried){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.ismarried=ismarried;
        //this.population+=1;
        //this will also work but don't use it

        Human.population+=1; //to access the static variable we use the class name
        //we do not use this keyword as it is not dependent on the object
    }
}
