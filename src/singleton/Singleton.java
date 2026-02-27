package singleton;

public class Singleton {
    private Singleton(){
        //now it can only be accessed in this class

    }
    private static Singleton instance;
    public static Singleton getInstance(){
        //check whether 1 obj only is created or not
        if(instance == null){
            instance=new Singleton(); //i can call it here since its in the same class
        }

    }
}
