package Inheritance;

public class MethodOverriding {
    public static void main(String[] args){
        Superhero shaktimaan = new Superhero(34, "Gangadhar", 68);
        shaktimaan.showDetails();
        SuperVillain blackAdam = new SuperVillain(4365, "Black Adam", 400);
        blackAdam.showDetails();
    }
}

class Superhero{
    int id;
    String name;
    int age;
//    String[] powers = {"Flying", "Shoot Laser Beams", "Superspeed","SuperStrength", "Mind-Control"};
    Superhero(int s_id, String s_name, int s_age){
        this.id= s_id;
        this.name = s_name;
        this.age = s_age;

        System.out.println("initialized successfully...");
    }
    public void showDetails(){
        System.out.println("Superhero Name :-"+this.name);
        System.out.println("Superhero Age :-"+this.age);
        System.out.println("Superhero ID :-"+this.id);
    }
}

class SuperVillain extends Superhero{
    SuperVillain(int v_id, String v_name, int v_age){
        super(v_id, v_name, v_age);
        System.out.println("Villain's data initialized...");
    }
    public void showDetails(){
//     super.showDetails(); // this could be method overriding
        System.out.println("Villain Name :- " + this.name);
        System.out.println("Villain ID :- " + this.id);
        System.out.println("Villain Age :- " + this.age);

    }
}
// if subclass has the same method as declared in the parent class, it is known as method overriding
// Method overloading is also known as runtime polymorphism
//