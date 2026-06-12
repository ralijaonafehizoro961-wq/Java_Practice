package Java_exercise_Easy.classe_object;

public class Ex25_Person {
    String name;
    int age;

    public Ex25_Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void afficher() {
        System.out.println("Name : " + name + ", age : " + age);
    }

    public static void main(String[] args) {
        Ex25_Person personne1 = new Ex25_Person("Alice", 30);
        Ex25_Person personne2 = new Ex25_Person("Bob", 25);
        personne1.afficher();
        personne2.afficher();
    }
}
