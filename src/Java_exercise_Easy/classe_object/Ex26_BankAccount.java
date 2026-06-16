package Java_exercise_Easy.classe_object;

public class Ex26_BankAccount {
    public int solde;

    public Ex26_BankAccount(int solde) {
        this.solde = solde;
    }

    public void deposer(int dep){
        solde = solde + dep;
    }

    public void retrait(int rtr){
        solde = solde - rtr;
    }

    public void afficher_compte(){
        System.out.println("Compte : " + this.solde);
    }

    public static void main(String[] args) {
        Ex26_BankAccount sold1 = new Ex26_BankAccount(2000);
        sold1.deposer(500);
        sold1.afficher_compte();
        sold1.retrait(1500);
        sold1.afficher_compte();

    }
}
