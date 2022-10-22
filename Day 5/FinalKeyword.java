package Inheritance;


public class FinalKeyword {

    public static void main(String[] args) {
        finalVariables();
        FinalMethod m = new FinalMethod(3, 6);
        m.show();
        FinalMethodDerived d = new FinalMethodDerived(45,66);
        d.show(); // not overrided method it is derived method from parent
        // because we could not override final declared method
    }

    public static void finalVariables(){
        // final keyword related to variable
        final int AGE = 100;
        // AGE = 543;
        // above line shows error as we cannot reassign that variable
        // System.out.println(AGE);
    }

}

class FinalMethod{
    int x;
    int y;
    FinalMethod(int x, int y){
        this.x = x;
        this.y  = y;
    }
    public final void show(){
        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }
}
class FinalMethodDerived extends FinalMethod{

    FinalMethodDerived(int x, int y) {
        super(x, y);
    }
//    public void show(){
//        // as we declare show method in parent class as a final method then it is
//        // not possible to override it ..
//        System.out.println("X :"+this.x);
//        System.out.println("X :"+this.y);
//    }
}


// final variables
// If a variable followed by final keyword, then it is known as final variable
// When final is declared, it is constant which will not and cannot change all over program
// eg. final PI = 3.14
// it is similar to const keyword from c/c++/javascript

// final methods
// If we declared a method final, then it cannot be overridden in subclass or childClass
// When we try to override methods that has been declared final then they will generate
// compile-time error
