package Java_exercise_Easy.classe_object;

public class Ex27_Rectangle {
    public int longueur;
    public int largeur;

    public Ex27_Rectangle(int longueur, int largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public int permimetre(){
        return (this.longueur + this.largeur ) * 2;
    }

    public int aire(){
        return this.longueur * this.largeur;
    }

    @Override
    public String toString(){
        int p = this.permimetre();
        int a = this.aire();
        return """
           ------------------------------
           Information about the rectangle
           ------------------------------
           Length     : %d
           Width      : %d
           Perimeter  : %d
           Area       : %d
           ------------------------------
           """.formatted(this.longueur, this.largeur, p, a);

    }

    public static void main(String[] args) {
        Ex27_Rectangle rect1 = new Ex27_Rectangle(120,20);
        System.out.println(rect1);
    }
}
