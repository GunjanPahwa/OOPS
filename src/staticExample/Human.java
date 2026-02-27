package staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean ismarried;
    static long population;

    public Human(int age, String name, int salary, boolean ismarried){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.ismarried=ismarried;

        Human.population+=1; //to access the static variable we use the class name
        //we do not use this keyword as it is not dependent on the object
    }
}
