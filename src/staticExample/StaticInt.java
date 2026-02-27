package staticExample;
//this is a demo to show initialization of static variables
public class StaticInt {
    static int a=4;
    static int b;
    //to initialize them make a static block which would be executed exactly once when the class is first loaded
    static{
        System.out.println("I am in static block");
        b=a*5;
    }

    public static void main(String[] args) {
        StaticInt obj=new StaticInt();
        System.out.println(StaticInt.a+" "+StaticInt.b);
        StaticInt.b+=3;
        System.out.println(StaticInt.b);

        StaticInt obj2=new StaticInt(); //the static block would not run again once i make this object
        //it will get executed only once
        //if it was loaded again i would have seen the I am in static block statement again and it would've been 4 and 20
        //but it prints 4 and 23
        System.out.println(StaticInt.a+" "+StaticInt.b);
    }
}
