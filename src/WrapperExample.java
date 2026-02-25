import java.sql.SQLOutput;

public class WrapperExample {
    public static void main(String[] args) {
        int a=10; //here since int is a primitive it is stored in stack
        int b=20;
        Integer num=45; // since we have used wrapper class, num will be treated like an object and stored in heap
        Integer c=40;
        Integer d=50;
        swap(a,b); //it will not swap it. why? cause in java there is no such thing as pass by reference, we just have pass by value
        //so the pointer to the reference variable won't be passed just 10 will be passed
        //so the a in the parameter is not the same as the a we have in this function, the scope of parameter a was in that function only
        System.out.println(a+" "+b);
        swap1(c,d);
        System.out.println(c+" "+d);
        //but when we pass objects the reference value is passed
        //but here also we would not be able to swap. why? because class Integer is a 'final' class
        final int BONUS=2;
       // BONUS=3; this will give error as it can not be modified
        final A Gunjan=new A("Gunjan Pahwa");
        Gunjan.name="new name"; //i can do this
        //but i cannot do this
        //Gunjan=new A("new name");4
        //when a non primitive is final you cannot reassign it
        A obj=new A("kfeffqw"); //this will just give me a random value
        //but i don't want that
        //i want that whenever i call the object the name and a number get printed
        //this is where we use override-> why?
        //because println internally calls the toString method, so if we don't have the toString method defined in our class then it will use the default toString method



    }
    static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
    }
    static void swap1(Integer c, Integer d){
        Integer temp=c;
        c=d;
        d=temp;

    }

}
class A implements AutoCloseable{ //used instead of finalize
    //final int num;
    //this will give error as this is not initialized and final reference variables need to be initialized
    final int num=10;
    String name;
    public A(String name){
        this.name=name;
    }
    @Override
    public void close(){ // whenever an object of class A is freed from memory (garbage collection) then this method gets called
        System.out.println("Object is destroyed");
    }
}
