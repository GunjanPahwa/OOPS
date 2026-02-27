package staticExample;

public class Main {
    public static void main(String[] args) {
        Human gunjan=new Human(21, "Gunjan", 1400000, false);
        Human lionel=new Human(22, "Lionel Jaden Menezes", 1500000,false);
        System.out.println(gunjan.name);
        System.out.println(gunjan.population);
        System.out.println(lionel.population); //it will show one for both while this is not true as two humans exist
        //so this should show two for both the classes as the number of humans are two for both
        //declare those as static
        System.out.println(Human.population); //we can access static variables without using the object
        //greeting(); //inside the static method i can not use anything that is not static
    }
    //we know that something that is not static belongs to an object
    void greeting(){ //this is dependent of objects
        System.out.println("Hello World!");
    }
    static void fun(){ //this is not dependent on objects
      //  greeting(); this will also give error
        //we can't use this because it requires an instance
        //but the function you are using it in does not require an instance
    }
}
