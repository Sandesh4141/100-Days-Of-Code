/**
 * MultiInterface -> demontstrate mutliple level inheritance in java
 * using interfaces
 */

interface SuperHero{
    public void fly();
    public void land();
    public void shootLaser();
    public void saveHuman();

    public default void eat(){
        System.out.println("Eating..");
    }
}

// here we extend supervillain from superhero
// means inheritance of interfaces has been done;
interface SuperVillain extends SuperHero{
    // interface inheritance

    public void killHumans();
    public void shootBullets();
    
}

//
class Superman implements SuperHero{
    public void fly(){
        System.out.println("Superhero Flying...");
    }
    public void land(){
        System.out.println("Superhero landed....");
    }
    public void shootLaser(){
        System.out.println("Shooting lasers from eyes...");
    }
    public void saveHuman(){
        System.out.println("Superman Saved a human");
    }
}

class BlackAdam implements SuperHero,SuperVillain{
    // mutlilevel inheritance 
    public String name = "Black Adam";
    public void fly(){
        System.out.println("Black Adam flying...");
    }
    public void land(){
        System.out.println("Black Adam landed...");
    }
    public void shootLaser(){
        System.out.println("Black adam shooting laser from hand");
    }
    public void killHumans(){
        System.out.println("Black adam a killed human");
    }
    public void shootBullets(){
        System.out.println("Black adam shooting bullets from AK47");
    }
    public void saveHuman(){
        System.out.println( "Black adam saved a human");
    }
}

public class MultiInterface {
    public static void main(String[] args) {
        Superman superman = new Superman();
        BlackAdam black_adam = new BlackAdam();

        black_adam.fly();
        superman.fly();

        black_adam.killHumans();
        superman.saveHuman();
        superman.eat();
        black_adam.eat();

    }
}



/*
mutiple inheritance using interfaces can be achieve

*/
