package singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj=Singleton.getInstance();
        //now no matter how many instances i create it will give the same instance
        Singleton obj2=Singleton.getInstance();
        Singleton obj3=Singleton.getInstance();
        //all 3 reference variables are pointing to just one object
    }
}
