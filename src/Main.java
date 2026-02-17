//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //store 5 roll numbers
        int[] numbers=new int[5];

        //store 5 names
        String[] names=new String[5];
       // Student Gunjan;//the reference variable Gunjan is of type Student
        //it contains three properties, roll number, name and marks

        //data of 5 students
        //to save the name, marks and roll number of students i will be making 3 arrays if i want to follow this approach
        //what if i want a single data structure where every single element contains these three things
       // Gunjan=new Student();
       // Student Gunjan=new Student();
        Student Gunjan=new Student(60,"Gunjan Pahwa",99.8f);
        //Gunjan.rno=60;
        //Gunjan.name="Gunjan Pahwa";
        //Gunjan.marks=99.6f;
        Student Rahul=new Student();
        //Gunjan.changeName("Bhavika"); //name will change in greeting too
        //Gunjan.greeting();

        System.out.println(Gunjan.rno); //will give 0 if not assigned a value
        System.out.println(Gunjan.name); // will give null
        System.out.println(Gunjan.marks); //will give 0.0

        Student random=new Student(Gunjan); //other will be replaced with kunal and this would be replaced with random
        System.out.println(random.name);

        Student random2=new Student();
        System.out.println(random2.name);

        Student one=new Student();
        Student two=one;

        one.name="Something something";
        System.out.println(two.name); //it will also be changed to something something as they both point to the same object
    }
}
class Student {
    int rno;
    String name;
    float marks=90.0f; //if i give default value in the class then it will overwrite the value i assign to the object
    //we need to find a way to add the values of the above properties object by object
    //we need one word to access every object
    void greeting(){
        System.out.println("Hello my name is "+ this.name);
    }
    void changeName(String newName){
        name=newName;
    }
    Student (Student other) { //student takes value from another type of student

        this.name=other.name;//random.name=Gunjan.name
        this.rno=other.rno;
        this.marks=other.rno;
    }
     Student(){//but with this Gunjan and rahul will have same roll number, name and marks
         //this.rno=13;
         //this.name="Gunjan Pahwa";
         //this.marks=99.6f;
         //if this was an empty constructor, then in my program it would have automatically called the other constructor, this is how you call a constructor from a constructor
         //in the empty constructor just write
         this(13,"default person",100.0f);

         //internally its like:new Student(13,"default person",100.0f);
     }
     //constructor overloading: i made two constructors with same name but different arguments
     //Student arpit=new Student(17,"Arpit",89.7f)
    //here this will be replaced with arpit
    //constructors don't have a return type as they are the type of the class itself
    Student(int rno, String name, float marks1){
        this.rno=rno; //this means that this roll number is the one that i am passing in the constructor
        this.name=name; //i only have to use this keyword when the parameter and variable name is same
        marks=marks1; //like here this was not necessary as parameter and variable name was different
         //it is a good practice to use this keyword
     }

}