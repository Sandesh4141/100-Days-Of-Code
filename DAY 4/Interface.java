package Interfaces_In_Java;

public class Interface {
    public static void main(String[] args) {
        SuperHero superman = new SuperHero();
        superman.name = "Clark Kent";
        superman.fly();
        superman.land();
        superman.shoot();
   }
}
interface Hero{
    void getHeroDetails();
    void fly();
    void shoot();
    void land();
}

class SuperHero implements Hero{
    String name;

    public void getHeroDetails(){
        System.out.println("Name :"+ this.name);
    }
    public void fly(){
        System.out.println("Flying...");
    }
    public void shoot(){
        System.out.println("Shooting....");
    }
    public void land(){
        System.out.println("landed...");
    }
}
// Interfaces - notes
/*
Interfaces is way of describing what classes should do,
Without specifying how they should do it.
* Used to achieve fully abstraction
* By using it we can achieve multiple inheritance
* all methods of an interface are public by default
* Like abstract class interface also cannot be instantiated.
* (means cannot create object of that class)
 */
