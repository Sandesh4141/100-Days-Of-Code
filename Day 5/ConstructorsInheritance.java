package Inheritance;

public class ConstructorsInheritance {
    public static void main(String[] args) {
      Base base = new Base();
      Base base2 = new Base(54);
      Derived der1 = new Derived(4,10);
      Derived d2 = new Derived();
      Derived d3 = new Derived(123,45,65,54);
    }
}

class Base{
    int x;
    Base(){
        System.out.println("Base Class's constructor ran....");
    }
    Base(int x){
        System.out.println("Overloaded Base class's Constructor's X = " + x);
    }
    Base(int x, int y, int z){
        System.out.println("X : "+ x);
        System.out.println("Y : "+ y);
        System.out.println("Z : "+ z);
    }
}
class Derived extends Base{

    Derived(){
        System.out.println("normal constructor");
    }
    Derived(int x, int y){
        super(x);
        System.out.println("Derived class's Constructor Y =" +y);
    }
    Derived(int x, int y, int z,int a){
        super(x, y, z);
        System.out.println("int A : "+a);
    }
}

/*
super() uses
when we want to use constructor of base class 
with different parameters (method overloading)
means we can pass parameters for base class's 
constructor with super method
 
*/