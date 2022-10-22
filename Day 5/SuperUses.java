package Inheritance;

public class SuperUses {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        Child c1 = new Child();
        Child c2 = new Child("Sandy", 22, "SSVMK");
    }
}

class Parent{
    String name ;
    int age;
    public void move(){
        System.out.println("Parent Moving ");
    }
    public void eat(){
        System.out.println("Parent Eating");
    }
    Parent(){
        name = "Sandesh";
        age  = 22;
        System.out.println(name);
        System.out.println(age);
        System.out.println("Defalut values used in construction");
    }
    Parent(String x, int y){
        this.name = x;
        this.age = y;
    }
}
class Child extends Parent{
    String school;
    Child(){
        school = "SSVMK";
    };
    Child(String x, int y, String school) {
        super(x, y);
        this.school = school;
    }
    public void move(){
        super.move();// type of method overriding
        System.out.println("Children can walk and move also");
    }
}