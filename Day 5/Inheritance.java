package Inheritance;

public class Inheritance {
    public static void main(String[] args) {
//        System.out.println("Inheritance in java");
//        Employee emp = new Employee();
////        emp.name = "Sandesh";// will not work as name property is private
//        // setting employee data
//        emp.setAge((byte) 22);
//        emp.setId(1999);
//        emp.setName("Sandesh");

        // getting employee data
//        System.out.println(emp.getAge());
//        System.out.println(emp.getName());
//        System.out.println(emp.getID());
//        emp.showDetails();

        System.out.println("Printing workers data");
        Worker worker1 = new Worker();
        // setting workers data
        worker1.setAge((byte) 24);
        worker1.setId(324);
        worker1.setName("Steve Rogers");
        worker1.setHoursOfWork((byte) 8);
        worker1.setTypOfWork("Boot Cutting");

        worker1.showDetails();

        // setting managers data

        System.out.println("Printing Managers Data");
        Manager manager1 = new Manager();
        manager1.setName("Ajay Tambade");
        manager1.setId(3565);
        manager1.setAge((byte) 22);
        manager1.setSalary(50000);
        manager1.setYearOfWork((byte) 6);
        manager1.setHoursOfWork((byte) 5);
        manager1.setTypOfWork("Management");

        manager1.showDetails();
    }

}
class Employee{
    private int id;
    private String name;
    private byte age;

    public void showDetails(){
        System.out.println("Name :"+this.name);
        System.out.println("ID :"+this.id);
        System.out.println("Age :"+this.age);

    }
    // setters
    public void setId(int e_id){
        id = e_id;
    }

    public void setAge(byte e_age) {
        this.age = e_age;
    }

    public void setName(String e_name) {
        this.name = e_name;
    }
    // getters
    public int getID(){
        return this.id;
    }
    public byte getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}

class Worker extends Employee{
    // data members with default access
    String typOfWork;
    byte hoursOfWork;

    /// setters and getters (member function)(methods)
    public void setTypOfWork(String w_work){
        this.typOfWork = w_work;
    }
    public void setHoursOfWork(byte w_hrs){
        this.hoursOfWork = w_hrs;
    }

    public String getTypOfWork() {
        return typOfWork;
    }

    public byte getHoursOfWork() {
        return hoursOfWork;
    }

    public void showDetails(){
        System.out.println("Worker Name " + this.getName());
        System.out.println("Worker ID: " + this.getID());
        System.out.println("Worker Age : "+ this.getAge());
        System.out.println("Type of Work : "+ this.getTypOfWork());
        System.out.println("Hours of Work : "+ this.getHoursOfWork());
    }
}

class Manager extends Worker{
    byte yearOfWork;
    int salary;

    public byte getYearOfWork() {
        return yearOfWork;
    }

    public void setYearOfWork(byte yearOfWork) {
        this.yearOfWork = yearOfWork;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void showDetails(){
        System.out.println("Manager name :"  + this.getName());
        System.out.println("Manager Age :"  + this.getAge());
        System.out.println("Manager ID :"  + this.getID());
        System.out.println("Manager Work Hours :"  + this.getHoursOfWork());
        System.out.println("Manager name :"  + this.getTypOfWork());
        System.out.println("Manager name :"  + this.getSalary());
        System.out.println("Manager name :"  + this.getYearOfWork());
    }
}

// java does not support multiple inheritance through classes
// i.e two classses cannot be superclass at a time for an subclass

/*
 * Their are types of inheritance
 * 1.single inheritance
 * 2.multilevel inheritannce
 * 3.Heirarchical Inheritance
 * 4.multiple inheritance
 * 5.Hybrid inheritance
 */