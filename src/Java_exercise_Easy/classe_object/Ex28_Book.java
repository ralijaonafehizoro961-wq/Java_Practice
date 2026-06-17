package Java_exercise_Easy.classe_object;

public class Ex28_Book {
    public String title ;
    public String author;
    public int price;

    public Ex28_Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void afficher(){
        System.out.printf("""
                Information about the book %s
                Title : %s
                Author : %s
                price : %d €
                %n""", this.title,this.title,this.author,this.price);
    }

    public static void main(String[] args) {
        Ex28_Book book1 = new Ex28_Book("les miserables", "Victor Hugo",100);
        book1.afficher();
    }
}
