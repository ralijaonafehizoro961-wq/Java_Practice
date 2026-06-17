package Java_exercise_Easy.classe_object;

public class Ex30_Student {
    public String name;
    public double note;

    public Ex30_Student(String name, double note) {
        this.name = name;
        this.note = note;
    }

    public String displayNote(){
        return "The note of " + this.name + " : " + this.note;
    }

    public static void main(String[] args) {
        Ex30_Student e1 = new Ex30_Student("Robinson Vladmir",15.75);
        System.out.println(e1.displayNote());
    }
}
