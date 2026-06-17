package Java_exercise_Easy.inheritance_polymorphism;

class Personne{
    protected String name;
    protected int age;

    public Personne (String name, int age){
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println("Name : " + this.name + " ; Age : " + this.age);
    }
}

class Employee extends Personne {
    protected double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public void display(){
        super.display();
        System.out.println(this.name + "'s salary : " + salary + " €");
    }
}
public class Ex32_Employee {
    public static void main(String[] args) {
        Employee e1 = new Employee("Derrick Jones",25,25000.0);
        e1.display();
    }
}
