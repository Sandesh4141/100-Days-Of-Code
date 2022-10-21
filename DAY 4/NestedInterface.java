import Interfaces_In_Java.Interface;

public class NestedInterface {
    public static void main(String[] args) {
        Student std = new Student();
        std.print();
        std.show();        

        
    }
}

// interface nested in interface 
interface first_interface{
    public void show();
    interface second_interface{
        public void print();
    }
}
class Student implements first_interface.second_interface{
    public String name;
    public int age;

    public void show(){
        System.out.println("Student is showing...");
    }
    public void print(){
        System.out.println("Student is printing...");
    }
}

// interface nested in class
class Human {
    public int age;
    public String category;

    interface class_nested_interface{
        public void eat();
        public void speak();
    }
}
class Teacher implements Human.class_nested_interface{
    public void eat(){
        System.out.println("Teacher Eating..");
    }
    public void speak(){
        System.out.println("Teacher Speaking..");
    }

}

/// nested interface notes
/*
 *  interface can be nest within one another
 * An interface which is declared within another interface or class 
 * is known as Nested interface
 * Nested interfaces cannot be accessed directly they must be referenced 
 * the outer class.
 * 
 */