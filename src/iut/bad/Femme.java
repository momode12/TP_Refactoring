package iut.bad;

public class Femme extends Humain {

    public Femme(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }
    
    public static void main(String[] args) {
        Homme h = new Homme("HERITIANA", "Julien", 23);
        Femme f = new Femme("FANOMEZANA", "Julia", 20);

        h.ami(f); 
        f.ami(h); 
    }
}