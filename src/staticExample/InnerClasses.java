package staticExample;
//if i have a class in a class then the outer class can not be static only the inner class can be static
//this is because outside classes are not dependent on any other class

public class InnerClasses {
    static class Test{
        String name;
        public Test(String name){
            this.name=name;
        }
        @Override
        public String toString(){ //defining my own tostring method which will override the default tostring method
            return name;
        }

    }

    public static void main(String[] args) {
        Test a=new Test("Gunjan");
        Test b=new Test("Lionel");
        //if class Test was not static then this would've given me an error as it itself is dependent on some other class
        //however if it was outside that class and not dependent on any other class it would not have given me an error
        System.out.println(
                a.name
        );
        System.out.println(b.name );
        //if class test was non static and outside the innerclass then this would have printed Lionel Lionel
        //but now its printing gunjan lionel, Why?
        //whenever we talk about static context we mean where it is mentioned as static
        //class test is mentioned as static inside the inner class,hence it not dependent on objects of inner class
        //but main and test can have instances of each other
    }
}
