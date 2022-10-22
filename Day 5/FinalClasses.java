package Inheritance;

public class FinalClasses {
    public static void main(String[] args) {
//        DerivedFinal df = new DerivedFinal();
        // above object declaration shows error
        //java: cannot inherit from final Inheritance.FinalClass
        // we are trying to inherit a final declared class


    }
}

final class FinalClass{
    public void msg(){
        System.out.println("Final Declared Class...");
    }
}
//class DerivedFinal extends FinalClass{
//    //this will shows error as we are deriving it from final declared class
//
//}

// final classes notes
// If we do not want to a class to be extended then we should declare a class as final class
//