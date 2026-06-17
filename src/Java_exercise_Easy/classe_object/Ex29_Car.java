package Java_exercise_Easy.classe_object;

public class Ex29_Car {
    public String brand;
    public int speed;

    public Ex29_Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public int accelerate(int vit){
        speed = speed + vit;
        return speed;
    }

    @Override
    public String toString(){
        return """
                Information of the car
                Brand : %s
                Current Speed : %s km/h
                """.formatted(this.brand,this.speed);
    }

    public static void main(String[] args) {
        Ex29_Car car1 = new Ex29_Car("Lambourghini",300);
        System.out.println(car1);
        car1.accelerate(150);
        System.out.println(car1);
    }
}
